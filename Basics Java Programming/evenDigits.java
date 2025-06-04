//WAP to count the total number of even digits in a number entered by user.
class Number{
    private int num;
    public void setNumber(int num){
        this.num = num;
    }
    
    public int getEvenDigits(){
        int count=0;
        while(num!=0){
            int ext = num % 10;
            if(ext%2==0){
                count = count +1;
            }
            num = num/10;
        }
        return(count);
    }
}
class evenDigits {
    public static void main(String[] args) {
        Number n = new Number();
        n.setNumber(382632);
        int res = n.getEvenDigits();
        System.out.println("No. of even digits:"+res);
    }
}

