
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci n: ");
        int n = scanner.nextInt();
        System.out.print("Inserisci k: ");
        int k = scanner.nextInt();
        scanner.close();

        Fattoriale thread1 = new Fattoriale(n);
        Fattoriale thread2 = new Fattoriale(k);
        Fattoriale thread3 = new Fattoriale(n - k);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        long fattorialeN = thread1.getVal();
        long fattorialeK = thread2.getVal();
        long fattorialeNK = thread3.getVal();

        long combinazioni = (fattorialeN / (fattorialeK * fattorialeNK));

        System.out.println("Le combinazioni di " + n + " su " + k + " sono: " + combinazioni);
    }
}
