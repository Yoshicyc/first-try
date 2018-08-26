public class ch8_02{
	public static void main(String args[]){
		CB objB = new CB();
		objB.show();
	}
}

class CA{
	protected int varX;
	public CA(){
		System.out.println("Constract Farter...");
		varX = 10;
	}
}

class CB extends CA{
	public CB(){
		System.out.println("Constract Son...");
	}
	public void show(){
		System.out.println("varX = "+varX);
	}
}