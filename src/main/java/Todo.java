public class Todo extends Task {

    public Todo(String description) {
        super(description);
        super.symbol = "T";
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}