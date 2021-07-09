import java.util.ArrayList;
public class friendList {
    private ArrayList<String> friendListSayak = new ArrayList<String>();

    public void addFriend(String name){
        friendListSayak.add(name);
    }

    public void printFriendList(){
        System.out.println("Sayak has "+friendListSayak.size()+" number of friends\nThey're:");
        for(int i=0;i<friendListSayak.size();i++)
        {
            System.out.println("Friend "+(i+1)+": "+friendListSayak.get(i));
        }

    }
    public void modifyFriendList(int position, String name)
    {
        friendListSayak.set(position,name);
    }
    public void removeFriend(int position)
    {
        String removedFriend = friendListSayak.get(position);
        friendListSayak.remove(position-1);
        System.out.println("Removed "+removedFriend+" from sayak's friendList");
    }
    public void findFriend(String friend){
        int position = friendListSayak.indexOf(friend);
        if(position>=0)
            System.out.printf("Sayak has a friend named "+friend+" at position "+position+" int the list");
        else
            System.out.println("Sayak don't have a friend named "+friend);

    }
}
