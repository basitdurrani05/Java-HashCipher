import java.io.FileWriter;

public class filehandling_2 {

    public static void main(String[] args) {


     try{

        FileWriter b = new FileWriter("amit.txt");



        try{

            b.write("Hello I am amit. My Joining date of the google internship since 20 March 2025");
        }

        finally{

            b.close();
        }
     }

     catch(Exception e){

        System.out.println(e.getMessage());
     }


       

       


       

       

      

        


    }
    
}
