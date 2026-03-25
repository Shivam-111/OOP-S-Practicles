class FileProcessingSystem {
    public static void main(String[] args) {

        try {
            // Simulating file reading
            System.out.println("Reading file...");

            // You can simulate an error (optional)
            // int x = 10 / 0;

        } catch (Exception e) {
            System.out.println("Error while reading file");

        } finally {
            // Cleanup message
            System.out.println("Closing file resources");
        }
    }
}