package c_sentence;

import java.util.Scanner;

import com.sun.xml.internal.stream.Entity.ScannedEntity;

public class Sentence02 {
	public static void main(String[] args) {
		/*
		1. 반복문
			- for, while, do-while
			- 어떤 작업이 반복적으로 수행되도록 할 때 사용된다.
			- 반복문은 주어진 조건이 만족하는 동안 주어진 문장을 반복적으로 수행
			- for문은 주로 반복 횟수를 알고 있을 때, while 반복횟수를 모를때 사용한다.
			
		2. for문
			- 기본구조
			  for( 초기화 ; 조건식 ; 증감식 ){
			  	  조건식이 true일 때 수행될 문장
			  }
		 */
		
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		
		//시작 : 0  끝 : 10  증가량 : 1			
		for( int i = 0 ; i<11 ; i++ ){		//i는 지역변수
			System.out.println(i);	
		}
		
		//5~15까지의 합계를 구하세요
		int sum = 0;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;
		sum += 11;
		sum += 12;
		sum += 13;
		sum += 14;
		sum += 15;
		
		sum = 0;
		for( int i = 5 ; i < 16 ; i++ ){
			sum += i; 				  
		}
		System.out.println("5부터 15까지의 합은 "+sum);
		
		//5~15까지의 짝수의 합계를 구하세요
		sum = 0;
		for( int i = 5; i < 16 ; i++ ){
			if(i%2==0){
			sum += i;
			}
		}
		System.out.println("5부터 15까지 짝수의 합은 "+sum);
		
		
		/*
		3. while문
			- 반복횟수를 모를 때 많이 사용한다.
			- 조건식과 수행해야할 블럭{}만으로 구성되어 있다.
			- 기본구조
			  while(조건식){
			  	수행될 문장
			  }
		 
		 */
		for( int i = 0; i < 10 ; i++ ){
			System.out.println(i);	
		}
		
		int i = 0;
		while (i < 10){
			System.out.println(i);
			i++;
		}
		
		//23~1092까지의 합계를 구하세요
		/*
		int j = 23;
		sum = 0;
		while (j < 1093){
			sum += j;
			j++;
		}
		System.out.println(sum);
		*/
		
		//3의 배수만 더하라
		int j = 23;
		sum = 0;
		while (j < 1093){
			if(j%3==0){
			sum += j;
			}
			j++;
		}
		System.out.println(sum);
		
		
		//1~몇까지 더했을 때 100 이상이 될까?
		
		int start = 0;
		int sum3 = 0;
		while (sum3 < 100){
			start++;
			sum3 +=start;
		}
		System.out.println(start);
		
		/*
		int start2 = 1;
		int sum4 = 0;
		while(true){			//무한 실행
			sum4 += start2;			
			if(sum4 >= 100){
				break;			//조건식을 만족했을 때 반복문을 나감
			}
			start2++;
		}*/
		/*
		Scanner sc = new Scanner(System.in);					//콘솔창으로 사용자 입력값 받는 클래스
		System.out.println("합계가 몇 이상일지 숫자를 입력하세요.");
		int endSum = sc.nextInt();								//숫자를 입력받아 저장
		//String str = sc.next();									//문자열을 입력받아 저장

		int start3 = 1;
		int sum5 = 0;
		while(true){	
			sum5 += start3;
			if(sum5 >= endSum){
				break;			
			}
			start2++;
		}
		System.out.println(start3);
		
		System.out.println("문자를 입력해주세요");
		String str = sc.next();				//문자열을 받을 때 이용
		System.out.println(str);
		*/
		
		// 2 * 1 = 2
		int dan = 2;
//		int gob = 1;
/*		System.out.println(dan + " * " + 1 + " = " + dan*1);
		System.out.println(dan + " * " + 2 + " = " + dan*2);
		System.out.println(dan + " * " + 3 + " = " + dan*3);
		System.out.println(dan + " * " + 4 + " = " + dan*4);
		System.out.println(dan + " * " + 5 + " = " + dan*5);
		System.out.println(dan + " * " + 6 + " = " + dan*6);
		System.out.println(dan + " * " + 7 + " = " + dan*7);
		System.out.println(dan + " * " + 8 + " = " + dan*8);
		System.out.println(dan + " * " + 9 + " = " + dan*9);
*/
/*		
		for(int gob = 1 ; gob<10 ; gob++){
			System.out.println(dan + " * " + gob + " = " + dan*gob);
		}
		
		dan = 3;
		for(int gob = 1 ; gob <10 ; gob++){
			System.out.println(dan + " * " + gob + " = " + dan*gob);
		}
*/
/*		
		for ( dan = 2 ; dan < 10 ; dan++){
			for ( int gob = 1 ; gob < 10 ; gob++ ){
				System.out.println(dan + " * " + gob + " = " + dan*gob);
			}
		}
		
		//짝수단 홀수곱
		for ( dan = 2 ; dan < 10  ; dan++){
			if(dan%2 ==0){
				for ( int gob = 1 ; gob < 10 ; gob++ ){
					if(gob%2 !=0){
					//if(dan%2 == 0 && gob%2 != 0)			//이렇게 if문 하나만 사용할 수 있음
						System.out.println(dan + " * " + gob + " = " + dan*gob);
					}
				}
			}
		}
*/
		/*
		dan = 2;
		while (dan < 10){
			int gob = 1;
			
			while (gob < 10){
				System.out.println(dan + " * " + gob + " = " + dan*gob);
				gob++;
			}
			dan++;
		}
*/		
		
		dan = 2;
		int gob = 1;
		while (gob < 10){
			System.out.println(dan + " * " + gob + " = " + dan*gob);
			gob++;
		}
		
		/*
		4. do-while문
			- while문의 변형으로 기본구조는 while문과 같으나 블럭{}을 먼저 수행하고 조건식을 판단한다.
			- 1실행 - 2조건 확인 - 3조건이
			- 기본구조
			  do{
			  
			  }while(조건식);
		*/
		
		// 
		Scanner sc = new Scanner(System.in);
		
		String str = null;
		do{
		System.out.println("문자열을 입력해주세요. 그만하려면 x를 입력해주세요.");
		str = sc.next();
		System.out.println(str);
		
		}while(!str.equals("x"));				//참조형이 같은가를 비교할 때는 .equals() 사용
	
		
		/*
		5. break문 
			- 현재 위치에서 가장 가까운 switch문 또는 반복문을 나갈 때 사용한다.
			
		6. continue문
			- 반목문 내에서만 사용할 수 있다.
			- 반복문 끝으로 이동하여 반복문으로 넘어간다.
		 */
		for ( int k = 0; k < 20 ; k++){
			if ( k%2 == 0 ){
				continue;					//조건식에 맞으면 다음 반복문으로 넘어가라
			}
			System.out.println(k);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
