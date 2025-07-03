public class Main {
    public static void main(String[] args) {
        // Print Hello World
        System.out.println("Hello, From Main Class");

        Sub s1 = new Sub();
        int result = s1.subtraction(10, 4);
        System.out.println("Substraction : " + result);

        Add a1 = new Add();
        int result2 = a1.Addition(10,4);
        System.out.println("Addition : " + result);
    }
}