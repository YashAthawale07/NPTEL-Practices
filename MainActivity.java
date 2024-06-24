import android.app.ActivityManager;
import android.content.Context;
import android.net.TrafficStats;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView appListTextView = findViewById(R.id.appListTextView);

        ActivityManager am = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> runningApps = am.getRunningAppProcesses();

        StringBuilder appInfo = new StringBuilder();

        for (ActivityManager.RunningAppProcessInfo processInfo : runningApps) {
            String packageName = processInfo.processName;
            int uid = processInfo.uid;

            // Check if the app is in the background
            if (!isAppInForeground(packageName)) {
                long mobileRxBytes = TrafficStats.getUidRxBytes(uid);
                long mobileTxBytes = TrafficStats.getUidTxBytes(uid);

                // Check if data usage is greater than zero (indicating background data usage)
                if (mobileRxBytes > 0 || mobileTxBytes > 0) {
                    appInfo.append("Package Name: ").append(packageName).append("\n");
                    appInfo.append("Background Data Usage (RX): ").append(mobileRxBytes).append(" bytes\n");
                    appInfo.append("Background Data Usage (TX): ").append(mobileTxBytes).append(" bytes\n");
                    appInfo.append("\n");
                }
            }
        }

        appListTextView.setText(appInfo.toString());
    }

    private boolean isAppInForeground(String packageName) {
        ActivityManager am = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningTaskInfo> runningTasks = am.getRunningTasks(1);

        if (!runningTasks.isEmpty()) {
            String topActivityPackageName = runningTasks.get(0).topActivity.getPackageName();
            return packageName.equals(topActivityPackageName);
        }

        return false;
    }
}