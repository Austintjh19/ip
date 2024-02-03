package osiris;

/**
 * The Main class serves as the entry point for the Osiris chat application.
 * It initializes an instance of the Osiris chatBot and starts the chat session.
 */
public class Main {

    public static void main(String[] args) {

        final Osiris chatBot = new Osiris();
        chatBot.startChat();

    }
}
