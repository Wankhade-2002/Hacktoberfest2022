import java.util.Scanner;
public class dumm {
    public static void main(String[] args) {
        System.out.println("calculating the CGPA of students: ");
        System.out.println("enter the first sub marks");
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        System.out.println("enter the second subject marks");
        int x1 = a.nextInt();
        System.out.println("enter the third sub marks");
        int x2 = a.nextInt();
        float percentage = (x + x1 + x2) / 3.f;
        System.out.println("the percentage of student is: " + percentage);
        float cgpa = (percentage) / 9.5f;
        System.out.println("the cgpa of student is: " + cgpa + " out of 10");
    }
}
