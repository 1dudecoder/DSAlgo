// import java.util.*;
  
//   public class rotate{

// //    n = 12340056
// //    k = 3
// //    r = 05612340   

//       public static void main (String arg[]){
          
//         Scanner scr = new Scanner(System.in);
        
//         int n = scr.nextInt();
//         int k = scr.nextInt();
//         int num = count(n);

//         k = k % num;    

//         if( k < 0){
//             k = k+num;
//         }

//         int p = 1;
//         int q = 1;
        
//         for(int i = 0 ; i < num; i++){
//             if(i < k){
//                 p = p * 10;
//             }else{
//                 q = q * 10;
//             }
//         }
//         int back = n % p;
//         int front =  n / p;

//         int nans = back * q;

//         int ans = nans + front;

//         System.out.println(ans);

//       }

//       public static int count(int n){
//         int c = 0;
//         while(n != 0){
//             n = n/10;
//             c++;
//         }
//         return c;
//       }

//   }

// partern

// Scanner scr = new Scanner(System.in);

// int n = scr.nextInt();
// int nst = 1;

// for(int row = 0; row < n; row++){
//     for(int col = 0; col < nst ; col++){
//         System.out.print("*\t");

//     }
//     nst++;
//     System.out.println("");
// }

//pattern 2

// Scanner scr = new Scanner(System.in);

// int n = scr.nextInt();
// int nst = n;

// for(int row = 0; row < n; row++){
//     for(int col = 0; col < nst ; col++){
//         System.out.print("*\t");

//     }
//     nst--;
//     System.out.println("");

// parttern 3

// int n = scr.nextInt();
// int nst = 1;
// int nsp = n-1;

// for(int row = 0; row < n; row++){
//     for(int col = 0; col < nsp ; col++){
//         System.out.print("\t");
//     }
//     for(int sp = 0; sp < nst;sp++){
//       System.out.print("*\t");
//     }
//     nst++;
//     nsp--;
//     System.out.println("");
// }



//dnt know 

// Scanner scr = new Scanner(System.in);

// int n = scr.nextInt();

// int nst = n-1/2;
// int nsp = 1;
// int lnst = n-1/2;

// for(int row =0; row < n; row++){

//   for(int col = 0; col < nst; col++){
//     System.out.print("*\t");
//   }
//   for(int sp = 0; sp < nsp; sp++){
//     System.out.print("\t");
//   }
//   for(int col1 = 0; col1 < lnst; col1++){
//     System.out.print("*\t");
//   }

//   if(row < nst){
//     nst--;
//     nsp = nsp+2;
//     lnst--;
//   }else{
//     nst++;
//     nsp = nsp-2;
//     lnst++;
//   }

//   System.out.println("");

// }


//parten 3

// Scanner scr = new Scanner(System.in);
    
// int n = scr.nextInt();
// int nst = 1;
// int nsp = n-1;

// for(int row = 0; row < n; row++){
//   for(int col = 0; col < nsp; col++){
//     System.out.print("\t");
//   }
//   for(int col1 = 0; col1 < nst; col1++){
//     System.out.print("*\t");
//   }
//   nst++;
//   nsp--;
//   System.out.println("");

// }

//pattern 5

// Scanner scr = new Scanner(System.in);

// int n = scr.nextInt();
// int nst = 1;
// int nsp = n/2;

// for(int row = 0; row < n; row++){

//   for(int col = 0; col < nsp; col++){
//     System.out.print("\t");
//   }

//   for(int col1 = 0; col1 < nst; col1++){
//     System.out.print("*\t");
//   }

//   if(row < n/2){
//     nst += 2;
//     nsp--;
//   }else{
//     nst -= 2;
//     nsp++;
//   }

//   System.out.println("");

// }

//patter 6

// Scanner scr = new Scanner(System.in);

// int n = scr.nextInt();
// int nst = n/2+1;
// int nsp = 1;

