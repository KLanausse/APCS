package Ch7Arrays;

import java.util.Arrays;

public class ArrayBasics
{
    public static void main(String[] args){
        //Create an int array of size 10
        int[] numbers = new int[10];

        //populate it with random numbers
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int) (Math.random()*10) + 1;
        }

        //Print Contents of Array

            //for(DataType varName : containerName)
            //ONLY USED FOR ARRAY TRAVERSAL
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        //Set the last value of the array to 18
        numbers[numbers.length-1] = 18;

        //Print again!
        System.out.println(Arrays.toString(numbers));

        randomArray();
    }

    public static void randomArray(){
        //Create an array with a random size between 1 and 10
        int[] randomArray = new int[(int)(Math.random()*10 + 1)];

        //populate that array with random numbers between 1 and 10
        for (int i = 0; i <= randomArray.length - 1 ; i++) {
            randomArray[i] = (int)(Math.random()*10 + 1);
        }

        //Print the array
        System.out.println(Arrays.toString(randomArray));
    }
}
