package e_oop;

import java.util.Scanner;

public class MyMathTest {
	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println("정수 사칙연산 계산기 입니다.");
		Scanner sc = new Scanner(System.in);				    //받을 준비
		System.out.println("정수를 입력하세요.");
		String clear = "a";
		
		while(!clear.equals("c")){
			int num = sc.nextInt();								//값 저장
			System.out.println("+, -, *, / 를 입력하세요.   중간에 나가기: @");
			String buho = sc.next();
			if(buho.equals("@")){
				System.out.println("계산이 끝났습니다.");
				break;
			}
			System.out.println("계산할 정수를 입력하세요.");
			int num2 = sc.nextInt();
			
			String result = sc.next();
			System.out.print(num+buho+num2+result);
			

			if (buho.equals("+")){
				int sum = c.add2(num, num2);
				System.out.println(sum);
			}else if (buho.equals("-")){
				int minus=c.substract(num, num2);
				System.out.println(minus);
			}else if (buho.equals("*")){
				long mult= c.multiply(num, num2);
				System.out.println(mult);
			}else if(buho.equals("/")) {
				float div= c.divide(num, num2);
				System.out.println(div);
			}	
			System.out.println("끝내기: c");
			clear = sc.next();
		}
		System.out.println("계산이 끝났습니다.");



		//main 메서드 안을 비우세요
		//사용자로부터 정수값1, 사칙연산부호1, 정수값1 입력받기
		//부호에 따라 다른 메서드가 호출되도록
		//계산기를 완료해주세요

		//해당 계산기가 지속적으로 사용할 수 있도록 만들고, 부호 대신 @를 입력하였을 때 종료되도록 만들기.
	}

}

class Calc{
	int a = 10;
	int b = 20;

	void add1(){
		int result = a+b;
		System.out.println(result);
	}

	int add2(int x, int y){ //매개변수
		return x+y;
	}

	//int형 매개변수 두개를 받아서 먼저 받은 값에서 나중에 받은 값을 뺀 결과값을 반환하는 매서드를 만드세요
	//substract
	int substract(int x, int y){
		return x-y;
	}

	//정수값 두개를 받아 두 값의 곱을 반환하는 메서드를 만드세요
	//multiply
	//단, overflow를 고려하여 만드세요
	long multiply(int x, int y){
		return (long)x*y;
	}

	//정수값 두개를 받아 앞의 값을 뒤의 값으로 나눈 값을 반환하는 메서드를 만드세요
	//divide
	//단, 소숫점 셋째자리에서 반올림하여 둘째자리까지 표현해주세요
	float divide(int x, int y){
		float result = (int)((float)x/y*100+0.5)/100f;
		if (x==0 || y==0){
			System.out.println("실행할 수 없습니다.");
			result = 0;
		}
		return result;
//		float a=0;
//		if(!(x==0 || y==0)){
//			a = (int)((float)x/y*100+0.5)/100f;
//		}else{
//			System.out.println("다시 입력하세요");
//		}
//		return a;
	}


}