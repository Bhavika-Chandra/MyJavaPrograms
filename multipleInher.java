import java.lang.*;
interface backend{
    public void connectServer();
}
class frontend{
    public void responsive(String str){
        System.out.println(str+" can also be used as frontend");
    }
}
class Language extends frontend implements backend{
    String language="Java";
    public void connectServer(){
        System.out.println(language+" can be used as backend language");
    }
}
    class multipleInher{
    public static void main(String[] args){
        Language java=new Language();
        java.connectServer();
        java.responsive("Java");
    }
}