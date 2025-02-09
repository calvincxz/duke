package commands;

import duke.Storage;
import duke.TaskList;
import duke.Ui;

public abstract class Command {

    public abstract String execute(TaskList tasks, Ui ui, Storage storage);

    public boolean isExit() {
        return false;
    }
}
