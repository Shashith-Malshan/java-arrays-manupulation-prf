import java.util.Arrays;

public class Main {

    static String[] fruits={"apple","banana","orange"};
    //static String[] fruits=new String[0];

    static void printFruits(){
        //System.out.println(Arrays.toString(fruits));

        System.out.print(fruits.length==0?"[null":"[");
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i]+", ");
        }
        System.out.println(fruits.length==0?"]":"\b\b]");
    }



    public static void main(String[] args) {
        printFruits();

    }
}