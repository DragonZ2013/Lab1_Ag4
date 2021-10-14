package Main;

public class Main {

    public static void main(String[] args) {
        int[] KeyboardCost1 = {40,35,70,15,45};
        System.out.println(aufgabe_1(KeyboardCost1));
    }

    public static int aufgabe_1(int[] costKeyboard){
        //returns the lowest cost from the array
        int min_cost=costKeyboard[0];
        for(int cost: costKeyboard)
            if(min_cost>cost)
                min_cost=cost;
        return min_cost;
    }

    
}
