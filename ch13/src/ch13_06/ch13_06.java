package ch13_06;

public class ch13_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		COperation atmObj = new COperation();
		COperation counterObj = new COperation();
		atmObj.start();
		counterObj.start();
	}
}

class COperation extends Thread{
	public void run(){
		CAccount.withdraw(1000);
	}
}

class CAccount{
	static int balance = 10000;
	static int accountNo = 1026;
	public static void checkBalance(){
		int temp = balance;
		try{Thread.sleep((long)(1000*Math.random()));}
		catch(InterruptedException e){}
		System.out.println(Thread.currentThread().getName()+" is running...");
		System.out.println("Account "+accountNo+" has "+temp+" dalars");
	}
	
	public synchronized static void withdraw(int m){
		int temp = balance;
		try{Thread.sleep((long)(1000*Math.random()));}
		catch(InterruptedException e){}
		temp = temp - m;
		try{Thread.sleep((long)(1000*Math.random()));}
		catch(InterruptedException e){}
		balance = temp;
		System.out.println(Thread.currentThread().getName()+" "+m+"元");
		checkBalance();
	}
}

