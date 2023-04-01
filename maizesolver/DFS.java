

import java.util.List;

public class DFS {
    
    public static boolean searchpaths(int[][]maize,int x,int y,List<Integer> path){
        if(maize[x][y] == 9){
            path.add(x);
            path.add(y);
            return true;
        }

        if(maize[x][y] == 0){
            maize[x][y] = 2;
        
            int dx = 0;
            int dy = -1;

            if(searchpaths(maize,x+dx,y+dy,path)){
                path.add(x);
                path.add(y);
                return true;
            }

            dx = 0;
            dy = 1;

            if(searchpaths(maize,x+dx,y+dy,path)){
                path.add(x);
                path.add(y);
                return true;
            }

            dx = -1;
            dy = 0;

            if(searchpaths(maize,x+dx,y+dy,path)){
                path.add(x);
                path.add(y);
                return true;
        }

            dx = 1;
            dy = 0;

            if(searchpaths(maize,x+dx,y+dy,path)){
                path.add(x);
                path.add(y);
                return true;
            }
        }

        return false;
    }

}
