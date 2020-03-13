import java.util.*;
class Permutation{
    public static void main(String[] args) {
      String s = "abc"; 
      permute(s.toCharArray(), 0, s.length());       
    }

    public static void permute(char[] ch,int c,int n){
      if(c==n){
        System.out.println(ch);
      }else{

        for(int i = c;i<n;i++){
          String d="";  
          for(int j=i;j<n;j++){
              d+=ch[j];
            }
            System.out.println(ch);
            
            swap(ch, c, i);
            permute(ch, c+1, n);
            swap(ch, c, i);
        }

      }

    }



    public static void swap(char[] ch,int i,int j){
      char temp = ch[i];
      ch[i] = ch[j];
      ch[j] = temp;

    }


}


/*
          a          b             c
      (ab)(ac)    (ba)(bc)      (ac)(ab)

*/