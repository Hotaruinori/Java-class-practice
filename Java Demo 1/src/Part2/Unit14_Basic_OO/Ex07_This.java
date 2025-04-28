package Part2.Unit14_Basic_OO;
class Point                       
{
    int x,y;
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
   
    void showPoint()
    {
        System.out.println("座標:" + "(" + this.x + "," + this.y + ")");       
    }
}


public class Ex07_This
{
    public static void main(String[] args)
    {
        Point p=new Point(100,200);
        p.showPoint();
    }
}