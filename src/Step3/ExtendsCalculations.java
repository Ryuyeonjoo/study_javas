package Step3;

public class ExtendsCalculations extends Calculations{
    ExtendsCalculations() {
        System.out.println("ExtendsCalculations. - constructor");
    }
    // multiply
    public int multiplication(int first, int second){
        int result = first * second;
        return result;
    }
    // Public Methods substraction
    public int substraction(int first, int second){
        int result = second - first;
        return result;
    }
     
}
