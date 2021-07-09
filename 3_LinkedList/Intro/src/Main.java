import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList ll = new LinkedList("head");
        while(true){
            System.out.println("Make a choice:\n1) add element to linked list\n2) print the linked list\n"+
                    "3) Quit\n Your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    System.out.println("enter element: ");
                    String element = scanner.nextLine();
                    addLL(ll,element);break;
                case 2:printLL(ll.next);break;
                case 3: System.out.println("program ended......");return;
            }

        }

    }
    private static void addLL(LinkedList head,String item){
        LinkedList newNode = new LinkedList(item);
        LinkedList p = head;
        while(p.next!=null)
        {
            p=p.next;
        }
        p.next = newNode;
    }
    private static void printLL(LinkedList head){

        while(head!=null){
            System.out.print(head.name+" => ");
            head=head.next;
        }
        System.out.println("null");
    }
}
