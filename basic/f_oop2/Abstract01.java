package f_oop2;

public class Abstract01 {

}

abstract class Unit{ //모든 유닛의 공통적인 부분
	int x;
	int y;
	
	abstract void move(int x, int y);
	
	void stop(){
		
	}
	
}


abstract class Marine extends Unit{
	
	void stimPack(){	//특수기능
		
	}
	
}


class Tank extends Unit{
	
	void changeMode(){
		
	}
	
	@Override
	void move(int x, int y){
		
	}
	
}


class DropShip extends Unit{
	
	void load(){
		
	}
	
	void unLoad(){
		
	}
	
	@Override
	void move(int x, int y){
		
	}
	
	
}







