package projava;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class DiffSampleInherit {
    public static void main(String[] args) {
        var f = new JFrame("差分プログラミング");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        var img = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
        var g = img.createGraphics();
        g.setBackground(Color.WHITE);
        g.clearRect(0, 0, 600, 400);
        g.drawImage(lineImage(), 10,10,f);
        g.drawImage(rectImage(), 300,80,f);
        var label = new JLabel(new ImageIcon(img));
        f.add(label);
        f.pack();
        f.setVisible(true);
    }

    static BufferedImage lineImage() {
        return new LineDrawer().createImage();
    }

    static BufferedImage rectImage() {
        return  new RectDrawer().createImage();
    }

    static abstract class ImageDrawer {
        BufferedImage createImage() {
            var image = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
            var graphics = image.createGraphics();
            draw(graphics);
            return image;
        }

        abstract void draw(Graphics2D g);
    }

    static class LineDrawer extends ImageDrawer {
        @Override
        void draw(Graphics2D g) {
            g.drawRect(10,10, 300, 400);
        }
    }

    static class RectDrawer extends  ImageDrawer {

        @Override
        void draw(Graphics2D g) {
            g.drawRect(10,10,400,300);
        }
    }
}
