abstract class shape {
    int a=5,b=10;
    abstract void printArea();    
}
class rectangle extends shape{
    public void printArea(){
        System.out.println("Area of rectangle is="+a*b);
    }
}
class triangle extends shape{
    public void printArea(){
        System.out.println("Area of triangle is:"+0.5*a*b);
    }
}
class circle extends shape{
    public void printArea(){
        System.out.println("Area of circle is:"+3.14*a*a);
}
}
class A{
    public static void main(String args[]){
        shape obj=new rectangle();
        obj.printArea();
        shape obj1=new triangle();
        obj1.printArea();
        shape obj2=new circle();
        obj2.printArea();
    }
}
