package pack5b;
import pack5a.subpacka.CCircle;
import pack5a.subpackb.CRect;
public class ch11_07{
	public static CCircle obj1;
	public static CRect obj2;
	public static void main(String args[]){
		obj1 = new CCircle(5.0);
		obj1.showArea();
		obj2 = new CRect(5.0,3.0);
		obj2.showArea();
	}
}