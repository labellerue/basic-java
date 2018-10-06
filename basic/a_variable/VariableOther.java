package a_variable;
/**
 * 변수의 타입에 대한 공부
 * @author 이소형
 * @since 2018.05.29
 *
 */
public class VariableOther {
	public static void main(String[] args){
		/*
		 1.기본형타입(Primitive type)
		 	- boolean, char, byte, short, int, long, float, double
		 	- 값을 저장함
		 2. 참조형타입(Reference type)(기본적으로 4byte)
		 	- 주소를 저장
		 
		 1-2. 기본형 타입의 종류
		 	- 논리형: true/ false 중 하나의 값만 저장 ex) boolean
		 	- 문자형: 문자 하나를 저장하는데 사용 ex) char
		 	- 정수형: 정수값을 저장하는데 사용 ex) byte, short, int, long
		 	- 실수형: 실수값을 저장하는데 사용 ex) float, double
		
		 1-3. 기본형 변수의 크기(1byte = 8 bit)
		 	- 1byte : boolean, byte  사실상 필요한 bit 개수는 1개(0과 1) 이어서 나머지 7bit는 공
		 	- 2byte : char, short
		 	- 4byte : int, float
		 	- 8byte : long, double
		 	
		 1-4. 논리형: boolean(기본값 false)
		 		-boolean형 변수에는 true와 false중 하나의 값을 저장할 수 있다.
		 		-boolean형 변수는 대답(yes,no), 스위치(on/off)
		 		-데이터를 다루는 최소단위가 1byte이므로 1byte형을 가지게 된다.
		 		ex) false의 값을 저장할 수 있는 변수 abc를 선언 및 초기화 하세요.
		 
		 문제: false 값을 가진 변수명 abc를 선언 및 초기화 하시오.
		 */
		boolean abc= false;
		System.out.println(abc);
		
		
		/*
		 1-5. 문자형: char(유니코드체계='\u0000')
		 		-java는 Unicode(16진수 세계)문자 체계를 이용한다. 2byte형을 취한다.
		 		  -->ASKY코드 'A' = 65(10진수) => 41(16진수)
		*/
		char a= 'A';
		char b= '\u0041';
		char c= 65;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
		/*
		 1-6. 정수형: byte, short, int, long
		 		-기본자료형은 int이다.(int 사용가능 최대 숫자 약 21억. 우리가 사용할 정도의 숫자는)
		 		-변수의 값을 저장하려면 정수값의 범위에 따라서 4개의 정수형 중에 하나를 선택해야 한다.
		 		-byte형이나 short형의 경우 크기가 작아서 범위를 넘는 잘못된 결과를 얻을 수 있다. 
		 		  그래서 int형을 사용하는 것이 좋다.
		 		-JVM의 피연산자 스택이 피연산자들을 4byte 단위로 저장하기 때문에 4byte형보다 작은 자료형의 연산시 4byte형으로 변환하여 연산된다.
		 		-overflow : 정수형
		 		  변수가 자신이 저장할 수 있는 범위를 넘었을 때 최소값부터 다시 표현하는 현상.
		 		  변수의 범위를 넘는 값으로 쵝화는 허용하지 않는다.
		 문제: 50의 값을 저장할 수 있는 변수를 선언 및 초기화 하세요. 변수명: b
		 */
		int b2 = 50;
		System.out.println(b2);
		
		long long2 = 9312312222222L; //long type임을 알려주기 위해 숫자 뒤에 L 입력
		
		byte b3 = 126;
		System.out.println(b3); //126
		b3++;
		System.out.println(b3); //127
		b3++;
		System.out.println(b3); //-128 -->overflow해서 가장 밑부터 다시 시작
		b3--;
		System.out.println(b3); //127 거꾸로 가면 다시 반대로

		/*
		 1-7. 실수형: float, double
		 		-실수형값을 저장하는데 사용된다.
		 		-float : 1+8+23
		 		-double : 1+11+52
		 		-실수형 중 사용할 자료형을 선택할때는 값의 범위뿐만 아니라 정밀도도 중요한 요소가 된다.
		 		-기본자료형은 double
		 */
		double d2 = 1.64519786546465789;
		float f2 = 1.64519786546465789f; //float type임을 알려주기 위해 숫자 뒤에 f 혹은 F 입력
		System.out.println(f2);			 //1.6451979 소수점 7자리까지밖에 출력 못함.
		
		double d3 = 0.1;				 //실재 0.1이 아니라 근사한 값
		float f3 = 0.1f;				 //실재 0.1
		double d4 = 0.5;				 //2의 -1승은.
		float f4 = 0.5f;				 //2의 몇승인 숫자는 double과 float가 같음.
		
		
		/*
		 2-1. String
		 		-문자열을 다루는 클래스이다.
		 		-java에서 제공해주는 자료형 클래스
		 */
		String strr = "";
		String str = null;				 //기본 문자열
		str = "the length of the String is not limited";
		
		System.out.println(5+"sdf");	 // 5sdf 더 강한 쪽으로 형을 맞춰짐
		System.out.println(true+"sdf");	 // truesdf 문자열로 바뀜
		System.out.println("======\t-------"); //tab
		System.out.println("======\n-------"); //newline
		/*
		 3. 형변환(casting)
		 		-변수 또는 리터럴(값)의 타입을 다른 타입으로 변환하는 것이다.(참조형으로는 안됨)
		 */
		int i3 = 65;
		byte b4 = (byte)i3; //변환하고자 하는 타입을 앞에 괄호 안에 써줌
		char c3 = (char)i3;
		System.out.println(c3);
		
		float f5 = 3.141592f;
		int i5 = (int)f5;
		System.out.println(i5); //실수가 정수타입으로 바뀌면서 소수점이 완전 잘림
		
		int i6 = b4;		//int>byte 이기 때문에 형 변환과정 생략 가능
							//int를 byte로 변환하는 경우에서는 큰type이 작은type으로 들어가기 때문에 형변환을 해주는 것 
		
		
		
		
	}

}
