import java.util.Scanner;

public class hourtosecondes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number  :");
        int hours = scanner.nextInt();

        int seconds = hours * 60;

        System.out.println(hours + " ore  jan te barabarta me  " + seconds + " sekonda. ");

    }

}