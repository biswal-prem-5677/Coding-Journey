import java.util.Scanner;

class Student {
    String name;
    int rollno;
    int[] marks;
    int total;
    double percentage;
    char grade;

    public Student(String name, int rollno, int NoOfSubjects) {
        this.name = name;
        this.rollno = rollno;
        this.marks = new int[NoOfSubjects];
    }

    void Results() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
        int size = marks.length;
        percentage = (double) total / size;  
        if (percentage >= 90)
            grade = 'O';
        else if (percentage >= 80)
            grade = 'E';
        else if (percentage >= 70)
            grade = 'A';
        else if (percentage >= 60)
            grade = 'B';
        else if (percentage >= 50)
            grade = 'C';
        else if (percentage >= 40)
            grade = 'D';
        else
            grade = 'F';
    }

    void display() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("   Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

public class StudentGradeSheet {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        System.out.println("Enter number of subjects: ");
        int NoOfSubjects = sc.nextInt();
        sc.nextLine();          // consume leftover newline

        Student[] st = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Roll Number: ");
            int rollno = sc.nextInt();

            st[i] = new Student(name, rollno, NoOfSubjects);

            System.out.println("Enter marks for " + NoOfSubjects + " subjects:");
            for (int j = 0; j < NoOfSubjects; j++) {
                st[i].marks[j] = sc.nextInt();
            }
            sc.nextLine();         // consume newline after marks

            st[i].Results();
        }

        for (Student s : st) {
            s.display();
        }

        sc.close();
    }
}
