import java.util.ArrayList;
import java.util.*;

class subgraph{
    public static void main(String[] args) {
     
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int max = 0;
        for(int i=0;i<size;i++){
            ArrayList<Integer> l2 = new ArrayList<>();
            for(int j=0;j<2;j++){
                int input =scan.nextInt();
               
                l2.add(input);
                if(l1.isEmpty() || !l1.contains(input)){
                    l1.add(input);
                }
            }
            list.add(l2);
        }
        int graph[][] = new int[l1.size()][l1.size()];
        for(int i=0;i<l1.size();i++){
            for(int j=0;j<l1.size();j++){
              if(i==j){
                  graph[i][j] = 1;
              }else{
                graph[i][j] = 0;
              } 
            }   
        }
        
        for(int i=0;i<list.size();i++){
            ArrayList<Integer> l2 = list.get(i);
            int ind = l1.indexOf(l2.get(0));
            int ind2 =l1.indexOf(l2.get(1));
            //System.out.println(ind+" "+ind2);
            graph[ind][ind2] = 1;
            
         }
         for(int i=0;i<l1.size();i++){
            for(int j=0;j<l1.size();j++){
            // System.out.print(graph[i][j]);
            }   
          // System.out.println(); 
        }
        list.clear();
        for(int i=0;i<l1.size();i++){
            ArrayList<Integer> l3 = new ArrayList<>();
            l3.add(l1.get(i));
            list.add(l3);
            for(int j=i+1;j<l1.size();j++){
            ArrayList<Integer> l2 = new ArrayList<>();
            int c = l1.get(i);
            int d = l1.get(j);
            l2.add(c);
            l2.add(d);
            list.add(l2);
           // System.out.println(list);
           
            
        }  
         
        }
        int count = 0;
        for(int i=0;i<list.size();i++){
            ArrayList<Integer> l2 = list.get(i);
            if(l2.size() == 1){
                int c = l2.get(0);
                int in = l1.indexOf(c);
                //System.out.println(c+" "+in);
                if(graph[in][in]==1){
                    count++;
                }
            }else{
                int c = l2.get(0);
                int d = l2.get(1);
                int ind = l1.indexOf(c);
                int ind2 = l1.indexOf(d);
                //System.out.println(c+","+d+"  "+ind+","+ind2);
                if(graph[ind][ind2]==1){
                    count++;
                }
            }
        }


        System.out.println(count);
      
    }

}


/*
4
1 2
2 3
3 4
4 1

[1,2,3,4]
[1][2][3][4][1,2][1,3][1,4][2,3][2,4][3,4]
*/