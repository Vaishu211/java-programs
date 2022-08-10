import java.util.Arrays;
class Array4{
    public static void main(String[] args){
        int numbers []={2,8,7,4,3,9};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[numbers.length-2]);
    }
}