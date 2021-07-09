import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LL newLL = new LL("#head#");
        while(true){
            printOptions();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    System.out.println("enter name:");
                    String newPerson = scanner.nextLine();
                    addLL(newLL,newPerson);
                    break;
                case 2:
                    System.out.print("enter person name to search:");
                    String newPerson2 = scanner.nextLine();
                    int position = searchLL(newLL,newPerson2);
                    if(position>=0)
                        System.out.printf(newPerson2+" is present in the list");
                    else
                        System.out.println(newPerson2+" is not present in the list");
                    break;
                case 4:
                    System.out.print("enter person name to delete:");
                    String newPerson3 = scanner.nextLine();
                    int position2 = searchLL(newLL,newPerson3);
                    if(position2>=0) {
                        System.out.println(newPerson3 + " is deleted from the list");
                        removeLL(newLL,newPerson3);
                    }
                    else
                        System.out.println(newPerson3+" is not present in the list");
                    break;
                case 5: printLL(newLL.next);break;

                default:return;


            }
        }
    }
    private static void addLL(LL head, String person){
        while(head.next!=null){
            head = head.next;
        }
        LL newNode = new LL(person);
        head.next = newNode;
        newNode.prev=head;
    }
    private static int searchLL(LL head, String person){
        int i=-1,index=-1;

        while(head!=null){
            i+=1;
            if(head.getVal().equals(person))
                return i;
            head=head.next;
        }
        return index;
    }
    private static void removeLL(LL head, String person){


        while(head!=null){
            if(head.getVal().equals(person)){
                LL prev= head.prev;
                LL next = head.next;
                prev.next=next;
                next.prev=prev;
                return;
            }
            head=head.next;
        }

    }
    private static void printLL(LL head){
        System.out.println();
        while(head!=null) {
            System.out.printf(head.getVal()+" => ");
            head=head.next;
        }
        System.out.println("null");
    }
    private static void printOptions(){
        System.out.println("Choices\n1) Add a person\n2) Search for a person\n" +
                "3) Add a person, after another person\n4) Delete a person\n" +
                "5) Print the list of persons\n6) Quit\n");
        System.out.print("enter your choice: ");
    }
}
