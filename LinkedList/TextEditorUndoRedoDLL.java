import java.util.Scanner;

class TextState {
    String content;
    TextState prev, next;

    TextState(String content) {
        this.content = content;
    }
}

public class TextEditorUndoRedoDLL {
    static TextState head = null;
    static TextState current = null;
    static int maxHistory = 10;
    static int historySize = 0;

    public static void type(String content) {
        TextState newState = new TextState(content);
        if (current != null) {
            current.next = newState;
            newState.prev = current;
        } else {
            head = newState;
        }
        current = newState;

        // Trimming history if it exceeds the limit
        historySize++;
        if (historySize > maxHistory) {
            head = head.next;
            head.prev = null;
            historySize--;
        }
    }

    public static void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo successful.");
        } else {
            System.out.println("Cannot undo.");
        }
    }

    public static void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo successful.");
        } else {
            System.out.println("Cannot redo.");
        }
    }

    public static void showCurrent() {
        if (current != null) {
            System.out.println("Current Content: " + current.content);
        } else {
            System.out.println("Editor is empty.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command;

        System.out.println("Text Editor Started. Type 'type <text>', 'undo', 'redo', 'show', or 'exit'.");

        while (true) {
            System.out.print("> ");
            command = sc.nextLine();

            if (command.equals("exit")) break;
            else if (command.startsWith("type ")) {
                String content = command.substring(5);
                type(content);
            } else if (command.equals("undo")) {
                undo();
            } else if (command.equals("redo")) {
                redo();
            } else if (command.equals("show")) {
                showCurrent();
            } else {
                System.out.println("Invalid command.");
            }
        }

        System.out.println("Text Editor Closed.");
        sc.close();
    }
}
