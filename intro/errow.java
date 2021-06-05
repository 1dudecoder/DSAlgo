import java.util.*;

public class errow {
    public static void main(String arg[]){

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int val = 1;
        int nsp = (n*2) - 3;

        for(int i = 0 ; i < n ; i++){
        //     for(int j = 1; j <= val; j++){
        //         System.out.print(j+"\t");
        //     }
            
        // for(int sp = 1; sp <= nsp; sp++){
        //     System.out.print("\t");
        // }


        for(int jl = 1; jl <= val;jl++){
            for(int j = jl; j >=  1; j++){
                System.out.print(j+"\t");
            }
        }


        val++;
        // nsp -= 2;
        System.out.println();

        }

    
    }
}

//pattern 15 i guss
// int nsp = 1;
// int nst = 1;
// int nsp1 = n-4;
// int lnst = 2;

// for(int r = 0; r < n; r++){
    
//     for(int st = 0; st < 1; st++){   
//         System.out.print("*\t");
//     }

//     for(int fsp = 1; fsp <= nsp; fsp++){      
//         System.out.print("\t");
//     }

//     for(int fst = 1; fst <= nst; fst++){
//         System.out.print("*\t");
//     }

//     for(int msp = 1; msp <= nsp1; msp++){
//         System.out.print("\t");
//     }

//     if(r != n/2){
//         System.out.print("*\t");
//     }

//     if(r > n/2){
//         for(int ls = 1; ls <= lnst; ls++){
//             System.out.print("*\t");
//         }
//     }
    

//     if(r < n/2){
//         nsp++;
//         nsp1 -= 2;
//     }else{
//         nsp--;
//         lnst += 2;
//     }

// }
// System.out.println();