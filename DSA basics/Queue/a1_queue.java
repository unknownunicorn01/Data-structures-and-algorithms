import java.util.*;
public class a1_queue{
  public static void main(String[] args){
    java.util.Queue<Integer> myQueue = new LinkedList<>();
    //for insertion
    myQueue.add(1);
    myQueue.offer(2); 
    System.out.println(myQueue.offer(3)); //both add and offer have return type boolean
    //deletion in queue

    System.out.println(myQueue.remove());  //return type of revmove and poll is int or datatype it made in
    System.out.println(myQueue.poll());
    myQueue.add(4);
    myQueue.add(5);
    System.out.println(myQueue); // you can print whole queue like this too
  }
}