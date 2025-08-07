package main;

// import java.util.Scanner;

class Student{
    int rollno;
    String name;
    int marks;
}

public class ObjArray {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 12;
        s1.name = "Pravin";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Om";
        s2.marks = 95;

        Student s3 = new Student();
        s3.rollno = 15;
        s3.name = "Shri";
        s3.marks = 80;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name + ":" + students[i].rollno + ":" + students[i].marks);
        }

        System.out.println();

        for(Student st : students){
            System.out.println(st.name + ":" + st.rollno);
        }
    }
}


