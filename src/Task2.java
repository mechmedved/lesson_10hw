import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++){
            myList.add(sc.nextLine());
        }

        sc.close();
        int maxValue = maxStringLength(myList);

        for(var value: myList){
            if(maxValue == value.length()){
                System.out.println(value);
            }
        }
    }

    private static int maxStringLength(ArrayList<String> myList){

        int maxValue = myList.getFirst().length();
        for(var value: myList){
            if(value.length()>maxValue){
                maxValue = value.length();
            }
        }

        return maxValue;
    }
}