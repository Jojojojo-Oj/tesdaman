import java.util.Scanner;

public class TesdaArrayMed {
    public static void main(String [] args){
        Scanner scan = new  Scanner(System.in);

        // EXERCISE 1
        // int [] nums = {1, 2, 3, 4, 5,6};

        // int left = 0;
        // int right = nums.length - 1;


        // while (left < right) {
        //     int temp = nums[left];
        //     nums[left] = nums[right];
        //     nums[right] = temp;
        //     left++;
        //     right--;
        // }


        // for(int n : nums){
        //     System.out.print(n +  " ");
        // }


        // EXERCISE 2
        
        // int [] nums2 = {10, 20, 30, 40, 50};
        // System.out.print("Search: ");
        // int search = scan.nextInt();
        // boolean isFound = false;
        
        // for(int i = 0; i < nums2.length; i++){
        //     if(nums2[i] == search){
        //         isFound = true;
        //         break;
        //     }
        // }


        // if(!isFound){
        //     System.out.println("Element Not Found!");
        // }
        // else{
        //     System.out.println("Element Found!");
        // }


        // EXERCISE 3

        // int [] nums3 = {90, 50, 70, 80};
        // int largest = nums3[0];
        // int secondLargest = Integer.MIN_VALUE;




        // for(int i = 1; i < nums3.length; i++){                              
        //     if(largest < nums3[i]){
        //         secondLargest = largest;
        //         largest = nums3[i];
        //     }
        //     else if(secondLargest != largest && secondLargest < nums3[i]){
        //         secondLargest = nums3[i];
        //     }
        // }

        // System.out.print(secondLargest);


        // EXERCISE 4

        int[] nums4 = {5, 5, 5, 10, 10, 15, 20, 20};

        int[] temp = new int[nums4.length];
        int count = 0;
        
        for(int i = 0; i < nums4.length; i++){
            boolean isDuplicate = false;

            for(int j = 0; j < temp.length; j++){
                if(nums4[i] == temp[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                temp[count] = nums4[i];
                count++;
            }

        }



        
        
        

        

    }
}
