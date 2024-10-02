import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("E");

        System.out.println(myList.size());

        for(String s : myList){
            System.out.println(s);
        }
    }
}