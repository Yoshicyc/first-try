public class ch9_02{
	public static void main(String args[]){
		CCircle obj = new CCircle(5.0);
		obj.computeArea();
		obj.show();
	}
}

interface ICircle{
	double pi = 3.14;
	public void show();
	public void computeArea();
}

class CShape{
	protected double area;
	public void show(){
		System.out.println("area="+area);
	}
}

class CCircle extends CShape implements ICircle{
	protected double radius;
	public CCircle(double i){
		radius = i;
	}
	@Override public void computeArea(){
		area = radius * radius * pi;
	}
}