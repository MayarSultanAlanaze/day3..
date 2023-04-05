import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        String name;
        int number;
        try {
            System.out.println("enter your name:");
            name = s.nextline();
            System.out.println("enter your number:");
            name = s.nextline();

        } catch (Exception e) {
            System.out.println(e.toString());

        } finally {
            input.close();

        }

    }
}
