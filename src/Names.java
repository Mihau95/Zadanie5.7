import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i <names.length; i++) {
            System.out.printf("Imie: %d ", (i+1));
            names[i]=scanner.nextLine();
        }

        System.out.println();

        for (int i=names.length-1; i>=0; i--) {
            System.out.println("Witaj: "+names[i]);
        }
    }
}
