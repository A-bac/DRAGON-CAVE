import java.util.Scanner;

public class DRAGONCAVE {

    public static void main (String[] args) {
        System.out.println("\nYou are in a land full of dragons. In front of you, you see two caves." +
                         " In one cave, the dragon is friendly\nand will share his treasure with you. The other dragon " +
                         "is greedy and hungry and will eat you on sight.\n\nWhich cave will you go into? (1 or 2)\n");
        String direction = input();
        cave(direction);
    }

    static String input() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
            try {
                input = scanner.nextLine();
            } catch (Exception a) {
                System.out.println("YOu've been excepted");
            }
            return input;
    }

    static void cave(String direction) {
        int choice = Integer.parseInt(direction);
        if (choice == 1){
            System.out.println("\nYou approach a cave...\nIt is dark and spooky...\nA large dragon jumps out in front of you! \nHe opens his jaws and...\nGobbles you down in one bite!\n");
        } else if (choice == 2) {
            System.out.println("\nThe dragon becomes you! You begin roaring and breathing fire at your foes,\nresting on a nest of gold and gems forever!\n");
        }
    }
}



