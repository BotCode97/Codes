import java.util.*;
import java.io.*;
import java.net.URL; 
class PhotoSlideShow{

    public static ArrayList<ArrayList<String>> interset(ArrayList<ArrayList<String>> l){
        int count_c=0;
        for(int i = 0;i<l.size()-1;i++){
            count_c=0;
            
            ArrayList<String> s1 = l.get(i);
            ArrayList<String> s2 = l.get(i+1);
            
            System.out.println(s1+" "+s2);
            for(int j=0;j<s1.size();j++){
                for(int k=0;k<s2.size();k++){
                    if(s1.get(j).equals(s2.get(k))){
                        count_c++;
                    }
                }   
            }
            int size_s1 = s1.size()-count_c;
            int size_s2 = s2.size()-count_c;

            if(size_s1>size_s2){
                l.set(i,s2);
                l.set(i+1,s1);
            }else if(size_s1<size_s2){
                l.set(i,s1);
                l.set(i+1,s2);
            }
            

        }

        
        return l;
    }
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<ArrayList<String>> H = new ArrayList<>();
        ArrayList<ArrayList<String>> V = new ArrayList<>();
        
        ArrayList<ArrayList<String>> Total = new ArrayList<>();
        ArrayList<ArrayList<String>> V1 = new ArrayList<>();
        String a[] = new String[n];
        int index_h[] = new int[n];
        int index_v[] = new int[n];
        int count4=0;
        int count5=0;
        for(int i=0;i<n;i++){
            String f = scan.next();
            a[i] = f;
            int d = scan.nextInt();
            if (f.equals("H")) {   
                index_h[count4] = i;
                count4++;
                ArrayList<String> h_parts = new ArrayList<>();
                for(int j=0;j<d;j++){
                h_parts.add(scan.next());
            }
                H.add(h_parts);
            }else{
                index_v[count5] = i;
                count5++;
                ArrayList<String> v_parts = new ArrayList<>();
                for(int j=0;j<d;j++){
                    v_parts.add(scan.next());
                }
                V.add(v_parts);
            }
        }

      for(int i=0;i<V.size();i++){
        ArrayList<String> n1 = V.get(i);
        ArrayList<String> b = new ArrayList<>();
      
        //System.out.println(n1); 
           for(int j=i+1;j<V.size();j++){
        ArrayList<String> n2 = V.get(j);
            
            for(int k=0;k<n1.size();k++){
                b.add(n1.get(k));
                //System.out.println(n1.get(k));
            }
            for(int k=0;k<n2.size();k++){
                b.add(n2.get(k));
                //System.out.println(n2.get(k));
            }
            
      
            
            V1.add(b);
           }
        
       // V1.add(n2);
      } 

      ArrayList<String> b_new = new ArrayList<>();
      ArrayList<ArrayList<String>> V2 = new ArrayList<>();
       
      for(ArrayList<String> s :V1){
      //System.out.println(r);
      for(String r :s){
        if(!b_new.contains(r)){
        //System.out.println(r);
        b_new.add(r);   
        }
     }
     
     V2.add(b_new);
    }

    
    
      int count = 0;
      int count_h = 0;
      for(int i=0;i<n;i++){
          if(a[i].equals("V")){
              if(a[i+1].equals("V") && (i+1)!=n){ 
                Total.add(V2.get(count));
                i=i+1;
                count++;
              }else{}
                  //Neglect
            }else if(a[i].equals("H")){
                Total.add(H.get(count));
                count_h++;
            }

          }
      

      int counter_h =0;
      int counter_v =0;

      int size_final = 
      ArrayList<ArrayList<String>> l1 = interset(Total);
      int size_final = l1.size();
      for(int i=0;i<l1.size();i++){
          ArrayList<String> ele = l1.get(i);
          if(H.contains(ele)){
              System.out.println(index_h[counter_h]);
              counter_h++;
          }else{
            System.out.println(index_v[counter_v]+" "+index_v[counter_v + 1]);
            counter_v++;
          }
      }

  }
      
    }
}
