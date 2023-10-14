package first_project;

import java.util.Arrays;

public class Main2 {
    public static int find_min(int[] mas){
        if (mas.length == 2){
            if (mas[0] < mas[1]){
                return mas[0];
            }
            else {
                return mas[1];
            }
        }
        int[] newMas;
        int sub_min = find_min(newMas = Arrays.copyOfRange(mas, 1, mas.length));
        if (mas[0] < sub_min) {
            return mas[0];
        }
        else {
            return sub_min;
        }

    }
    public static void main(String[] args){
        int[] mas = {9,2,3,4,1,6,7};
        System.out.println(find_min(mas));
    }
}
