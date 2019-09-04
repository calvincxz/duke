package duke;

import java.util.ArrayList;
import java.util.Scanner;
import tasks.Task;

public class Ui {
    Scanner scanner;

    /*public duke.Ui() {
        scanner = new Scanner(System.in);
    }

    public void showLoadingError() {
        System.out.println("File cannot be loaded.");
    }
    */

    /*
    /**
     * This method is used to print welcome message to user.
     *
    public void showWelcome() {
        System.out.println("Hello! I'm Duke" + "\n" + "What can I do for you?");
    }

    public void showLine() {
        System.out.println("________________________________");
    }

    /**
     * This method is used to read user command.
     *
     * @return String This returns user command as a string.

    public String readCommand() {
        return scanner.nextLine();
    }
    */

    public String print(String msg) {
        return msg;
    }

    /**
     * This method is used to print current items in the list to user.
     *
     * @param list the current task list
     * @return Nothing
     */
    public String printList(ArrayList<Task> list) {
        String output = "Here are the tasks in your list:";
        for (int i = 1; i <= list.size(); i++) {
            Task t = list.get(i - 1);
            output += ("\n" + i + "." + t);
        }
        return output;
    }

}
