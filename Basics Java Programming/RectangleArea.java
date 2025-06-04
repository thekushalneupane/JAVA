//WAP to find area and perimeter of rectangle

class Rectangle{
    private int len,bre;
    public  Rectangle(){
        len=0;
        bre=0;
    }
    
    public Rectangle(int len, int bre){
        this.len = len;
        this.bre = bre;
    }
    
    public int area(){
        return len*bre;
    }
    
    public int perimeter(){
        return 2*(len+bre);
    }
}

class RectangleArea {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4,5);
        System.out.println("Area = "+r.area());
        System.out.println("Perimeter = "+r.perimeter());
    }
}