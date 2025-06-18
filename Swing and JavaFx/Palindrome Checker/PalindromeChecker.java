//Palindrome Checker

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame implements KeyListener{
	JLabel lbl_msg;
	JTextField txt_str;
	public MyFrame(){
		lbl_msg = new JLabel("No text input");
		txt_str = new JTextField(20);
		txt_str.addKeyListener(this);
		setLayout (new FlowLayout());
		setTitle("Palindrome Checker");
		setSize(300,100);
		add(txt_str);
		add(lbl_msg);
		setVisible(true);
	}
	public void keyPressed(KeyEvent e){}
	public void keyReleased(KeyEvent e){
		String str = txt_str.getText();
		if(str.equals("")){
			lbl_msg.setText("No text input");
			return;
		}
		String rev = "";
		for(int i = str.length()-1; i>=0;i--){
			char ext = str.charAt(i);
			rev = rev+ext;
		}
		if(str.equalsIgnoreCase(rev)){
			lbl_msg.setText("Palindrome");
		}
		else{
			lbl_msg.setText("Not Palindrome");
		}
	}
	public void keyTyped(KeyEvent e){}
}
class PalindromeChecker{
	public static void main(String[] args){
		new MyFrame();
	}
}