class outer
{
    int outer_x=100;
    class inner 
    {
        int inner_y=200;
        void imethod()
        {
            System.out.println("Accessing from inner class");
            System.out.println(outer_x);
            System.out.println(inner_y+outer_x);
        }
    }


void display()
{
    inner obj1= new inner();
    System.out.println("The vale of innser class variable"+obj1.inner_y); 
    System.out.println("The value of inner class variable"+outer_x);
}
}
public class inner_class_demo {
    public static void main(String[] args) {
        
        outer ob=new outer();
        ob.display();
        outer.inner ob2 =ob.new inner();
        ob2.imethod();
    }
}
