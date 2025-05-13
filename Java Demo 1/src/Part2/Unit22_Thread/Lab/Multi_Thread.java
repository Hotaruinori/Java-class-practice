package Part2.Unit22_Thread.Lab;

// 第1個 Thread: 1+2+....10
// 第2個 Thread: 1+2+....12
// 第3個 Thread: 1+2+....15
// 第4個 Thread: 1+2+....18
class Add_nums extends Thread {
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
public class Multi_Thread{
    public static void main(String args[]){  
        Add_nums thread1 =new Add_nums(1, 10);
        Add_nums thread2 =new Add_nums(2, 12);
        Add_nums thread3 =new Add_nums(3, 15);
        Add_nums thread4 =new Add_nums(4, 18);

        // thread1.setPriority(10);

        System.out.println("開始 -\n");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
