package first_project;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void find_more(int[] mas) {
            int last = mas[mas.length-1]*mas[mas.length-1];
            int counter = 0;
            for (int i = 0; i < mas.length; i++){
                if (mas[i] > last) {
                    counter++;
                }
            }
            int[] result = new int[counter];
            int j = 0;
            for (int i = 0; i < mas.length; i++){
                if (mas[i] > last){
                    result[j] = mas[i];
                    j++;
                }
            }
            System.out.println(Arrays.toString(result));

    }
    public static void main(String[] args) {
        int[] mas = {2,3,4,5,6,1};
        Main.find_more(mas);
    }
}