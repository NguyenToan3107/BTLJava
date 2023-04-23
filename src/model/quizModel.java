package model;

public class quizModel {
	String[] questions = {
			"What color is my dog?",
			"Java is the best language?",
			"How to become master Java?"
		};
	String[][] options = {
			{"Red", "Yellow", "Black", "White"},
			{"No", "Yes", "Right", "I don't know"},
			{"Find leader", "Don't sleep", "Study", "No way"}
	};
	char[] answers = {
			'D',
			'D',
			'A'
	};
	
	char guess;
	char answer;
	int index;
	int correct_guesses = 0;
	int total_questions = questions.length;
	int result;
	int seconds = 10;
	
	// constructor
	public quizModel() {
	}

	public String[] getQuestions() {
		return questions;
	}

	public void setQuestions(String[] questions) {
		this.questions = questions;
	}

	public String[][] getOptions() {
		return options;
	}

	public void setOptions(String[][] options) {
		this.options = options;
	}

	public char[] getAnswers() {
		return answers;
	}

	public void setAnswers(char[] answers) {
		this.answers = answers;
	}

	public char getGuess() {
		return guess;
	}

	public void setGuess(char guess) {
		this.guess = guess;
	}

	public char getAnswer() {
		return answer;
	}

	public void setAnswer(char answer) {
		this.answer = answer;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getCorrect_guesses() {
		return correct_guesses;
	}

	public void setCorrect_guesses(int correct_guesses) {
		this.correct_guesses = correct_guesses;
	}

	public int getTotal_questions() {
		return total_questions;
	}

	public void setTotal_questions(int total_questions) {
		this.total_questions = total_questions;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	

	// getter and setter
	
}
