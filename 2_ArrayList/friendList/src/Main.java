import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static friendList f= new friendList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice;

        while(!quit)
        {
            printInstruction();
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice)
            {
                case 0: printInstruction(); break;
                case 1: f.printFriendList();
                case 2:addFriend();break;
                case 3:modifyFriend();break;
                case 4:removeFriend();break;
                case 5:searchFriend();break;
                case 6:quit=true;break;
                default: System.out.println("invalid input");
            }
        }

    }

    public static void printInstruction()
    {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of sayak's friends.");
        System.out.printf("\t 2 - To add a friend on the list.");
        System.out.println("\t 3- To modify a friend from the list.");
        System.out.println("\t 4 - To remove a friend from the list.");
        System.out.println("\t 5- To search for a friend in the list");
        System.out.println("\t 6 - To quit the application.");
    }
    public static void addFriend()
    {
        System.out.println("Please enter the friend's name: ");
        String newFriend = scanner.nextLine();

        f.addFriend(newFriend );
        System.out.println(newFriend+" is added to sayak's friend list.");
    }
    public static void modifyFriend(){
        System.out.print("Enter friend number");
        int friendNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacement friend:");
        String newFriend = scanner.nextLine();
        f.modifyFriendList(friendNumber-1,newFriend);

    }
    public static void removeFriend(){
        System.out.print("Enter friend number:");
        int number = scanner.nextInt();
        scanner.nextLine();
        f.removeFriend(number);


    }
    public static void searchFriend()
    {
        System.out.print("Enter the name of the friend to be searched: ");
        String friend = scanner.nextLine();
        f.findFriend(friend);
    }
}
