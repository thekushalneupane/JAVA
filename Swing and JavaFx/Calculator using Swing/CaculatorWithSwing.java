//Create a suitable GUI to find the sum and difference of two numbers using JAVA Swing and grid layout management.

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{
    JLabel lbl_fn, lbl_sn, lbl_res;
    JTextField txt_fn, txt_sn, txt_res;
    JButton btn_add, btn_sub;
    public MyFrame(){
        lbl_fn = new JLabel("First Num:");
        lbl_sn = new JLabel("Second Num:");
        lbl_res = new JLabel("Result:");
	txt_fn = new JTextField(20);
	txt_sn = new JTextField(20); 
	txt_res = new JTextField(20);
	btn_add = new JButton("ADD");
	btn_add.addActionListener(this);
	btn_sub = new JButton("SUB");
	btn_sub.addActionListener(this);

	setSize(400,500);
	setLayout(new GridLayout(4,2,5,5));
	
	add(lbl_fn);
	add(txt_fn);
	add(lbl_sn);
	add(txt_sn);
	add(lbl_res);
	add(txt_res);
	add(btn_add);
	add(btn_sub);
	setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
	double fn = Double.parseDouble(txt_fn.getText());
	double sn = Double.parseDouble(txt_sn.getText());
	double res = 0;
	if(e.getSource() == btn_add)
		res= fn + sn;
	else
		res = fn-sn;
	txt_res.setText(Double.toString(res));
    }
}
class CaculatorWithSwing{
	public static void main (String[] args){
		new MyFrame();
	}
} 
