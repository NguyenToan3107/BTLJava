package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import controller.quizController;
import model.quizModel;

public class quizView extends JFrame implements ActionListener, MouseListener{
	private quizModel model;
	private JTextField textfield;
	private JTextArea textarea;
//	private JButton buttonA;
//	private JButton buttonB;
//	private JButton buttonC;
//	private JButton buttonD;
	private JButton answer_labelA;
	private JButton answer_labelB;
	private JButton answer_labelC;
	private JButton answer_labelD;
	private JLabel time_label;
	private JLabel seconds_left;
	private JTextField number_right;
	private JTextField percentage;
	private Timer timer;
	private Timer pause;
	
	// constructor
	public quizView() throws HeadlessException {
		this.model = new quizModel();
		this.init();
	}

	private void init() {
		this.setTitle("Quiz Game");
		this.setSize(650, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		// Font
		
		Font font = new Font("Ink Free", Font.BOLD, 30);
		Font font1 = new Font("MV Boli", Font.BOLD, 30);
		Font font2 = new Font("MV Boli", Font.BOLD, 35);
		Font font3 = new Font("MV Boli", Font.PLAIN, 16);
		Font font4 = new Font("Ink Free", Font.BOLD, 60);
		
		
		// action
//		quizController ac = new quizController(this);
		timer = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					int second = model.getSeconds();
					second--;
					model.setSeconds(second);
					seconds_left.setText("00 : " + String.valueOf(second));
					if(second <= 0) {
						displayAnswer();
					}
			}
		});
		
		// panel_top
		JPanel panel_top = new JPanel();
		
		textfield = new JTextField(); 
		textfield.setBackground(new Color(253,149,140));
		textfield.setForeground(new Color(253,252,253));
		textfield.setFont(font);
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setBorder(new EmptyBorder(0, 0, 0, 0));
		textfield.setEditable(false);
		textfield.setText("Welcome to QUIZ GAME");
		
		textarea = new JTextArea();
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setBackground(new Color(253,149,140));
		textarea.setForeground(new Color(40,36,39));
		textarea.setFont(font1);
		textarea.setBorder(BorderFactory.createBevelBorder(1));
		textarea.setBorder(new EmptyBorder(0, 0, 0, 0));
		textarea.setEditable(false);
		textarea.setText("SAMPLE TEXT");
		
		panel_top.setLayout(new BorderLayout());
		panel_top.add(textfield, BorderLayout.NORTH);
		panel_top.add(textarea, BorderLayout.CENTER);
		
		// panel_center
		JPanel panel_center = new JPanel();
		
		answer_labelA = new JButton();
		answer_labelA.setBackground(new Color(251,218,201));
		answer_labelA.setForeground(new Color(40,36,39));
		answer_labelA.setFont(font2);
		answer_labelA.setFocusable(false);
		answer_labelA.setBorder(BorderFactory.createEmptyBorder(-1, -1, -1, -1));
		answer_labelA.setOpaque(false);
		answer_labelA.addActionListener(this);
//		answer_labelA.setPreferredSize(new Dimension(100, 50));
		answer_labelA.setSize(100, 50);
		
		answer_labelB = new JButton();
		answer_labelB.setBackground(new Color(251,218,201));
		answer_labelB.setForeground(new Color(40,36,39));
		answer_labelB.setFont(font2);
		answer_labelB.setFocusable(false);
		answer_labelB.setBorder(BorderFactory.createEmptyBorder(-1, -1, -1, -1));
		answer_labelB.setOpaque(false);
		answer_labelB.addActionListener(this);
//		answer_labelB.setPreferredSize(new Dimension(100, 50));
		answer_labelB.setSize(100, 50);
			
		answer_labelC = new JButton();
		answer_labelC.setBackground(new Color(251,218,201));
		answer_labelC.setForeground(new Color(40,36,39));
		answer_labelC.setFont(font2);
		answer_labelC.setFocusable(false);
		answer_labelC.setBorder(BorderFactory.createEmptyBorder(-1, -1, -1, -1));
		answer_labelC.setOpaque(false);
		answer_labelC.addActionListener(this);
