
public class Calculator {
    public class returnStruct{
        boolean exists;
        double data;
        returnStruct(boolean e, double d){
            exists = e;
            data = d;
        }
    }
    final int INFINITY =  Integer.MAX_VALUE;
    public returnStruct div(int a, int b){
        if(b == 0) return new returnStruct(false, INFINITY);
        else {
            double res = a;
            res /= b;
            return new returnStruct(true, res);
        }
    }
    public static int add(int lhs, int rhs){
        return lhs + rhs;
    }
    public static int mult(int lhs, int rhs){
        return lhs * rhs;
    }
    /*public static int div(int lhs, int rhs){
        if (rhs == 0){
            throw new IllegalArgumentException();
        }
        else return lhs / rhs;
    }*/
    public static int sub(int lhs, int rhs){
        return lhs - rhs;
    }
}
