import java.util.*;
class setString{
   private String s;
   public setString(String s){
      this.s = s;
   }
   public void display(){
      StringBuilder result = new StringBuilder();
      for(int i=0; i<s.length();i++){
         c yhar ch = s.charAt(i);
         if(!(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'|| ch == 'E' || ch == 'I' || ch == 'O'|| ch == 'U')){
            result.append(ch);
         }
      }
      System.out.println("String after removing vowels:" + result);
   }
}
public class RemoveVowels{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a string:");
     String str = sc.nextLine();
     setString ss = new setString(str);
     ss.display();
   }
}