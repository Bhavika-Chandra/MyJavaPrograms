class thread1 implements Runnable{
	public void run(){
		System.out.println("Thread started running...");
	}
public static void main(String[] args){
	thread1 obj=new thread1();
	Thread t1=new Thread(obj);
	t1.start();
}
}