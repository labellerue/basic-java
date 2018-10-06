package h_javaLang;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringIncode {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str = "가나";
//						 str.getBytes(String charsetName)
		byte[] strArr1 = str.getBytes("MS949");
		byte[] strArr2 = str.getBytes("CP949");
		byte[] strArr3 = str.getBytes("UTF-8");

		System.out.println(Arrays.toString(strArr1));
		System.out.println(Arrays.toString(strArr2));
		System.out.println(Arrays.toString(strArr3));
		
		
		
	}
}
