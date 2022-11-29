package com.nasKim.typingGame;

import java.util.Random;
import java.util.Scanner;

public class Function {

// 문제 단어를 생성하는 메소드-------------------------------------------------------------

	public void create_word(Word w) {

		Random r = new Random();

		String res = "";
		for (int i = 0; i < w.getCnt(); i++) {
			
			boolean flag = r.nextBoolean();	// 랜덤한 대소문자를 출력하기 위해 flag변수 선언.
			
			if(flag) {
				res += (char) (r.nextInt(97, 123));
			}else {
				res += (char) (r.nextInt(65, 91));
			}
		}
		w.setWord(res);
	}

// 난이도 입력 화면을 출력하는 메소드--------------------------------------------------------

	public void select_difficulty(Word w) throws InterruptedException {

		Scanner sc = new Scanner(System.in);

		Thread.sleep(1500);
		System.out.println();
		System.out.println("----------난이도 선택----------");
		System.out.println();
		System.out.print("몇 글자?? >> ");
		w.setCnt(sc.nextInt());
		sc.nextLine(); // 버퍼상에 남아있는 \n 값을 처리하기 위해 사용.

	}

// 문제 출제화면을 출력하는 메소드-----------------------------------------------------------

	public void print_screen(Word w) {

		System.out.print("< " + w.getWord() + " >");
		System.out.print("     입력 >>     ");

	}

// 게임 로딩 대기화면을 출력하는 메소드-------------------------------------------------------

	public void wait_screen() throws InterruptedException {

		System.out.println(3 + "...");
		Thread.sleep(1000);
		System.out.println(2 + "..");
		Thread.sleep(1000);
		System.out.println(1 + ".");
		Thread.sleep(1000);
		System.out.println();
	}

// 정답 화면을 출력하는 메소드--------------------------------------------------------------

	public void correct_screen(Word w) throws InterruptedException {

		Thread.sleep(250);
		System.out.println();
		System.out.println("┌─────────<정답입니다>─────────┐");
		System.out.println("현재 당신의 점수는 : " + w.getScore() + "/100점 입니다.");
		System.out.println();
		Thread.sleep(500);
	}

// 오답 화면을 출력하는 메소드--------------------------------------------------------------

	public void incorrect_screen(Word w) throws InterruptedException {

		Thread.sleep(250);
		System.out.println();
		System.out.println("┌─────────<오답입니다>─────────┐");
		System.out.println("현재 당신의 점수는 : " + w.getScore() + "/100점 입니다.");
		System.out.println();
		Thread.sleep(500);
	}

// 게임 시작 화면을 출력하는 메소드----------------------------------------------------------	

	public void start_screen() {

		System.out.println("┌────────────────────────────┐");
		System.out.println("│                            │");
		System.out.println("│   💡💡영문 타자 정확도 게임💡💡   │");
		System.out.println("│                            │");
		System.out.println("└────────────────────────────┘");
	}

// 게임 실패 화면을 출력하는 메소드----------------------------------------------------------	

	public void fail_screen() {

		System.out.println("┌────────────────────────────┐");
		System.out.println("│       U can do it!!!       │");
		System.out.println("│            Now             │");
		System.out.println("│         Try again^^        │");
		System.out.println("└────────────────────────────┘");
	}

// 게임 성공 화면을 출력하는 메소드----------------------------------------------------------	

	public void success_screen() {

		System.out.println("┌────────────────────────────┐");
		System.out.println("│   ♥♥♥Congratulations♥♥♥    │");
		System.out.println("│            Now             │");
		System.out.println("│      Will be American^^    │");
		System.out.println("└────────────────────────────┘");
	}

// 에러메세지 화면을 출력하는 메소드----------------------------------------------------------	

	public void errMsg() {

		System.out.println("글자 수는 0보다 큰 수를 입력 plz...");
		System.out.println("게임 하고 싶으면 1코인 넣어주세요.");
	}

}
