import java.util.*;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");


    public static void main(String[] args) {

//
        btnPrint.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(String title){
                System.out.println(title + " was clicked");
            }
        });
        listen();



//        Gearbox.Gear first = mcLaren.new Gear(1,12.3);
//
//
//        System.out.println(first.driveSpeed(1000));

//        mcLaren.addGear(1,5.4);
//        mcLaren.addGear(2,15.3);
//        mcLaren.addGear(3,20.2);

//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(5000));


    }

    private static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
