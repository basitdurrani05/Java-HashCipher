import java.util.*;
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

//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter Digit : ");
//     int a = sc.nextInt();
//     int c=0;


//     System.out.println("Reverse Digit : ");
//    while (a!=0) {

//     c = a%10;
//     System.out.print(c);
//     a=a/10;





// 2D Array.


// Scanner sc = new Scanner(System.in);

// System.out.println("Enter Matrix : ");
// int [][]a = new int[3][3];  // 1 square bracket is row then 2 square bracket is column.


// for(int i=0; i<a.length; i++){    // Row

//     for(int j=0; j<a.length+1; j++){  // coloumn

//         a[i][j] = sc.nextInt();
//     }
// }


// System.out.println("Matrix : ");

// for(int i=0; i<a.length; i++){   // Row

//     for(int j=0; j<a.length; j++){    // coloumn

//         System.out.print(a[i][j]+" ");
//     }
//     System.out.println();
// }



// Searching an element of the Array.


// Scanner sc = new Scanner(System.in);

// System.out.println("Enter Array Element : ");
// int []a = new int[5];
// int c=0;


// for(int i=0; i<a.length; i++){
//     a[i] = sc.nextInt();
// }

// System.out.println("Array Elements : ");
// for(int i=0; i<a.length; i++){
//     System.out.print(a[i]+" ");
// }


// System.out.println("\nEnter Elements You can Search : ");
// int search = sc.nextInt();

// for(int i=0; i<a.length; i++){

//     if(a[i]==search){     

//         c++;

//     }
// }

// if(c>0){

//     System.out.println(search+" Elements Found "+c+" Times");
// }

// else{

//     System.out.println("Does Not Found.");
// }


// Sorting of the Array


// Scanner sc = new Scanner(System.in);

// System.out.println("Enter Arrays Elements : ");

// int []a = new int[5];
// int temp;

// for(int i=0; i<a.length; i++){
//     a[i] = sc.nextInt();
// }

// System.out.println("Normal Arrays Elements : ");

// for(int i=0; i<a.length; i++){

//     System.out.println(a[i]+" ");
    
// }

// // Logic

// for(int i=0; i<a.length; i++){     // Run The Array

//     for(int j=i+1; j<a.length; j++){   

//         if(a[i]>a[j]){

//             temp=a[i];    // Sorting
//             a[i]=a[j];
//             a[j]=temp;
//         }
//     }


// }

// System.out.print("\nSorted Arrays :  ");
// for(int i=0; i<a.length; i++){

//     System.out.print(a[i]+" ");
// }



// Sorting the Array


// Scanner sc = new Scanner(System.in);

// System.out.println("Enter Arrays Elements : ");

// int []a = new int[5];
// int temp;

// for(int i=0; i<a.length; i++){
//     a[i] = sc.nextInt();
// }

// System.out.println("Normal Arrays Elements : ");

// for(int i=0; i<a.length; i++){

//     System.out.println(a[i]+" ");
    
// }

// // Logic

// for(int i=0; i<a.length; i++){     // Run The Array

//     for(int j=i+1; j<a.length; j++){

//         if(a[i]<a[j]){

//             temp=a[i];
//             a[i]=a[j];
//             a[j]=temp;
//         }
//     }


// }

// System.out.print("\nSorted Arrays :  ");
// for(int i=0; i<a.length; i++){

//     System.out.print(a[i]+" ");
// }




// Reverse the Array.

    //  Scanner sc = new Scanner(System.in);

    //  System.out.println("Enter Elements Arrays : ");
    //  int []a = new int[5];

    //  for(int i=0; i<a.length; i++){

    //     a[i] = sc.nextInt();
    //  }

    //  System.out.println("Reverse Arrays : ");

    //  for(int i=a.length-1; i>=0; i--){
    //     System.out.print(a[i]+" ");
    //  }



    // Addition Of Matrix.

    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter 1st Matrix : ");
    // int [][]a = new int[2][2];


    // // Input

    // for(int i=0; i<a.length; i++){

    //     for(int j=0; j<a.length; j++){

    //         a[i][j] = sc.nextInt();
    //     }
    // }  
    
    // // Output

    // System.out.println("1st Matrix : ");

    // for(int i=0; i<a.length; i++){

    //     for(int j=0; j<a.length; j++){

    //         System.out.print(a[i][j]+" ");
    //     }

    //     System.out.println();
    // }


    // System.out.println("\nEnter 2nd Matrix : ");
    // int [][]b = new int[2][2];


    // // Input

    // for(int i=0; i<b.length; i++){

    //     for(int j=0; j<b.length; j++){

    //         b[i][j] = sc.nextInt();
    //     }
    // } 
    
    
    //  // Output

    //  System.out.println("2nd Matrix : ");

    //  for(int i=0; i<b.length; i++){
 
    //      for(int j=0; j<b.length; j++){
 
    //          System.out.print(b[i][j]+" ");
    //      }
 
    //      System.out.println();
    //  }


    // //  Result

    //  int [][]c = new int[2][2];

    //  System.out.println("\nAddition Of Matrix : ");

    //  for(int i=0; i<c.length; i++){

    //     for(int j=0; j<c.length; j++){

    //         c[i][j] = a[i][j] + b[i][j];    // i means row and j means coloumn.
    //         System.out.print(c[i][j]+" ");
    //     }

    //     System.out.println();
    //  }




    























    }
}

