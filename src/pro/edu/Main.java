package pro.edu;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static int[] swap(int[] array){
        int[] buffer = new int[array.length];

        for (int i = 0; i <array.length ; i++) {
            if(i%2 == 0){
                buffer[i] = array[i+1];
            } else{
                buffer[i] = array[i-1];
            }
        }
        return buffer;
    }

    public static void main(String[] args) {

        int[] array = {0,1,2,3,4,5};

        Arrays.stream(swap(array)).forEach(el-> System.out.print(" " + el));

    }

}
