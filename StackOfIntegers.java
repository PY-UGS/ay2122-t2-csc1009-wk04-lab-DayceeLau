import java.beans.PersistenceDelegate;

public class StackOfIntegers {
   private Integer[] elements;
   private Integer size; //Index of array: elements

   public StackOfIntegers(){
      this.size = -1;   //Set to -1, Index of array starts at 0
      this.elements = new Integer[16];
   }

   public StackOfIntegers(Integer capacity){
      this.elements = new Integer[capacity];
   }

   //Index >=0 that means there is something in array
   public boolean empty(){
      return (this.size >=0 ? false:true);
   }

   //Need to check if empty or not first, if empty then there is nothing to check
   public int peek(){
      //Not empty then return last to put into array
      if (!this.empty()){
         return (this.elements[this.size]);
      }
      else{
         return 0;
      }
   }

   //Check if the index of the array is larger than array size first
   public void push (Integer value){
      if(this.size + 1 < this.elements.length){
         this.size += 1;
         this.elements[this.size] = value;
      }
   }

   //Need to check if array is empty, if empty then there is nothing to pop
   public Integer pop(){
      if(!this.empty()){
         Integer i = this.elements[this.size];
         this.size -= 1;
         return i;
      }
      else{
         return 0;
      }
   }

   public Integer getSize(){
      return this.size;
   }
}