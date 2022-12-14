package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {
/*
 * while 문
 *  - 별도의 초기, 증감식이 존재하지 않고
 *   반복 종료 조건을 자유롭게 설정하는 반복문
 *   
 *   ** 확실히 언제 반복이 끝날지는 모르지만
 *   	언젠가 반복 조건이 false가 되는 경우 반복을 종료함
 *   
 *   [작성법]
 *   while(조건식) {
 *   	조건식이 true일 동안 반복 수행될 구문
 *   
 * 
 * */
	
	public void ex12() {
		
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		while(input != 9) { //input이 9가 아닐때 반복
			System.out.println("=========키오스크=======");
			System.out.println("=========메뉴선택=======");
			System.out.println("1. 떡볶이");
			System.out.println("2. 김밥");
			System.out.println("3. 쫄면");
			System.out.println("9. 종료");
			
			
			System.out.print("메뉴 선택 >");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println("떡볶이 주문 완료"); break;
			case 2 : System.out.println("김밥 주문 완료"); break;
			case 3 : System.out.println("쫄면 주문 완료"); break;
			case 9 : System.out.println("키오스크 종료"); break;
			default :  System.out.println("잘못입력했음"); 
			}
			
		}
		
	}//ex12
	
	public void ex13() {
	
	//입력되는 모든 정수 합 구하기
//	단 0이 입력되면 반복 종료 후 결과출력
//	- > 0이 입력되지않으면 계속 반복
//	ex)
//	정수 입력 : 5
//	정수입력 : 1
//	정수 입력 : 0
//	합계 : 6
//	
//	
		
		
		Scanner sc = new Scanner(System.in);
		int input = 2; // 어차피 재대입되기때문에 0만 아니면 됨
		int sum = 0; //입력값 누적 더함
		
		while(input != 0) { //input이 0가 아닐때 반복
			
			
			System.out.print("정수 입력 : " );
			input = sc.nextInt();
			
			sum += input;//입력받은 값을 sum에 누적
			
			
			
			
			}
			
			System.out.println("합계  " + sum);
			
		
	}//ex13

	
	
	public void ex14() {   
		
//		★각 특징 중요 중요★
//		반복문 종류 3가지 
//		for
//		while
//		do ~ while 
//			
		
//		1부터 입력한 값의 합
//		단, 0을 초과한 숫자 입력
//		= > 0이하의 숫자를 입력할 시 "1이상의 숫자를 입력해주세요" 문구 출력
//		ex } 입력값 : 5
//	=> 1 + 2 + 3 + 4 + 5 = 출력해야하는 값
//	ex } 입력값 : 10
//=> 1 + 2 + 3 +... + 10 = 출력해야하는 값
		
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("숫자입력");
			int input = sc.nextInt();
			int sum = 0; 
		
			if(input > 0) {
				int i =1;
			
				while(i <= input) {
					sum += i;
					i++;
				}
				System.out.println("1부터 " + input + "까지의 핪은" + sum + "입니다");
			
			
			}else {
				System.out.print("1이상의 숫자를 입력해주세요" );
			}
			
				
		
		
	}
	public void ex15() {   
		
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		int sum = 0;
	// do ~ while
	//	최소 한번은 수행하는 반복문
		do {
			System.out.println("점수 : ");
			input = sc.nextInt();
			
			sum += input;
		}while(input !=0);
		
		System.out.println("합계 : " + sum);
			
		}
		
		
	}
		
		

