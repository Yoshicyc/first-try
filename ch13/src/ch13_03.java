
public class ch13_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCar car1 = new CCar("Ford");
		CCar car2 = new CCar("Toyota");
		Thread obj1= new Thread(car1);
		Thread obj2= new Thread(car2);
		obj1.start();
		obj2.start();
	}
}
class CWheeledDevices{
	int wheel;
}
class CCar extends CWheeledDevices implements Runnable{
	String manufacturer;
	public CCar(String str){
		wheel = 4; manufacturer = str;
	}
	public void run(){
		for(int i=1;i<=3;i++){
			for(int t=1;t<10000;t++){
				;
				System.out.println(manufacturer +" is running");
			}
		}
	}
}