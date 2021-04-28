import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author sfait
 */
  public class Course {
//declares private variables     
        private String name;
        private Student [] students;
        public int studCounter=0;
        private String lecture;
        private int studcount=0;
//creates variables needed        
        public Course(String name,String lecture) {
            this.name=name;
            this.lecture=lecture;
            students =new Student[20];
        }       
        public Course(){
//null constructor             
        }
         public String getName() {
            name = ("Computer Science");
            return name;
        }
        
        public int getstudcount() {
            return studcount;
        }
        public String getLecture() {
            lecture = ("George");
            return lecture;
        }
        
        public Student [] getStudents() {
            return students;
        }
        public boolean addStudents(Student student) {
            boolean add;
            
            if(studCounter <students.length) {
                students[studCounter]=student;
                ++studCounter;
                add=true;
                
            }else
                add=false;
            
           return add;  
        }
//converts course to string for the name of lecture and course               
        public String toString() {
            return "\nCourse name: " + this.getName()+"\nLecture: " + this.getLecture()+"\nTotal number of students: " ;
        }
//prints out the items which have been changed to string        
        public int printData() {
            System.out.println("Course name: " + this.getName()+"\nLecture: " + this.getLecture());
            System.out.println("\nStudents");
            this.outputData();
            return 0;
        }
//converts text file to array and counts length of array to return number of students               
        public void studcount() throws FileNotFoundException, IOException{
        File file = new File("Student.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] byteArray = new byte[(int)file.length()];
        fis.read(byteArray);
        String data = new String(byteArray);
        String[] stringArray = data.split("\r\n");
        System.out.println("Number of Students are: "+stringArray.length);
        //count occurences of M top return number of males  
        String line = "";
        int count = stringArray.length;
        Scanner scanner = new Scanner(new FileReader(file));

        }     
      
//count occurences of F to return number of females       
         public void femalecount() throws FileNotFoundException{
            Scanner scannerFile = null;
            
            try {
                scannerFile = new Scanner(new File("Student.txt"));
            } catch (FileNotFoundException e) {
            }
    
            int starNumber = 0;
            while (scannerFile.hasNext()) {
                String character = scannerFile.next();
                int index =0;
                char star = 'F';
                while(index<character.length()) {
        
                    if(character.charAt(index)==star){
                        starNumber++;
                    }
                    index++;
                }
            }
            System.out.println("The number of Female Students is: " + starNumber);
       }

       public void malecount() throws FileNotFoundException{
        Scanner scannerFile = null;
        
        try {
            scannerFile = new Scanner(new File("Student.txt"));
        } catch (FileNotFoundException e) {
        }

        int starNumber = 0;
        while (scannerFile.hasNext()) {
            String character = scannerFile.next();
            int index =0;
            char star = 'M';
            while(index<character.length()) {
    
                if(character.charAt(index)==star){
                    starNumber++;
                }
                index++;
            }
        }
        System.out.println("The number of Male Students is: " + starNumber);
   }
       
        public void outputData() {
            
            for(int i=0; i<students.length;i++) {
                
                if(students[i]!=null)
                System.out.print(students[i]+" ");
            }
        }
} 

