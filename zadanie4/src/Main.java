import java.util.Scanner;

public class Main {

    public static int readnumber () throws NegativeNumberException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int number = sc.nextInt();
        if(number < 0){
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return number;
}

    public static void fillArray(int[] a){
        for (int i=0; i < a.length; i++){
           try {
               a[i] = readnumber();
           }catch (NegativeNumberException e){
               a[i]= 0;

               System.out.println(e.getMessage());
           }

        }

    }



    public static void main(String[] args) {

        int[] numbers = new int[10];

        fillArray(numbers);

        System.out.println("Array contents: ");
        for (int number : numbers){
            System.out.print(number + " ");
        }




    }
}