package Part2.Unit19_InnerClass.Anonymous;
public class AnonymousInnerB
{
    public static void main(String args[])
    {             
       (
       	 new Host(){
            
            void set_num(int n)  // Override
            {
            	num=n;
               	System.out.println("num*3= " + num*3);
            }
         }
       ).set_num(5);   //執行加入的方法
      
   }
}


class Host   //宿主
{
    int num;

    void set_num(int n)
    {
        num=n;
        System.out.println("num*5= " + num*5);
    }
}






/*
       Host oo=new Host()
       {
            void set_num(int n)
            {
                num=n;
                System.out.println("num*4= " + num*4);
            }
       };
       oo.set_num(5);       
       oo = null;
*/