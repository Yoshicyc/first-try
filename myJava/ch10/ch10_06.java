public class ch10_06{
	public static void main(String args[]){
		int lottoSize = 99;
		try{
			if(lottoSize > 48)
				throw new CmyException1();
			if(lottoSize < 6)
				throw new CmyException2();
		}
	//	catch(CmyException1 | CmyException2 e){
	//		e.showMessage();
	//		lottoSize = e.changeSize();
	//	}
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		catch(CmyException1 e){
			e.showMessage();
			lottoSize = e.changeSize();
		}
		catch(CmyException2 e){
			e.showMessage();
			lottoSize = e.changeSize();
		}
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		finally{
			System.out.println("Ball's = "+lottoSize);
		}
		int lottoArray[] = new int[lottoSize];
		System.out.println("All Done!!");
	}
}

class CmyException1 extends Exception{
	public CmyException1(){	super();}
	public void showMessage(){	System.out.println("Wrong Size,too Big");}
	public int changeSize(){
		System.out.println("Change Size to 6");
		return 6;
	}
}

class CmyException2 extends Exception{
	public CmyException2(){	super();}
	public void showMessage(){	System.out.println("Wrong Size,too Small");}
	public int changeSize(){
		System.out.println("Change Size to 6");
		return 6;
	}
}