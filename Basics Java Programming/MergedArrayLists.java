//WAP in JAVA to input N numbers from user and a search key and finally locate the search key position in the list using Linked List implementation.
import java.util.*;
public class MergedArrayLists{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        
        //list1
        System.out.println("Enter the total numbers to be in list1:");
        int N1 = sc.nextInt();
        System.out.println("Enter "+N1+" numbers for list1:");
        for(int i=0; i<N1; i++){
            int number = sc.nextInt();
            list1.add(number);
            //numbers.add(sc.nextInt());
        }
        
        //list2
        System.out.println("Enter the total numbers to be in list2:");
        int N2 = sc.nextInt();
        System.out.println("Enter "+N2+" numbers for list 2:");
        for(int i=0; i<N2; i++){
            int number = sc.nextInt();
            list2.add(number);
            //numbers.add(sc.nextInt());
        }
        
        //Merge List
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println("Merged List:");
        System.out.println(list3);
    }
}