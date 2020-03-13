class MergeSort{
    public static void main(String[] args) {
    int[] arr = {9,8,7,6,5,4,3,2,1};
    mergesort(arr, 0, arr.length-1);       
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }
    }
    public static void mergesort(int[] arr,int left,int right){
        if(left == right){
          return;
        }else{
        int mid = (left+right)/2;
        
        mergesort(arr, left, mid);
        mergesort(arr, mid+1, right);
        sort(arr, left, mid+1, mid, right);
      
    }
    }

    public static void sort(int[] arr,int s1,int s2,int e1,int e2){
      int i=s1,j=s2,k=0;
      int[] data = new int[arr.length];
    
      while(i<=e1 && j<=e2){
        if(arr[i]<arr[j]){
            data[k] = arr[i];
            i++;
            k++;
        }else if(arr[i]>arr[j]){
            data[k] = arr[j];
            j++;
            k++;
        }else{
            data[k] = arr[i];
            k++;
            data[k] = arr[j];
            k++;
            i++;
            j++;
        } 
      }
      if(i>=e1 && j<=e2){
          while(j<=e2){
              data[k] = arr[j];
              k++;
              j++;
          }
      }else{
        while(i<=e1){
            data[k] = arr[i];
            k++;
            i++;
        }
      }
      for(int c=s1,f=0;c<=e2 && f<=k;c++,f++){
        arr[c] = data[f];
        }
    }    


}

/*
        2354718910
    23547        18910
   235  47
 23 5   4 7
2 3 5
23 5
   
*/ 