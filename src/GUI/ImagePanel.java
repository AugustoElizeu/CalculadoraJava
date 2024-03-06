package GUI;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel{
	 private BufferedImage image;
	 private String path = "C:\\Users\\Augusto Elizeu\\Desktop\\Tudo\\Estudos\\Java\\Calculadora\\src\\GUI\\java.png";

	    public ImagePanel(String imagePath) {
	        try {
	            image = ImageIO.read(new File(path));
	        } catch (IOException e) {
	            System.out.println("Não achei a sua foto");
	        }
	    }
	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        if (image != null) {
	            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	        }
	    }

	    @Override
	    public Dimension getPreferredSize() {
	        if (image != null) {
	            return new Dimension(image.getWidth(), image.getHeight());
	        }
	        return super.getPreferredSize();
	    }
}
