public class tenth {


    // Constructor.

    // 1). Default constructor

    // int a;
    // String b;

   
   
    // void show(){

    //     System.out.println(a+" "+b);

    // }


    // 2). Parameterized constructor

    


    // tenth(int a, String b){

    //     System.out.println(a+" "+b);
    // }



    // 3). Copy Constructor


    // int a;

    // tenth(){

    //     a=20;
    //     System.out.println("1st Constructor : "+a);
    // }

    // tenth(tenth amit){

    //     a=amit.a;
    //     System.out.println("Copy Constructor : "+a);
    // }




    // What is difference b/w Constructor and Method ?

    // int a;

    // tenth(){

    //     a=10;
    //     System.out.println(a);
       

        

    // }


    // static int number(){

    //     int first=50;

    //     return first;
    // }


    // static void number(){

    //     System.out.println("Ye mera method hai this is my method in java.");

    // }




    String name;
    String branch;
    String college;

    static void show1(){

        System.out.println("Student Details : || FORM || ");
    }

    

}



class b extends tenth{


    void show(){

        name = "Amit Mahor";
        branch = "CSE";
        college = "Shri Ram College Engineering & Management";

        System.out.println("Name : "+name);
        System.out.println("Branch : "+branch);
        System.out.println("College : "+college);
    }





    public static void main(String[] args) {

        // 1). Default constructor

        // tenth sc = new tenth();

        // sc.show();

        // tenth sc = new tenth(30,"Basit");

        // tenth sc = new tenth();

        // tenth sc1 = new tenth(sc);


        // tenth sc = new tenth();

        // System.out.println(number());



        // Methods

     
        // System.out.println("Hello World"); In buit Method

        // number(); Aapna method NorMAL method

        b sc = new b();

        sc.show1();
        sc.show();
       

        


        


    }

}
    

