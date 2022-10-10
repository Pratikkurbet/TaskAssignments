package LambdaExpression;

interface myRunnable
{
	void run();
}
public class Java8_8 extends Thread{
	public static void main(String[] args) {
		myRunnable r=()->{
			try {
				for (int i = 0; i < 100; i++) {
					System.out.println(i);
					Thread.sleep(100);
				}
			} catch (Exception e) {
				e.getMessage();
			}
		};
		r.run();
		
		new Thread(()->{
            try {
                for(int i=100;i>=0;i--)
                {
                    System.out.println(i);
                    Thread.sleep(100);
                }
            
            } catch (Exception e) {
            	e.getMessage();
            }
        }).start();
	}
}
