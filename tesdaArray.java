import java.util.Scanner;

public class tesdaArray {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        // EXERCISE 1

        System.out.print("Enter Range: ");
        int range = scan.nextInt();


        int [] nums = new int[range];

        for(int i = 0; i < nums.length; i++){
            System.out.print("Enter Number: ");
            nums[i] = scan.nextInt();
        }

        int sum = 0;

        for(int iii : nums){
            System.out.println(iii);
            sum += iii;
        }
        

        // // EXERCISE 2 

        System.out.println("Sum: " + sum);


        // EXERCISE 3

        int[]nums3 = {12, 45, 7, 89, 1};
        int largest = nums3[0];
        int smallest = nums3[0];
        for(int i = 1; i < nums3.length; i++){
            if(largest < nums3[i]){
                largest = nums3[i];
            }


            if(smallest > nums3[i]){
                smallest = nums3[i];
            }
        }


        System.out.println("Largest: " + largest);
        System.out.print("Smallest: " + smallest);
        

        // EXERCISE 4

        int [] nums4 = {1, 1, 3, 4, 5, 6};
        int evenCount = 0;
        int oddCount = 0;

        for(int f : nums4){
            if(f % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }


        System.out.println(evenCount);
        System.out.println(oddCount);
        
    }
}
