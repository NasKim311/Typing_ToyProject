package com.nasKim.typingGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in); 		// 입력 객체 생성.
		Word w = new Word(); 						// 변수 객체 생성.
		Function f = new Function(); 				// 기능 객체 생성.

		f.start_screen(); 							// 시작화면 출력 메소드.
		f.select_difficulty(w); 					// 난이도 입력 화면 출력 메소드.
		f.wait_screen(); 							// 게임 로딩 대기화면 출력 메소드.

//--------------------------<게임 중 화면>-----------------------------------------------------------------------			

		if (w.getCnt() <= 0) { 						// 입력된 글자수가 0이하 일 떄 조건.<1-1조건>
			f.errMsg();								// 에러메세지 메소드.
			
		} else {									// 입력된 글자수가 0초과 일 떄 조건.<1-2조건>
			
			while (true) { 								// 이 게임이 몇번 반복되야 100점이 채워지는지 횟수를 모르니 while문 사용.
				
				if (w.getScore() > -50 && w.getScore() < 100) { // 점수가 -50점과 100점에 도달하기 전까지 반복하기 위한 조건.<2-1조건>
					
					f.create_word(w);								// 문제로 출제될 단어 생성 메소드.
					f.print_screen(w);								// 문제 출제화면 출력 메소드.
					w.setAnswer(sc.nextLine());						// 스캐너로 입력받은 값을 answer변수에 할당하는 메소드.
					
					if (w.getWord().equals(w.getAnswer())) {		// 문제와 입력한 정답이 일치하는 조건.<3-1조건>
						w.setScore(w.getScore() + 10);					// score변수에 10을 추가로 더하는 메소드.
						f.correct_screen(w);							// 정답 화면 출력 메소드.
						
					} else {										// 문제와 입력한 정답이 불일치하는 조건.<3-2조건>
						w.setScore(w.getScore() - 10);					// score변수에 10을 추가로 뺴는 메소드.
						f.incorrect_screen(w);							// 오답 화면 출력 메소드.
					}

				} else if (w.getScore() >= 100) { 				// 점수가 100점에 도달하면 종료하기 위한 조건.<2-2조건>
					f.success_screen();								// 게임 성공 화면 출력 메소드.
					break;											// 성공 즉시 while반복문을 탈출하기 위한 키워드 break사용.

				} else if (w.getScore() <= -50) { 				// 점수가 -50점에 도달하면 종료하기 위한 조건.<2-3조건>
					f.fail_screen();								// 게임 실패 화면 출력 메소드.
					break;											// 실패 즉시 while반복문을 탈출하기 위한 키워드 break사용.
				}

			} // while문 닫는 중괄호

		} // <1-2조건>else문 닫는 중괄호

		sc.close(); 								// Scanner를 닫아준다. (주황줄 보기 싫어서..ㅎㅎ)

	} // main method

} // Main class





//랜덤클래스 nextInt() 메소드 설명해야함.
// throws 설명.
// Thread.sleep() 설명.
