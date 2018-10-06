package d_array;

import java.util.Arrays;

public class ArrayOther {
	public static void main(String[] args) {

		/*
		1. 다차원 배열
			- 자바에서는 1차원 배열뿐만 아니라 2차원 이상의 다차원 배열도 허용한다.
			- 2차원 배열의 선언
				선언 방법			선언예
			   타입[][] 변수명;	  int[][] score;
			   타입 변수명[][];	  int score[][];
			   타입[] 변수명[];	  int[] score[];

		 */
		//		int[][] score3 = new int[3][];
		//		score3[0] = new int[3];				//0번 큰 배열에 들어있는 작은 배열의 크기
		//		score3[1] = new int[4];				//1번 큰 배열에 들어있는 작은 배열의 크기
		//		score3[2] = new int[5];				//2번 큰 배열에 들어있는 작은 배열의 크기
		//		
		//		System.out.println(score3.length);	//큰 방 크기가 얼마냐
		//		System.out.println(score3[2].length);//큰 방의 2번 방 크기가 얼마냐

		//{10,20,30}
		//{40,50,60,70}
		//{80,90,100,110,120}
		//		score3[0][0] = 10;
		//		score3[0][1] = 20;
		//		score3[0][2] = 30;
		//		score3[1][0] = 40;
		//		score3[1][1] = 50;
		//		score3[1][2] = 60;
		//		score3[1][3] = 70;
		//		score3[2][0] = 80;
		//		score3[2][1] = 90;
		//		score3[2][2] = 100;
		//		score3[2][3] = 110;
		//		score3[2][4] = 120;

		//0번 방에는 모두 10, 1번 방에는 모두 20, 2번 방에는 모두 30값 넣기
		//		int j ;
		//		for (int i = 0 ; i<score3.length ; i++){			//큰 배열
		//			for (j = 0 ; j<score3[i].length ; j++){			//작은 배열
		//				
		//				score3[i][j] = 10*(i+1);
		//				
		//			}
		//		}

		//사람 이름 7명 저장, 왼쪽에 사람 이름 찍히도록 출력
		String[] student = {"유민지", "변찬우", "이소형", "박찬배", "박진", "김지태", "나진실"};
		String[] subject = {"국어", "영어", "수학", "사회", "과학", "자바"};

		//1. 7명의 6과목을 저장할 수 있는 변수를 선언 및 생성해주세요.  -score
		int[][] score = new int[student.length][subject.length];		//int[7][6]

		//2. score변수의 모든 방을 0~100 사이의 랜덤한 정수값을 저장해주세요.
		for(int i=0 ; i<score.length ; i++){
			for(int j=0 ; j<score[i].length ; j++){
				score[i][j] = (int)(Math.random()*101);
			}
		}
		
		//이름별 합계
		int[] allSum = new int[student.length];
		for(int i=0 ; i<student.length ; i++){
			for(int j=0 ; j<subject.length ; j++){
				allSum[i] += score[i][j];
			}
		}
		
		//이름별 평균
		float[] avg = new float[student.length];
		for(int i=0 ; i<student.length ; i++){
			avg[i] = (int)((float)allSum[i]/subject.length*100+0.5)/100f;
		}
	
		
		//과목별 합계
		int[] subSum = new int[subject.length];
		for(int j=0 ; j<subject.length ; j++){
			for(int i=0 ; i<student.length ; i++){
				subSum[j] += score[i][j];
			}
		}
		
		//과목별 평균
		float[] subAvg = new float[subject.length];
		for(int j=0 ; j<subject.length ; j++){
			subAvg[j] = (int)((float)subSum[j]/student.length*100+0.5)/100f;	
		}
		
		
		//등수
		int[] rank = new int[student.length];
		for(int i=0 ; i<student.length ; i++){
			int count = 1;
			for(int j=0 ; j<student.length ; j++){
				if (allSum[i]<allSum[j]){
					count++;					
				}
			}
			rank[i] = count;
		}
		
		
		
		
		//등수 내림차순
//		for ( int j = 0 ; j<rank.length ; j++){
//			for ( int i = 0; i<rank.length -1-j ; i++){
//				if(rank[i] > rank[i+1]){
//					int temp = num[i];
//					num[i] = num[i+1];
//					num[i+1] = temp;	
//				}
//				for (int k = 0 ; k<num.length; k++){
//					System.out.print(num[k] + "  ");
//				}
//				System.out.println("");
//			}
//		}
		
	
		
		//출력문장
		for(int k=0 ; k<subject.length ; k++){				//위에 6과목 출력
			System.out.print("\t" + subject[k]);		
		}
		System.out.print("\t" + "합계");
		System.out.print("\t" + "평균");
		System.out.println("\t" +"등수");
		
		for(int i=0; i<score.length ; i++){
			System.out.print(student[i]+"\t");				//왼쪽에 7명 이름 출력
			for(int j=0 ; j<score[i].length ; j++){
				System.out.print(score[i][j] + "\t");		//점수 출력
			}
			System.out.print(allSum[i]);					//이름별 합계 출력
			System.out.print("\t" + avg[i]);				//이름별 평균 출력
			System.out.print("\t" + rank[i]);
			System.out.println();
		}
		System.out.print("과목합계: ");						//과목별 합계
		for(int k=0 ; k<subject.length ; k++){
			System.out.print(subSum[k] + "\t");
		}
		System.out.println();
		System.out.print("과목평균: ");						//과목별 평균
		for(int k=0 ; k<subject.length ; k++){
			System.out.print(subAvg[k] + "\t");
		}
		System.out.println();
		
		





	}

}
