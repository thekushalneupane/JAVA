//WAP to sum the total of odd digits in a number entered by user.
import java.util.*;
class Numbers{
    private int num;
    public void setNumber(int num){
        this.num = num;
    }
    
    public int getSumOfOddDigits(){
        int sum=0;
        while(num!=0){
            int ext = num % 10;
            if(ext%2!=0){
                sum= sum +  ext;
            }
            num = num/10;
        }
        return (sum);
    }
}
class OddDigitsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int N = sc.nextInt();
        Numbers n = new Numbers();
        n.setNumber(N);
        int res = n.getSumOfOddDigits();
        System.out.println("Sum of Odd digits:"+res);
    }
}