//Map.java
import java.util.Scanner;

public class Map {
    
    private static int positionX = 0;
    private static int positionY = 0;
    private static Scanner input = new Scanner(System.in);

    public static void Move() {

        boolean done = false;
        while (!done) {

            System.out.println("w)North a)West s)South d)East: ");
            char select = input.next().charAt(0);

            switch (select) {
                case 'w':
                positionY++;
                done = true;
                break;
                
                case 'a':
                positionX--;
                done = true;
                break;

                case 's':
                positionY--;
                done = true;
                break;

                case 'd':
                positionX++;
                done = true;
                break;

                default:
                System.out.println("Invalid input!");
                break;
            }
        }
    }

    public static void OutputPosition() {
        System.out.println("you are in (" + positionX + ", " + positionY + ")");
    }

    // Close the Scanner when it's no longer needed
    public static void closeScanner() {
        input.close();
    }
    
}
