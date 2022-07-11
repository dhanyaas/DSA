import java.util.Scanner;

class box
{
    int l;
    int h;
    int b;
    box( int l,int b,int h)
    {
        this.l=l;
        this.b=b;
        this.h=h;
        
    }
    box( int l)
    {
      this.l=b=h=l;  

    }
    int volume()
    {
        return l*b*h;
    }

   void print()
   {
    System.out.println("Method overloading");
   } 
   void print( int v)
   {
    System.out.println("The volume of the box is:" + " " +v);
   }
}


public class overloding {
    public static void main(String[] args) {
        int r1,r2;
        int len,bre,he;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length:");
         len=s.nextInt();
         System.out.print("Enter the breath");
         bre=s.nextInt();
         System.out.print("Enter the height:");
         he=s.nextInt();
        box b1 =new box(len,bre,he);
        box b2=new box(len);
        r1=b1.volume();
        r2=b2.volume();
        b1.print();
        b2.print();
        b1.print(r1);
        b2.print(r2);

        

    }
}
