

import java.util.Arrays;
import java.util.List;

public class Bag {
    public  static int positionRow = 0;
    public static String[][] items = new String[26][3];
    public static String[][] items2 = new String[26][3];
    public static int bagWeight = 600;
    public static int currItemsWeight = 0;
    public static int maxAllowedWeight = 7000;
    public static int totalWeight = 0;
    public static int sum = bagWeight;



    public void writeToItems(String name, String importance, String weight, String[][] array) {
        array[positionRow][0] = name;
        array[positionRow][1] = importance;
        array[positionRow][2] = weight;
        positionRow++;
    }

    public void greedy ()
    {

        Arrays.sort(items, (a, b) -> Integer.compare(Integer.parseInt(b[1]), Integer.parseInt(a[1])));
        positionRow = 0;
        while ((sum < maxAllowedWeight - 100)&&(positionRow<20))
        {
            sum = sum + Integer.parseInt(items[positionRow][2]);
            System.out.println(sum);
            writeToItems(items[positionRow][0],items[positionRow][1], items[positionRow][2], items2 );
        }
        System.out.println("After: ");
        System.out.println(Arrays.deepToString(items2).replace("], ", "]\n"));
        System.out.println(sum);
    }
}
