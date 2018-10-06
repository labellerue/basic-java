package d_array;

import java.util.Arrays;

public class SortBasic {
	public static void main(String[] args) {
		
		/*
		1. 정렬
			- 빠르고 쉽게 찾기 위해 순서대로 데이터를 가지런히 나열
			- 버블정렬, 선택정렬, 삽입정렬
		
		2. 버블정렬(bubble sort)
			- 인접한 데이터간에 교환이 계속적으로 일어나며 정렬이 이루어짐
			- 오름차순 기준 가장 큰 값을 뒤로 보냄
			  ex. { 5 2 3 1 4 }
			        2 3 1 4 5  1회차
			        2 1 3 4 5  2회차....
			        - 기준이 되어 크기를 비교하며 큰 수를 뒤로 보냄
			        
		3. 선택정렬(select sort)
			 - 정렬의 대상에서 최소값을 찾아서 맨앞의 내용과 교체하는 방식
			 - 한 회전 후 가장 작은 수가 기준방에 확정
			
		4. 삽입정렬(insert sort)
			- 정렬의 대상을 하나씩 늘려가면서 정렬이 필요한 요소를 선택해 적절한 위치에 삽입해 가는 방식이다.
			ex. 정렬 5 2 3 1 4
				1회 2 5/3 1 4	2와 5 정렬하고 뒤는 밀어버림
				2회 2 3 5/1 4	2, 3, 5 정렬하고 뒤는 밀어버림
				3회 1 2 3 5/4	1, 2, 3, 5 정렬하고 뒤는 밀어버림
				4회 1 2 3 4 5
			
			
			
			
		 */
		
		
		int[] num = {5,2,3,1,4};
	
		for ( int j = 0 ; j<num.length ; j++){
			for ( int i = 0; i<num.length -1-j ; i++){
				if(num[i] > num[i+1]){
					int temp = num[i];
					num[i] = num[i+1];
					num[i+1] = temp;	
				}
				for (int k = 0 ; k<num.length; k++){
					System.out.print(num[k] + "  ");
				}
				System.out.println("");
			}
		}

		
//내가 푼 것		
		int[] num2 = {5,3,1,4,2};
		for (int j = 0 ; j<num2.length-1 ; j++){
			int min = j;
			for(int i = j+1 ; i<num2.length ; i++){
				if (num2[min]>num2[i]){					//방 번호를 알아내기
					min = i;
				}
			}
			System.out.println(Arrays.toString(num2));
			int temp = num2[j];
			num2[j] = num2[min];
			num2[min] = temp;
		}
//2번		
		for (int i = 0 ; i<num2.length-1 ; i++ ){
			
			int min = num2[i];
			int minBang = i;							//방값 저장하는 변수 따로
			for(int j = 1+i ; j<num2.length ; j++ ){
				if(min>num2[j]){
					min = num2[j];
					minBang = j;
				}
			}
			int temp = num2[i];
			num2[i] = num2[minBang];
			num2[minBang] = temp;
		}
		
		
		
	




			

		
		
		
	}

}
