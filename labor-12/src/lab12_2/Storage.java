package lab12_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Storage {
    //ArrayList<Product> products = new ArrayList<>();
    private Map<Integer, Product> products = new HashMap<>();

    public Storage(String fileName){
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(" ");
                int identifier =  Integer.parseInt(items[0].trim());
                String name = items[1].trim();
                int amount =  Integer.parseInt(items[2].trim());
                int price =  Integer.parseInt(items[3].trim());
                products.put(identifier, new Product(identifier, name, amount, price));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void update(String fileName){
        int succesfulUpdates = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(" ");
                int identifier =  Integer.parseInt(items[0].trim());
                int newAmount =  Integer.parseInt(items[1].trim());

                /*for (Map.Entry<Integer, Product> entry: products.entrySet()){
                    if(entry.getKey() == identifier){
                        entry.getValue().increaseAmount(newAmount);
                    }
                }*/ // Az alabbi megoldas sokkal jobb es gyorsabb

                //letrehoz egy uj referenciat, ami a megfelelo elemre mutat a Map-bol
                Product p = products.get(identifier); //olyan mintha egy pointer lenne
                if(p != null){
                    p.increaseAmount(newAmount);
                    succesfulUpdates++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Number of succesfully updated files: " + succesfulUpdates);
    }

    public Map<Integer, Product> printStorage(){
        return products;
    }
}