// for(int row = 0; row < n; row++){
//   for(int col = 0; col < nst; col++){
//     System.out.print("*\t");
//   }
//   for(int col1 = 0; col1 < nsp; col1++){
//     System.out.print("\t");
//   }
//   for(int col2 = 0; col2 < nst ; col2++){
//     System.out.print("*\t");
//   }

//   if(row < n/2){
//     nst--;
//     nsp += 2;
//   }else{
//     nst++;
//     nsp -= 2;
//   } 
  
//   System.out.println("");
// }

//patern4

// Scanner scr = new Scanner(System.in);

// int n = scr.nextInt();
// int nst = n;
// int nsp = 0;

// for(int row = 0; row < n; row++){
//   for(int col = 0; col < nsp; col++){
//     System.out.print("\t");
//   }

//   for(int col1 = 0; col1 < nst; col1++){
//     System.out.print("*\t");
//   }

//   nst--;
//   nsp++;

//   System.out.println("");

// }


//patter 9

// Scanner scr = new Scanner(System.in);
// int n = scr.nextInt();
// int nsp = n-2;
// int nsp1 = 0;

// for(int row = 0;  row < n; row++){

//   for(int col0 = 0; col0 < nsp1 ; col0++){
//     System.out.print("\t");
//   }

//   System.out.print("*\t");

//   for(int col = 0; col < nsp; col++){
//     System.out.print("\t");
//   }

//   if(row != n/2){
//     System.out.print("*\t");
//   }

//   if(row < n/2){
//     nsp -= 2;
//     nsp1++;

//   }else{
//     nsp += 2;
//     nsp1--;
//   }
//   System.out.println("");
// }



//pattern 10

// Scanner scr = new Scanner(System.in);

// int n = scr.nextInt();
// int nsp = n/2;
// int nsp1 = 0;


// for(int row = 0; row < n ; row++) {

//   for(int col = 0; col < nsp; col++){
//     System.out.print("\t");
//   }

//   System.out.print("*\t");

//   for(int col1 = 0; col1 < nsp1-1; col1++){
//     System.out.print("\t");
//   }

//    if(row != n-1 && row != 0){
//     System.out.println("*");
//   }


//   if(row < n/2){
//     nsp--;
//     nsp1 +=2;
//   }else{
//     nsp++;
//     nsp1 -=2;

//   }

//   System.out.println(""); 
// }


//patter11

// Scanner scr = new Scanner(System.in);

// int n = scr.nextInt();
// int num = 1;
// int count = 1;


// for(int row = 0 ; row < n; row++){
//   for(int col = 0; col < num; col++) {
//     System.out.print(count + "\t");
//     count++;
//   }
//   num++;
//   System.out.println("");
// }


// 0	
// 1	1	
// 2	3	5	
// 8	13	21	34	
// 55	89	144	233	377

// Scanner scr = new Scanner(System.in);
// int n = scr.nextInt();
// int a = 0;
// int b = 1;

// for(int row = 0; row < n; row++){
  
//   for(int i = 0; i < row+1; i++){
//     System.out.print(a+"\t");
//     int temp = a+b;
//     a = b;
//     b = temp;
//   }

//   System.out.println("");
// }


// 1	
// 1	1	
// 1	2	1	
// 1	3	3	1	
// 1	4	6	4	1




import java.util.*;
  
  public class rotate{

    public static void main(String arg[]){

      Scanner scr = new Scanner(System.in);

      int n = scr.nextInt();
      int nst =  1;
      int nsp = (2*n)-3;

      for(int row = 1 ; row <= n; row++){

        for(int col = 1; col <= nst; col++){
          System.out.print(col + "\t");
        }

        for(int col0 = nsp; col0 >= 1; col0-- ){
          System.out.print("\t");
        }


        for(int col = 1; col <= nst; col++){
          System.out.print(col + "\t");
        }
        
        nst++;
        nsp -= 2;
        System.out.println("");
      }

    }
  }
