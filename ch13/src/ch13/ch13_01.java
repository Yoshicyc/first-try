package ch13;

public class ch13_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCar obj1 = new CCar("Ford");
		CCar obj2 = new CCar("Toyota");
		obj1.run();
		obj2.run();

	}
}

class CCar{
	String manufacturer;
	public CCar(String str){ manufacturer = str;}
	public void run(){
		for(int i=1; i<3; i++){
			for(int t=1; t<100000; t++){
				;
			System.out.println(manufacturer+" is running");
			}
		}
		
	}
	
}