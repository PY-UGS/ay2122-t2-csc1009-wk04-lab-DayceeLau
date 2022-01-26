import javax.print.event.PrintEvent;

public class Wk04Q2Main {
    public static void main(String[] args)
    {
        StackOfIntegers stack = new StackOfIntegers();
        //Check that stack is empty
        //System.out.println(stack.getSize()); 
        //Output:-1 there is nothing inside; array start at 0

<<<<<<< HEAD
        for(int i = 0 ; i < 10; i++){
=======
        for(Integer i = 0 ; i < 10; i++)
>>>>>>> e98c0f9cb764a3fe72991789b90e5161e52566da
            stack.push(i);
        }
        //System.out.println(stack.getSize()); Output:9

        while(!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
        //System.out.println(stack.getSize()); Output:-1
        
    }
}