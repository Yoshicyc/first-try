public class ch9_01{
	public static void main(String args[]){
		CCircle obj = new CCircle(5.0);
		obj.computerArea();
		obj.show();
	}
}

interface ICircle{
	double pi = 3.14;
	void show();
	void computerArea();
}

class CCircle implements ICircle{
	protected double area;
	protected double radius;
	public CCircle(double i){
		radius =i;
	}
	@Override public void show(){
		System.out.println("area="+area);
	}
	@Override public void computerArea(){
		area = radius * radius * pi;
	}
}