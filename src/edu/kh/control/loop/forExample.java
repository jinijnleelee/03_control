package edu.kh.control.loop;

import java.util.Scanner;

public class forExample {
	
	/* for문
	 * -끝이 정해져 있는 (횟수가 정해져있는) 반복문
	 * -조건에 따라 한번도 수행되지 않을 수 있음
	 * 
	 * 
	 * [작성법]
	 * 
	 * for(초기식;조건식;증감식){
	 *	 반복 수행할 코드
	 * }
	 * 
	 *  - 초기식 :for문을 제어하는 용도의 변수 선언
	 * 
	 *  - 조건식 : for문의 반복 여부를 지정하는 식.(다음 반복 진행해?)
	 *  		 보통 초기식에 사용된 변수를 이용하여 조건식을 작성함.
	 *  
	 *  - 중감식 : 초기식에 사용된 변수를 
	 *  		for문이 끝날 때 마다 증가 or 감소 시켜서
	 *  		초기식의 결과를 변하게 하는 식
	 *  
	 * */
	
	public void ex1() {
		
		
		// 1 - 10 출력하기
		// -> 1부터 10까지  1씩 증가하여 출력
		// * 반복문읜 조건식이 true 일 때만 반복
		
		for(int i =1;i<=10; i++ ) {
		//1) 초기식  2) 조건식 3) 증감식
			
			System.out.println("i :" + i);
			//3) 반복 수행될 코드
			
		}
	}//ex1()
	
	
	public void ex2() {
		
		//3에서 7까지 1씩 증가하여 출력
		// 3 4 5 6 7
		for(int i =3;i<=7; i++ ) {
			//1) 초기식  2) 조건식 3) 증감식
				
				System.out.print(i);
				//3) 반복 수행될 코드
				
				
			}
		
	}//ex2()
	
	
	
	public void ex3() {
		
	// 1부터 입력받은 수까지 1씩 증가하며 출력	
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		
		for(int i =1;i<=temp; i++ ) {
			
			System.out.println(i);
			//
			
		}
		
		
		
		
	}//ex3()
	
	public void ex4() {
		//1.0부터 입력받은 실수까지 0.5씩 증가하여 출력
		Scanner sc = new Scanner(System.in);
		double temp = sc.nextDouble();
		
		for(double i = 1.0; i <= temp; i += 0.5) {

			System.out.println(i);
			// i += 0.5;
			
			
			
		}
		
	}//ex4()
	
	public void ex5() {
		//영어 알파벳 A 부터 Z까지 한줄로 출력
		//** char 차료형은 ?유니코드
		
		for( int i= 'A'; i <='Z'; i++ ) {
			System.out.print((char)i);
		}
			System.out.println("\n===============");
		for( char i= 'A'; i<='Z'; i++) {
			
			System.out.print(i);
		}
		
		
		
	}//ex5()
	
	
	public void ex6() {
		
		//응용문제
		//1부터 10까지 모든 정수의 합 구하기
		// => 합계 : 55
		
		int sum = 0; //반복되어 증가되는 i값의 합계를 저장할 변수
					//0으로 시작하는 이유 : 아무것도 더 하지 않음으로
					// 정확히 결과를 도출 할 수 있기 때문에 
		
	for(int i = 1; i <= 10; i++ ) {
				
		sum +=i;
		// sum = sum + i
	
	}
	System.out.println("합계 :" + sum);
	
	}//ex6()
	
	
	public void ex7() {
		//1부터 20까지 1씩 증가하면서 출ㄹ력
		// 단, 5의 배수에 ()를 붙여서 출력
		//ex) 1 2 3 4 (5) 6 7 8 9 (10)
	
		
		for(int i = 1; i <= 20; i++ ) {
			
			if(i % 5 == 0 ) {
				
				System.out.print( "(" + i + ") " );
				
			
				
			}else {//else 안쓰면 그 구문은 무조건 실행
				System.out.print( i + " " );
			}
			
			
		}
		
	
		
		
		
	}//ex7()
	
	//***중첩 반복문***//
	public void ex8() {
		//구구단 모두 출력하기
		for(int dan = 2; dan <= 9; dan++) { // 2~9 단까지 차례대로 증가
			for(int su = 1; su <= 9; su++) { //각 단에 곱해질 수 1~9까지 차례대로 증가
				System.out.printf("%2d X %2d = %2d\n",dan ,  su , dan * su);
				
			}
			System.out.println();//줄바꿈
		}
			
		
		
		
		
	}// ex8()
	
	public void ex9() {
		//구구단 역순 출력
		//9단~ 2단까지 역방향
		//곱해지는 수 1~9
		
		for(int dan = 9; dan >= 2; dan--) { //단 9 ~ 2
			for(int su = 1; su <= 9; su++) { //각 단에 곱해질 수 1~9까지 차례대로 증가
				System.out.printf("%2d X %2d = %2d\n",dan ,  su , dan * su);
				
			}
			System.out.println();//줄바꿈
		}
		
		
		
		
	}//ex9()
	
	
	public void ex10() {
		
		
//		12345
//		12345
//		12345
//		12345
//		12345
		
		for(int i = 1; i <= 5; i++) {// 5바퀴 반복하는 FOR문
		
		
			for(int j = 1; j <= 5; j++) {// 12345 한줄 출력하는  FOR문
				    System.out.print(j);
			
		
					}
			 System.out.println();
			
				}
		
		for(int x = 1; x <= 3; x++) {
			for(int y = 5; y <= 1; y--) {
				 System.out.print(y);
			}
				
			 System.out.println();
				
			
		}
	
	
	}//ex10()
	
	
	public void ex11() {
		
//		1
//		12
//		123
//		1234
//		============
//		4321
//		321
//		21
//		1
		
		for(int x = 1; x <=4; x++ ) {
			
				for(int i = 1; i <= x; i++ ) {
					System.out.print(i);
				
				
			}
				 System.out.println();
				
		}
		
		System.out.println("========");
		
		for(int x = 4; x >=1 ; x--) {
			for(int i = x; i >= 1;  i --) {
				System.out.print(i);
			}
			 System.out.println();
		}

		
		
	}//ex11()
	
}

