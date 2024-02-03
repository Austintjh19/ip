package osiris.ui;

import java.util.ArrayList;

/**
 * The Ui class provides methods for managing user interface interactions and displaying messages.
 */
public class Ui {

    /**
     * Outputs introduction messages to the user.
     */
    public void displayIntroductions() {
        this.printSeparator();
        for (String line : UiOutputs.NAME_ASCII_ART) {
            System.out.println(line);
        }
        this.printSeparator();
        System.out.println(UiOutputs.INTRODUCTIONS);
        this.printSeparator();
    }

    /**
     * Prompts the user with the Osiris message prompt.
     */
    public void displayOsirisPromptMessage() {
        System.out.print(UiOutputs.MESSAGE_OSIRIS_PROMPT);
    }

    /**
     * Outputs a message for unsupported commands.
     */
    public void displayUnsupportedCommandMessage() {
        System.out.println(UiOutputs.UNSUPPORTED_COMMAND_OUTPUT);
    }

    /**
     * Outputs goodbye messages to the user.
     */
    public void displayGoodbyes() {
        this.printSeparator();
        System.out.println(UiOutputs.GOODBYES);
        this.printSeparator();
    }

    /**
     * Displays a success notification for adding a to-do task.
     *
     * @param taskDetails The details of the added task.
     * @param taskCount   The total count of tasks.
     */
    public void displayToDoTaskAdditionNotification(String taskDetails, int taskCount) {
        this.printSeparator();
        System.out.println("     Got it. I've added this task:");
        System.out.println("        " + taskDetails);
        System.out.printf("     Now you have %d tasks in the list.%n", taskCount);
        this.printSeparator();
    }

    /**
     * Displays a success notification for adding a deadline task.
     *
     * @param taskDetails The details of the added task.
     * @param taskCount   The total count of tasks.
     */
    public void displayDeadlineTaskAdditionNotification(String taskDetails, int taskCount) {
        this.printSeparator();
        System.out.println("     Got it. I've added this task:");
        System.out.println("        " + taskDetails);
        System.out.printf("     Now you have %d tasks in the list.%n", taskCount);
        this.printSeparator();
    }

    /**
     * Displays a success notification for adding an event task.
     *
     * @param taskDetails The details of the added task.
     * @param taskCount   The total count of tasks.
     */
    public void displayEventTaskAdditionNotification(String taskDetails, int taskCount) {
        this.printSeparator();
        System.out.println("     Got it. I've added this task:");
        System.out.println("        " + taskDetails);
        System.out.printf("     Now you have %d tasks in the list.%n", taskCount);
        this.printSeparator();
    }


    /**
     * Displays a success notification for marking a task as completed.
     *
     * @param taskDetails The details of the completed task.
     */
    public void displayMarkTaskCompleteNotification(String taskDetails) {
        this.printSeparator();
        System.out.println("     Nice! I've marked this task as done:");
        System.out.println("        " + taskDetails);
        this.printSeparator();
    }


    /**
     * Displays a success notification for marking a task as incomplete.
     *
     * @param taskDetails The details of the incomplete task.
     */
    public void displayMarkTaskIncompleteNotification(String taskDetails) {
        this.printSeparator();
        System.out.println("     OK, I've marked this task as not done yet:");
        System.out.println("        " + taskDetails);
        this.printSeparator();
    }

    /**
     * Displays a success notification for removing a task.
     *
     * @param taskDetails The details of the removed task.
     * @param taskCount   The total count of tasks.
     */
    public void displayDeleteTaskNotification(String taskDetails, int taskCount) {
        this.printSeparator();
        System.out.println("     Noted. I've removed this task:");
        System.out.println("        " + taskDetails);
        System.out.printf("     Now you have %d tasks in the list.%n", taskCount);
        this.printSeparator();
    }


    /**
     * Prints the list of user tasks.
     *
     * @param taskDetailsList The list containing details of user tasks.
     */
    public void printUserTasks(ArrayList<String> taskDetailsList) {
        this.printSeparator();
        System.out.println("     Here are the tasks in your list:");
        for (int i = 0; i < taskDetailsList.size(); i++) {
            System.out.println("     " + (i + 1) + ". " + taskDetailsList.get(i));
        }
        this.printSeparator();
    }

    /**
     * Prints the details of the found tasks to the user interface.
     *
     * @param taskDetailsList The list of task details to be printed.
     */
    public void printFoundUserTasks(ArrayList<String> taskDetailsList) {
        this.printSeparator();
        System.out.println("     Here are the matching tasks in your list:");
        for (int i = 0; i < taskDetailsList.size(); i++) {
            System.out.println("     " + (i + 1) + ". " + taskDetailsList.get(i));
        }
        this.printSeparator();
    }

    /**
     * Prints a separator line to the console.
     */
    private void printSeparator() {
        System.out.println(UiOutputs.SEPARATOR);
    }

}
