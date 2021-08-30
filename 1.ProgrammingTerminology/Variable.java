public class Variable {
    //1. local variable 

    // public static void main(String[] args) {
    //     String name="Shahul"; //declared within in a block or method is local variable
    //     System.out.println(name);
    // }

    //2. instant variable

    // also known as the global variable
    // declared inside the class
    // access by using the object

    // String name="Shahul";
    // public static void main(String[] args) {
    //     Variable obj=new Variable();
    //     System.out.println(obj.name);
    // }

    // 3.static Variable
    // no need for creating the object to access the variable
    // Declared inside the class.
    
    static String name="Shahul";
     public static void main(String[] args) {
        System.out.println(name);   
     }
}
