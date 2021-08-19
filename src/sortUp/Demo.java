package sortUp;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input String  : ");
        System.out.print(showArrayList(sortUp(input.nextLine())));
    }

    public static ArrayList<Character> sortUp(String string) {
        ArrayList<Character> sudString = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            ArrayList<Character> list = new ArrayList<>();
            list.add(string.charAt(i));
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(j) > list.get(list.size() - 1))
                    list.add(string.charAt(j));
            }
            if (list.size() > sudString.size())
                sudString = list;
        }
        return sudString;
    }

    public static String showArrayList(ArrayList<Character> arr) {
        String string = "";
        for (Character character : arr) {
            string += character;
        }
        return string;
    }
}
