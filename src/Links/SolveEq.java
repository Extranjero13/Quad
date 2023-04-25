package Links;
public class SolveEq {
            
    public static void main(String[] args) throws Exception {

        //Holder trialone = new Holder();
        Quad ExampleOne = new Quad();
        Quad ExampleTwo = new Quad();
        Comp tarea = new Comp(-1.5,1.32288);

        System.out.println("This discriminant is greater than 0. The coefficients are a =1 , b=65 , c=85");
        System.out.println("Discriminant equals = " +  ExampleOne.Compute_dis(1, 65 , 85)); // discriminant test case with two real roots
        double j= ExampleOne.Compute_dis(1, 65, 85);
        System.out.println("Your two real roots are as follows: ");
        System.out.println("x= " + ExampleOne.Formula(j, 65, 1,85)); // Quad Formula Solved for Positive Value
        System.out.println("x= " + ExampleOne.Formula_Neg(j, 65, 1,85)); // Quad Formula Solved for Negative Value

        System.out.println("------------------------------------------------");
        System.out.println("The discriminant is less than 0. The coeffecients are a=1 , b=3 , c=4"); 
        // we are testing two complex/imaginary roots

       System.out.println("Discriminant equals = " +  ExampleTwo.Compute_dis(1, 3 , 4));
            tarea.new_Format();
            tarea.neg_Format();

    }
}
