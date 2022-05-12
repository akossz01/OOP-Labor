package lab12_1;

public interface IDictionary {
    String DICTIONARY_FILE = "dictionary.txt";

    boolean add(String s);
    boolean find(String s);
    int size();
}
