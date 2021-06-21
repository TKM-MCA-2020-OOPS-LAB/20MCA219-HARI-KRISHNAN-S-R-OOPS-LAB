import java.util.ArrayList;
import java.util.List;

class Producer extends Thread{
	List<Integer> list;
	
	public Producer(List<Integer> list){
		this.list=list;
	}
	
	@Override
	public void run(){
		try {
			
			synchronized(list){
				
				while(true){
					
					if(list.size()>0) {
						
						list.wait();
					}
					else
						produce();
				}
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	private void produce() throws InterruptedException {
		for(int i=1;i<=5;i++){
			Thread.sleep(1000);
			list.add(i);
			System.out.println("Producer produced the element: "+i);	
		}
		list.notifyAll();
	}
}
class Consumer extends Thread{
	List<Integer> list;
	
	public Consumer(List<Integer> list){
		this.list=list;
	}
	
	@Override
	public void run(){
		try {
			
			while(true){
				
				synchronized(list){
					
					if(list.size()==0){
						
						list.wait();
					}	
					else
						consume();
				}
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	private void consume() throws InterruptedException
	{
		while(!list.isEmpty())
		{
			Thread.sleep(1000);
			System.out.println("Consumed the element: "+list.remove(0));
		}
		list.notifyAll();
	}
}
public class co4_q7
{
	public static void main(String[] args) throws Exception
	{
		List<Integer> list = new ArrayList<Integer>();
		Producer produce = new Producer(list);
		Consumer consume = new Consumer(list);
		produce.start();
		consume.start();
	}

}