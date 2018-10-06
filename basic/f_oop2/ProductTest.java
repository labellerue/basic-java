package f_oop2;

import java.util.Vector;

public class ProductTest {
	public static void main(String[] args) {
		
//		Product d = new Dyson("v8",128);
//		System.out.println(d.toString());//Product에는 override를 안했기 때문에 그 부모인 Object의 toString()이 호출되어야 하지만,
										//객체인 Dyson이 override했기 때문에 Dyson의 toString()이 실행됨
		//물품진열
		Tv2 t = new Tv2("LG올레드", 1000);
		Dyson d = new Dyson("V8", 200);
		NoteBook nb = new NoteBook("Gram", 300);
		
		//구매자 등장
		Buyer b = new Buyer("나진실", 10000);
		Buyer b2 = new Buyer("이소형", 200);
		b.buy(t,2);//Tv구매
		b.buy(d,3);
		b.buy(nb,4);
		
		System.out.println("고객님의 남은 돈 : " +b.money);
		System.out.println("고객님의 포인트 : "+b.bonusPoint);
		
		//1. 반품: buyer에 산 물품을 저장
//		b.refund(t);
//		b.refund(d);
//		b.refund(d);
//		b.refund(nb);
//		System.out.println("고객님의 남은 돈 : " +b.money);
//		System.out.println("고객님의 포인트 : "+b.bonusPoint);	
		
		
		//2. summary
		b.summary();
		
//			영 수 증
//		구매물품
//		  LG올레드 1000만원
//		  V8      200만원
//		  Gram	  300만원
//		  
//		  합계      1500만원
//		  
//		  호갱님의 남은돈은 8500만원
//		  		 포인트는 150만원
//		  		 
//		  감사합니다. 나진실님.
		
		
		//3. 사람을 여러명 관리할 수 있는 클래스를 만드세요
		
		//4. 물품수량을 관리할 수 있도록 만들어주세요.
		System.out.println("총 판매량: "+b.item.size());
		
		
	}
}

class Product{
	String name;
	int price;
	int mileage;
	int stock;
	
	public Product(String name, int price){
		this.name = name;
		this.price = price;
		mileage = price/10;
	}
}


class Tv2 extends Product{
	
	public Tv2(String name, int price){ 
		super(name,price);
	}
	
	int sold(int ea){		//구매한 수량만큼 재고에서 빼기
		stock = stock - ea;
		return ea;
	}

	@Override
	public String toString() {
		return name;
	}
	
}

class NoteBook extends Product{

	public NoteBook(String name, int price){
		super(name, price);
	}
	
	void sold(int ea){		//구매한 수량만큼 재고에서 빼기
		stock = stock - ea;
	}
	
	@Override
	public String toString(){
		return name;
	}
}

class Dyson extends Product{

	public Dyson(String name, int price){
		super(name, price);
	}
	
	void sold(int ea){		//구매한 수량만큼 재고에서 빼기
		stock = stock - ea;
	}

	@Override
	public String toString(){
		return name;
	}
}

class Buyer extends Manager{
	String name;
	int money;
	int bonusPoint;
	Vector<Product> item = new Vector<Product>();	//구매목록을 저장하기 위한 변수
													//제네릭
	
	public Buyer(String name, int money){
		super.name= name;		//매니저에게 구매고객 등록
		this.name= name;
		this.money= money;
	}
	
	/**
	 * 물품 구매를 위한 메서드
	 * @param p 물품의 상위 메서드
	 */
	void buy(Product p, int stock){
		if(money < p.price*stock){
			System.out.println("집으로 사라져");
			return;
		}
		money -= p.price;
		bonusPoint += p.mileage;
		item.add(p);	//Object 타입으로 up-casting	구매한 물건 배열에 저장
		System.out.println(p+"를 구매하셨습니다.");
		super.bonusPoint=bonusPoint;	//매니저에게 고객의 포인트 보고
	}
	
	void refund(Product p){
		int count=0;
		if(item.isEmpty()){	//여기서 사간 물건이 없다면
			System.out.println("반품할 물건이 없습니다.");
			return;
		}else{				//여기서 사간 물건이 있다면
			for(int i=0 ; i<item.size() ; i++){	//index마다 p의 주소가 들어있는지 확인한다
				if(p==item.get(i)){
					money += p.price;			//돈 돌려주고
					bonusPoint -= p.mileage;	//마일리지 도로 가져가고
					System.out.println(p+"를 반품하셨습니다.");
					item.remove(p);				//구매목록에서 제거
					count++;
				}
				if(count==item.size()){			//p와 일치하는 물품이 하나도 없을 때
					System.out.println(p+"은(는) 여기서 구매하신게 아니예요");
				}
			}
		}
		//답
//		if(item.remove(p)){
//			money += p.price;			//돈 돌려주고
//			bonusPoint -= p.mileage;	//마일리지 도로 가져가고
//			System.out.println(p+"를 반품하셨습니다.");
//		}else{
//			System.out.println("해당물품을 구매하신적 없습니다.");
//		}
		
	}
	
	void summary(){
		System.out.println("---------영수증---------");
		System.out.println("구매물품");
		int total =0;
		for(int i=0; i<item.size() ; i++){
			Product p = item.get(i);	//item.get()은 Object형이니까 down-casting을 해야하지만 vector값을 Product형으로 해주면 같은 형이 됨
			System.out.println(p.name+"		"+p.price+"만원");
			total+= p.price;
		}
		System.out.println("합계		"+total+"만원");
		System.out.println("고객님의 남은 돈은	"+ money+"만원");
		System.out.println("	포인트는	"+bonusPoint+"점");
		System.out.println("감사합니다.	"+name+"님");
	}
	
}

class Manager{
	String name;
	int bonusPoint;
//	Vector buyerInfo = new Vector();
	
}

//답
class Buyers{
	private Vector<Buyer> customers = new Vector<Buyer>();
	
	
}










