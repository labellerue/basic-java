package f_oop2;

public class SingletonTest {
	public static void main(String[] args) {
		Singleton st1 = Singleton.getInstance();
		Singleton st2 = Singleton.getInstance();
		
	}
}

class Singleton{
	
	static Singleton st = null;
	
	private Singleton(){
		System.out.println("This is SPARTA!!!!");
	}
	
	static Singleton getInstance(){
		if(st==null){					//객체생성은 한번만 이루어진다
			st = new Singleton();	
		}
		return st;
	}
}