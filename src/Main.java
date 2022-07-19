public class Main {
    public static void main(String[] args) {

        Ints calc = new IntsCalculator(new Calculator());

        System.out.println(calc.mult(3, 0));
        System.out.println(calc.pow(5, 0));


    }
}