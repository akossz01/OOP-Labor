package oop.labor09_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*DictionaryService service = new DictionaryService(DictionaryType.ARRAY_LIST);
        System.out.println("Unknown words from a file: ");
        //   System.out.println( service.findWordsFile( "text_to_find.txt")); //fun fact: van olyan szo az angolban hogy "magyar"
        System.out.println( service.findWordsFile( "bible.txt"));*/

        DictionaryService service = new DictionaryService(DictionaryType.ARRAY_LIST);
        Scanner scanner = new Scanner(System.in);
        while( true ) {
            System.out.print("Word to find ( Enter <end> for exit): ");
            String word = scanner.nextLine();
            if( word.equalsIgnoreCase( "end")){
                break;
            }
            System.out.println(" Find(" + word + "): " + service.findWord(word));
        }
        scanner.close();

    }
}


