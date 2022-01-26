public class Wk04Q2Main {
    public static void main(String[] args)
    {
        StackOfIntegers stack = new StackOfIntegers();
        //Check that stack is empty
        //System.out.println(stack.getSize()); 
        //Output:-1 there is nothing inside; array start at 0
        for(Integer i = 0 ; i < 10; i++){
            stack.push(i);
        }
        //System.out.println(stack.getSize()); Output:9

        while(!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
        //System.out.println(stack.getSize()); Output:-1
        
    }
}