package Main;

public class Main {

    public static void main(String[] args) {
        int[] KeyboardCost1 = {40,35,70,15,45};
        int[] KeyboardCost2 = {15,20,10,35};
        int[] KeyboardCost3 = {40,50,60};
        int[] KeyboardCost4 = {60};
        int[] KeyboardCost5 = {40,60};
        int[] USBCost2 = {20,15,40,15};
        int[] USBCost3 = {15,45,20};
        int[] USBCost4 = {8,12};
        System.out.println(aufgabe_1(KeyboardCost1));
        System.out.println(aufgabe_2(KeyboardCost2,USBCost2));
        System.out.println(aufgabe_3(USBCost3,30));
        System.out.println(aufgabe_4(KeyboardCost3,USBCost4,60));
        System.out.println(aufgabe_4(KeyboardCost4,USBCost4,60));
        System.out.println(aufgabe_4(KeyboardCost5,USBCost4,60));
    }

    public static int aufgabe_1(int[] costKeyboard){
        //returns the lowest cost from the array
        //Input: int[]
        //Output: int
        int min_cost=costKeyboard[0];
        for(int cost: costKeyboard)
            if(min_cost>cost)
                min_cost=cost;
        return min_cost;
    }

    public static int aufgabe_2(int[] costKeyboard,int[] costUSB){
        //returns the highest cost from both arrays
        //Input: int[],int[]
        //Output: int
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
        //Input: int[],int
        //Output: int
        int max_cost=costUSB[0];
        for(int cost: costUSB)
            if(max_cost<cost&&cost<budget)
                max_cost=cost;
        return max_cost;
    }

    public static int aufgabe_4(int[] costKeyboard,int[] costUSB,int budget){
        //returns the highest cost of 2 added elements from each array, under budget
        //Input: int[],int[],int
        //Output: int
        int max_cost=-1;
        for(int cost1: costKeyboard)
            for(int cost2: costUSB)
                if(cost1+cost2>max_cost&&cost1+cost2<budget)
                    max_cost=cost1+cost2;
        return max_cost;
    }
}
