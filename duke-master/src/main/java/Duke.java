import java.util.Scanner;
import java.util.ArrayList;

public class Duke {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Hello! I'm Duke" + "\n" + "What can I do for you?");

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String input = sc.nextLine();
            if (input.equals("bye")) {
                System.out.println("Bye. Hope to see you again soon!");
            } else if(input.equals("list")) {
                for (int i = 1; i <= list.size(); i++) {
                    System.out.println( i + ". " + list.get(i-1));
                }
            } else  {
                list.add(input);
                System.out.println("added: " + input);
            }
        }
    }
}
