import java.util.Scanner;

class account {
    String owner,acc;
    double balance;
    account( String accno,String name,double bal){
        this.acc=accno;
        this.owner=name;
        this.balance=bal;

    }
  void deposite(double amount){
    this.balance=amount;
    System.out.print("The balance details is:");
    System.out.println(owner+"\t"+acc+"\tbalance");
  }
 void widthdrwal( double amount){
     if(this.balance<500){
        System.out.println("less balance");
        return;
     }
     this.balance-=amount;
 }
}


public class prg5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        String name =sc.next();
        System.out.print("enter the account no");
        String acc=sc.next();
        System.out.println("balance");
        double bal=sc.nextInt();
        account a=new account(acc, name, bal);
        boolean opt=true;
        while(opt)
        {
            System.out.println("1.balance enquiry\n2.deposite\n 3.withdrowal");
            System.out.println("enter your choice");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("enter the amount to deposite");
                double amt=sc.nextInt();
                a.deposite(amt);
                break;
               case 2: System.out.println("enter the amount to withdrawal");
               double amount=sc.nextInt();
               a.widthdrwal(amount);
                break;
            }
            System.out.println("Do you want continue");
            opt=sc.nextBoolean();

        }

    }
}
