package h_javaLang;

import java.util.Date;

/**
 * String 클래스
 * @author soso
 *
 */
public class StringTest01 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println(str1 == str2); //클래스가 로드될 때 heap메모리가 주소를 찾아가게 됨. 같은 주소
		System.out.println(str1.equals(str2));
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));//equals 메서드가 오버라이딩 되어서 값을 비교하도록 되어있다.
		
		Date d1 = new Date(20180704L);
		Date d2 = new Date(20180704L);
		System.out.println(d1 == d2);
		System.out.println(d1.equals(d2));
		
	}
}
