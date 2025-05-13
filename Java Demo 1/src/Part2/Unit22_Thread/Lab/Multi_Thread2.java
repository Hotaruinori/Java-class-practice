package Part2.Unit22_Thread.Lab;

// 第1個 Thread: 1+2+....10
// 第2個 Thread: 1+2+....12
// 第3個 Thread: 1+2+....15
// 第4個 Thread: 1+2+....18
class Add_nums implements Runnable {
    private String id;
    private int sum_nums = 0;
    private int x;
    public Add_nums(int n, int x){
        id = "Thread " + n;
        this.x = x;
    }
   
    public void run(){
        
        for(int i=1;i<=this.x;i++){
            sum_nums += i;
            // try {
            //     Thread.sleep(100);
            // }
            // catch(Exception e){}
            System.out.println(id + " is running.. , sum = " +  sum_nums);
            // System.out.println(Thread.currentThread().getName() + " is running.. , sum = " +  sum_nums);
        } 
    }
}
public class Multi_Thread2{
    public static void main(String args[]){  
        Add_nums t1 =new Add_nums(1, 10);
        Add_nums t2 =new Add_nums(2, 12);
        Add_nums t3 =new Add_nums(3, 15);
        Add_nums t4 =new Add_nums(4, 18);

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        Thread thread3 = new Thread(t3);
        Thread thread4 = new Thread(t4);

        System.out.println("開始 -\n");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
