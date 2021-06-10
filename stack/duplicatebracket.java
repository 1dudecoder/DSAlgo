// package stack;
import java.util.*;
import java.util.LinkedList;

public class duplicatebracket {    
    public static void main(String[] args) throws Exception {
    LinkedList<Character> ls = new LinkedList<>();

        Scanner scr = new Scanner(System.in);
        
        String str = scr.nextLine();
                
        for(int i = 0; i < str.length();i++){
            
            char ch = str.charAt(i);
            
            if(ch == ')'){
                
                if(ls.peek() == '('){   
                    
                    System.out.println(true);
                    
                    return;
                    
                }else{
                    
                    while(ls.peek() != '('){
                        
                        ls.pop();  
                        
                    }
                    
                    ls.pop();
                }
                
            }else{
                
                ls.push(ch);
            }
        }
            System.out.println(false);
        }
}






