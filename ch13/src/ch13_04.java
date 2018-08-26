
public class ch13_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCar obj1 = new CCar("Ford");
		CCar obj2 = new CCar("Toyota");
		obj1.start();
		obj2.start();
	}
}
class CCar extends Thread{
	String manufacturer;
	public CCar(String str){manufacturer = str;}
	public void run(){
		for(int i=1;i<=3;i++){
			try{
				sleep((long)(1000*Math.random()));
			}catch(InterruptedException e){}
			System.out.println(manufacturer+" is running");
		}
	}
}