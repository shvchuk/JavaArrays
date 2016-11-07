package TablicaJednowymiarowa;
// searching for min and max numbers in an array
public class ArrayMinMax {

    public static void main(String[] args) {

        int nums[] = new int[10]; // creating an int array of 10 elements
        int min, max; // declares min and max variables

        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;

        min = max = nums[0];

        for (int i = 1; i < 10; i++){
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];
        }

        System.out.println("Min value is: " + min);
        System.out.println("Max value is: " + max);


    }
}
