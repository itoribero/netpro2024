import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReaderExample {
    public static void main(String[] args) {
        String csvFile = "path/to/your/csv/file.csv";
        String line = "";
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] words = line.split(csvSplitBy);
                for (String word : words) {
                    System.out.println(word);
                }
            }
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
}
