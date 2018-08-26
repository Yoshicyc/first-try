public class ch9_03{
	public static void main(String args[]){
		CCircle1 obj1 = new CCircle1(5.0);
		CCircle2 obj2 = new CCircle2(5.0);
		CCircle3 obj3 = new CCircle3(5.0);
		obj1.computeArea();
		obj1.show();
		obj2.computeArea();
		obj2.show();
		obj3.computeArea();
		obj3.show();
	}
}

interface ICircle{
	public static final double pi=3.14;
	public abstract void computeArea();
	public default void show(){
		System.out.println("pi= "+pi);
	}
}

class CShape{
	protected double area;
	public void show(){System.out.println("area= "+area);}
}

class CCircle1 implements ICircle{
	protected double radius;
	protected double area;
	public CCircle1(double i){radius = i;}
	@Override public void computeArea(){area = radius * radius * pi;}
}

class CCircle2 extends CShape implements ICircle{
	protected double radius;
	public CCircle2(double i){radius = i;}
	@Override public void computeArea(){area = radius * radius * pi;}
}

class CCircle3 extends CShape implements ICircle{
	protected double radius;
	public CCircle3(double i){radius = i;}
	@Override public void computeArea(){area = radius * radius * pi;}
	@Override public void show(){System.out.println("area= "+area+"radius="+radius);}
}