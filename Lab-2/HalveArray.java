interface Operation {
    int compute(int value);
}

class Halve implements Operation {
    @Override
    public int compute(int value) {
        return value / 2;
    }
}

public class HalveArray {
    public static int[] halveElements(int[] numbers) {
        Operation halver = new Halve();

        int[] halvedResults = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            halvedResults[i] = halver.compute(numbers[i]);
        }

        return halvedResults;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int[] halvedNumbers = halveElements(numbers);

        System.out.print("Halved values: ");
        for (int number : halvedNumbers) {
            System.out.print(number + " ");
        }
    }
}
