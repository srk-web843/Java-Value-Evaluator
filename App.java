import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input two numbers: ");
        float a1 = scanner.nextFloat();
        float a2 = scanner.nextFloat();

        try {
        List<Float> numberList = listCreate(a1, a2);
        System.out.println("The sum, product and quotient of your values are: " + numberList);
        System.out.println("The average of these values is: " + listAverage(numberList));
        } catch(ArithmeticException e) {
            System.out.println("Sorry, these values won't work.");
        }
    }

    public static List<Float> listCreate(float a1, float a2) {
        Integers a = new Integers(); 
        List<Float> numberList = new ArrayList<>();
        numberList.add(a.addition(a1, a2));
        numberList.add(a.multiplication(a1, a2));
        numberList.add(a.division(a1, a2));
        return numberList;
    }

    public static float listAverage(List<Float> numberList) {
        float sum = 0;
        for(float number : numberList) {
            sum += number;
        }
        int size = numberList.size();
        float average = sum / size;
        return average;
    }

    System.out.
}

