public class str_operations {
    public static void main(String args[]){
        String greet = "Hello World";
        System.out.println("String:"+greet);
        int length = greet.length();
        System.out.println("\n Length:"+length);
        System.out.println(greet.indexOf('l'));
        char ch = greet.charAt(3);
        System.out.println(ch);
        System.out.println(greet.toLowerCase());
        System.out.println(greet.toUpperCase());
        System.out.println(greet.substring(0,5));
        System.out.println(greet.substring(5,10));
        String str = "Welcome to java!";
        System.out.println(greet.concat(str));
    }     
}
