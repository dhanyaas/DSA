import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class insert {
    public static void main(String[] args) {
        
        String b;
        StringBuffer sb = new StringBuffer(30);
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE STRING:");
        b=sc.next();

        int k=0;
        int i=b.length();
        System.out.println(i);
         StringBuffer rev= new StringBuffer();
         while(i!=k)
         {
            --i;
        
        rev.append(b.charAt(i));
          //char rev= b.charAt(i);
          //System.out.println();
         


        }
        System.out.println(rev);
        String upper= rev.tostring
         }
         

}
