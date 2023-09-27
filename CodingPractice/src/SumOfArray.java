class NumberArray {
    public void calculateSum(int[] numbers){

        if(numbers == null || numbers.length ==0){
            System.out.println("not a valid input");
            return;
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("The given numbers sum is " + sum);
        System.out.println("Average is " + sum / numbers.length);

    }

}


public class SumOfArray {
    public static void main(String[] args){
        NumberArray arr = new NumberArray();
        int[] digits = {3,4,5,1,2};
        arr.calculateSum(digits);
    }
}
