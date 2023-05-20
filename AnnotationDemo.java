import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value();
}
public class AnnotationDemo {
    @Deprecated
    public static void deprecatedMethod() {
        System.out.println("This method is deprecated.");
    }
    @SuppressWarnings("unchecked")
    public static void suppressWarningExample() {
        java.util.List myList = new java.util.ArrayList();
        myList.add("Item");
    }
    @MyAnnotation("Sample Annotation")
    public static void customAnnotationExample() {
        System.out.println("This is a method with a custom annotation.");
    }
    public static void main(String[] args) {
        deprecatedMethod();
        suppressWarningExample();
        customAnnotationExample();
    }
}