//		answer_labelC.setPreferredSize(new Dimension(100, 50));
		answer_labelC.setSize(100, 50);
		
		answer_labelD = new JButton();
		answer_labelD.setBackground(new Color(251,218,201));
		answer_labelD.setForeground(new Color(40,36,39));
		answer_labelD.setFont(font2);
		answer_labelD.setFocusable(false);
		answer_labelD.setBorder(BorderFactory.createEmptyBorder(-1, -1, -1, -1));
		answer_labelD.setOpaque(false);
		answer_labelD.addActionListener(this);
//		answer_labelD.setPreferredSize(new Dimension(100, 50));
		answer_labelD.setSize(100, 50);
		
		panel_center.setLayout(new GridLayout(2, 2, 50, 20));
		panel_center.setBackground(new Color(253,149,140));
//		panel_center.setPreferredSize(new Dimension(50, 20));
		panel_center.add(answer_labelA);
		panel_center.add(answer_labelB);
		panel_center.add(answer_labelC);
		panel_center.add(answer_labelD);
		
		// panel_footer
		JPanel panel_footer = new JPanel();
		
		
		
		// panel_footer_1
		JPanel panel_footer_1 = new JPanel();
		
		
		seconds_left = new JLabel();
		seconds_left.setBackground(new Color(251,233,229));
		seconds_left.setForeground(new Color(34,44,57));
		seconds_left.setFont(font3);
		seconds_left.setBorder(BorderFactory.createEmptyBorder(-1, -1, -1, -1));
		seconds_left.setOpaque(false);
		seconds_left.setHorizontalAlignment(JTextField.CENTER);
		seconds_left.setText("00 : " + String.valueOf(model.getSeconds()));
		
		time_label = new JLabel();
		time_label.setBackground(new Color(251,233,229));
		time_label.setForeground(new Color(34,44,57));
		time_label.setFont(font3);
		time_label.setText("Timer");
		
		panel_footer_1.setLayout(new FlowLayout(FlowLayout.TRAILING, 10, 10));
		panel_footer_1.add(seconds_left);
		panel_footer_1.add(time_label);
		panel_footer_1.setBackground(new Color(251,233,229));
		
		// panel_footer_2
		JPanel panel_footer_2 = new JPanel();
		
		number_right = new JTextField();
		number_right.setBackground(new Color(251,233,229));
		number_right.setForeground(new Color(34,44,57));
		number_right.setFont(font);
		number_right.setBorder(BorderFactory.createEmptyBorder(-1, -1, -1, -1));
		number_right.setOpaque(false);
		number_right.setEditable(false);
		
		percentage = new JTextField();
		percentage.setBackground(new Color(251,233,229));
		percentage.setForeground(new Color(34,44,57));
		percentage.setFont(font);
		percentage.setBorder(BorderFactory.createEmptyBorder(-1, -1, -1, -1));
		percentage.setOpaque(false);
		percentage.setEditable(false);
		
		panel_footer_2.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 10));
		panel_footer_2.add(number_right);
		panel_footer_2.add(percentage);
		panel_footer_2.setBackground(new Color(251,233,229));
		
		panel_footer.setLayout(new BorderLayout());
		panel_footer.add(panel_footer_1, BorderLayout.EAST);
		panel_footer.add(panel_footer_2, BorderLayout.WEST);
		
		panel_footer.setBackground(new Color(251,233,229));
		
		// Layout
		this.setLayout(new BorderLayout());
		this.add(panel_top, BorderLayout.NORTH);
		this.add(panel_center, BorderLayout.CENTER);
		this.add(panel_footer, BorderLayout.SOUTH);
		
		this.setVisible(true);
		nextQuestion();
	}
	
	public void nextQuestion() {
		if(model.getIndex() >= model.getTotal_questions()) {
			results();
		}else {
			textfield.setText("Question "+ (model.getIndex() + 1));
			textarea.setText(model.getQuestions()[model.getIndex()]);
			answer_labelA.setText(model.getOptions()[model.getIndex()][0]);
			answer_labelB.setText(model.getOptions()[model.getIndex()][1]);
			answer_labelC.setText(model.getOptions()[model.getIndex()][2]);
			answer_labelD.setText(model.getOptions()[model.getIndex()][3]);
			timer.start();
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		answer_labelA.setEnabled(false);
		answer_labelB.setEnabled(false);
		answer_labelC.setEnabled(false);
		answer_labelD.setEnabled(false);
		
		if(e.getSource() == answer_labelA) {
			model.setAnswer('A');
			if(model.getAnswers()[model.getIndex()] == model.getAnswer()) {
				int corect = model.getCorrect_guesses();
				corect++;
				model.setCorrect_guesses(corect);
			}
		}
		if(e.getSource() == answer_labelB) {
			model.setAnswer('B');
			if(model.getAnswers()[model.getIndex()] == model.getAnswer()) {
				int corect = model.getCorrect_guesses();
				corect++;
				model.setCorrect_guesses(corect);
			}
		}
		if(e.getSource() == answer_labelC) {
			model.setAnswer('C');
			if(model.getAnswers()[model.getIndex()] == model.getAnswer()) {
				int corect = model.getCorrect_guesses();
				corect++;
				model.setCorrect_guesses(corect);
			}
		}
		if(e.getSource() == answer_labelD) {
			model.setAnswer('D');
			if(model.getAnswers()[model.getIndex()] == model.getAnswer()) {
				int corect = model.getCorrect_guesses();
				corect++;
				model.setCorrect_guesses(corect);
			}
		}
		displayAnswer();
	}

	private void displayAnswer() {
		timer.stop();
		answer_labelA.setEnabled(false);
		answer_labelB.setEnabled(false);
		answer_labelC.setEnabled(false);
		answer_labelD.setEnabled(false);	
		
		
//		if(model.getAnswers()[model.getIndex()] != 'A') {
//			answer_labelA.setForeground(new Color(25,255,0));
//		}
//		
//		if(model.getAnswers()[model.getIndex()] != 'B') {
//			answer_labelA.setForeground(new Color(25,255,0));
//		}
//		
//		if(model.getAnswers()[model.getIndex()] != 'C') {
//			answer_labelA.setForeground(new Color(25,255,0));
//		}
//		
//		if(model.getAnswers()[model.getIndex()] != 'D') {
//			answer_labelA.setForeground(new Color(25,255,0));
//		}
		Timer pause = new Timer(2000, new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
//						answer_labelA.setForeground(new Color(25,255,0));
//						answer_labelB.setForeground(new Color(25,255,0));
//						answer_labelC.setForeground(new Color(25,255,0));
//						answer_labelD.setForeground(new Color(25,255,0));
						
						model.setAnswer(' ');
						model.setSeconds(10);
						seconds_left.setText(String.valueOf(model.getSeconds()));
						answer_labelA.setEnabled(true);
						answer_labelB.setEnabled(true);
						answer_labelC.setEnabled(true);
						answer_labelD.setEnabled(true);
						int index = model.getIndex();
						index++;
						model.setIndex(index);
						nextQuestion();
					}
					
				});		
		pause.setRepeats(false);
		pause.start();
	}

	private void results() {
		answer_labelA.setEnabled(false);
		answer_labelB.setEnabled(false);
		answer_labelC.setEnabled(false);
		answer_labelD.setEnabled(false);
		
		int result = (int)((model.getCorrect_guesses()/(double)model.getTotal_questions())*100);
		model.setResult(result);
		textfield.setText("Result: ");
		
//		answer_labelA.setText("");
		answer_labelA.setVisible(false);
		answer_labelB.setVisible(false);
		answer_labelC.setVisible(false);
		answer_labelD.setVisible(false);
		
		if(model.getCorrect_guesses() < model.getTotal_questions()) {			
			textarea.setText("Wish you luck next time");
		}else {			
			textarea.setText("Congratulation <3 <3 <3");
		}
		
		number_right.setText("("+model.getCorrect_guesses()+"/"+model.getTotal_questions()+")");
		percentage.setText(model.getResult()+"%");

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		answer_labelA.setForeground(new Color(25,255,0));
		answer_labelB.setForeground(new Color(25,255,0));
		answer_labelC.setForeground(new Color(25,255,0));
		answer_labelD.setForeground(new Color(25,255,0));
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
