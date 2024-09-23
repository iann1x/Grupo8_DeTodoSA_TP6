package detodosa;


import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class EscritorioPersonalizado extends JDesktopPane {
    private BufferedImage img;

    public EscritorioPersonalizado() {
    try{
        img = ImageIO.read(getClass().getResourceAsStream("/Imagenes/background.jpg"));
                }catch (Exception ex){
                ex.printStackTrace();
                }
    }
    
    @Override
    protected void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawImage(img, 0, 0,1600,1000, null);
    }
    }

    
    

