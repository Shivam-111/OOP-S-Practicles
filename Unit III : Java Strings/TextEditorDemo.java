// Define a class TextEditorBuffer.
// Create a string using StringBuffer.
// Append text to the string.
// Insert text at a specific position.
// Reverse the final string and display it.

class TextEditorBuffer {
    private StringBuffer buffer;

    // Constructor initializes the buffer
    public TextEditorBuffer(String initialText) {
        buffer = new StringBuffer(initialText);
    }

    // Append text to the buffer
    public void appendText(String text) {
        buffer.append(text);
    }

    // Insert text at a specific position
    public void insertText(int position, String text) {
        if (position >= 0 && position <= buffer.length()) {
            buffer.insert(position, text);
        } else {
            System.out.println("Invalid position!");
        }
    }

    // Reverse the buffer and display
    public void displayReversed() {
        System.out.println("Reversed String: " + buffer.reverse());
    }

    // Optional: display current buffer
    public void displayBuffer() {
        System.out.println("Current Buffer: " + buffer.toString());
    }
}

public class TextEditorDemo {
    public static void main(String[] args) {
        // Create buffer with initial text
        TextEditorBuffer editor = new TextEditorBuffer("Hello");

        // Append text
        editor.appendText(" World");

        // Insert text at position
        editor.insertText(6, "Beautiful ");

        // Display current buffer
        editor.displayBuffer();

        // Reverse and display final string
        editor.displayReversed();
    }
}