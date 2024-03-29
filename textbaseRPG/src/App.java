//App.java
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        Player.CreatCharacter(); //Creating Character
        
        boolean done = false;

        while(!done) {

            Map.OutputPosition(); // Reveals where are you.

            System.out.println("1)Move 2)Rest 3)Menu: ");
            int select = input.nextInt();

            switch (select) {
                case 1:
                    Map.Move();
                    break;
                
                case 2:
                    //rest
                    break;

                case 3:
                    System.out.println("1)Items 2)Equip 3)Status");
                    System.out.println("4)Quit  0)cancel: ");
                    select = input.nextInt();
                        if (select == 1) {
                            //show items function
                            break;
                        } else if (select == 2) {
                            // equip armor and weapon.
                            break;
                        } else if (select == 3) {
                            //reveal stats
                            break;
                        } else if (select == 4) {
                            done = true;
                            break;
                        } else if (select == 0) {
                            //cancel
                            break;
                        } else {
                            System.out.println("Invalid input!");
                        }

                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }
        input.close();
    }

}