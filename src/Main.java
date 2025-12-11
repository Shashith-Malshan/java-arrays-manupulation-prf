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

    static void printReverseFruits(){

        System.out.print(fruits.length==0?"[null":"[");
        for (int i = fruits.length-1; i >=0 ; i--) {
            System.out.print(fruits[i]+", ");
        }
        System.out.println(fruits.length==0?"]":"\b\b]");
    }


    static void addFruit(String fruit){
        String[] tempar=new String[fruits.length+1];
        for (int i = 0; i < fruits.length; i++) {
            tempar[i]=fruits[i];
        }
        tempar[fruits.length]=fruit;
        fruits=tempar;
        printFruits();
    }

    static int getIndex(String fruit){
        for (int i = 0; i < fruits.length ; i++) {
            if (fruits[i].equalsIgnoreCase(fruit)){
                return i;
            }
        }
        return -1;
    }

    static void removeFruit(String fruit){
        int index=getIndex(fruit);
        if(index==-1){
            return;
        }
        String[] tempAr= new String[fruits.length-1];
        for (int i = 0; i < index; i++) {
            tempAr[i]=fruits[i];
        }
        for (int i = index; i < fruits.length-1 ; i++) {
            tempAr[i]=fruits[i+1];
        }
        fruits=tempAr;
        printFruits();
    }

    static public String[] vegetables={"carrot","cabbage","beans"};
    static void mergeFruitsVegetables(){
        String[] tempAr=new String[fruits.length+vegetables.length];

        for (int i = 0; i < fruits.length ; i++) {
            tempAr[i]=fruits[i];
        }
        for (int i = fruits.length; i < tempAr.length ; i++) {
            tempAr[i]=vegetables[i- fruits.length];
        }
        fruits=tempAr;
        printFruits();

    }







    public static void main(String[] args) {
        printFruits();
        addFruit("mango");

        System.out.println(getIndex("orange"));

        removeFruit("apple");

        printReverseFruits();

        mergeFruitsVegetables();




    }
}