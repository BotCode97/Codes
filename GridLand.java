import java.util.*;
class GridLand{

        //Cloudera Online Round

    ArrayList<String> path = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> answer = new ArrayList<>();
        int s = scan.nextInt();
        for(int i=0;i<s;i++){
            
            int x = scan.nextInt();
            int y = scan.nextInt();
            int k = scan.nextInt();
            GridLand sol = new GridLand();
        sol.traverse(2, 2, 0, 0,"");
        answer.add(sol.path.get(k));
        sol.path.clear();
        }
        System.out.println(answer.toString());
 
    }


    public void traverse(int x,int y,int xs,int ys,String dir){
        //System.out.println(count +"  "+xs+","+ys);
        if(xs==x && ys==y){
            path.add(dir);
        }    
        if(xs>x || ys >y ){
            
        }else{
            traverse(x, y, xs+1, ys,dir+"H");
            traverse(x, y, xs, ys+1,dir+"V"); 
        }
    }



}
/*
                                               0,0
                                        0,1                 1,0
                                0,2          1,1        2,0     1,1
                            0,3    1,2     1,2  2,1   3,0  2,1   X
*/                                    