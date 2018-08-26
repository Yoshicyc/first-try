package ch13_05;

public class ch13_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCar obj1 = new CCar("Ford");
		CCar obj2 = new CCar("Toyota");
		obj1.start();
		try{
			obj1.join();
			System.out.println("obj1 done");
			obj2.start();
		}catch(InterruptedException e){}
	}
}
class CCar extends Thread{
	String manufacturer;
	public CCar(String str){manufacturer = str;}
	public void run(){
		for(int i=1;i<=3;i++){
			for(int t=1;t<1000;t++){
				System.out.println(manufacturer+" is running");
			}
		}
	}
}