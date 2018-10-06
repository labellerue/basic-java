package h_javaLang;

import java.util.StringTokenizer;


public class StringTokenizerTest {
	public static void main(String[] args) {
		
		String text = "100,200,300,400";
		StringTokenizer st = new StringTokenizer(text, ",");
		
		while(st.hasMoreTokens()){//토큰이 있느냐
			System.out.println(st.nextToken());
		}//다 돌면 st1내용 사라짐
		
		System.out.println("---------split----------");
		String data = "100,,,200,,300,400";//,다음 공백도 값으로 인정
		String[] dataArr = data.split(",");
		for(int i=0; i<dataArr.length ; i++){
			System.out.println(dataArr[i]);
		}
		
		System.out.println("---------StringTokenizer----------");
		StringTokenizer st2 = new StringTokenizer(data, "0,"); //모든 구분자 0과 ,를 빼고 구분하여 1 2 3 4출력
		while(st2.hasMoreTokens()){//토큰이 있느냐
			System.out.println(st2.nextToken());
		}//다 돌면 st2내용 사라짐
			
			
	}
}
