public class ch9_09{
	public static void main(String args[]){
		CCircle obj = new CCircle(5.0);
		obj.computeArea();
		obj.draw(2,1);
	}
}

interface ICircle{
	public static final double pi = 3.14;
	public abstract void computeArea();
}

interface IColor{
	public abstract void draw(int i);
}

interface ICricleColor extends IColor,ICircle{
	public abstract void show();
	public abstract void draw(int i);
	public abstract void draw(int i, int j);
}

interface IShape{
	public abstract void show();
}

class CCircle implements IShape,ICricleColor{
	protected double area;
	protected double radius;
	public CCircle(double i){radius = i;}
	@Override public void computeArea(){
		area = radius * radius * pi;
	}
	@Override public void draw(int i){
		show();
		if(i==2)		System.out.println("綠色");
	}
	@Override public void draw(int i, int j){
		draw(i);
		if(j==1)		System.out.println("實心");
	}
	@Override public void show(){
//		System.out.println("area= "+area);
	}
}