package z_exam;

public class Exam02 {
	public static void main(String [] args){
		/*
		[2-1] 다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
				1byte	2byte	4byte	8byte
		----------------------------------------
		논리형 :	boolean
		문자형 :			char
		정수형 :	byte	short	int		long
		실수형 :					float	double
		
		[2-2] 주민등록번호를 숫자로 저장하고자 한다. 이 값을 저장하기 위해서는 어떤 자료형(data type)을 선택해야 할까? 
		regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로 초기화 하는 한 줄의 코드를 적으시오.
		long regNo = 9312312222222L;	//정수 byte, short, int 로 표현하기에 너무 큰 숫자이므로 이 숫자를 담을 수 있는 long 형태로 사용
										//byte:127, short:32767(2의15제곱근-1), int:약 21억

		[2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
		int i = 100;
		long l =100L;
		final float PI = 3.14f;
		- 리터럴 : 100, 100, 3.14f	//값
		- 변수 : i, l			//선언된 변수
		- 키워드 : int, long, final, float		//예약어
		- 상수 : PI					//바뀌지 않는 값
		
		[2-4] 다음 중 기본형(primitive type)이 아닌 것은?
		a. int
		--b. Byte		//소문자 byte 형태가 기본형임
		c. double
		d. boolean

		[2-5] 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 ‘오류’라고 적으시오.
		System.out.println(“1” + “2”) → ( )		String + String = String/ "1"+"2"="12"		//문자열 1과 문자열 2가 출력됨
		System.out.println(true + “”) → ( )		Boolean + String = String/ "true"+""="true"	//String이 더 크기 때문에 작은 것이 따라감
		System.out.println(‘A' + 'B') → ( )		char + char => int + int = int/ 65+66=131	//JVM은 기본적으로 4byte로 변환되기 때문에 가장 기본형인 int로 자동 변환
																							//ASKY 코드에 따라 int형으로 변환되어 계산
		System.out.println('1' + 2) → ( )		char + int = int/ 49+2=51					//ASKY 코드에 따라 char 1은 정수로 49
		System.out.println('1' + '2') → ( )		char + char => int + int = int/ 49+50=99	//ASKY 코드에 따라 int형으로 변환되어 계산
		System.out.println('J' + “ava”) → ( )	char + String = String/ "J"+"ava"="Java"	//String이 더 크기 때문에 작은 것이 따라감
		System.out.println(true + null) → (오류)	boolean + null = error						//기본형이 아닌 참조형 null
		
		[2-6] 다음 중 키워드가 아닌 것은?(모두 고르시오)
		a. if
		--b. True		//예약어는 기본적으로 대소문자의 구분을 함.
		--c. NULL
		--d. Class
		e. System		//기본적으로 제공하는 클래스명
		
		[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오)
		--a. $ystem
		b. channel#5	//변수에 사용 가능한 기호는 _와 $
		c. 7eleven		//맨 앞에 숫자가 나올 수 없음
		--d. If			//앞이 대문자이기 때문에 예약어가 아닌 변수로 사용 가능
		e. 자바			//사용할 수 있으나 프로그래머들 사이에서 암묵적인 약속으로 한글을 사용하지 않음
		f. new			//예약어
		g. $MAX_NUM		//상수로 사용하기로 약속
		h. hello@com	//변수에 사용 가능한 기호는 _와 $
		
		[2-8] 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? (모두 고르시오)
		--a. int		//4byte
		b. long			//8byte
		c. short		//2byte
		--d. float		//4byte
		e. double		//8byte
		
		[2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
		byte b = 10;
		char ch = 'A';
		int i = 100;				//byte->short->int->long->float->double
		long l = 1000L;						char->
		a. b = (byte)i;				//int를 byte로 변환하려할 때 자릿수가 모자라기 때문에 형변환 필요	
		b. ch = (char)b;			//byte를 char로 변환하려할 때 서로 관계성이 적기 때문에 형변환 필요	
		c. short s = (short)ch;		//char을 short로 변환하려할 때 서로 관계성이 적기 때문에 형변환 필요
		--d. float f = (float)l;	//long보다 float가 더 크기 때문에 생략 가능
		--e. i = (int)ch;			//char보다 int가 더 크기 때문에 생략 가능

		[2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오)
		char은 2byte=16bit이므로 0~2의 16승 -1= 0~65,535
		
		[2-11] 다음중 변수를 잘못 초기화 한 것은? (모두 고르시오)
		--a. byte b = 256;			//byte가 담을 수 있는 최대 큰 수는 127 
		--b. char c = '';			//char에 어떠한 것이라도 들어가야 인식함
		--c. char answer = 'no';	//char은 한 글자만 담을 수 있다
		--d. float f = 3.14			//마지막에 문장 끝맺음 ;이 없다
		e. double d = 1.4e3f;		//float 보다 double이 크므로 형변환이 됨.
		
		[2-12] 다음 중 main메서드의 선언부로 알맞은 것은? (모두 고르시오)
		--a. public static void main(String[] args)
		--b. public static void main(String args[])
		c. public static void main(String[] arv)
		d. public void static main(String[] args)
		e. static public void main(String[] args)

		[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오)
		a. boolean - false		//boolean의 기본값은 false
		b. char - '\u0000'		//문자의 기본값은 유니코드
		--c. float - 0.0		//0.0f
		d. int - 0				//0은 정수
		--e. long - 0			//0L
		--f. String - ""		//참조형 타입의 기본형은 null
		

		*/
		
		double d = 1.4e3f;
		System.out.print(d);
		System.out.print(1.25);
		
	}

}
