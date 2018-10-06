package z_exam;

public class Exam03 {

		
		/*
		 [3-1] 다음 연산의 결과를 적으시오.
		 산술 비교 논리 대입
		 단항 이항 삼항
		 class Exercise3_1 {
		 	public static void main(String[] args) {
		 	int x = 2;
		 	int y = 5;
		 	char c = 'A'; // 'A'의 문자코드는 65
		 	System.out.println(1 + x << 33);				// 1 + 2 << 33 = 3<<33 = 2^2+2^1 = 6
	 		System.out.println(y >= 5 || x < 0 && x > 2);	//true
	 		System.out.println(y += 10 - x++);				// (y + 10 = 15 - 2) 13	//x = 3	, y = 13
	 		System.out.println(x+=2);						// (3 + 2 = 5) 5 
	 		System.out.println( !('A' <= c && c <='Z') );	// false	연산 규칙 상 char은 4byte 형태로 바뀌기 때문에 'A'
	 		System.out.println('C'-c);						// 연산 시 4byte 형으로 전환 (67 - 65) 2
	 		System.out.println('5'-'0');					// 연산 시 4byte 형으로 전환 (53 - 48) 5
	 		System.out.println(c+1);						// 연산 시 4byte 형으로 전환 (65 + 1) 66
	 		System.out.println(++c);						// B	66은 ASKY코드에 의하면 B //c = 66
	 		System.out.println(c++);						// B	66은 ASKY코드에 의하면 B //c = 67
	 		System.out.println(c);							// C	//c = 67
		 	
		 	}
		 }
		 
		 [3-2] 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다. 만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 
		 13개의 바구니가 필요할 것이다. (1)에 알맞은 코드를 넣으시오.
		 class Exercise3_2 {
		 	public static void main(String[] args) {
		 	int numOfApples = 123; // 사과의 개수
		 	int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
//		 	int numOfBucket = (numOfApples%sizeOfBucket)>0 ? (numOfApples/sizeOfBucket)+1 : numOfApples/sizeOfBucket  ; // 모든 사과를 담는데 필요한 바구니의 수
		 	System.out.println("필요한 바구니의 수 :"+numOfBucket);		//나눈 값의 1의 자리 수가 0일 때와 0이 아닐 때를 구분하여 계산
		 															//1의 자리 수가 1이면 10의 자리수에 +10, 0이면 바구니/사과
		 	}
		 }
		 [실행결과]
		 13
		 
	
		 [3-3] 아래는 변수 num의 값에 따라 ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다. 삼항 연산자를 이용해서 (1)에 알맞은 코드를 넣으시오.
		 [Hint] 삼항 연산자를 두 번 사용하라.
		 class Exercise3_3 {											//x>0 ? x:-x
		 	public static void main(String[] args) {
		 	int num = 10;
//		 	System.out.println(  num==0? "0":num>0 ? "양수":"음수"  );		//먼저 0일 경우와 0이 아닐 경우를 구분한 후 양수/음수 구분
		 	}	
		 }
		
		 [실행결과]
		 양수
		 
	 
		 [3-4] 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 만일 변수 num의 값이 ‘456’이라면 ‘400’이 되고, ‘111’이라면 ‘100’이 된다. 
		 (1)에 알맞은 코드를 넣으시오.
		 class Exercise3_4 {
		 	public static void main(String[] args) {
		 	int num = 456;
		 	System.out.println(  (num/100)*100  );		//num의 백의 자리 수 이하를 모두 int 형태에서 소수점으로 없애고, 다시 100을 곱하여
		 	}											//백 이상의 자리수들을 제자리로 돌림
		 }
		 [실행결과]
		 400
		 
		 
		 [3-5] 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의 값이 333이라면 331이 되고, 777이라면 771이 된다. 
		 (1)에 알맞은 코드를 넣으시오.
		 class Exercise3_5 {
		 	public static void main(String[] args) {
		 	int num = 333;
// 		 	System.out.println(  (num/10)*10+1);		//num의 1의 자리 수를 int 형태에서 소수점으로 만들어 없애고, 다시 10을 곱하여 나머지 자리수들을  
		 	}											//제자리로 돌린 후, 1의 자리수가 1이 되도록 +1을 함
		 }
		 [실행결과]
		 331
		 
		 
		 [3-6] 아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구하는 코드이다. 
		 예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이다. 19의 경우 20이고, 81의 경우 90이 된다. 
		 30에서 24를 뺀 나머지는 6이기 때문에 변수 num의 값이 24라면 6을 결과로 얻어야 한다. (1)에 알맞은 코드를 넣으시오.
		 [Hint] 나머지 연산자를 사용하라.
		 class Exercise3_6 {
		 	public static void main(String[] args) {
		 	int num = 24;
//		 	System.out.println(  ((int)(num/10.0f+0.9)*10) - num );			//먼저 1의 자리를 소숫자리로 만들어 올림 후 나머지 소숫점을 버리고 정수형으로 변환
		 	}																//그 값에 num 값을 뺀 값을 구한다.
		 																	//10의 자리수만 궁금하니 (int)((num+10)/10.0f)-num
		 }
		 [실행결과]
		 6
		 
		 
		 [3-7] 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 변환공식이 'C =5/9 ×(F - 32)'라고 할 때, (1)에 알맞은 코드를 넣으시오. 
		 단, 변환 결과값은 소수점 셋째자리에서 반올림해야한다.(Math.round()를 사용하지 않고 처리할 것)
		 class Exercise3_7 {
		 	public static void main(String[] args) {
		 	int fahrenheit = 100;
//		 	float celcius =  (int)((5f/9*(fahrenheit - 32))*100+0.5)/100f ;		//기본형인 double로 계산되어 정확한 값이 나오지 않아 float로 casting 작업 필수
		 	System.out.println("Fahrenheit:"+fahrenheit);
		 	System.out.println("Celcius:"+celcius);
		 	}
		 }
		 [실행결과]
		 Fahrenheit:100
		 Celcius:37.78
		 
		 
		 [3-8] 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
		 class Exercise3_8 {
		 	public static void main(String[] args) {
		 	byte a = 10;
		 	byte b = 20;
//		 	int c = a + b;					//byte 연산 시 int로 변하기 때문에 결과값이 들어가는 변수 c를 int로 맞춰줌 
		 	char ch = 'A';
//		 	ch = (char) (ch + 2);			//char + int = int이므로 결과값을 char로 받고 싶기 때문에 casting 함
//		 	float f = 3 / 2f;				//float 값으로 출력되어야 정확한 값이 나옴.
//		 	long l = 3000 * 3000 * 3000L;	//long 값 출력을 위해 L 삽입으로 인지 시킴
		 	float f2 = 0.1f;
//		 	double d = 0.1f;				//double은 실재 값이 아니라 근사값을 표현하므로 실재 수를 담는 float 수로 바꿈
		 	boolean result = d==f2;
		 	System.out.println("c="+c);
		 	System.out.println("ch="+ch);
		 	System.out.println("f="+f);
		 	System.out.println("l="+l);
		 	System.out.println("result="+result);
		 	}
		 }
		 [실행결과]
		 c=30
		 ch=C
		 f=1.5
		 l=27000000000
		 result=true
		 
		 
		 [3-9] 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b의 값이 true가 되도록 하는 코드이다. (1)에 알맞은 코드를 넣으시오.
		 class Exercise3_9 {
		 	public static void main(String[] args) {
		 	char ch = 'z';
//		 	boolean b = (  'A'<=ch && ch<='Z' || 'a'<=ch && ch<='z' || '0'<=ch && ch<='9' );
		 	System.out.println(b);
		 	}
		 }
		 [실행결과]
		 true
		 
		 
		 [3-10] 다음은 대문자를 소문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다. 문자코드는 소문자가 대문자보다 32만큼 더 크다. 
		 예를들어 'A‘의 코드는 65이고 ’a'의 코드는 97이다. (1)~(2)에 알맞은 코드를 넣으시오.
		 class Exercise3_10 {
		 	public static void main(String[] args) {
		 	char ch = 'A';
//		 	char lowerCase = (  'A'<=ch && ch<='Z'  ) ? (  (char)(ch+32)  ) : ch;
		 	System.out.println("ch:"+ch);
		 	System.out.println("ch to lowerCase:"+lowerCase);
		 	}
		 }
		 [실행결과]
		 ch:A
		 ch to lowerCase:a
		 */
		
		
	

}
