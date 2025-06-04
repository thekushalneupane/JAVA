//WAP in JAVA to input N numbers from user and a search key and finally locate the search key position in the list using Linked List implementation.
import java.util.*;
public class SearchArrayList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        System.out.println("Enter the no. of elements:");
        int N = sc.nextInt();
        System.out.println("Enter "+N+" numbers:");
        for(int i=0; i<N; i++){
            int number = sc.nextInt();
            numbers.add(number);
            //numbers.add(sc.nextInt());
        }
        System.out.println("Enter the no. to search for:");
        int key = sc.nextInt();
        
        System.out.println("The input numbers are:");
        System.out.println(numbers);
        int position = numbers.indexOf(key);
        if(position!=-1){
            System.out.println("The key is at position:"+(position+1));
        }
        else{
            System.out.println("Key isn't found!");
        }
    }
}