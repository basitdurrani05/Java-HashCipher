//  2). Run Time Polymorphism


// class A{


//     int a=20;
    

//     void name(){

//         System.out.println("Arun");
//     }

// }








public class twelfth{     // extends A

    

//     int a=40;

//     @Override
//     void name(){

//         super.name();
//         System.out.println(super.a);

//         System.out.println("Amit");
//         System.out.println(a);
//     }


    // Varargs Methods


    // public static void count(int ...a){     // Similar to Array
        
    //    for(int i=0; i<=a.length; i++){
    //     System.out.println("Varargs Counting : "+i);
    //    }
    // }

    // Normal Method

    // public static void count2(int b){     
    //     for(int i=0; i<=b; i++){
    //         System.out.println("Normal Counting : "+i);
    //        }
    // }



    // Polymorphism . Poly means "many" morphism means "Form".

     //  How many Type of Polymorphism ?

    // 1). Compile Time
    // 2). Run Time


    // 1). Compile Time Polymorphism.

    // public static void first(int serialno){        

    //     System.out.println(serialno);
    // }



    // public static void first(int rollno, String name){

    //     System.out.println("Roll No : "+ rollno);
    //     System.out.println("Name : "+ name);


    // }


    // public static void first(int pass, char c){

    //     System.out.println("Password : "+pass);
    //     System.out.println("Special Character use in password : "+c);
    //     System.out.println("Successfully Signup");

    // }








    

   











   


    public static void main(String[] args) {

        // count(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22);   // Normal


        // count2(1,2,3,4,5,6); Varargs





        // Polymorphism.



        //  1). Compile Time
        // first(1);
        // first(20, "Arun");
        // first(1234, '@');


        // 2). Run Time
        // twelfth sc = new twelfth();

        // sc.name();

        
       


        

        
        


        
    
    }
    
}
