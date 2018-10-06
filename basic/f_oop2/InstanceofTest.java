package f_oop2;

public class InstanceofTest {
	public static void main(String[] args) {
		FireCar2 c = new FireCar2();
		
		System.out.println(c instanceof FireCar2); //오른쪽이 검사하는 타입
		
		System.out.println(c instanceof Car2);	//검사한 타입이 true면 형변환이 가능하다
		Car2 c2 = new FireCar2();
		
		System.out.println(c instanceof Object);
		Object c3  =c;
		
		Car2 c4 = new Car2();
		System.out.println(c4 instanceof Car2);
		System.out.println(c4 instanceof Object);
		
		System.out.println("안되는거");
		System.out.println(c4 instanceof FireCar2);	//false
		FireCar2 fc2 = (FireCar2)c4;	
		
		
		
		Car2  c5 = new FireCar2();
/////		System.out.println(c5 instanceof FireCar2);
		
		
		
		
	}
}

class Car2{
	
}

class FireCar2 extends Car2{
	
}