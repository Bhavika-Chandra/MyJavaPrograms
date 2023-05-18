import java.util.Queue;
import java.util.LinkedList;
class queue{
public static void main(String args[]){
Queue <Integer> numbers=new LinkedList<>();
numbers.offer(1);
numbers.offer(2);
numbers.offer(3);
Sytem.out.println("Queue:"+numbers);
int removedNumber=numbers.poll();
System.out.println("Removed element:"+removedNumber);
System.out.println("Queue after deletion:"+numbers);
}
}
