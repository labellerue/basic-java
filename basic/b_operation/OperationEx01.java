package b_operation;

public class OperationEx01 {
	public static void main(String[] args){
		/*
		1. 증감연산자(++, --)
			- 증가연산자(++): 피연산자의 값을 1 증가시킨다.
			- 감소연산자(--): 피연산자의 값을 1 감소시킨다.
		 */
		int i2 = 7;
		int i3 = 5;
		int i4 = ++i2 + i3;		//i2가 먼저 +1이 되고 계산
								//8 + 5
		int i5 = i2++ + i3;		//i2는 나중에 증가
								//8 + 5
								//i2는 9가 됨
		System.out.println(i5);
		System.out.println(i2);
		int i9 =21;
		int i10 = 5;
		int i11 = ++i9 + ++i10 +i9++ + ++i10;
		System.out.println(i11);
		System.out.println("i9는"+i9);
		System.out.println("i10은"+i10);
		System.out.println("i11은"+i11);
		
		/*
		2. 부호연산자(+,-)
			- 기본형중 boolean형과 char형에는 사용할 수 없다.
			
		3. 비트전환 연산자(~)
			- 정수형과 char형에만 사용 가능하다.
			- 피연산자를 2진수로 표현했을 때 0은 1로, 1은 0으로 변환한다.
		 */
		byte b = 10;
		int c= ~b;
		System.out.println("이걸보소"+c);
		
		/*
		4. 논리부정 연산자(!)
			- boolean형에만 사용 가능
			- true -> false, false -> true
			- TV전원 버튼과 같은 토글버튼을 논리적으로 구현할 수 있다.
		 */
		boolean power = false;
		System.out.println(!power);
		
		power = !power;
		System.out.println(power);
		
		/*
		5. 산술연산자
			- 사칙연산자(+,-,*,/), 나머지연산자(%), 쉬프트연산자(<<,>>,>>>)
				두개의 피연산자를 취하는 이항연산자이다.
			- 이항연산자의 경우 피연산자의 크기가 4byte보다 작으면 4byte(int)형으로 변환 후 연산을 수행한다.
			
		6. 사칙연산자(+,-,*,/)
			- int형(4byte)보다 작은 자료형간의 연산은 int형으로 변환 후 연산한다.
			 :byte + short => int + int
			- 두개의 피연산자 중 자료형의 크기가 큰 쪽에 맞춰서 형변환 후 연산한다.
			 :byte + long => long + long
			 :char + float => float + float
			- 정수형 간의 나눗셈에는 0으로 나누는 것은 금지되어 있다.
		 */
		byte aa = 1;
		short bb = 29;
		//aa와 bb의 합을 저장할 수 있는 변수를 만들어 aa와 bb의 합의 결과를 저장해주세요.
		int dd= aa + bb;
		System.out.println(dd);
		
		char cc = 'F';
		byte ff = 120;
		//cc와 ff의 곱을 저장할 수 있는 변수 gg를 선언 및 초기화하세요.
		int gg = cc * ff;
		System.out.print("F의 ASKY코드 정수는 ");
		System.out.println(0+cc);
		System.out.println(gg);
		
		int hh = 10;
		int ii = 2147483647;
		//hh와 ii의 합을 jj라는 변수에 저장해주세요
		//단, 정상적인 값이 출력되도록 해주세요
		long jj = (long)hh + ii;
		System.out.println(jj);
		
		/*
		7. 나머지 연산자(%)
			- 왼쪽의 피연산자를 오른쪽의 피연산자로 나누고 난 나머지 값을 돌려주는 연산자 인다.
			- boolean형을 제외한 모든 기본형에 사용 가능하다.
		 */
		int ba = 10;
		int ca = 3;
		//ba를 ca로 나눈 몫을 share변수에 저장해주세요
		int share = ba/ca;
		System.out.println(share);
		int remain = ba%ca;
		System.out.println(remain);
		//10을 3으로 나눈 몫은 3이고 나머지는 1이다.
		System.out.println(ba+"을 "+ca+"으로 나눈 몫은 "+share+"이고 나머지는 "+remain+"이다.");
		
		/*
		8. 쉬프트 연산자(<<, >>, >>>)	그래픽에 사용
			- 정수형 변수에만 사용 가능하다.
			- 피연산자의 각자리(2진수) 오른쪽 또는 왼쪽으로 이동한다.
			- 곱셈과 나눗셈을 할 때 연산속도가 좋음으로 사용한다.
			- << : x<<n은 x*2^n
			- >> : x>>n은 x/2^n
			- 양수이면 빈 곳을 0으로 채우고 음수이면 빈 곳을 1로 채운다.
		 */
		System.out.println(10<<2);
		
		/*
		9. 비교연산자
			- 두개의 변수 또는 리터럴을 비교하는데 사용되는 연산자
			- 주로 조건문과 반복문의 조건식에 사용되며 연산결과는 true 또는 false 이다.
			- 이항연산자
			- 타입이 같은 것끼리 비교
			
		10. 대소비교연산자(<, >, <=, >=)
			- 기본형중에 boolean형을 제외한 자료형에 사용할 수 있다.
			
		11. 등가비교연산자(==, !=)
			- 모든 자료형에 사용할 수 있다.
			- 기본형의 경우에는 저장된 값을 비교, 참조형의 경우에는 저장된 주소를 비교한다.
			
				수식			연산결과
				x<y			x가 y보다 작을 때 true, 그외에는 false
				x>y			x가 y보다 클 때 true, 그외에는 false
				x<=y		x가 y보다 작거나 같을 때 true, 그외에는 false
				x<=y		x가 y보다 크거나 같을 때 true, 그외에는 false
				x==y		x와 y가 같을 때 true, 그외에는 false
				x!=y		x와 y가 다를 때 true, 그외에는 false
		 */
		//15를 저장할 수 있는 변수를 선언 및 초기화 하세요 da
		int da = 15;
		//15.000001을 저장할 수 있는 변수를 선언 및 초기화 하세요 db
		float db = 15.000001f;
		//da와 db가 같은지 그 결과를 출력해주세요
		System.out.println(da==db);
		System.out.println(0.1==0.1f);	//false 이유: 0.1은 기본 double로 0.1근사치이고, float는 정확히 0.1값
		System.out.println('A'==65);
		
		/*
		12. 비트연산자(&, |, ^)
			- 이진비트 연산을 수행한다.
			- 실수형인 float, double을 제외한 모든 기본형에 사용 가능하다.
			
			&(AND연산) : 피연산자 양쪽 모두 1일 때 1이다.
			|(OR연산) : 피연산자 중 한쪽의 값이 1이면 1이다.
			^(XOR연산) : 피연산자의 값이 서로 다르면 1이다.
			
			3 -> 00000011
			5 -> 00000101
			&	 00000001 =>1
			|	 00000111 =>7
			^	 00000110 =>6
		 */
		System.out.println(3&5);
		
		/*
		13. 논리연산자(&&, ||)
			- 피연산자로 boolean형 또는 boolean형 값을 결과로 하는 조건식만을 허용한다.
			- 조건문과 반목분에서 조건식 간의 결합에 이용한다.
			
			&&(AND결합) : 피연산자 양쪽 모두 true일 때만 true의 결과
			||(OR결합) : 피연산자 중 어느 한쪽이라도 true이면 true의 결과
			
			char c = 'D'; //의 범위 구하기
			'A'<= c && c <='Z'
		 */
		//문자 하나를 저장할 수 있는 변수 dc를 선언하세요
		char dc;
		//dc의 초기값으로 K를 저장해주세요
		dc = 'K';
		//dc가 영어 대문자일 때 true가 출력되도록 만들어 주세요
		System.out.println('A'<=dc && dc<='Z');
		//dc가 영어 소문자일때 true가 출력되도록 만들어 주세요
		System.out.println('a'<=dc && dc<='z');
		//dc가 영문자인지 판단하는 조건식을 만드세요
		System.out.println('A'<=dc && dc<='Z'||'a'<=dc && dc<='z');	//연산 순서는 &&가 ||보다 우선순위가 높음
		//dc가 숫자형인지 판단하는 조건식을 만드세요
		System.out.println('0'<=dc && dc<='9');
		
		
		/*
		14. 삼항연산자
			- 세개의 피연산자를 필요로 하기 때문에 삼항연산자로 이름 지어졌다.
			- 삼항연산자의 조건식에는 연산결과가 true 또는 false인 식이 사용된다.
			- 기본구조
				조건식 ? 식1:식2;
		 */
		int x = 10;					//int x = -10 이면
		int absX = x>0 ? x:-x;		//0보다 작기 때문에 -x 가 됨
		System.out.println(absX);	//--10은 10		무조건 양수만 내는 절대값 구하기
		
		/*
		15. 대입연산자(=, op=)
			- 변수의 값 또는 수식의 연산결과를 저장하는데 사용한다.
			- 연산우선순위가 가장 낮다.
		 */
		//10의 값을 저장할 수 있는 변수 ea를 선언 및 초기화 해주세요
		int ea = 10;
		//ea의 값에 20을 더한 값을 ea에 저장해 주세요
		ea = ea + 20;	//ea = 30
		//내 자신에게 연산하여 내 자신에게 넣는 op연산자
		ea+=20;			//ea = 50
		ea*=2;			//ea = 100
		ea/=10; 		//ea = 10
		ea<<=3;			//10*2^3= 80
		
		/*0
		반올림
		반올림은 +0.5를 하여 x.5이상의 수만 올림
		올림은 +0.9를 하여 x.0 빼고 모두 올림
		소수점 없에기는 정수 부분만 추출
		 */
		//소숫점 넷째자리에서 반올림하여 소숫째 셋째자리까지 표현해주세요
		float fff = 3.141592f;
		fff = fff*1000;		//3141.592
		fff = fff + 0.5f;	//반올림
		fff = (int)fff;		//정수형으로 바꾸어 원래 소숫째 넷째자리부터 없에기
		fff = fff/1000f;	//다시 소숫자리 돌려주기 
		System.out.println(fff);	//3.142
		//fff = (int)(fff*1000+0.5)/1000f;
	
		//23.845636을 변수 dddd에 저장해 주세요
		float dddd = 23.845636f;
		//dddd를 소숫점 5번째 자리에서 반올림하여 4번째 자리까지 표현해 주세요
		dddd = (int)(dddd*10000+0.5)/10000f;
		System.out.println(dddd);
		
		
		
		
		
		
		
		
		
		
	}

}
