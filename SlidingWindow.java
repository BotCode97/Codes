import java.util.*;
class SlidingWindow{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int des = scan.nextInt();
        int neg_des = scan.nextInt();
        int[] arr = {1,2,3,4,5,6,7};
        SlidingWindow win = new SlidingWindow();
        win.slidingWindow(arr, 0, 1,des);
        int[] arr1 = {1,2,3,-3,2,4,-5};
        win.slidingwindowwithNegative(arr1, 0, 1, neg_des);
    }


    
    public void slidingwindowwithNegative(int[] arr,int i,int j,int des){
    
        if(j==arr.length && i==(j-1)){
            return;
        }else
           if(j==arr.length ){
           
             slidingwindowwithNegative(arr, i+1, i+2, des);
        }else if(j!=arr.length && i!=(j+1)){
            int sum = 0;
            for(int k=i;k<=j;k++){
                sum+=arr[k];
            }
            if(sum==des){
                System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, j+1)));   
            }
            slidingwindowwithNegative(arr, i, j+1, des);
        }
   
    }

    public void slidingWindow(int[] arr,int i,int j,int des){     
        if(j == arr.length && i==(j+1)){
            return;
        }else if(i==j && j!= arr.length){
            slidingWindow(arr, i, j+1, des);
        }else if(i!=j && j!=arr.length){

        int sum = 0;
        for(int k=i;k<=j;k++){
            sum+=arr[k];
        }
        if(sum>des){
            slidingWindow(arr, i+1, j, des);
        }else if(sum<=des){
            if(sum == des){
                System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, j+1)));
            }
            slidingWindow(arr, i, j+1, des);
        }
    }

    }

}
