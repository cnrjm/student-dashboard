import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/*
 *
 * @author sfait
 */
  public class MainStudent {
      
        String studentName;
        String studentdob;
        String address;
        String gender;
    
       private ArrayList<String> students = new ArrayList<String>();
       private ArrayList<String> courses = new ArrayList<String>();
       public MainStudent(){           
       }
//creates arraylist for student and course       
    public MainStudent(ArrayList<String> students, ArrayList<String> courses) {
          students = new ArrayList<String>();
          courses = new ArrayList<String>();
        }       
            public ArrayList<String> arrayStud() {
            return students;
        }
            public ArrayList<String> arrayCourse() {
            return courses;
        }
    
        public void main(String[] args) {
            writeCourseintoFile();
            readStudentFile();
            readCourseFile();   
        }
//writes to course file            
        public void writeCourseintoFile() {
            FileWriter writer;
            
            File file = new File("build\\classes\\CourseDetails.txt");
            
            try {
                writer = new FileWriter(file,true);
                for(int i= 0; i<courses.size(); i++) {
                    writer.write(courses.get(i).toString());
                    System.out.println("");
                }
    
    
                writer.flush();
                writer.close();
            }catch(IOException e) {
                System.out.println("Error...");
            }           
        }
//reads in student text file         
        public void readStudentFile() {
            FileReader reader;
            
            File file = new File("build\\classes\\Student.txt");
            String text;
            int len = (int)file.length() ;
            char[] buf = new char[len] ;
            
            try {
                reader=new FileReader(file);
                for(int i =0; i<students.size();i++) {
                    
                    reader.read(buf) ;
                    text = new String(buf);
                    System.out.println(text);                    
                }
            }catch(IOException e) {
                e.printStackTrace();
                System.out.println("Error...");
                
            }      
        }
//reads in course file         
        public void readCourseFile() {
            FileReader reader;
            
            File file = new File("CourseDetails.txt");
            String text;
            int len = (int)file.length() ;
            char[] buf = new char[len] ;
            
            try {
                reader=new FileReader(file);
                for(int i =0; i<courses.size();i++) {
                    
                 
    
                    reader.read(buf) ;
                    text = new String(buf);
                    System.out.println(text);
                    
                
                    
                }
            }catch(IOException e) {
                e.printStackTrace();
                System.out.println("Error...");
                
            }
        }
       
 }
        
    
  