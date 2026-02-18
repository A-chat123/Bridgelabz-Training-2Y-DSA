import java.util.Scanner;

class StudentNode {
    int roll;
    String name;
    int age;
    String grade;
    StudentNode next;

    StudentNode(int roll, String name, int age, String grade) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedList {
    private StudentNode head;

    // Add at beginning
    public void addAtBeginning(int roll, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addAtEnd(int roll, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    // Add at position
    public void addAtPosition(int pos, int roll, String name, int age, String grade) {
        if (pos == 1) {
            addAtBeginning(roll, name, age, grade);
            return;
        }

        StudentNode newNode = new StudentNode(roll, name, age, grade);
        StudentNode temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete by Roll Number
    public void deleteByRoll(int roll) {
        if (head == null)
            return;

        if (head.roll == roll) {
            head = head.next;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.roll != roll)
            temp = temp.next;

        if (temp.next == null) {
            System.out.println("Student not found");
            return;
        }

        temp.next = temp.next.next;
    }

    // Search by Roll
    public void search(int roll) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                System.out.println("Found: " + temp.roll + " " + temp.name +
                        " " + temp.age + " " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Update Grade
    public void updateGrade(int roll, String newGrade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                temp.grade = newGrade;
                System.out.println("Grade Updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Display all students
    public void display() {
        if (head == null) {
            System.out.println("No Records");
            return;
        }

        StudentNode temp = head;
        while (temp != null) {
            System.out.println(temp.roll + " | " + temp.name + " | " +
                    temp.age + " | " + temp.grade);
            temp = temp.next;
        }
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentLinkedList list = new StudentLinkedList();
        int choice;

        do {
            System.out.println("\n1.Add Begin\n2.Add End\n3.Add Position\n4.Delete\n5.Search\n6.Update Grade\n7.Display\n8.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    list.addAtBeginning(
                            sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                    break;
                case 2:
                    list.addAtEnd(
                            sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                    break;
                case 3:
                    list.addAtPosition(
                            sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                    break;
                case 4:
                    list.deleteByRoll(sc.nextInt());
                    break;
                case 5:
                    list.search(sc.nextInt());
                    break;
                case 6:
                    list.updateGrade(sc.nextInt(), sc.next());
                    break;
                case 7:
                    list.display();
                    break;
                case 8:
                    System.out.println("Exit");
            }
        } while (choice != 8);
    }
}

