public class SymbolBalancingTask {
    public static void main(String[] args) {
        System.out.println(balanceCheck("(A*C) + ((V-M))"));


    }
    public static boolean balanceCheck(String expr){
        //create a stack
        MyStack<Character> myStack=new MyStack<>();
        //iterate over expr to add and pop from stack
        for (int i = 0; i < expr.length(); i++) {
            Character ch=expr.charAt(i);
            //filter non delimiters
            if(ch!='('&& ch!=')'&& ch!='['&& ch!=']'&& ch!='{'&& ch!='}'){
                continue;// ALL characters SHOULD not be THESE characters, in order to skip!!!Not any, but all
            }
            //if it is required symbol=>
                 //if opening symbol, push to the stack
            if(ch=='('||ch=='['||ch=='{'){
                myStack.push(ch); continue;
            }
            //at this point this is a closing symbol
                   //stack shouldn't be empty
            if(myStack.isEmpty()){ return false;}
                  // check if incoming symbol matches existing
            switch(ch){
                case ')':
                    if(myStack.pop()!='('){return false;}
                    break;
                case ']': if(myStack.pop()!='['){return false;}
                    break;
                case '}': if(myStack.pop()!='{'){return false;}
                    break;
            }
        }// end of forLoop
        //return of stack is empty, since if it is not empty it means some symbols didn't match
        return myStack.isEmpty();
    }
}
