import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sfait
 */
public class com102 {
//this displays menu
     public void display_menu() 
    {
        //prints out options
	System.out.println("1) Add\n2) Delete\n3) Report\n4) Search");
	System.out.print("Choice: ");
    }
// this is asked after every run through of menu loop to see if user wants to continue    
    public void question() throws FileNotFoundException, IOException
    {
	System.out.println("Would you like to proceed or quit?");
	System.out.println("To proceed enter 9.");
	System.out.println("If you wish to quit enter 0.");
//imports scanner
	Scanner q = new Scanner(System.in);       
	switch (q.nextInt()) 
	{
            //if 0 is pressed program ends
	    case 0:
	    System.out.println ("goodbye.");
	    break;
  //if 9 is selected program reloops
	    case 9:
	    System.out.println ("Please proceed.");
	    new com102();
	    break;
//if unrecongisned number is inputted out put "Unrecognized option"
	    default:
	    System.err.println ( "Unrecognized option" );
	    break;
	}
    }
 
    public com102() throws FileNotFoundException, IOException 
    {//import scanner
	Scanner in = new Scanner(System.in);
        display_menu();
  //if number is selected 1-4 run that method after completed ask question method to loop
	switch (in.nextInt()) 
	{
	    case 1:
	    System.out.println ( "You picked add student" );
            Student info = new Student();
            info.add();
            info.toString(); 
            question();
	    break;

	    case 2:
	    System.out.println ( "You picked delete student" );
            question();
	    break;
  
	    case 3:
	    System.out.println ( "You picked print Course details" );
            Course print = new Course("", "");
            print.printData();
            print.studcount();
			print.femalecount();
			print.malecount();
            question();
	    break;
            
            case 4:
	    System.out.println ( "You picked search student" );
            fileScan search = new fileScan();
            search.search();
            question(); 
	    break;
//if number not bewteen 1-4 this is printed 
	    default:
	    System.err.println ( "Unrecognized option" );
            question();
	    break;
	}
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
    new com102();
    new Course();
    new MainStudent();
    new fileScan();
    
    }
  
}

