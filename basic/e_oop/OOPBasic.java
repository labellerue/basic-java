package e_oop;

public class OOPBasic {
	public static void main(String[] args) {
		
		/*
		Object Oriented programming(객체지향프로그래밍)
		
		1. 객체지향언어
			- 기존의 프로그래밍언어에 몇 가지 새로운 규칙을 추가한 보다 발전된 형태이다.
			- 규칙들을 이용해서 코드간에 서로 관계를 맺어줌으로써 보다 유기적으로 프로그램이 구성된다.
			- 객체지향 언어의 특징
			  : 코드의 재사용성을 높일 수 있다.
			     코드의 관리가 용이하다.
			     신뢰성이 높은 프로그래밍을 가능하게 한다.
		
		2. 클래스와 객체
			1) 클래스란?
			  - 객체를 정의해 놓은 것이다.
			  - 객체의 설계도 또는 틀이다.
			  - 클래스의 선언
			  	[접근제어자][지정예약어] class 클래스명 [extends 클래스명][implements 인터페이스명]{}
			  	 public	   abstract  class Oop		extends Oop2	Serializeable
			  
			2) 객체란?
				- 실제로 존재하는 것, 사물 또는 개념
				- 객체의 구성요소
				  : 속성(멤버변수, 특성, 필드, 상태)
				   ex. 크기, 길이, 높이, 색상
				  : 기능(메서드, 행위, 함수)
				   ex. 켜기, 끄기, 채널변경
				   
		3. 인스턴스화란?
			- 클래스로부터 객체를 만드는 과정을 클래스의 인스턴스화라고 부른다.
			- Tv클래스로부터 만들어진 객체를 Tv클래스의 인스턴스라고 한다.
			- 인스턴스 생성방법
			  클래스명	참조변수명; =>클래스의 객체를 참조하기 위한 참조변수를 선언
			  참조변수 = new 클래스명(); =>클래스의 객체를 생성 후, 
			  						    객체의 주소를 참조변수에 저장한다.
			- 인스턴스는 참조변수를 통해서만 다룰 수 있으며, 참조변수의 타입은 인스턴스의 타입과 일치해야 한다.
		
		4. 선언 위치에 따른 변수의 종류
			- 전역변수 (클래스변수, 인스턴스변수), 지역변수
			- 지역변수
			  : 메서드 내에 선언되며, 메서드 내에서만 사용할 수 있다.
			  : 메서드 종료시 소멸된다.
			  : for, while 선언된 블럭{} 내에서만 사용 가능하다.
			- 클래스변수
			  : 클래스 내에 선언된다.
			  : 모든 인스턴스가 공통된 저장공간(변수)을 가진다.
			  : 한 클래스의 모든 인스턴스들이 공통된 값을 유지해야 하는 경우 사용된다.
			  : 인스턴스 변수 앞에 static만 붙이면 된다.
			  
			- 인스턴스변수
			  : 인스턴스변수의 값을 읽어오거나 변경하기 위해서는 인스턴스를 생성해야 한다.
			  : 인스턴스마다 독립적인 저장공간을 가지므로 서로 다른 값을 가질 수 있다.
			  : 인스턴스마다 고유한 상태를 유지해야 하는 경우 인스턴스 변수로 선언한다.
				  
		5. 메서드
			- 어떠한 작업을 수행하기 위한 명령문의 집합
			- 주로 어떤값을 입력 받아서 처리하고 그 결과를 돌려준다.
			- 입력받는 값이 없을 수도 있고, 결과를 반환하지 않을 수도 있다. --> void
			- 반복적으로 사용되는 코드를 줄이기 위해 사용된다
				=> 코드 양이 줄고, 유지보수가 쉽다.
			- 작성방법
				리턴타입	메서드명(변수타입 변수명, 변수타입 변수명){
					//메서드 호출시 수행될 문장
				}
				
		6. return문
			- 메서드가 정상적으로 종료되는 경우
			  : 메서드의 블럭{} 내의 마지막 문장까지 수행하였을 경우
			  : 메서드의 블럭{} 내에서 return문을 만났을 때
			- 반환값
			  : 없는 경우에는 void
			  			   return;
			  : 있는 경우에는 
			  	 return 반환값;
			  	 리턴타입과 반환값의 타입이 일치해야 한다.
			  	 
		7. 메서드의 호출
			- 클래스메서드
			  : 클래스명 . 클래스메서드명();
			- 인스턴스메서드
			  : 인스턴스화 => 참조변수명.메서드명();
			  
		8. 매개변수
			- 메서드를 호출할 때 매개변수로 지정한 값을 메서드의 매개변수로 복사해서 넘겨준다.
			- 기본형 매개변수
			  : 단순히 저장된 값만 복사한다.
			  : 변수의 값을 읽기만 할 수 있다.
			- 참조형 매개변수
			  : 인스턴스의 주소값을 복사한다.
			  : 변수의 값을 읽고 변겨할 수 있다.
			  
		9. 재귀호출(recursive call)
			- 매서드 내부에서 메서드 자기 자신을 다시 호출하는 것
			
		10. 메서드의 종류
			- 클래스메서드(static method)
			  : 객체생성없이 '클래스명.메서드명()'으로 호출한다.
			  : 인스턴스변수나 인스턴스메서드와 관련없는 작업을 한다. 
			  (클래스메서드가 먼저 로드 되고, 주소가 만들어질 때 비로소 인스턴스가 로드된다. 클래스만 로드되어있을 때 인스턴스는 로드되어있지 않은 상태)
			  : 메서드 내에서 인스턴스 친구들을 호출하지 않는다면 클래스메서드로 만들것을 고려한다.
			- 인스턴스메서드(instance method)
			  : 인스턴스 생성 후, '참조변수명.메서드명()'으로 호출한다.
			  : 인스턴스 친구와 관련된 작업을 수행한다.
			  : 메서드 내에서 인스턴스 친구들을 호출할 수 있다.
			  
		11. 메서드 오버로딩
			- 한 클래스 내에 같은 이름의 메서드를 여러개 정의하는 것
			- println() 가 대표적인 예이다.
			- 조건
			  : 메서드명이 같아야 한다.
			  : 매개변수의 개수 또는 타입이 달라야 한다.
			  : 리턴타입은 상관이 없다.
			- 오버로딩의 장점
			  : 메서드의 이름만으로 구분된다면 같은 클래스의 모든 메서드의 명칭이 달라야 한다.
			  : 근본적으로 같은 기능을 하는것인데 다른 이름으로 표현되면 기억하기 어렵다.
			  : 메서드의 이름을 짓는 고민을 덜 수 있다.
				  
		12. 생성자
			ex. Calc c = new Calc();   --Calc()가 생성자
			class Calc{}
			- 인스턴스가 생성될 때 호출되는 인스턴스 초기화 메서드이다.(퇴근하면 값 사라지고 또다시 메서드를 부를 때 초기화)
			- 특징
			  : 메서드처럼 클래스 내에 선언된다.
			  : 생성자가 없을 때 컴파일러가 기본 생성자를 만들어주나, 있으면 그대로 사용
			  : 리턴 값이 없다.
			    (생성자도 메서드이기 때문에 반환값이 없는 void를 써야하지만 모든 생성자가 반환값이 없기 때문에 void를 생략한다.)
			  : 생성자의 명칭은 클래스명과 동일해야 한다.
			  : 인스턴스화를 할 때만 호출할 수 있다.
			- 정의방법
			  : 기본생성자
			    클래스명(){
			    }
			  : 매개변수가 있는 생성자
			    클래스명(변수타입 변수명...){
			    }
				
		13. 변수의 초기화
			- 변수를 선언하고 처음으로 값을 저장하는 것을 '변수의 초기화'라고 한다.
			- 초기화 방법
			  : 명시적 초기화
			    int a = 10;
			  : 생성자를 이용한 초기화
			  : 초기화블럭을 이용한 초기화
			  	클래스초기화블럭
			  	인스턴스초기화블럭
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
		
		 */
	}

}