import java.lang.*;
class Fruits{
    void color(){
        System.out.println("Parent class method is invoked.");
    }
}
class Mango extends Fruits{
    @Override
    void color(){
        System.out.println("The child class method is invoked.");
    }
}
class Main{
    public static void main(String[] args){
        Fruits obj=new Mango();
        obj.color();
        Fruits obj1=new Fruits();
        obj1.color();
        /*obj=new Fruits();
        obj.color();
        obj=new Mango();
        obj.color();*/
    }
}