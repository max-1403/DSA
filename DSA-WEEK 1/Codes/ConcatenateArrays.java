import java.util.Arrays;

public class ConcatenateArrays {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30};
        int[] array2 = {40, 50, 60};

        int[] result = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, result, 0, array1.length);
        
       
        System.arraycopy(array2, 0, result, array1.length, array2.length);

        System.out.println("Concatenated Array: " + Arrays.toString(result));
    }
}
