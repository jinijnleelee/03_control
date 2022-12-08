package edu.kh.control.condition;

import java.util.Scanner;

public class SwitchExample {
	
	
	/*
	 * Switch
	 *  - 식 하나의 결과로 많은 경우의 수를 처리할 때 사용하는 조건문
	 *  -> 식의 결과로 얻은 값과 같은 case 구문이 실행된다
	 *  
	 *  [작성법]
	 *  switch(식) {
	 *  
	 *  case 결과값1 : 수행코드1,break;
	 *  case 결과값2 : 수행코드2,break;
	 *  case 결과값3 : 수행코드3,break;
	 *  ...
	 *  default : case를 모두 만족하지 않을 경우 수행하는 코드 (==else)
	 *  
	 * */
	
	
	public void ex1() {
		//키보드로 정수를 입력 받아
//		1 이면 "빨강"
//		2 주황
//		3 노랑
//		4 초록
//		1~4 사이 숫자가 아니면 흰색
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력 : ");
		int input = sc.nextInt();
		
		String result;

		switch(input) {
		case 1 : result ="빨강"; 
		break;
		case 2 : result ="주"; 
		break;
		case 3 : result ="노"; 
		break;
		case 4 : result ="초"; 
		break;
		default: result ="흰";
		
		}
		
		
		
		
	}//ex1()
	
	
	public void ex2() {
		Scanner sc = new Scanner(System.in);
		int moth = sc.nextInt();
		String result;
		
		switch(moth) {
		case 3:case 4:case 5: result = "봄";
			break;
		case 6:case 7:case 8: result = "여룸";
			break;
		case 9:case 10:case 11: result = "가을";
			break;
		case 12:case 1:case 2: result = "겨울";
		break;
		default: result = "잘못입력";
			
		
			
			
		}
		
		}//ex2()
	
	
	public void ex3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력 :");
		int num1 = sc.nextInt();
		System.out.println("연산자 :");
		String str = sc.next();
		System.out.println("정수입력 :");
		int num2 = sc.nextInt();
		// 만약 사용자가 * 를 입력하면 *이거가 계산되어야하는거잖아?
	
		switch(str){
		case "+" : System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
			break;
		
		case "/" :
			if(num2 == 0) {
				System.out.println("0으로 못나눔");
			}else {
				
			
			System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
		}
		break;
			
			
		
			
			
			
				
			}
	}//ex3()
		
}
		
		
		
		
		//연산자(+ _ * ? %)
		// -> 연산자는 String
		//정수 1: ex 5
		//정수 2: ex 10
		//연산자 : * 
		//계산결과는 : 5 * 10 = 50
		
		
	
		
	

	

