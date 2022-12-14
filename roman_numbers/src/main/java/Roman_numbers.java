import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Roman_numbers {
    public static String Roman_numbers(int number){
        List<Integer> values = Arrays.asList(1000,900,500,400,100,90,50,40,10,9,5,4,1);
        List<String> romanLetters = Arrays.asList("M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I");
        String romanNumber = "";
        for (int i = 0; i < values.size(); i++) {
            while (number >= values.get(i)) {
                number -= values.get(i);
                romanNumber = romanNumber + romanLetters.get(i);
            }
        }
        //System.out.println(romanNumber);
        return romanNumber;
    }

    public static void main(String [] args){
        int test=150;
        var romanNumber = Roman_numbers(test);
        System.out.println(romanNumber);

        int test1=19;
        var romanNumber1 = Roman_numbers(test1);
        System.out.println(romanNumber1);

        int test2=43;
        var romanNumber2 = Roman_numbers(test2);
        System.out.println(romanNumber2);

        int test3=7;
        var romanNumber3 = Roman_numbers(test3);
        System.out.println(romanNumber3);


    }

}

