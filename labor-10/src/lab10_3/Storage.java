package lab10_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Storage {
    ArrayList<Product> products = new ArrayList<>();

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
                products.add(new Product(identifier, name, amount, price));
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
                //----Slow--------
                for (Product p:products){
                    if (p.getIdentifier() == identifier){
                        p.increaseAmount(newAmount);
                        succesfulUpdates++;
                    }
                }
                //----------------
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Number of succesfully updated files: " + succesfulUpdates);
    }

    public ArrayList<Product> printStorage(){
        return products;
    }
}
