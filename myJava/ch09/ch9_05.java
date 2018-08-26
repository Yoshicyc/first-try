public class ch9_05{
	public static void main(String args[]){
		CCircle obj = new CCircle(5.0);
		obj.computeArea();
		obj.show();
		obj.draw(1);
	}
}

interface ICircle{
	public static final double pi =3.14;
	public abstract void show();
	public abstract void computeArea();
}

interface IColor{
	public abstract void draw(int i);
}

class CShap{
	protected double area;
	public void show(){
		System.out.println("area= "+area);
	}
}

class CCircle extends CShape implements ICircle,IColor{
	protected double radius;
	public CCircle(double i){radius = i;}
	@Override public void computeArea(){
		area = radius * radius * pi;
	}
	@Override public void draw(int i){
		if(i==0)		System.out.println("0");
		else if(i==1)	System.out.println("1");
		else 		System.out.println("error");
	}
}