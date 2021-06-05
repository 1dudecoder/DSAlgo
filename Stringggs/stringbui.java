package Stringggs;
import java.util.*;
public class stringbui {
    public static void main(String arr[]){
        Scanner scr = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");

            sb.append(scr.next());
            // pepCODinG
            for(int i = 0; i < sb.length();i++){
                char a = sb.charAt(i);
                
                // for small alphabets
                if(a == 'a') sb2.append('A');
                if(a == 'b') sb2.append('B');
                if(a == 'c') sb2.append('C');
                if(a == 'd') sb2.append('D');
                if(a == 'e') sb2.append('E');
                if(a == 'f') sb2.append('F');
                if(a == 'g') sb2.append('G');
                if(a == 'h') sb2.append('H');
                if(a == 'i') sb2.append('I');
                if(a == 'j') sb2.append('J');
                if(a == 'k') sb2.append('K');
                if(a == 'l') sb2.append('L');
                if(a == 'm') sb2.append('M');
                if(a == 'n') sb2.append('N');
                if(a == 'o') sb2.append('O');
                if(a == 'p') sb2.append('P');
                if(a == 'q') sb2.append('Q');
                if(a == 'r') sb2.append('R');
                if(a == 's') sb2.append('S');
                if(a == 't') sb2.append('T');
                if(a == 'u') sb2.append('U');
                if(a == 'v') sb2.append('V');
                if(a == 'w') sb2.append('W');
                if(a == 'x') sb2.append('X');
                if(a == 'y') sb2.append('Y');
                if(a == 'z') sb2.append('Z');

                // for capital alphabets
                if(a == 'A') sb2.append('a');
                if(a == 'B') sb2.append('b');
                if(a == 'C') sb2.append('c');
                if(a == 'D') sb2.append('d');
                if(a == 'E') sb2.append('e');
                if(a == 'F') sb2.append('f');
                if(a == 'G') sb2.append('g');
                if(a == 'H') sb2.append('h');
                if(a == 'I') sb2.append('i');
                if(a == 'J') sb2.append('J');
                if(a == 'K') sb2.append('k');
                if(a == 'L') sb2.append('l');
                if(a == 'M') sb2.append('m');
                if(a == 'N') sb2.append('n');
                if(a == 'O') sb2.append('o');
                if(a == 'P') sb2.append('p');
                if(a == 'Q') sb2.append('q');
                if(a == 'R') sb2.append('r');
                if(a == 'S') sb2.append('s');
                if(a == 'T') sb2.append('t');
                if(a == 'U') sb2.append('u');
                if(a == 'V') sb2.append('v');
                if(a == 'W') sb2.append('w');
                if(a == 'X') sb2.append('x');
                if(a == 'Y') sb2.append('y');
                if(a == 'Z') sb2.append('z');
            }
            System.out.println(sb2.toString());
        }
}
