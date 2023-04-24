package Links;
import java.util.Scanner;
public class SolveEq {
            // we do not need user input, get rid of this later.
    public static void main(String[] args) throws Exception {
        Scanner calculate = new Scanner(System.in);
        Holder trialone = new Holder();
        Quad ExampleOne = new Quad();
        System.out.println("Welcome to your Quadratic Formula character. Please enter integer values for a,b, and c");
        System.out.print("input value for a:");
        int a = calculate.nextInt();
        trialone.setA(a);
        System.out.print("input value for b:");
        int b = calculate.nextInt();
        trialone.setB(b);
        System.out.print("input value for c:");
        int c = calculate.nextInt();
        trialone.setC(c);

        calculate.close();


        System.out.println(trialone.getA());
        System.out.println(trialone.getB());
        System.out.println(trialone.getC());

        System.out.println(ExampleOne.Compute_dis(a, b , c)); // discriminant
        double j= ExampleOne.Compute_dis(a, b, c);
        System.out.println(ExampleOne.Formula(j, b, a)); // Quad Formula Solved for Positive Value
        System.out.println(ExampleOne.Formula_Neg(j, b, a)); // Quad Formula Solved for Negative Value


    }
}
