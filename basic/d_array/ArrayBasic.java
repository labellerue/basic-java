package d_array;

public class ArrayBasic {
	public static void main(String[] args) {
		/*
		1. 배열(array)란?
			- 같은 타입의 여러변수를 하나의 묶음으로 다루는 것
			- 참조형
			ex) int mathScore = 40;
				int engScore = 90;
				int sciScore = 60;
				int korScore = 100;
				int freScore = 20;
				
		2. 배열의 선언
			- 원하는 타입의 변수를 선언하고 변수 또는 타입에 배열임을 알리는 대괄호[]를 붙이면 된다
			ex) int[] score;	int형 배열을 변수명 score로 선언해준다
				int score[];
				
		3. 배열의 생성
			- 주소를 만들어준다/생성한다 라는 의미를 가짐
			- 배열의 생성을 위해서는 연산자 'new'와 함께 배열의 타입과 크기를 지정해 주어야 한다
			- 배열 안에 아무것도 입력되지 않았으면 기본값 (int는 0)으로 들어감
			ex) int[] score = new int[5];
				System
		
		 */
		

//		int[] score = new int[5];
//		System.out.println(score[0]);
//		System.out.println(score[1]);
//		System.out.println(score[2]);
//		System.out.println(score[3]);
//		System.out.println(score[4]); 
		
//		for( int i=0; i<score.length ; i++){
//			System.out.println(score[i]);
//		}
		
		//배열에 값 저장
//		score[0] = 0;
//		score[1] = 10;
//		score[2] = 20;
//		score[3] = 30;
		
//		for(int j = 0 ; j< score.length ; j++ ){
//			score[j] = j * 10;
//		}
		
		/*선언 2
		int[] score2 = new int[]{1,2,3,4};		//바로 값 넣어주기, 배열 크기는 4
		int[] score3 = {1,2,3,4};				//선언할 때만 new int[] 생략 가능
		*/

		
		//문제 
		//1. 6과목의 정수값을 저장할 수 있는 변수 score2를 선언 및 생성하세요
			int[] score2 = new int[6];
			
		//2. score2의 각방의 점수를 0~100점 사이의 랜덤한 값으로 초기화 하세요
/*			score2[0] = (int)(Math.random()*100);
			score2[1] = (int)(Math.random()*100);
			score2[2] = (int)(Math.random()*100);
			score2[3] = (int)(Math.random()*100);
			score2[4] = (int)(Math.random()*100);
			score2[5] = (int)(Math.random()*100);
*/
			for(int i = 0 ; i<score2.length ; i++ ){
				score2[i] = (int)(Math.random()*101);
			}
			
		//3. 모든 과목의 점수를 출력하세요
//			System.out.println(score2[0]);
//			System.out.println(score2[1]);
//			System.out.println(score2[2]);
//			System.out.println(score2[3]);
//			System.out.println(score2[4]);
//			System.out.println(score2[5]);
			
			for(int i = 0 ; i<score2.length ; i++){
				System.out.println(score2[i]);
			}
		
		//4. 과목의 합계를 구하세요	-sum
			int sum = 0;
			for(int i = 0 ; i<score2.length ; i++){
				sum += score2[i];
			}
			System.out.println("과목의 합계: " + sum);
			
		//5. 과목의 평균을 소숫점 셋째자리에서 반올림하여 둘째자리까지 표현해 주세요	-avg
			float avg;
			avg = (int)((float)sum/score2.length*100+0.5)/100f;
			System.out.println("모든 과목의 평균: " + avg);
		//6. 모든 과목중 최대값을 구하세요	-max	최대값의 범위를 100으로 잡지 말라
			int max = 0;
			for( int i =0 ; i<score2.length ; i++){
				if (max < score2[i]){
					max = score2[i];
				}
			}
			System.out.println("최대값: " + max);
		
		//7. 모든 과목중 최소값을 구하세요	-min	최소값의 범위를 0으로 잡지 말라
			int min = score2[0];
			for( int i =0 ; i<score2.length ; i++){
				if (min > score2[i]){
					min = score2[i];
				}
			}
			System.out.println("최소값: " + min);

	
		
		
		
		
	}

}
