package Links;
public class SolveEq {
            
    public static void main(String[] args) throws Exception {

        Quad ExampleOne = new Quad();
        Quad ExampleTwo = new Quad();
        Comp tarea = new Comp(-1.5,1.32288);
        Quad ExampleThree= new Quad();

        System.out.println("This discriminant is greater than 0. The coefficients are a =1 , b=65 , c=85");
        System.out.println("Discriminant equals = " +  ExampleOne.Compute_dis(1, 65 , 85)); // discriminant test case with two real roots
        System.out.println("Your two real roots are as follows: ");
        System.out.println("x= " + ExampleOne.Formula(1, 65,85)); // Quad Formula Solved for Positive Value
        System.out.println("x= " + ExampleOne.Formula_Neg(1, 65,85)); // Quad Formula Solved for Negative Value

        System.out.println("------------------------------------------------");
        System.out.println("The discriminant is less than 0. The coeffecients are a=1 , b=3 , c=4"); 
        // we are testing two complex/imaginary roots

       System.out.println("Discriminant equals = " +  ExampleTwo.Compute_dis(1, 3 , 4));
            tarea.new_Format();     //a +bi
            tarea.neg_Format();     //a-bi


        System.out.println("------------------------------------------------");
        System.out.println("This discriminant is equal to 0. The coefficients are a =4 , b=4 , c=1");
        System.out.println("Discriminant equals = " +  ExampleThree.Compute_dis(4, 4 , 1)); // discriminant test case with one real root
        System.out.println("Your two real roots are as follows: ");
        System.out.println("x= " + ExampleThree.Formula(4, 4,1)); // Quad Formula Solved for Positive Value
        System.out.println("x= " + ExampleThree.Formula_Neg(4, 4,1)); // Quad Formula Solved for Negative Value
        //Same root, if statement/boolean later
        //double real root if/else later?
        double x = ExampleThree.Formula(4, 4,1);        //calling on the ComPair object using the Quad class
        double y = ExampleThree.Formula_Neg(4, 4,1);
       System.out.println(ExampleOne.compare(x,y));
    }
}
