package z_exam;

public class Exam04 {
	public static void main(String[] args) {
		/*
		[4-1] 다음의 문장들을 조건식으로 표현하라.
		1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 
		// 0<=x && x<=20		  	
		2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		// !(ch == ' ' || ch == '/t') 
		3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
		// ch == 'x' || ch == 'X'
		4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
		// '0' <= ch || ch <= '9' 
		5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		// 'A' <= ch && ch <= 'Z' || 'a' <= ch && ch = 'z'
		6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식
 		// year%400 == 0 || year%4 == 0 && year%100 != 0
		7. boolean형 변수 powerOn가 false일 때 true인 조건식
		// powerOn == false
		// powerOn = !powerOn
		8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
		//  str == "yes" 

		
		[4-2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		
		int x =0;
		for( int i = 1 ; i < 21 ; i++ ){	//1부터 20사이의 정수 중에 모두 더하는데
			if(!(i%2 == 0 || i%3 == 0)){		//2의 배수 또는 3의 배수를 뺀 수만 더한다 (2의 배수여도 안되고 3의 배수여도 안되는) (i%2 == 0 || i%3 == 0)의 반대
											//1,3,5,7,9,...19 중에(&&) 1,5,7,11,...19 두 조건 모두 충족시키는 값만이 if문을 통과
				x = x + i;
			}
		}
		System.out.println(x);
		
		
		[4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
		
		int inSum = 0;						//괄호 안의 연산을 위한 변수
		int outSum = 0;					//계산이 중첩되어 이어지도록 값을 담기 위한 모든 합의 변수 
		for (int i =1 ; i<11 ; i++){	//조건 정리하기 (1부터 더하기;10까지더하기;증가식)
										//더해갈 때 마다 마지막 수에 +1된 수가 더해지기 때문에 i++ 증가연산자 이용
			
			inSum += i;						//괄호 안의 연산, x= x + x + x + i++ 형식으로 중첩되어 돌아가게 구성됨 
			outSum += inSum;					//괄호 밖의 연산, 한번 괄호 안의 연산이 이루어질 때 마다 더해줌
										//y 연산식이 이루어진 후 다시 조건에 맞춘 x 연산식이 돌아감
		} 
		System.out.println(outSum);
		
		int totalSum = 0;
		for (int i = 1; i<11 ; i++){
			for (int j = 1 ; j<i+1 ; j++){
				totalSum += j;
			}
		}
		
		int sum = 0;
		for ( int i=1 ; i<11 ; i++){		// 1의 갯수 10, 2의 갯수 9, 3의 갯수 8...모두 더하는 식
			sum += i*(11-i); 
		}
		
		
		[4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
		
		int i = 0;					//홀수일 때 양수로 만들어주고, 짝수일 때 음수로 만들기
		int sum = 1;
		while (sum <= 100 ){
			i++;
			if (i%2==0){
				i = -i;
				sum = sum +i;
				i = -i;
			}else{
				sum = sum +i;
			}
		}
		System.out.println(i);
		
		
		int i2 = 0;					//1 + -(2) + 3 + -(4) + 5...
		int sum2 = 0;
		while (true){				//무한으로 돌아갈 때
			
			i2++;					//증가식: 더하는 숫자를 1씩 증가
			
			if(i2%2 != 0){			//i가 1일 때 			//i가 홀수일 때
				sum2 = sum2 + i2;	//sum2= sum2 + (i2)
			} else {				//i가 2일 때 			//i가 짝수일 때
				sum2 = sum2 - i2;	//sum2= sum2 - (i2)	i2가 짝수일 때 뺄셈
			}
			
			if(sum2 >= 100){		//합이 100이상일 때 반복문 종료
				break;
			}
		}
		System.out.println(i2);
		
		int sum = 0;
		int i = 0;
		int buho = 1;
		while(sum<100){
			i++;
			sum += buho*i;
			
			buho *=-1;				//부호 바꿔주기
		}
		
		while(true){
			sum += buho*i;
			if(sum >= 100){
				break;				//break;문 사용
			}
			i++;
			
			buho *= -1;
		}
					

		[4-5] 다음의 for문을 while문으로 변경하시오.
		public class Exercise4_5 {
			public static void main(String[] args) {
				for(int i=0; i<=10; i++) {	//(초기화;조건식;증감식)
				for(int j=0; j<=i; j++)			//(초기화2;조건식2;증감식2)
					System.out.print("*");
				System.out.println();
				}
				
				int i = 0;						//초기화 : i = 0
				while(i<=10){					//조건식 : i <=10
					int j = 0;					//초기화2: j = 0
					while(j<=i){				//조건식2: j<=i
						System.out.print("*");	//실행
						j++;					//증감식2: j++
					}					
					i++;						//증감식 : i++
					System.out.println();		//실행2
				}				
			} // end of main
		} // end of class


		[4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
		
		for ( int i = 1 ; i<7 ; i++){						//주사위1의 눈은 1부터 6까지
			for ( int j = 1 ; j<7 ; j++){					//주사위2의 눈은 1부터 6까지
				if(i+j == 6){								//주사위 1과 2의 합이 6일 때
					System.out.print("주사위1: "+i+"   ");	//주사위1의 값 출력
					System.out.println("주사위2: "+j);		//주사위2의 값 출력
				}
			}
		}
		
		
		
		[4-7] Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하라. (1)에 알맞은 코드를 넣으시오.
		class Exercise4_7 {
			public static void main(String[] args) {
				int value =  (int)(Math.random()*6+1) ;	//Math.random()은 기본적으로 0<=Math.random()<1 의 값을 갖고 있기 때문에 
				System.out.println("value:"+value);		//전체 *6 후에 +1을 해주어 1<=Math.random()<7의 형태로 변형한다
				}
		}


		[4-8] 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 이다.
		
		for(int x = 0 ; x<11 ; x++){					//x는 10이하의 정수이므로 하나씩 증가하며 경우의 수 찾기
			for(int y = 0 ; y<11 ; y++){				//y는 10이하의 정수이므로 x와 연계하여 하나씩 증가하며 경우의 수 찾기
				if(2*x+4*y == 10){						//만약 방정식에 알맞는 값이 x와 y에 들어오면 (방정식을 java 언어로 수정)
					System.out.print("x=" + x + ", ");	//조건에 맞는 x의 값을 출력
					System.out.println("y=" + y);		//조건에 맞는 y의 값을 출력
				}
			}
		}
			
		[실행결과]
		x=1, y=2
		x=3, y=1
		x=5, y=0


		[4-9] 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라. 만일 문자열이 "12345"라면, 
		‘1+2+3+4+5’의 결과인 15를 출력이 출력되어야 한다. (1)에 알맞은 코드를 넣으시오.
		[Hint] String클래스의 charAt(int i)을 사용
		class Exercise4_9 {
			public static void main(String[] args) {
				String str = "12345";
				int sum = 0;
				for(int i=0; i < str.length() ; i++) {
					sum += str.charAt(i)-'0';
					
				}
				System.out.println("sum="+sum);
				
			}
		}
		[실행결과]
		15


		[4-10] int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라. 만일 변수 num의 값이 12345라면, 
		‘1+2+3+4+5’의 결과인 15를 출력하라.
		(1) 알맞은 코드를 넣어 완성하시오.
		[주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
		class Exercise4_10 {
			public static void main(String[] args) {
				int num = 12345;
				int sum = 0;
				while (true){						//마지막 수가 남을 때 까지 반복문을 돌릴 것이나 언제 끝날지 모름
					sum += num%10;					//num의 나머지 값을 구하여 1의 자리 수부터 sum에 저장하며 계속적으로 더해준다
					num = num/10;					//이미 구한 1의 자리 수는 없에주고, 
													//나머지 수를 또다시 나머지값을 통해 한자리 수로 구하기 위해 num에 다시 넣어준다
													//마지막에 남을 가장 큰 자리 수가 1의 자리 수로 남을때까지 반복한 후
					if(num/10 ==0){					//한자리 수만 남았을 때 몫이 0이 되므로
						sum += num;					//지금까지 더한 sum에 마지막으로 더해준다
						break;						//마지막 가장 큰 자리 수였던 수까지 다 더해진 후 반복문을 나온다
					}
				}
				System.out.println("sum="+sum);
							
			}
		}
		[실행결과]
		15


		[4-11] 피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를 만들어 나가는 수열이다. 
		예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는 1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 
		1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오.
		public class Exercise4_11 {
			public static void main(String[] args) {
			// Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.
				int num1 = 1;
				int num2 = 1;
				int num3 = 0; // 세번째 값
				System.out.print(num1+","+num2);
				for (int i = 0 ; i < 8 ; i++ ) {
					
					num3 = num1 + num2;				//처음 주어진 두 수 더하기		1+1		a+b	= c에 대입
					num1 = num2;					//식에 다음 더해야할 숫자 대입	  1+2	  b+c = a에 대입	
					num2 = num3;					//								2+3		c+a = b에 대입
													//								  3+5	  a+b = c에 대입
					System.out.print(","+num3);	
				}
			} // end of main
		} // end of class
		[실행결과]
		1,1,2,3,5,8,13,21,34,55


		[4-12] 구구단의 일부분을 다음과 같이 출력하시오.
		
		for (int i = 2 ; i<10 ; i++){							//앞에 곱하는 수
			for (int j = 1 ; j<4 ; j++){						//i가 증가하기 전에 1,2,3 으로 곱할 수
				System.out.println(i + "*" + j + "=" + i*j);	//2*1 2*2 2*3 를 먼저 돌고
			}													//3*1 3*2 3*3 돌리는 작업 반복
		}
			
				*//*

		for (int i = 2 ; i<10 ; i++){						
			for (int j = 1 ; j<4 ; j++){	
				switch(i){
				case 1: case 2: 
					System.out.print(i + "*" + j + "=" + i*j + "  ");
					break;
				case 2:
					System.out.print(i + "*" + j + "=" + i*j + "  ");
				default :
					System.out.println("");
					break;
				}
			}
		}
		/*
		[실행결과]
		2*1=2 	3*1=3 	4*1=4
		2*2=4 	3*2=6 	4*2=8
		2*3=6 	3*3=9 	4*3=12
		
		5*1=5 	6*1=6 	7*1=7
		5*2=10 	6*2=12 	7*2=14
		5*3=15 	6*3=18 	7*3=21
		
		8*1=8 	9*1=9
		8*2=16 	9*2=18
		8*3=24 	9*3=27
		
		
		[4-13] 다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		class Exercise4_13{
			public static void main(String[] args){
				String value = "12o34";
				char ch = ' ';
				boolean isNumber = true;
				// 반복문과 charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.
				
				for(int i=0; i < value.length() ;i++) {
					ch = value.charAt(i);					//한글자한글자 숫자인지 파악하기
					if (!('0' <= ch && ch <= '9')){			//숫자일 경우 0~9 사이이다
						isNumber = false;					//한글자라도 숫자가 아니면 숫자가 아니기 때문에 숫자가 아닐 경우 isNumber은 false가 된다
					}
				} 
				if (isNumber) {
					System.out.println(value+"는 숫자입니다.");
				} else {
					System.out.println(value+"는 숫자가 아닙니다.");
				}
			} // end of main
		} // end of class

		[실행결과]
		12o34는 숫자가 아닙니다.


		[4-14] 다음은 숫자맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다. 
		사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다. 
		사용자가 컴퓨터가 생각한 숫자를 맞추면게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다.
		(1)~(2)에 알맞은 코드를 넣어 프로그램을 완성하시오.
		class Exercise4_14{
			public static void main(String[] args){
			// 1~100사이의 임의의 값을 얻어서 answer에 저장한다.

				int answer =  (int)(Math.random()*100+1);				//1~100사이의 랜덤한 정수 생성		
				int input = 0; // 사용자입력을 저장할 공간
				int count = 0; // 시도횟수를 세기위한 변수
			// 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
				java.util.Scanner s = new java.util.Scanner(System.in);
				do {													//입력값을 먼저 받고,
					count++;
					System.out.print("1과 100사이의 값을 입력하세요 :");
					input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.
					
					if (answer > input){								//입력값이 답보다 작을 경우
						System.out.println("더 큰 수를 입력하세요.");		//힌트를 주고
					}else if (answer < input){							//입력값이 답보다 클 경우
						System.out.println("더 작은 수를 입력하세요.");		//그에 맞는 힌트를 주고
					}else {												//입력값과 답이 일치할 경우 answer == input
						System.out.println("맞췄습니다.");				//정답임을 알린 후
						break;											//반복문을 완전히 빠져나간다.
					}
					
					} while(true); // 무한반복문							//break 전까지, 답을 맞추기 전까지 계속 돌아감
				
				System.out.println("시도횟수는 " + count + "번입니다.");	//count 횟수세기를 끝내고 몇번인지 출력
				
			} // end of main
		} // end of class HighLow
		[실행결과]
		1과 100사이의 값을 입력하세요 :50
		더 큰 수를 입력하세요.
		1과 100사이의 값을 입력하세요 :75
		더 큰 수를 입력하세요.
		1과 100사이의 값을 입력하세요 :87
		더 작은 수를 입력하세요.
		1과 100사이의 값을 입력하세요 :80
		더 작은 수를 입력하세요.
		1과 100사이의 값을 입력하세요 :77
		더 작은 수를 입력하세요.
		1과 100사이의 값을 입력하세요 :76
		맞췄습니다.
		시도횟수는 6번입니다.


		[4-15] 다음은 회문수를 구하는 프로그램이다. 회문수(palindrome)란, 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수를 말한다. 
		예를 들면 ‘12321’이나 ‘13531’같은 수를 말한다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		[Hint] 나머지 연산자를 이용하시오.
		class Exercise4_15{
			public static void main(String[] args){
				int number = 12321;
				int tmp = number;
				int result =0; // 변수 number를 거꾸로 변환해서 담을 변수
				while(tmp !=0) {								
					
					result = (result + tmp%10) * 10;							// 12321 % 10.....1
					tmp = tmp/10;						// 12321 / 10 => 1232
																				// 1232  % 10.....2
														// 1232  / 10 => 123
																				// 123   % 10.....3
														// 123   / 10 => 12
																				// 12    % 10.....2
														// 12    / 10 => 1 이 남았을 때 여전히 반복문이 돌아 result 값에 10을 곱하게 되므로 실행하지 않고 더해주기만 한다.
					// 나머지값 = tmp%10
					// result = (나머지값 + result)*10	첫 나머지값에 10을 곱하여 다음 나머지값이 뒤에 오며 처음 수와 반대의 수가 되도록 배치
					// 두 식을 합하여 result = (tmp%10 + result) * 10
					// tmp는 나머지 값이 구해진 부분은 없엔다
					// 가장 앞에 있던 마지막 수가 남았을 때 반복문 안에 있으면 *10이 수행되므로 나가도록 한다
					if (tmp/10 ==0){					// 몫이 0일 때 한자리 수만 남은 것이 되므로					
						result += tmp;					// 앞서 구한 result 값에 마지막 수를 더해주고
						break;							// 반복문을 나간다
					}
				}
			
				if(number == result)									//초기값 number와 거꾸로 뒤집은 result의 값이 같을 때 실행
					System.out.println( number + "는 회문수 입니다.");

				else
					System.out.println( number + "는 회문수가 아닙니다.");
				
				System.out.println(result);
			} // main
		}
		[실행결과]
		12321는 회문수 입니다.
		 */
		
		/*
		int x = 0;
		int y = 0;
		for (int i =1 ; i<=10 ; i++){	
										
										
			x= x + i;
			System.out.print(" + "+"("+i+" + "+x+")");
			y= y + x;			 		
			//System.out.print(" + "+"("+x+" + "+y+" + "+")");						
		} System.out.println(y);
		*/

	
	}

}
