package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
	int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
	String riddleOne = JOptionPane.showInputDialog("why did the chicken cross the road?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
	if(riddleOne.equals("to get to the otther side")) {
		JOptionPane.showMessageDialog(null,"Correct");
	score += 1;
	}
		// 5. Otherwise, say "wrong" and tell them the answer
	else {
		JOptionPane.showMessageDialog(null,"Wrong, its to get to the otther side");
	}
		// 6. Add some more riddles
	String riddleTwo = JOptionPane.showInputDialog("why did the emu peeck your back?");
		if(riddleTwo.equals("to scare you")) {
			JOptionPane.showMessageDialog(null,"Correct");
			score +=1;
		}
		
		else {
			JOptionPane.showMessageDialog(null,"Wrong, its to scare you");
		}
	
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null,score);
	}
}

