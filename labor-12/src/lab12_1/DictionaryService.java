package lab12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryService {
    private IDictionary dictionary;

    public DictionaryService(DictionaryType dictionaryType) {
        dictionary = DictionaryProvider.createDictionary(dictionaryType);
        try (Scanner myReader = new Scanner(new File("dictionary.txt"))){
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                dictionary.add(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public boolean findWord(String word) {
        return dictionary.find(word);
    }

    public ArrayList<String> findWordsFile(String filename) {
        ArrayList<String> temp = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                word = word.toLowerCase();
                word = word.replaceAll("[\\p{Punct}]", "");
                if (!(dictionary.find(word)) && !(temp.contains(word))) {
                    temp.add(word);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return temp;
    }

}