package Links;
import java.lang.Math;

public class Quad {
    public double Compute_dis(int a , int b , int c){
        double j;           //discriminant 
        double k;
        
        k= Math.pow(b, 2) - 4*(a)*(c);
        j=Math.sqrt(k);
        return j;
    }

    public double Formula(double j , int b , int a){
        double x;
        x= (-b + j)/2*a;
        return x;
    }
    public double Formula_Neg(double j , int b , int a){
        double x;
        x= (-b - j)/2*a;
        return x;
    }
}
