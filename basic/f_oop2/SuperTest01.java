package f_oop2;

public class SuperTest01 {
	public static void main(String[] args) {
		Child2 c2 = new Child2();
		int result = c2.getAdd();
		System.out.println(result);
		
		
	}
}


class Parent2{
	int x = 10;
	int y = 20;
	
	int getAdd(){
		return x + y;
	}
	
	Parent2(){
		
	}
}

class Child2 extends Parent2{
	int x = 30;
	int y = 40;
	
//	int getAdd(int x){
//		System.out.println(x);		//인자값 출력
//		System.out.println(this.x); //30
//		System.out.println(super.x);//10
//		return super.getAdd();		//부모와 중복이 안되기 때문에 super 생략 가능
//	}
	
	@Override
	int getAdd(){
		System.out.println(x);		//인자값 출력
		System.out.println(this.x); //30
		System.out.println(super.x);//10
		return super.getAdd();		//부모와 중복이 안되기 때문에 super 생략 가능
	}
	
	Child2(){
		
	}
		
		
}