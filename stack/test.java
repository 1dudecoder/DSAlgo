public class test {
    Scanner scr = new Scanner(System.in);
        
    String str = scr.nextLine();
    Stack<Character> st = new Stack<>(); 
    for(int i = 0; i < str.length(); i++){
        
        char ch = str.charAt(i);
        
        if(ch == '[' || ch == '{' || ch == '('){
            st.push(ch);
            
        }else if(ch == ']'){
            boolean val = find(st,'[');
            if(val == false){
                System.out.println(val);
                return;
            }
        }else if(ch == '}'){
            boolean val = find(st,'{');
            if(val == false){
                System.out.println(val);
                return;                
            }
        }else if(ch == ')'){
            boolean val = find(st,'(');
            if(val == false){
                System.out.println(val);
                return; 
            }
        }
}
            if(st.size() == 0){
            
            System.out.println(true);
        }else{
            
            System.out.println(false);
        }

}
