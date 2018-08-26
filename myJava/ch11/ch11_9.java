public class ch11_9{
	public static void main(String args[]){
		Long myLongInt = new Long("5");
		long L1 = myLongInt.longValue();
		int I1 = myLongInt.intValue();
		CRect obj = new CRect(I1,I1);
		obj.showArea();
	}
}

class CRect{
	protected int area;
	protected int len,width;

	public CRect(int i, int j){len = i; width =j;}

	public void showArea(){
		area = len * width;
		System.out.println("Area="+area);
	}
}