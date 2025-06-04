import java.util.*;
class Temperature{
    private double fht;
    public void setFahr(double fht){
        this.fht = fht;
    }
    public double getCelsius(){
        return ((fht-32)/1.8);
    }
}
public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter temperature in Fahrenheit:");
        double f = sc.nextDouble();
        Temperature t = new Temperature();
        t.setFahr(f);
        double res_temp = t.getCelsius();
        System.out.println("Temperature="+res_temp+"°C");
    }
}