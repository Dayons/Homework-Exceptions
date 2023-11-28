import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        try {
            if (num < 0){
                throw new MyException(" entered negative number!!!");
            }
        }catch (MyException m){
            System.out.println("Error," + m.getMessage());
        }
        System.out.println("Your number is " + num);
    }
}