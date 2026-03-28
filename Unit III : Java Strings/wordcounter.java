// 6.	Create a class WordCounter.
//  Accept a sentence from the user. 
//  Use StringTokenizer to count words. 
// Display total number of words. 
import java.util.Scanner;
import java.util.StringTokenizer;
class wordcounter{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sentence: ");
        String sentence = sc.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(sentence);
        int WordCount = tokenizer.countTokens();
        System.out.println("Total Count Words: " + WordCount);
        sc.close();
    }
}