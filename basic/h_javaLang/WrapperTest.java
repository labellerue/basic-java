package h_javaLang;

public class WrapperTest {
	public static void main(String[] args) {
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));	//toString 오버라이딩 되어서 값을 비교
		
		System.out.println(i1);	//toString 오버라이딩 되어 값을 출력
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);//비트 찾기
//		System.out.println(Integer.BYTES);//1.8버전에 있음
		
		Integer bb = 70;//객체에 기본형을 넣으면 객체타입으로 자동 전환 => autoboxing
		int a = new Integer(45);//unboxing
		
		Integer[] aaArr = {new Integer(100)};
		Integer[] aaArr2 = {100};
		int b = aaArr2[0];
		
		method(500);//자동 형변환 autoboxing
	}
	static void method(Object obj){
		System.out.println(obj);
	}
	
	
}
