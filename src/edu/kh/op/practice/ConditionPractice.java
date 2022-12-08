package edu.kh.op.practice;

import java.util.Scanner;

public class ConditionPractice {

	

	public void practice1() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		String str = " ";

		if(num>0) {

			if(num%2==0) {
				str = "짝수입니다.";
			}else {
				str = "홀수입니다.";
			}

		}else {
			str = "양수만 입력해주세요.";

		}
		System.out.println(str);


		} //practice1




	public void practice2(){

		Scanner sc = new Scanner(System.in);

		System.out.print("국어점수 : ");
		int ko = sc.nextInt();

		System.out.print("수학점수 : ");
		int ma = sc.nextInt();

		System.out.print("영어점수 : ");
		int en = sc.nextInt();

		int sum = ko + ma + en;
		double avg = sum / 3;
		String str = " ";

		if(ko >= 40 && ma >= 40 && en >= 40 && avg >= 60) {

			System.out.printf("국어 : %d\n",ko);
			System.out.printf("수학 : %d\n",ma);
			System.out.printf("영어 : %d\n",en);
			System.out.printf("합계 : %d\n",sum);
			System.out.printf("평균 : %.1f\n",avg);
			str = "축하합니다, 합격입니다!";
		}else {
			str = "불합격입니다.";


		}
		System.out.println(str);




	}//practice2



	public void practice3(){

		Scanner sc = new Scanner(System.in);

		System.out.print("1~12 사이의 정수 입력 : ");
		int mon = sc.nextInt();

		switch (mon) {
		case 1: case 3:case 5:case 7:case 8:case 10:case 12: {
				System.out.printf("%d월은 31일까지 있습니다.",mon);
				break;
				
		}case 4: case 6:case 9:case 11: {
			System.out.printf("%d월은 30일까지 있습니다.",mon);
				break;
				
		}case 2:{
			System.out.printf("%d월은 28일까지 있습니다.",mon);
			break;
			
		}
		default:
			System.out.printf("%d월은 잘못 입력된 달입니다.",mon);
	}
		
		


	}//practice3
	
	
	
	public void practice4(){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("키(m)를 입력해 주세요 : ");
		double m = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();
		
		double bmi = kg / (m * m);
		System.out.printf("BMI 지수 : %.14f\n",bmi);
		String str = " ";
		
		
		if( bmi >= 30 ) {
			str = "고도 비만";
		}else if(bmi >= 25) {
			str = "비만";
			
		}else if(bmi >= 23) {
			str = "과체중";
			
		}else if(bmi >= 18.5) {
			str = "정상체중";
			
		}else {
			str = "저체중";
			
		}
		
		System.out.println(str);
		
				
		
	}//practice4

	
	public void practice5(){
		
		Scanner sc = new Scanner(System.in);

		System.out.print("중간 고사 점수 : ");
		int bet = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int las = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int wor = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		int att = sc.nextInt();
		
		
		
		
		
		
		
		double betSum = bet * 0.2;
		double lasSum = las * 0.3;
		double worSum = wor * 0.3;
		double attSum = (att/0.2)  * 0.2;
		
		double  allSum = betSum + lasSum + worSum + attSum;
		
		System.out.println("================= 결과 =================");
		
		if(20/0.3 > attSum/0.2) {
		
			System.out.print("Fail ");
			System.out.printf("[출석 횟수 부족 (%d/20)]",att);
		
		
			
		}else if(allSum >= 70) {
			
			System.out.println("중간 고사 점수(20) : "  + betSum) ;
			System.out.println("기말 고사 점수(30) : "  + lasSum) ;
			System.out.println("과제 점수    (30) : "  + worSum) ;
			System.out.println("출석 점수    (20) : "  + attSum) ;
			System.out.println("총점 : "  + allSum) ;
			System.out.println("PASS ");
			
			
			
		}else {
			
			System.out.println("중간 고사 점수(20) : "  + betSum) ;
			System.out.println("기말 고사 점수(30) : "  + lasSum) ;
			System.out.println("과제 점수    (30) : "  + worSum) ;
			System.out.println("출석 점수    (20) : "  + attSum) ;
			System.out.println("총점 : "  + allSum) ;
			System.out.print("Fail ");
			System.out.println("[점수 미달]");
		
			
			}
		
		
		
		

		
		
	}//practice5







	}




