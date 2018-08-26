pakage pack5a.subpacka;
public class CCircle extends pack5a.CShape{
	protected double radius;
	protected final double pi = 3.14;
	public CCircle(double i){	radius = i;}
	public void showArea(){
		area = radius * radius * pi;
		System.out.println("Circle Area= "+area);
	}
}