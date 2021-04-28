import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author sfait
 */
  public class Student {

    String studentName;
    String studentdob;
    String address;
    String gender;

    public Student() {
        //null constucrtor
    }

    public Student(String nName, String ndob, String naddress, String ngender) {
        this.studentName = nName;
        this.studentdob = ndob;
        this.address = naddress;
        this.gender = ngender;
    }
//creates the instance variables of the student
    public void setStudentName(String newStudentName) {
        studentName = newStudentName;
    }

    public void setStudentdob(String newStudentdob) {
        studentdob = newStudentdob;
    }

    public void setaddress(String newaddress) {
        address = newaddress;
    }

    public void setgender(String newgender) {
        gender = newgender;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentdob() {
        return studentdob;
    }

    public String getaddress() {
        return address;
    }

    public String getgender() {
        return gender;
    }

public static void main(String[] args) {


    }


public ArrayList<String> readin() throws FileNotFoundException{
ArrayList<String> result = new ArrayList<>();

try (Scanner s = new Scanner(new FileReader("Student.txt"))) {
    while (s.hasNext()) {
        result.add(s.nextLine());
    }
    return result;
}
}
//add method
public void add() throws IOException{
    List<Student> students = new ArrayList<Student>();//creates a new arrylist
    Scanner input = new Scanner(System.in);//creates new scanner
//sets countstudent to 1 for 1 student to be added
    int countStudents = 1;
//for loop for creating student
    for(int i=0; i< countStudents; i++){
          Student student = new Student();
//sets new student prints "Enter details for student"
          System.out.println("Enter details for student");
//prints "Enter name" and reads in user line input
          System.out.println("Enter name");
          student.setStudentName(input.nextLine()); 
//prints "Enter Date of birth" and reads in user input
          System.out.println("Enter Date of Birth");
          student.setStudentdob(input.next()); 
//prints "Enter address" and reads in user input
          System.out.println("Enter Address");
          student.setaddress(input.next()); 
//prints "Enter Gender either M or F" and reads in user input
          System.out.println("Enter Gender either M or F");
//validates the input to either M or F
          while (!input.hasNext("[MF]")) {
        System.out.println("That's not M or F!");
        input.next();
        }
//creates the student to be added to text file
          student.setgender(input.next()); 
          students.add(student);
    }
//appeneds student to end of file
        File file = new File("build\\classes\\Student.txt");
        FileWriter fr = new FileWriter(file, true);
        for(Student str: students) {
        fr.write(str + System.lineSeparator());
        }
        fr.close();
        
        }


//overrides the array list to the actual inputted values
public String toString() {
  return studentName + ", " + studentdob + ", "  + address + ", " + gender;
}
}