
// import java.awt.SystemTray;
import java.util.*;

public class Test {
    public static void main(Str[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter name of student = ");
        String name = sc.next();
        System.err.print("Enter roll Nomber = ");
        String rn = sc.next();
        System.err.print("Enter student English marks = ");
        int em = sc.nextInt();
        System.err.print("Enter student Hindi marks = ");
        int hm = sc.nextInt();
        System.err.print("Enter student physics marks = ");
        int pm = sc.nextInt();
        System.err.print("Enter student chemistry  marks = ");
        int cm = sc.nextInt();
        System.err.print("Enter student maths marks = ");
        int mm = sc.nextInt();

        int to, per;
        to = em + hm + pm + cm + mm;
        per = to / 5;

        System.out.println("\n************************************************\n");
        System.out.println("English marks : " + em);
        System.out.println("Hindi marks : " + hm);
        System.out.println("Physics marks : " + pm);
        System.out.println("Chemistry marks : " + cm);
        System.out.println("Maths marks : " + mm);
        System.err.println("Total marks : " + to);
        System.out.println("percentage : " + per);

        if (per >= 60) {
            System.err.println("1st division");
        } else if (per >= 50) {
            System.err.println("2nd division");
        } else if (per >= 30) {
            System.err.println("3rd division");
        } else {
            System.err.println("Fail");
        }

    }
}
