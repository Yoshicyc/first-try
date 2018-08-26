package ch16_10;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

public class ch16_10 extends Frame implements ActionListener{
	Button btn;
	public ch16_10(){
		this.setTitle("介面");
		this.setLayout(new FlowLayout());
		btn = new Button("按鈕1");
		this.add(btn);
		btn.addActionListener(this);
		this.setSize(200,100);
		this.setVisible(true);
		this.setLocation(400, 300);
	}
	public void actionPerformed(ActionEvent e){
		if(btn.getLabel()=="按鈕1")
			btn.setLabel("btn1");
		else
			btn.setLabel("按鈕1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch16_10();
	}

}
