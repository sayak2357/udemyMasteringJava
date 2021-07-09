import java.util.*;


public class Main {
    public static void main(String[] args) {
        Player gly = new Player("gly",10,33);
        System.out.println(gly.toString());
        savedObject(gly);

        gly.setHitPoints(3);
        System.out.println(gly);
        gly.setWeapon("Stormbringer");
        savedObject(gly);
        //loadObject(gly);
        System.out.println(gly);
        ISaveable werewolf = new Monster("Werewolf",22,33);
        System.out.println(werewolf);
        System.out.println("Strength = "+((Monster) werewolf).getStrength());
        savedObject(werewolf);

    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n"+
                "1 to enter a string\n"+
                "0 to quit");
        while(!quit){
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;


            }

        }
        return values;
    }

    public static void savedObject(ISaveable objectToSave){
        for(int i=0;i<objectToSave.write().size();i++){
            System.out.println("Saving "+objectToSave.write().get(i)+" to storage device");

        }
    }
    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);

    }
}