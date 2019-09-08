package commands;

import duke.TaskList;
import duke.Ui;
import duke.Storage;


public class ExitCommand extends Command {
    /**
     * This method is used to exit from application.
     *
     * @return duke response after exit
     */
    public String execute(TaskList tasks, Ui ui, Storage storage) {
        //tasks.addTask(taskToAdd);
        assert tasks.getList()!= null;
        storage.updateList(tasks.getList());
        return ui.print("Bye. Hope to see you again soon!");
    }

    @Override
    public boolean isExit() {
        return true;
    }
}
