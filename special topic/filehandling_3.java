import java.io.FileReader;


public class filehandling_3  {

    public static void main(String[] args) throws Exception {



              FileReader b = new FileReader("amit.txt");
             

              int i;

              while((i=b.read())!=-1){

                  System.out.print((char)i);
              
        }
        



    }



    
}
