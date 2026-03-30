// Create a class TextProcessingBuilder.
//  Use StringBuilder to create a string. 
//  Append additional text. 
// 	Display modified string. 


public class TextProcessingBuilder {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Append additional text
        sb.append(" World!");
        sb.append(" Welcome to Text Processing.");

        // Display modified string
        System.out.println("Modified String: " + sb.toString());
    }
}
