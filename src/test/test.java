package test;

import javax.swing.UIManager;

import view.quizView;

public class test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new quizView();
		}catch(Exception e) {
			e.printStackTrace();
		}
//		new quizView();
	}
}
