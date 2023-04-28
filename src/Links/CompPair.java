package Links;

public class CompPair {
    //method used to determine if both roots are complex
     String checker(double num_real, double num_fake){
        return num_real == num_fake ? "Both roots are the same.": "The complex roots are different";
    }  
    double real_root( double num_real, double num_fake){
        return num_real == num_fake ? num_real : 0;
    }


    //method to detect double root/ perfect squares
String bc( int b , int c){
        double x= (b/2) * 5;
        return x == -c ? "This is a double root due to a perfect square" : "This is not a double root. Not a perfect square";
    }   
}
