class Room{
    protected int len,bre;
    public int area(){
        return len*bre;
    }
}
class Bedroom extends Room{
    private int height;
    public void setData(int len,int bre,int height){
        this.len=len;
        this.bre=bre;
        this.height=height;
    }
    
    public int volume(){
        return (area()*height);
    }
}

class SingleInheritance {
    public static void main(String[] args) {
        Bedroom br = new Bedroom();
        br.setData(5,6,8);
        int vol = br.volume();
        System.out.println("Volume = "+ vol);
    }
}