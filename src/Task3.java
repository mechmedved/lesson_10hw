import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++){
            myList.add(sc.nextLine());
        }

        sc.close();

        int minValue = minStringLength(myList);

        for(var value: myList){
            if(minValue == value.length()){
                System.out.println(value);
            }
        }
    }

    private static int minStringLength(ArrayList<String> myList){

        int minValue = myList.getFirst().length();
        for(var value: myList){
            if(value.length()<minValue){
                minValue = value.length();
            }
        }

        return minValue;
    }
}
