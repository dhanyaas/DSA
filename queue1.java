import java.util.*;

class queueexception extends Exception{
    public void Error(){
        System.out.println("Queue is full");
        
    }
}
class queue {
    int rear=-1;
    int front=-1;
    int [] q;
      queue(int n){
        q=new int[n];
      }

    void insert(int ele) throws queueexception{

        if(rear>=q.length){
          throw new queueexception();
          
        }
        if(front==-1)
        front=0;
        q[rear++]=ele;
    }

    int delete(){
        int ele;
            if(front==-1){
                throw new ArrayIndexOutOfBoundsException();
            }
            if(front==rear){
             ele=q[front];
             rear=front=-1;
        }
        else{
            ele=q[front++];
        }
        return ele;
    }
    void display() {
        if(front==-1){
            throw new ArrayIndexOutOfBoundsException();
          
        }
        for(int i=front;i<rear;i++){
          System.out.println(q[i]+"\t");
            }

        }

    }

public class queue1 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        queue q=new queue(size);
        try {
            while(true){
                System.out.println("Queue operations\n");
                System.out.println("1.INSERT \n2.DELELTE\n 3.DISPLY\n 4.EXIT");
                System.out.println("Enter your choice:");
                int choice=sc.nextInt();
                switch(choice){
                case 1 :System.out.println("Enter the element to insert:");
                         q.insert(sc.nextInt());
                         break;
                case 2: System.out.println("Deleled item is "+q.delete());
                         break;
                case 3: q.display();
                break;
                case 4 : return;
                


                }
            }
        }
        catch(queueexception e){
            e.Error();
            
        }
        catch(ArrayIndexOutOfBoundsException exe){
            System.out.println("Queue is empty");
                }
    }
}


