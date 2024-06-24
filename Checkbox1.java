import java.awt.*;

public class Checkbox1 {
Checkbox1(){
	Frame f = new Frame("Frame In Java");
	Checkbox c1 = new Checkbox("C++");
	c1.setBounds(100,100,50,50);
	Checkbox c2 = new Checkbox(" Java",true);
	c2.setBounds(100,100,50,50);
	f.add(c1);
		f.add(c2);
		f.resize(500,500);
		f.setLayout(null);
		f.setVisible(true);

}
public static void main(String[] args){
	new Checkbox1();
	
}
}