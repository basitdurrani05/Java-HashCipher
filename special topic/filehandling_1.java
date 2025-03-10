import java.io.File;

public class filehandling_1 {

    public static void main(String[] args) {
        

        File a = new File("amit.txt"); // txt is a extension


        try{

            if(a.createNewFile()){
                System.out.println("Successfully file created.");
            }

            else{

                System.out.println("File already exists.");
            }
        }catch(Exception e){

            System.out.println(e.getMessage());
        }

    }

    
}