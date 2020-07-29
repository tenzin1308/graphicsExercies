/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicsexercies;

/**
 *
 * @author tenzintashi
 */
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsExercies extends JPanel{

    /**
     * @param args the command line arguments
     */
    private Point lastPoint;
    public GraphicsExercies(){
        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                lastPoint = new Point(e.getX(), e.getY());
            }
        });
        addMouseMotionListener(new MouseAdapter(){
        public void mouseDragged(MouseEvent e){
                Graphics g = getGraphics();
                g.drawLine(lastPoint.x, lastPoint.y,e.getX(),e.getY());
                g.dispose();
            }
        });
    }
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Try");
        frame.getContentPane().add(new GraphicsExercies(), BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setVisible(true);
    }
    
}
