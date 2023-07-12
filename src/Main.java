import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the elements in an array");
        String arrString=scanner.nextLine();

        String[] arrrayChar =arrString.split(" ");
        int size=arrrayChar.length;

        int array[]=new int[size];
        for(int iterator=0;iterator<size;iterator++) {
            array[iterator] = Integer.parseInt(arrrayChar[iterator]);
        }

        //Calling the CountOfArrayElement function
        int count=CountOfArrayElement(array,size);
        System.out.println(count);
    }


    //CountOfArrayElement function
    private static int CountOfArrayElement(int[] array, int size) {

        //Finding the maximum value
        int max= Integer.MIN_VALUE;
        for(int iterator=0;iterator<size;iterator++){
            if(max<array[iterator]){
                max=array[iterator];
            }
        }

        //finding the occurence of the maximum value
        int count=0;
        for(int iterator=0;iterator<size;iterator++){
            if(array[iterator]==max){
                count++;
            }
        }
        return size-count;
    }
}