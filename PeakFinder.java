class PeakFinder{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9},{2,14,7}};
        int n = arr.length;
        int left = 0;
        int right = n-1;
       // OneDArray(arr,left, right,n);
        twoDpeak(arr2, 4, 4);        
    }

    public static void OneDArray(int[] arr,int left,int right ,int n){
        int mid = (left+right)/2;
        while(left<=right || mid<n){

            if(mid<n-1){  
                if(arr[mid]<arr[mid-1]){
                //Left
                    right = mid-1;
                    mid = (left+right)/2;
                }else if(arr[mid]<arr[mid+1]){
                //Right
                    left = mid+1;
                    mid=(left+right)/2;
                
                }   
                else if(arr[mid]>=arr[mid-1] && arr[mid]>=arr[mid+1]){
                //Found
                    System.out.println(arr[mid]);
                    break;
                }
            }else if(mid==n-1 && arr[mid-1]<arr[mid]){
                System.out.println(arr[mid]);
                break;
            }
        }
    }


    public static void twoDpeak(int[][] arr,int n_col,int m_row){
        int left =0;
        int right = n_col-1;
        int j = (left+right)/2;
        int i = max(arr[j]);
        while(left<=right && j<n_col){
          
        if(j !=0 && j<n_col-1){
            if(arr[j-1][i]>arr[j][i]){
            //Left
            right = j-1;
            j = (left+right)/2;
            i = max(arr[j]); 
        }else if(arr[j+1][i]>arr[j][i]){
            //Right
            left = j+1;
            j = (left+right)/2;
            i = max(arr[j]); 
        }else if((arr[j+1][i]<=arr[j][i]) && arr[j-1][i]<=arr[j][i]){
            //Found
            System.out.println(arr[j][i]);
            break;
        }
    }else if(j ==0 && arr[j+1][i]<=arr[j][i]){
        //Found
        System.out.println(arr[j][i]);
        break;
    }else if(j ==n_col-1 && arr[j-1][i]<=arr[j][i]){
        //Found
        System.out.println(arr[j][i]);
        break;
    }
    
        }

    }

    public static int max(int[] arr){
        int max=0;
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }


}