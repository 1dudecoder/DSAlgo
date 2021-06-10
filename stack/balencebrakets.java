package stack;

import java.util.LinkedList;
import java.util.Scanner;

public class balencebrakets {

    public static void main(String arg[]){

        LinkedList<Character> ls = new LinkedList<>();
        Scanner scr = new Scanner(System.in);

        String str = scr.nextLine();

        for(int i = 0; i < str.length(); i++){
        char ch = str.charAt(i);
        
        if(ch == '{' || ch == '[' || ch == '('){
            ls.push(ch);
        }else if( ch == ']' || ch == ')' ||ch == '}' ){
          
            if(ls.size() == 0){
                System.out.println(false);
            }else if(ls.peek() == '{' && ch == '}'){
                ls.pop();
            }else if(ls.peek() == '[' && ch == ']'){
                ls.pop();
            }else if(ls.peek() == '(' && ch == ')'){
                ls.pop();
            }

        }


    }
    if(ls.size() !=  0){
        System.out.println(false);
    }else{
        System.out.println(true);
    }
}

} 