public class Main {
    public static void main(String[] args) {
        // Print Hello World
        System.out.println("Hello, From Main Class");

        Sub s1 = new Sub();
        int result = s1.subtraction(40, 4);
        System.out.println("Substraction : " + result);

        Add a1 = new Add();
        int result2 = a1.Addition(10,5);
        System.out.println("Addition : " + result2);

        Multi m1 = new Multi();
        int result3 = m1.Multiplication(10,5);
        System.out.println("Multiplication : " + result3);
        // THis is for testing

        Div d1 = new Div();
        float result4 = d1.Division(103, 2);
        System.out.println("Divsion : "+result4);
        
    }
}