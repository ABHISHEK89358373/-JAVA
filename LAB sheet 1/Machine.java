import java.util.Scanner;

class WashingMachine {
    int capacity = 10;
    void switchOn(){
        System.out.println("Machine Ready for Use");
    }
    int acceptClothes(int clothes){
        if(clothes>capacity){
            System.out.println("Clothes greater than capacity!");
            return capacity;
        }
        return clothes;
    }
    int acceptDetergent(int amtOfDetergent){
        return amtOfDetergent;
    }
    void switchOff(){
        System.out.println("Machine is turned off!");
    }
}

public class Machine {
    public static void main(String[] args) {
        WashingMachine m = new WashingMachine();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of detergent in grams: ");
        int detergent = sc.nextInt();
        System.out.print("Enter the number of clothes: ");
        int clothes = sc.nextInt();

        m.acceptDetergent(detergent);
        int washing = m.acceptClothes(clothes);
        m.switchOn();
        System.out.println(washing+ " clothes are getting washed.");
        System.out.println("Clothes are washed and rinsed successfully!");
        m.switchOff();
    }
}
