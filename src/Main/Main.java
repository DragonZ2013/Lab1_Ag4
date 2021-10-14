package Main;

public class Main {

    public static void main(String[] args) {
        int[] KeyboardCost1 = {40,35,70,15,45};
        int[] KeyboardCost2 = {15,20,10,35};
        int[] USBCost2 = {20,15,40,15};
        int[] USBCost3 = {15,45,20};
        System.out.println(aufgabe_1(KeyboardCost1));
        System.out.println(aufgabe_2(KeyboardCost2,USBCost2));
        System.out.println(aufgabe_3(USBCost2,30));
    }

    public static int aufgabe_1(int[] costKeyboard){
        //returns the lowest cost from the array
        int min_cost=costKeyboard[0];
        for(int cost: costKeyboard)
            if(min_cost>cost)
                min_cost=cost;
        return min_cost;
    }

    public static int aufgabe_2(int[] costKeyboard,int[] costUSB){
        //returns the highest cost from both arrays
        int max_cost=costKeyboard[0];
        for(int cost: costKeyboard)
            if(max_cost<cost)
                max_cost=cost;
        for(int cost: costUSB)
            if(max_cost<cost)
                max_cost=cost;
        return max_cost;
    }

    public static int aufgabe_3(int[] costUSB,int budget){
        //returns the highest cost from array under budget
        int max_cost=costUSB[0];
        for(int cost: costUSB)
            if(max_cost<cost&&cost<budget)
                max_cost=cost;
        return max_cost;
    }
}
