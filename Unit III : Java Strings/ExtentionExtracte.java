// Define the class
class FileExtensionExtractor {
    private String fileName;

    // Constructor
    public FileExtensionExtractor(String fileName) {
        this.fileName = fileName;
    }

    // Method to extract extension using substring()
    public String extractExtension() {
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex != -1 && dotIndex < fileName.length() - 1) {
            return fileName.substring(dotIndex + 1); // extension after '.'
        } else {
            return "No extension found";
        }
    }

    // Display the extracted extension
    public void displayExtension() {
        System.out.println("File Extension: " + extractExtension());
    }
}

// Main class to test
public class ExtentionExtracte {
    public static void main(String[] args) {
        FileExtensionExtractor extractor1 = new FileExtensionExtractor("report.pdf");
        extractor1.displayExtension();

        FileExtensionExtractor extractor2 = new FileExtensionExtractor("image.jpeg");
        extractor2.displayExtension();

        FileExtensionExtractor extractor3 = new FileExtensionExtractor("README");
        extractor3.displayExtension();
    }
}