import java.util.Random;
import java.util.Scanner;

public class lesson10 {
    public static void main(String[] args) {
       /* int A = 0, B = 20;
        for (int i = B; i > A; i--) {
            System.out.println(i );
        }*/
        /*Random rnd = new Random();
        int N =100;
        int randNumber = rnd.nextInt (N);
        System.out.println(rnd.nextInt(N));
        System.out.println(rnd.nextInt(N));
        System.out.println(rnd.nextInt(N));
        System.out.println(rnd.nextInt(N));
        System.out.println(rnd.nextInt(N));*/
        /*Random rnd = new Random();
        int A = 0, B = 10;
        int randNumber = rnd.nextInt(5);
        for (int i = 1; i <=5; i++) {
            System.out.println(i + " " +rnd.nextInt(11));
        }
    }*/

    /*public static void Task3() {
        Random rnd = new Random();
        int N = 10;
        int Number = rnd.nextInt(N) + 1;
        try (Scanner sc = new Scanner(System.in)) {
        int humanNumber;
            System.out.println("Я загадал. Попробуй отгадай..");
            do {
                System.out.println("Введите число:");
                humanNumber = sc.nextInt();
                if (Number > humanNumber) {
                    System.out.println("Мое число больше");
                }
                    if (Number < humanNumber) {
                        System.out.println("Мое число меньше");
                }
            }

            while(Number != humanNumber);
            System.out.println("Ты угадал");
        }
    }*/
        int[] A = new int[5];
        A[0] = 7;
        A[1] = 6;
        A[2] = 1;
        A[3] = 3;
        A[4] = 4;
        System.out.println(sumArray(A));
        System.out.println(arrayMax(A));
        /*System.out.println(A[0]+A[1]+A[2]);*/
    }
    public static int sumArray(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        return sum;
    }
    public static int arrayMax(int[] A) {
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if(max == 0 || max < A[i]){
                max = A[i];
            }
        }
        return max;
    }
}

