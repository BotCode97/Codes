class MaximumSumSubArray{
    public static void main(String[] args) {
    int arr[] = {1,2,3,-4,5,6};
    int max = arr[0];
    int n = arr.length-1;
    MaximumSumSubArray array = new MaximumSumSubArray();
    System.out.print("Maximum Sum : "+array.Sumsubarray(arr, 0, n));

    }
    public int Sumsubarray(int[] arr,int left,int right){
        if(left == right){
            return arr[left];
        }else{
            int sum = 0;
            int mid = (left+right)/2;
            int x = Sumsubarray(arr, left, mid);
            int y = Sumsubarray(arr, mid+1, right);
            int z = Sum(arr, left, right);
            if(x >= y && x>=z){
                sum = x;
            }else if(y >= x && y>=z){
                sum = y;
            }else if(z >= x && z>=y){
                sum = z;
            }
            return sum;
        }
    }

    public int Sum(int[] arr,int s1,int e1){
        int sum = 0;
        for(int i=s1;i<=e1;i++){
            sum+=arr[i];
        }
        return sum;
    }


}