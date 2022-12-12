package edu.kh.op.practice;

import java.util.Scanner;

public class LoopPractice {

	

	
	public void practice1(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
			
		if(input < 1) {
			System.out.print(" 1이상의 숫자를 입력하세요");
			
				
		}else {
			for(int i =1; i<= input;i++) {
			System.out.print(i);
		}
			
		}
		
	}
	
	public void practice2(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		int i = input;
		
			
			if(input < 1) {
				System.out.print(" 1이상의 숫자를 입력하세요");
				
					
			}else {
				for(; i>= 1;i--) {
				System.out.print(i);
			}
			
			
			
		}
		
		
	}
	
	public void practice3(){

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		int sum = 0;
		
		for(int i= 1; i<=input; i++) {
			System.out.print(i);
		
				sum +=  i;
				if(i!=input) {
					System.out.print("+");
				}
				
			}
			System.out.println("="+ sum);
		
		
	}

	
	public void practice4(){

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 : ");
		int input1 = sc.nextInt();
		System.out.println("두번째 숫자 : ");
		int input2 = sc.nextInt();
		
		if(input1<1 || input2<1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			
		}else {
			
			
			System.out.println(input1 + "," + input2);
			
			
		}
		
		
		
	}

	
	public void practice5(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		int sum = 0;
		System.out.println("===== " + input+"단 ======");

			
			for(int f= 1; f<=9; f++) {
				System.out.printf("%d * %d",input,f);
	
				System.out.println(" = "+input * f);
				
				
			}
			System.out.println();
			
			
		}
		
	public void practice6(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		if(input<2 || input>9) {
		
			System.out.println("2~9 사이 숫자만 입력해주세요");
	
		}else {
			
			for(;input<=9;input++) {
		
				System.out.println("===== " + input+"단 ======");
			
			
				for(int f= 1; f<=9; f++) {
			
		
				System.out.printf("%d * %d",input,f);
	
				System.out.println(" = "+input * f);
				
			}
			
			}
			
			System.out.println();
		}
		
	}
	
	public void practice7(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i<=input; i++) {
	
			for(int j =0; j<i; j++) {
				
		
			System.out.print("*");
		}
			System.out.println();
			
		}
			
		
		
	}
	
	
	public void practice8(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
	
			
			for(int j =input; j<=input; j--) {
			
				
				for(int i = 1;  i<=j; i++) {
					System.out.print("*");
					
			
		}
			
				
			
		}
			
			
		
	}

	public void practice9(){

		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		//행열
		//1회전때 row 1회전
		//antmsthfldi?
				
			
			for(int row =1; row<=input; row++) {
				for(int co1 = 1; co1 <=input; co1++) {
					// 1)1 <= 4 -1
					// 2)2 <= 4 -2
					// 3)3 <= 4 -2
					// 4)4 <= 4 -2
					if(co1 <= input - row) {
						System.out.print(" ");
					}else {
						System.out.print("*");
						
					}
				}
				System.out.println();
			
				
			
			
		}
			
			
			
		
	}



	public void practice11() {
/*		
		*
	   ***
	  *****
	 *******
    *********  <= input *2  -1
		
*/		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		for(int row = 1; row <= input; row ++) {
			for(int col = 1; col <=input * 2 - 1; col++) {
				//마지막 줄의 별 갯수 : input에 2를 곱한값의 -1
				//    row col   // 	  row col
				// 4 - 1 >= 1 //  4 + 1 <= 1  true
				// 4 - 1 >= 2 //  4 + 1 <= 2  true
				// 4 - 1 >= 3 //  4 + 1 <= 3  true
				// 4 - 1 >= 4 //  4 + 1 <= 4  false
				if(input - row >= col || input + row <= col) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

	public void practice12() {
		
	Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1 ; row <= input ; row++) {
			
			for(int col = 1 ; col <= input ; col++) {
				
				// 첫 번째 / 마지막 줄, 칸일 때만 * 출력
				// 입력한 인풋의 길이만큼 행열 길이를 지정
				if(row == 1 || row == input || col == 1 || col == input) {
					System.out.print("*");
				}else {
					System.out.print("★");
				}
			}
			System.out.println();
		}
		
	}
	
	public void practice13() {
		
		
		//2의 배수 또는 3의 배수인 경우 출력
		// => 2나 3으로 나누었을때 나머지값이 0인경우
		//조건 2) 2와 3의 공배수?
		//=> 2로도 나누어 떨어지고, 3으로도 나누어 떨어지는 공통의 배수
	Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();

		int count = 0;
		
		for(int i = 1; i <= input ; i++) {
			
			// 2의 배수 또는 3의 배수인 경우 출력
			// => 2나 3으로 나누었을때 나머지값이 0인 경우
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
				
				// 2와 3의 공배수라는말은? 
				// ==> 2로도 나누어 떨어지고, 3으로도 나누어 떨어진다
				if(i % 2 == 0 && i % 3 == 0) {
					count++; // count 증가
				}
			}
		}
		
		System.out.println("\ncount : " + count);
	}
	
	
	
}


	
	
