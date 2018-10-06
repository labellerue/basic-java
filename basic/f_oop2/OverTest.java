package f_oop2;

public class OverTest {
	public static void main(String[] args) {
		OverGo og= new OverGo();
		System.out.println(og.upMethod());
		System.out.println(og.upMethod(2));
		
		
		
	}

}

class OverUp{
	int x = 1;
	int y = 2;
	
	String upMethod(){
		return "OverUp upMethod";
	}
}

class OverGo extends OverUp{
	int z = 10;
	
	@Override
	String upMethod(){
		return "OverGo upMethod";
	}
	
	String upMethod(int a){
		return a+"upMethod";
	}
	
}