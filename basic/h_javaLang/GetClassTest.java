package h_javaLang;

import java.util.Arrays;

/**
 * getClass() 클래스 정보 얻어오는 3가지
 * @author soso
 *
 */
public class GetClassTest {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, ClassNotFoundException {
		//1. 객체를 통해서 얻어오는 방법
		Class obj = new Person(931231L).getClass();
		System.out.println(obj.getName());	//패키지명과 클래스명
//		System.out.println(obj.getField("id"));
		
		//2. 리터럴로부터 얻는 방법
		Class obj2 = Person.class.getClass();
		
		//3. 클래스의 이름으로 부터 얻는 방법
		Class obj3 = Class.forName("h_javaLang.Person");	//패키지명까지 써줘야함
		System.out.println(obj3.getName());
		System.out.println(Arrays.toString(obj3.getInterfaces()));
	}
}




