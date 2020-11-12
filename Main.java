import java.util.Scanner;
import java.util.Arrays;

class Main {

  public static void main(String[] args) {
    Board myboard = new Board(10, 10);
    String seperator = ">";
    boolean done = false;
    Scanner scanner = new Scanner(System.in);
    System.out.printf("What is your name? ");
    String username = scanner.nextLine();
    System.out.printf("Nice to meet you "+username+"! Lets begin.\n");
    while (!done) {
      System.out.printf(username+seperator+" "); //Print out our pretty terminal indicator
      String[] input = scanner.nextLine().split(" "); //Get the input
      String command = input[0];
      if (command.equals("exit")) {
        System.out.println("Exiting Program.");
        done = true;
      }
      if (command.equals("rename")) {
        username = combineArray(Arrays.copyOfRange(input, 1, input.length), " ");
      }
      if (command.equals("print")) {
        myboard.PrintBoard();
      }
    }
    scanner.close();
  }

  public static String combineArray(String[] input, String token) {
    String out = "";
    for (String s : input) {
      out+=s+" ";
    }
    return out.trim();
  }
}