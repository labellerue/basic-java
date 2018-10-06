package h_javaLang;

/**
 * clone 참조와 기본형
 * @author pc02
 *
 */

public class CloneTest02 {
	public static void main(String[] args) {
		Circle c = new Circle(new Point(100,100),50);
		Circle cCopy = (Circle)c.shallowCopy();
		Circle cDCopy = (Circle)c.deepCopy();
		
		System.out.println(c);
		System.out.println(cCopy);
		
		c.r = 200;
		c.p.x = 5000;
		System.out.println(c);
		System.out.println(cCopy);
		
		System.out.println(cDCopy);
		
		
	}
}

class Point{
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	
}

class Circle implements Cloneable{
	Point p;
	int r;
	
	public Circle(Point p, int r) {
		this.p = p;
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}

	protected Object shallowCopy(){
		Object o = null;
		try {
			o =super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return o;
	}
	
	protected Object deepCopy(){
		Object o = null;
		try {
			this.clone();
			o =super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
//			Point의 주소방을 공유하지 않도록 새로운 주소를 만들어 기존 값을 바꿔치기
		((Circle)o).p = new Point(p.x,p.y);
		return o;
	}
	
	
}




