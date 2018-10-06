package f_oop2;

public class InterfaceTest01 {
	public static void main(String[] args) {
		Fight f = new Fight();
		
		System.out.println(f instanceof Unit2);
		Unit2 u2 = f;
		
		System.out.println(f instanceof Object);
		Object ob = f;
		
		System.out.println(f instanceof Movable);
		Movable mv = f; 
		
		System.out.println(f instanceof Attackable);
		System.out.println(f instanceof Fightable);
	}
}

class Unit2{
	int x;
	int y;
	
	int currentHp;	//현재 HP
}

class Fight extends Unit2 implements Fightable{

	@Override
	public void move(int x, int y) {
		
	}

	@Override
	public void attack(Unit2 u) {
		
	}
	
}

interface Movable{
	void move(int x, int y);
}

interface Attackable{
	void attack(Unit2 u);	//매개변수: 누구를 공격하냐
}

interface Fightable extends Movable, Attackable{
	
}