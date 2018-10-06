package f_oop2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class DrawShape extends Frame {
	public static void main(String[] args) {
		DrawShape ds = new DrawShape();
		System.out.println(ds);
		Circle c = new Circle();
		System.out.println(c);
//		ds.paint(g);			//자동생성
//		ds.paint(new Graphics());
	}
	
	public void paint(Graphics g){//실재로 Frame 내에 paint()가 존재. 그래서 이 paint()는 overriding 한 것
		//1. Circle객체를 만드세요
		// 매개변수 두개짜리 생성자를 이용해서 200,200  반지름 100
		Point p1 = new Point(200,200);
		Circle c;
		c = new Circle(p1,100);
		
		//2. 원을 그리세요
		// g.drawOval(x, y, width, height); 가 그려줌
		g.drawOval(c.p.x, c.p.y, c.r*2, c.r*2);
		
		//3. Triangle객체를 만드세요
		// 매개변수 한개짜리 생성자를 이용하세요
		// 100,100 200,200 200,100
		Point[] p ={new Point(100,100), new Point(200,200), new Point(200,100)};
		Triangle t = new Triangle(p);

		//4. 삼각형을 그리세요
		// g.drawLine(x,y,x1,y1);	세번 그려주세요
		g.drawLine(t.p[0].x,t.p[0].y,t.p[1].x,t.p[1].y);
		g.drawLine(t.p[1].x,t.p[1].y,t.p[2].x,t.p[2].y);
		g.drawLine(t.p[2].x,t.p[2].y,t.p[0].x,t.p[0].y);
		
		//5. JVM 그리세요
		
	}
	
	DrawShape(){
		super("앙녕!");
		setSize(500,500);	//Frame에게 상속받은 것
		setVisible(true);	//화면 뜨도록 false에서 true값으로
		setBackground(Color.lightGray);
		setResizable(false);//창 크기 변경 불가능하도록 false값 넣음(기본 창 크기 변경 가능)
	}
}

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Circle{
	//1. 점 하나를 담을 수 있는 변수를 선언하세요 p
	Point p;
	//2. 반지름을 저장할 수 있는 변수를 선언하세요 r
	int r;
	//3. 매개변수가 두개인 생성자를 만들어 p와 r을 초기화 하세요
	Circle(Point p, int r){
		this.p=p;
		this.r=r;
	}
	//4. 기본 생성자를 만들고 매개변수가 두개인 생성자를 호출하여
	//	중심점은 100,100 반지름은 50으로 p와 r을 초기화 하세요
	Circle(){
		this(new Point(100,100), 50);
	}
}

class Triangle {
	//1. 점 3개를 저장할 수 있는 변수를 선언하세요. p
	Point[] p;
	//2. 매개변수가 하나인 생성자를 만들어서 p변수를 초기화 하세요
	Triangle(Point[] p){
		this.p= p;
	}
	//3. 매개변수가 세개인 생성자를 이용해서 p변수를 초기화 하세요
	Triangle(Point p1, Point p2, Point p3, Point p4){
		p = new Point[4];
		p[0]= p1;
		p[1]= p2;
		p[2]= p3;
		p[3]= p4;
	}
	Triangle(Point p1, Point p2, Point p3){
		this.p[0]= p1;
		this.p[1]= p2;
		this.p[2]= p3;		
	}

}















