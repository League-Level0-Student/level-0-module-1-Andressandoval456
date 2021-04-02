package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("Whats your birthday?");
		if(birthday.equals("4/2")) {
			JOptionPane.showMessageDialog(null,"Happy bithday");
		}
		else {
			JOptionPane.showMessageDialog(null,"happy unbirthday");
			
	}
	}
}
