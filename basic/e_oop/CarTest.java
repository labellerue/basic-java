package e_oop;

public class CarTest {
	public static void main(String[] args) {
		
		Car c = new Car();
//		System.out.println(c.color);
		Car c2 = new Car("blue", "Auto",4);

		
	}

}


class Car{
	String color;
	String gearType;
	int door;
	
	Car(){					//생성자 
		color = "white";	//생성자 입장에서 color가 초기화됨
		gearType = "Stick";
		door = 4;
	}
	Car(String color, String gearType, int door){
		this();//this:이 인스턴스에 있는 //생성자 내에 다른 생성자를 불러올 때
			   //모든 것 위에 있어야 한다.
		this.door = door;	//  Car(String,String,int)은 Car(){ 하얀색 스틱 문4개인 차}의 내용이 들어옴. door은 여기서 초기화
	}
	
	
}












