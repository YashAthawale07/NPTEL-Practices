import java.awt.*;

public class Button1 {
public static void main(String[] args){
	Frame f = new Frame("Frame In Java");
	Button b = new Button("Click Me");
	b.setBounds(150,50,130,180);
	f.add(b);
		f.resize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		f.show();
}
}