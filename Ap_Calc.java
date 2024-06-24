import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.TextField.*;

public class Ap_Calc extends Applet implements ActionListener{
	TextField one,two,res;
	Button add,mul,dev,sub;
	public void init(){
		Label l1=new Label("First Number:  ",Label.RIGHT);
		Label l2=new Label("Second  Number:  ",Label.RIGHT);
		Label l3=new Label("Result:  ",Label.RIGHT);
		
		one= new TextField(5);
		two= new TextField(5);
		res= new TextField(7);
		
		add= new Button("Add");
		sub= new Button("Substract");
		mul= new Button("Multiply");
		dev= new Button("Devide");
		
		add(l1);
		add(one);
		add(l2);
		add(two);
		add(l3);
		add(res);
		
		add(add);
		add(sub);
		add(mul);
		add(dev);
		
		one.addActionListener(this);
		two.addActionListener(this);
		res.addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		dev.addActionListener(this);
	}
	 public void ActionPerformed(ActionEvent ae){
		 String str = ae.getActionCommand();
		 float b1,b2,b3 = 0;
		 String msg;
		 
		 b1=Float.parseFloat(one.getText());
		 b2=Float.parseFloat(two.getText());
		 
		 if(str.equals("add"))
			 b3=b1+b2;
		 if(str.equals("substract"))
			 b3=b1-b2;
		 if(str.equals("multiply"))
			 b3=b1*b2;
		 if(str.equals("devide"))
			 b3=b1/b2;
		 msg=String.valueOf(b3);
		 res.setText(msg);
		 repaint();
		 
		 
	 }
	 public void paint(Graphics g){}
	



}