package com.nasKim.typingGame;

public class Word {

	private int cnt = 0; 			// 난이도 입력시 몇글자의 입력 값을 담을 변수 선언.
	private int score = 0;			// 플레이어의 점수를 담을 변수 선언.
	private String word = "";		// 문제 영단어를 담을 변수 선언.
	private String answer = "";		// 플레이어의 정답 입력 값을 담을 변수 선언.
	
	public Word() {}
	
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
 
	
}
