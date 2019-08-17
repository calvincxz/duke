import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {

        System.out.println("Hello! I'm Duke" + "\n" + "What can I do for you?");

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String input = sc.nextLine();
            if (input.equals("bye")) {
                System.out.println("Bye. Hope to see you again soon!");
            } else {
                System.out.println(input);
            }
        }
    }
}
