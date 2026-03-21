// Define the interface
interface Filterable {
    void apply_filter(String filter_type);
    void reset_filter();
}

// ImageProcessor class implementing Filterable
class ImageProcessor implements Filterable {
    @Override
    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to the image...");
        // Example: grayscale, blur, sharpen, etc.
    }

    @Override
    public void reset_filter() {
        System.out.println("Resetting image filters to original state.");
    }
}

// DataAnalyzer class implementing Filterable
class DataAnalyzer implements Filterable {
    @Override
    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to the dataset...");
        // Example: filter out null values, remove duplicates, select specific ranges
    }

    @Override
    public void reset_filter() {
        System.out.println("Resetting dataset filters to show all data.");
    }
}

// Demo class
public class Main {
    public static void main(String[] args) {
        // Using ImageProcessor
        Filterable imgProcessor = new ImageProcessor();
        imgProcessor.apply_filter("Grayscale");
        imgProcessor.reset_filter();

        // Using DataAnalyzer
        Filterable dataAnalyzer = new DataAnalyzer();
        dataAnalyzer.apply_filter("Remove Nulls");
        dataAnalyzer.reset_filter();
    }
}