
import java.math.*;
class method
{
    double l,h,b;
     double area1(double b,double h )
    {

       return (b*h)/2; 
    }

      double area1( double l)
      {
        return l*l;
      }
      double rect(double b,double l)
      {
        return l*b;
      }
      
    }
    





public class area {
    public static void main(String[] args) {
        double a1,a2,a3;
       method v=new method();
      a1= v.area1(4,5) ;
       a2=v.area1(6);
       a3=v.rect(4, 5);
       System.out.println(a1);
       System.out.println(a2);
       System.out.println(a3);
    }
}
