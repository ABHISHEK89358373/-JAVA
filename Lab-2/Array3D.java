public class Array3D {
    public static void set(int value, int x, int y, int z, int[] data, int dimX, int dimY, int dimZ) {
        int index = x * (dimY * dimZ) + y * dimZ + z;
        data[index] = value;
    }

    public static int get(int x, int y, int z, int[] data, int dimX, int dimY, int dimZ) {
        int index = x * (dimY * dimZ) + y * dimZ + z;
        return data[index];
    }

    public static void main(String[] args) {
        int dimX = 3, dimY = 3, dimZ = 3;
        int[] data = new int[dimX * dimY * dimZ];

        set(10, 0, 0, 0, data, dimX, dimY, dimZ);
        set(20, 1, 1, 1, data, dimX, dimY, dimZ);
        set(30, 2, 2, 2, data, dimX, dimY, dimZ);

        System.out.println("Value at (0, 0, 0): " + get(0, 0, 0, data, dimX, dimY, dimZ));
        System.out.println("Value at (1, 1, 1): " + get(1, 1, 1, data, dimX, dimY, dimZ));
        System.out.println("Value at (2, 2, 2): " + get(2, 2, 2, data, dimX, dimY, dimZ));
    }
}
