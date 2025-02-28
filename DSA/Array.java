import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        
        // Topic - Array 

        // 1D
        // 2D
        // 3D

        // Combination of 2D and 3D is called Multidimensional Array



        // int []a = {12,23,45,567};

        // for(int i=0; i<a.length; i++){
        //     System.out.println(a[i]);
        // }

        // System.out.println("Array Length: "+a.length);


        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Array Elements : ");
        // int []a = new int[5];

        // for(int i=0; i<a.length; i++){
        //     a[i] = sc.nextInt();
        // }
        // System.out.println("\n");

        // for(int i=0; i<a.length; i++){
        //     System.out.println(a[i]);
        // }



        // Sum Of Array Element


        // Scanner sc = new Scanner(System.in);


        // System.out.println("Enter Array Elements : ");
        // int a[] = new int[5];
        // int sum=0;


        // for(int i=0; i<a.length; i++){   // Array Input
        //     a[i] = sc.nextInt();
        // }

        // for(int i=0; i<a.length; i++){

        //     sum = sum + a[i];

        // }

        // System.out.println("Sum Of Array Element : "+(float)sum); // Typecasting


    //  Float Array


    // float []a = {1.21f, 1.22f,1.33f};


    // for(int i=0; i<a.length; i++){
    //     System.out.println(a[i]);
    // }


    // Reverse Array.

    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter Array Elements : ");
    // int a[] = new int[5];

    // for(int i=0; i<a.length; i++){   // Array Input
    //     a[i] = sc.nextInt();

    // }

    // System.out.println("Normal Array Element : ");

    // for(int i=0; i<a.length; i++){
    //     System.out.print(a[i]+" ");

    // }

    // System.out.println("\nReverse Array Element : ");

    // for(int i=a.length-1; i>=0; i--){
    //     System.out.print(a[i]+" ");
    // }

    // Reverse Digit.

    // Scanner sc  = new Scanner(System.in);

    // System.out.println("Enter Digit : ");
    // int []a = new int[3];

    // for(int i=0; i<a.length; i++){
    //     a[i] = sc.nextInt();
    // }

    // System.out.println("Normal Digit : ");

    // for(int i=0; i<a.length; i++){
    //     System.out.print(a[i]+" ");
    // }

    // System.out.println("\n Reverse Digit : ");
    // for(int i=a.length-1; i>=0; i--){
    //     System.out.print(a[i]);
    // }


    // Reverse Digit. Normal Method.

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Digit : ");
    int a = sc.nextInt();
    int c=0;


    System.out.println("Reverse Digit : ");
   while (a!=0) {

    c = a%10;
    System.out.print(c);
    a=a/10;

    
   }































    }
}