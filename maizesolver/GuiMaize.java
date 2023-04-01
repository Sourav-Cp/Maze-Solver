import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class GuiMaize extends JFrame{
    
    private int [][] maize =
    {
        {1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,1,0,1,0,1,0,0,0,0,0,1},
        {1,0,1,0,0,0,1,0,1,1,1,0,1},
        {1,0,1,1,1,1,1,0,0,0,0,0,1},
        {1,0,0,1,0,0,0,0,1,1,1,0,1},
        {1,0,1,0,1,1,1,0,1,0,0,0,1},
        {1,0,1,0,1,0,0,0,1,1,1,0,1},
        {1,0,1,0,1,1,1,0,1,0,1,0,1},
        {1,0,0,0,0,0,0,0,0,0,1,9,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1}
    };
    public List<Integer> path = new ArrayList<>();

    public GuiMaize(){
        setTitle("Maize Solver");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DFS.searchpaths(maize,1,1,path);
    }

    @Override
    public void paint(Graphics g){

        g.translate(50,50);

        for(int i=0;i<maize.length;i++){
            for(int j=0;j<maize[0].length;j++){
                Color color;
                switch (maize[i][j]){
                    case 1 : color = Color.BLACK;break;
                    case 9 : color = Color.RED;break;
                    default : color = Color.WHITE;break;
                }

                g.setColor(color);
                g.fillRect(30*i, 30*j, 30, 30);
                g.setColor(Color.red);
                g.drawRect(30*i, 30*j, 30, 30);
            }
        }

        for(int i=0;i<path.size();i=i+2){
            int pathx = path.get(i);
            int pathy = path.get(i+1);

            g.setColor(Color.green);
            g.fillRect(30*pathx, 30*pathy, 30, 30);
        }
    }
    
    public static void main(String args[]){
        GuiMaize view = new GuiMaize();
        view.setVisible(true);
    }
}
