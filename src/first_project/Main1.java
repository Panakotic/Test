package first_project;

import java.util.Arrays;

public class Main1 {
    public static void find_more_midle(int[] mas) {
        double midle;
        double summa = 0;
        for (int i = 0; i < mas.length; i++){
            summa += mas[i];
        }
        midle = summa / mas.length;
        int counter = 0;
        for (int i = 0; i < mas.length; i++){
            if (mas[i] > midle) {
                counter++;
            }
        }
        int[] result = new int[counter];
        int j = 0;
        for (int i = 0; i < mas.length; i++){
            if (mas[i] > midle){
                result[j] = mas[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(result));

    }
    public static void main(String[] args) {
        int[] mas = {2,3,4,5,6,1};
        Main1.find_more_midle(mas);
    }
}

