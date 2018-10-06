package z_exam;

//Car 클래스 생성
class Car{
	//색상, 기어, 문 변수 선언
	String color;
	String gear;
	int door;

	//기본생성자
	//매개변수 3개를 가진 생성자에게 인자값 white,auto,4 저장
	Car(){
		this("white", "auto", 4);
	}

	//Car 타입 매개변수로 쓸 생성자로 전역변수에 값 저장
	Car(Car a){
		color = a.color;
		gear = a.gear;
		door = a.door;
	}

	//3개의 매개변수를 가지고 전역변수에 값 저장(this 사용)
	Car(String color, String gear, int door){
		this.color= color;
		this.gear = gear;
		this.door = door;
	}
}


public class CarTest3 {
	public static void main(String[] args) {
		//Car타입 c1의 주소를 c2의 생성자를 통해 주소 저장
		Car c1 = new Car();
		Car c2 = new Car(c1);

		//출력  c1주소의 색상,기어,문
		System.out.println("c1의 color,gear,door "+c1.color+","+c1.gear+","+c1.door);

		//출력  c2주소의 색상,기어,문
		System.out.println("c2의 color,gear,door "+c2.color+","+c2.gear+","+c2.door);

		//c1의 문을 100으로 저장
		c1.door = 100;

		//출력  c1주소의 색상,기어,문
		System.out.println("c1의 color,gear,door "+c1.color+","+c1.gear+","+c1.door);

		//출력  c2주소의 색상,기어,문
		System.out.println("c2의 color,gear,door "+c2.color+","+c2.gear+","+c2.door);
	}

}

