import java.util.*;
class MyStack {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<Integer>();
        list.push(33);
        list.push(32);
        list.push(55);
        list.push(49);
        list.push(100);
        list.push(10);
        System.out.println(list);
        list.pop();
        System.out.println(list);
        //list.pop(55); -> this will not work because 55 is taken as index but we dont have 55 index
        //to remove a particular number -> find its position and delete it using its index.
        int position = list.indexOf(55);
        System.out.println("The key is at position:"+(position+1)+ " and its index is at:" + position);
        // we got the position of 55 at index 2
        list.remove(2);
        System.out.println(list);
    }
}