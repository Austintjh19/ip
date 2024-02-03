package osiris.task;

/**
 * The Task class represents a generic task in the Osiris application.
 * It serves as the base class for different types of tasks.
 */
public abstract class Task {

    /** Name of Task */
    private final String taskName;

    /** Whether Task has been completed. */
    private boolean isCompleted = false;

    /**
     * Constructs a Task object with the given task name.
     *
     * @param taskName The name of the task.
     */
    public Task(String taskName) {
        this.taskName = taskName;
    }

    /**
     * Constructs a Task object with the given task name and completion status.
     *
     * @param taskName    The name of the task.
     * @param isCompleted The completion status of the task.
     */
    public Task(String taskName, boolean isCompleted) {
        this.taskName = taskName;
        this.isCompleted = isCompleted;
    }

    /**
     * Marks the task as completed.
     */
    public void markComplete() {
        isCompleted = true;
    }

    /**
     * Marks the task as incomplete.
     */
    public void markIncomplete() {
        isCompleted = false;
    }

    /**
     * Retrieves the string representation of the task for storage purposes.
     *
     * @return The string representation of the task.
     */
    public String getStringStorageRepresentation() {
        String completionStatus = isCompleted ? "Y" : "N";
        return String.format("%s | %s", completionStatus, taskName);
    }

    /**
     * Retrieves the string representation of the task for display purposes.
     *
     * @return The string representation of the task.
     */
    @Override
    public String toString() {
        String completionStatus = isCompleted ? "[X]" : "[ ]";
        return String.format("%s %s", completionStatus, taskName);
    }
}
