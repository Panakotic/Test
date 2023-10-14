package first_project;


import java.io.*;

public class Main3 {
    public static String reverseString(String string){
        String reversedString = "";
        for (int i = 0; i < string.length(); i++ ){
            reversedString = string.charAt(i) + reversedString;
        }
        return reversedString;
    }
    public static void main(String[] args){
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String string = null;
        try {
            string = bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (string.equals(reverseString(string))){
            System.out.println(String.format("%s - это палиндром", string));
        }
        else {
            System.out.println(String.format("%s - это не палиндром", string));
        }
    }
}
