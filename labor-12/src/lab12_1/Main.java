package lab12_1;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        DictionaryService service = new DictionaryService(DictionaryType.HASH_SET);
        service.findWordsFile("bible.txt");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
    }

    //ArrayList - 150 sec
    //TREE_SET - 2,4 sec
    //HASH_SET - 1,76 sec
}
