/* 以建構式來指定屬性的初值 */

class ShowDate   //定義ShowDate類別
{
    private int year;   //年份
    private int month;  //月份
    private int day;    //日數
   
    public void printDate()
    {
        System.out.println(year + "-" + month + "-" + day);
        System.out.println();
    }
   
    public ShowDate()                              //建構1:無參數
    {
        this.year=2021;
        this.month=10;
        this.day=19;
        //this(2021,10,19);
    }
   
    public ShowDate(int day)                       //建構2:只有日數參數
    {
        this.year=2021;
        this.month=10;
        this.day=day;
        //this(2021,10,day);
    }
    
    public ShowDate(int month, int day)            //建構3:有日數、月份參數
    {
        this.year=2021;
        this.month=month;
        this.day=day;
        //this(2021,month,day);
    }
   
    //不對外開放的建構
    private ShowDate(int year, int month, int day) //建構4:有日數、月份、年份參數
    {
        this.year=year;
        this.month=month;
        this.day=day;     
    }
}


public class Ex08_Constructor
{ 
    public static void main(String[] args) 
    {       
        ShowDate day1,day2,day3,day4;
        
        day1 = new ShowDate();
        day1.printDate();
        
        day2 = new ShowDate(10);
        day2.printDate();
        
        day3 = new ShowDate(10,19);
        day3.printDate();
        
        //day4 = new ShowDate(2021,10,19);
        //day4.printDate();
    }
}