public class ch9_07{
	public static void main(String args[]){
		CCircle obj = new CCircle(5.0);
		obj.computeArea();
		obj.show();
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

interface IColorCircle extends IColor,ICircle{
	public abstract void show();
	//public abstract int draw(int i);
	public abstract void draw(int i);	
	public abstract void draw(int i, int j);
}

class CShape{
	protected double area;
	public void show(){
		System.out.println("area= "+area);
	}
}

class CCircle extends CShape implements IColorCircle{
	protected double radius;
	public CCircle(double i){radius = i;}
	@Override public void computeArea(){
		area = radius * radius * pi;
	}
	@Override public void draw(int i){
		if(i==2)		System.out.println("綠色");
	}
	@Override public void draw(int i, int j){
		draw(i);
		if(j==1)		System.out.println("實心");
	}
}