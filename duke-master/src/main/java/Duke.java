import java.util.Scanner;
import java.util.ArrayList;

public class Duke {
    public static void main(String[] args) {
        ArrayList<Task> list = new ArrayList<>();
        System.out.println("Hello! I'm Duke" + "\n" + "What can I do for you?");

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            if (input.equals("bye")) {
                System.out.println("Bye. Hope to see you again soon!");
            } else if (input.equals("list")) {
                for (int i = 1; i <= list.size(); i++) {
                    Task t = list.get(i-1);
                    System.out.println( i + "." + t);
                }
            } else if (input.equals("done")) {
                int num = Integer.parseInt(sc.next());
                Task t = list.get(num - 1);
                t.markAsDone();
                System.out.println("Nice! I've marked this task as done: "+ "\n" + t);
            } else {
                String x = input + sc.nextLine();
                list.add(new Task(x));
                System.out.println("added: " + x);
            }
        }
    }
}
