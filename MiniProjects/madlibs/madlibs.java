import java.util.Scanner;

public class project {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        String Name;
        String Subject;
        String Teacher_name;
        String Animal;
        int Number;
        String Verb;

        System.out.println("Enter Name: ");
        Name = scanner.next();

        System.out.println("Enter Subject: ");
        Subject = scanner.next();

        System.out.println("Enter Teacher_name: ");
        Teacher_name = scanner.next();

        System.out.println("Enter Animal: ");
        Animal = scanner.next();

        System.out.println("Enter Number: ");
        Number = scanner.nextInt();

        System.out.println("Enter Verb: ");
        Verb = scanner.next();

        System.out.print("One day, "+ Name);
        System.out.print(" was sleeping in " + Subject + " class." );
        System.out.print("Suddenly, Mr. " + Teacher_name +  " turned into a " + Animal + " and started" + Verb + ".");
        System.out.print(" Everyone laughed " + Number + " times! ");



        scanner.close();

    }
}
