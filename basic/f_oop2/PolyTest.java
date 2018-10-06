package f_oop2;

public class PolyTest {
	public static void main(String[] args) {
//		Tv t = new Tv();
//		SmartTv st = new SmartTv();
	 
		//1. SmartTv 4대를 저장할 수 있는 변수를 만들고 SmartTv 4대를 저장해주세요
		SmartTv[] stArr = {new SmartTv(), new SmartTv(), new SmartTv(), new SmartTv()};
		
		//2. AfreecaTv 3대를 저장할 수 있는 변수를 만들고 AfreecaTv 3대를 저장해주세요
		AfreecaTv[] afArr = {new AfreecaTv(), new AfreecaTv(), new AfreecaTv()};
		
		//3. VRTv 2대를 저장할 수 있는 변수를 만들고 VRTv 2대를 저장해주세요
		VRTv[] vrArr = {new VRTv(), new VRTv()};
		
		//4. Tv 9대를 저장할 수 있는 변수를 선언하세요 tvArr
		Tv[] tvArr;
		
		//5. tvArr에 SmartTv 3대 AfreecaTv 3대, VRTv 3대를 저장하세요.
		Tv t = (Tv)new SmartTv();	//up-casting(생략가능)
//		tvArr = new Tv[9];
//		tvArr[0] = new SmartTv();
//		tvArr[1] = new SmartTv();
//		tvArr[2] = new SmartTv();
//		tvArr[3] = new AfreecaTv();
//		tvArr[4] = new AfreecaTv();
//		tvArr[5] = new AfreecaTv();
//		tvArr[6] = new VRTv();
//		tvArr[7] = new VRTv();
//		tvArr[8] = new VRTv();
		tvArr = new Tv[]{new SmartTv(), new SmartTv(), new SmartTv(),  
				new AfreecaTv(),  new AfreecaTv(),  new AfreecaTv(), 
				new VRTv(), new VRTv(), new VRTv()}; 
		
		Tv at = tvArr[4];	//tvArr[4]는 Tv타입이니까 안의 주소값을 AfreecaTv타입으로 꺼내려면..
		AfreecaTv a = (AfreecaTv)tvArr[4];	//down-casting 상속관계에서만 가능함
		
//		SmartTv stv2 = (SmartTv)new Tv();	//문법상 오류는 없으나 SmartTv가 heap영역에 부모가 먼저 올라가있어야 하는데 자리가 없음
	}
}

class Tv{
	boolean power;
	int channel;
	
	void power(){
		power = !power;
	}
	
	void channel(){
		channel++;
	}
	
}

class SmartTv extends Tv{
	void internet(){
		
	}
}

class VRTv extends Tv{
	void headTracking(){
		
	}
}

class AfreecaTv extends Tv{
	void starBalloon(){
	}
	
	@Override
	void channel(){
		channel+=2;
	}
}








