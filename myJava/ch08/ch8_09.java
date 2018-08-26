import java.lang.*;
public class ch8_09{
	public static void main(String args[]){
		final String str = new String("Final");
		//str = new String("aa");		//re-difine str
		//str = "...";
		System.out.println(str);
		CB obj = new CB();
		obj.add();
		obj.show();
	}
}

class CA{
	public final int var1;
	public int var2;
	public CA(){
		var1 = 10;
		var2 = 10;
	}
	public void add(){
	//var1++;				//can't re-define var1
	var2++;
	}
	public final void show(){
		System.out.println("var1="+var1+"\tvar2="+var2);
	}
}

class CB extends CA{
	public void add(){
		//var1 = var1 +10;		//re-define
		var2 = var1+var2;
	}
	//public void show(){}			//override
}

final class CC{
	public int var3;
}

//class CD extends CC{}				//can't extends CC