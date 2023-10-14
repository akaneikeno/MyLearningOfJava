import java.util.*;

class Solution035 {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            // Complete the code            
            System.out.println(isBalanced(input));       
        }
        sc.close();
    }

    public static boolean isBalanced(String str) {
        boolean result = true;
        if(str.length() % 2 == 1){
            return false;
        }
        /*
         * stack.add(item):  insert item to stack
         * stack.pop(item):  get item and delete item from stack
         * stack.peck(item): get item and not delete item from stack
         */
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<str.length(); i++){
            char s = str.charAt(i);
            if(s=='(' || s=='{' || s=='['){
                stack.push(s);
            }else{
                if(!popFront(stack, s)){
                    return false;
                };
            }
        }
        return result;
    }

    public static boolean popFront(Stack<Character> stack, char c) {
        char p = ' ';
        switch(c){
            case ')' :
                p = '(';
                break;
            case '}' :
                p = '{';
                break;
            case ']' :
                p = '[';
                break;
        }
        
        if(stack.isEmpty() || stack.pop()!=p){
            return false;
        }else{
            return true;
        }
    }

    public static int countChara(String str, String chara) {
        int count = 0;
        String[] strArray = str.split("");
        for(int i=0; i<strArray.length; i++){
            if(strArray[i].equals(chara)){
                count++;
            }
        }
        return count;
    }
}