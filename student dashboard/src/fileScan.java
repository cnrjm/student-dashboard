import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileScan {
    public fileScan(){
//null constructor        
    }

    public void parseFile(String fileName,String searchStr) throws FileNotFoundException{
        Scanner scan = new Scanner(new File(fileName));//new scanner
        while(scan.hasNext()){//reads each line
            String line = scan.nextLine().toLowerCase().toString();// turns all line to lowercase
            if(line.contains(searchStr)){//checks if any of lines contain the search item
                System.out.println(line);//if the item is found print out the entire line ie student info
            }
            else{//if condition not meet print 
            System.out.println("Sorry student not found");
            break;
            }
        }
    }
    public void search() throws FileNotFoundException{
    Scanner myInput = new Scanner(System.in);//imports scanner
        System.out.print("Enter name of student you wish to search for: ");
        String studentCriteria = myInput.nextLine();// reads user input

        fileScan fileScan = new fileScan();
        //imports the text file to be read from
        fileScan.parseFile("build\\classes\\Student.txt", studentCriteria);
}
    

}
