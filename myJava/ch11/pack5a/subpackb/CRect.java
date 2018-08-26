package pack5a.subpackb;
public class CRect extends pack5a.CShape{
	protected double len,width;
	public CRect(double i, double j){	len = i; width = j;}
	public void showArea(){
		area = len * width;
		System.out.println("Rect Area= "+area);
	}
}