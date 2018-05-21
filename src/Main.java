

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {



    public static void main(String[] args) {

        File file = new File("C://Users/kolesnykv1/Data.txt");
        Scanner sc = null;
        Bag bag = new Bag();

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                parseLine(str, bag);
            }
            printItems(bag);
            bag.greedy();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }

        sc.close();
    }

    private static void printData() {

    }

    private static void parseLine(String str, Bag bag) {
        String name, importance, weight;
        Scanner sc = new Scanner(str);
        sc.useDelimiter(",");

        while (sc.hasNext()) {
            name = sc.next();
            importance = sc.next();
            weight = sc.next();
//            System.out.println("[ " + name + " " + importance + " " + weight + " ]");
            bag.writeToItems(name, importance, weight, bag.items);
        }

        sc.close();
    }

    public static void printItems(Bag bag)
    {
        System.out.println(Arrays.deepToString(bag.items).replace("], ", "]\n"));
    }


}

