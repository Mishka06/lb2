

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите число n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("Введите число x: ");
        int x = scanner.nextInt();
        double result=0;
        for (int j = 1; j <= n; j++) {

        }
        double summa = (-1) * (Math.pow(x, n)) / Math.pow(n, 1);
        result = result + summa;

        System.out.println(result);


        }



    }

