package h_javaLang;

/**
 * StringBuffer클래스
 * @author pc02
 *
 */
public class StringBufferTest01 {
	public static void main(String[] args) {
		/*
		String문자열에 "a"를 3만번 더하는 과정
		String str = "a";
		str += "a";
		str += "a";
		str += "a";
		str += "a";
		...
		이것이 구현되는 방법 : 
		String str ="a";
		str = new StringBuffer(str).append("a").toString();
		str = new StringBuffer(str).append("a").toString();
		str = new StringBuffer(str).append("a").toString();
		str = new StringBuffer(str).append("a").toString();
		...
		 */
		
//		String str = "a";
//		long start = System.currentTimeMillis();
//		for(int i=0; i<300000 ; i++){
//			str += "a";
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end-start);
		
//		StringBuffer sb = new StringBuffer("a");	//thread 양쪽을 맞춰주어야 함
//		long start = System.currentTimeMillis();
//		for(int i=0; i<30000000 ; i++){
//			sb.append("a");
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end-start);
		
		StringBuilder sb = new StringBuilder("a");	//필요할 때만 맞춰줌 ex.동기화
		long start = System.currentTimeMillis();
		for(int i=0; i<30000000 ; i++){
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
