package h_javaLang;

import java.util.Arrays;

public class StringMethod {
	public static void main(String[] args) {
//		char charAt(int index) : 지정된 index번째 문자를 리턴한다.
		String s = "Hello";
		char c = s.charAt(1);
		
//		Oracle에서도 사용하는 똑같은 메서드
//		1. String concat(String str) : 문자열을 뒤에 덧붙인다.
		String s2 = s.concat(" Oracle");
		System.out.println(s2);
		
//		2. boolean contains() : 지정된 문자열이 포함되어 있는지 확인한다.
		System.out.println(s2.contains("Or"));
		
//		확장자 처리에 유용한 것
//		1. boolean endsWith() : 지정된 문자열로 끝나는지 확인
		String s3 = "구인수가방에들어가신다.txt";
		System.out.println(s3.endsWith(".txt"));
		
//		그 외 중요한 메서드들
//		1. int lastIndexOf() 
//				: 지정된 문자 또는 문자코드를 문자열의 오른쪽 끝에서부터 찾아서 해당 인덱스를 반환해준다.
		System.out.println(s3.lastIndexOf("다"));//10 다의 index 번호
		System.out.println(s3.lastIndexOf("귀"));//없으면 -1 
		
//		2. String replace() : 문자열중의 문자를 새로운 문자열
		String s4 = s2.replace("Oracle", "Java");	//"Oracle"을 "Java"로 바꿈
		System.out.println(s4);
		
//		3. String[] split() : 문자열을 지정된 분리자로 나누어 문자열 배열에 담는다.
		String s5 = "100,200,300,400";
		String[] s6 = s5.split("0,");
		System.out.println(Arrays.toString(s6));
		
//		4. String subString() : 앞이 포함, 뒤 미포함. 
//				주어진 문자열을 시작부터 끝 범위에 포함된 문자열을 얻는다.
		String s7 = s3.substring(3, 5);
		System.out.println(s7);
		String s8 = s3.substring(0, s3.lastIndexOf("."));//0번 인덱스에서 .이전까지
		System.out.println(s8);
		
//		5. String trim() : 문자열 양끝의 공백을 제거한다.
		String s9 = "	My	Trim	";
		String s10 = s9.trim();
		System.out.println(s10);
		
		
		
		
		
	} 
}
