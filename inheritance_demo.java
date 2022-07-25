class shape {
     private double width;
    private double height;
    private double length;
    /*void print_sub()
    {
        System.out.println("i am the sub class");
    }*/
    void print_sub1(){
        System.out.println("width and hegiht are "+width+" and"+height);
             
    }
    double getwidth(){
        return width;
    }
    double getheight()
    {
        return height;
    }
    double getlength()
    {
        return length;
    }
    void setwidth(double w){
        width=w;
    }
    void setheight(double h){
        height=h;
    }
    void setlength(double l){
        length=l;
    }
    shape(double h,double w){
        width=w;
        height=h;
    }
    //shape( double l,double w)
    /*shape() {
        height=10;
        width=20;
    }*/
}
class rectangle  extends shape{ 
    //string s;
    rectangle(double l,double w)
    {
        super(l,w);
    }
    double area1() {
         return getheight()*getwidth();
    }
}
class triangle extends shape {
    String s;
    triangle( double h,double w){
        super(w,h);
    }
    double area(){
        return (getwidth()*getheight())/2;
    }
    void print_sub(){
        System.out.println("i am subclass extending from super class");
    }
}
public class inheritance_demo {
    public static void main(String[] args) {
        triangle t1=new triangle(20,20);
        rectangle t2=new rectangle(10,10);
        t1.print_sub();
        t1.print_sub1();
        t1.print_sub();
        System.out.println("The area of trangle will be"+t1.area());
        System.out.println("The area will be:"+t2.area1());
    }
}
