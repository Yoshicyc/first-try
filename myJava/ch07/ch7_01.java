import java.util.Scanner;
import java.lang.*;

public class ch7_01{
	public static void main(String args[]){
		CCar bus = new CCar();
		CCar taxi = new CCar();

		bus.name = "601";
		bus.whell = 6;
		bus.person = 40;

		taxi.name = "CA-438";
		taxi.whell = 4;
		taxi.person = 3;

		System.out.println(taxi.person);
		System.out.println(taxi.name);
	}

}

class CCar{
	public String name;
	public int whell;
	public int person;
}
