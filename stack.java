import java.util.Stack;
class stack{
public static void main(String args[]){
Stack <String> flowers = new Stack<>();
flowers.push("Rose");
flowers.push("Lily");
flowers.push("Jasmine");
System.out.println("STack:"+flowers);
flowers.pop();
System.out.println("Stack after pop:"+flowers);
}
}