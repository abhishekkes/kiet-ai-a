public class MyClass {
    public static void main(String[] args) {
        B obj=new B();
        System.out.println(obj.getClass().getSuperclass().getName());
    }
}
