import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Привіт, відважний герою!");
        System.out.println("Тебе чекає цікава подорож");
        System.out.println("Ти йшов чарівною стежкою, і натрапив на роздоріжжя: 1 - піти наліво, 2 - піти направо");
        Scanner sc = new Scanner(System.in);

        int choice1 = sc.nextInt();
        if (choice1 == 1) {
            System.out.println("Ти обрав піти наліво");

        } else if (choice1 == 2) {
            System.out.println("Ти обрав піти направо");

        } else {
            System.out.println("Ти заплутався");

        }

        if (true) {
            System.out.println("hello");
        }

        System.out.println("HELLO HELLO");

    }

}
