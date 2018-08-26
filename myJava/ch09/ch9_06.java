public class ch9_06{
	public static void main(String args[]){
		CA obj = new CA();
		obj.show();
	}
}

interface IX{
	public default void show(){System.out.println("IX");}
}

interface IY{
	public default void show(){System.out.println("IY Default");}
}

class CA implements IX,IY{
	public void show(){
		IY.super.show();
	}
}