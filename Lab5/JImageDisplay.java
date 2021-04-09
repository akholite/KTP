import javax.swing.*;
import java.awt.*;
import java.awt.image.*;

public class JImageDisplay extends JComponent {

    private BufferedImage buffImage;

    public JImageDisplay(int width, int height) {
        buffImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        super.setPreferredSize(new Dimension(width, height));
    }

    public BufferedImage getImage() {
        return buffImage;
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(buffImage, 0, 0, buffImage.getWidth(),
                buffImage.getHeight(), null);
    }

    public void ClearImage() {
        int m = buffImage.getWidth();
        int n = buffImage.getHeight();
        Color black = new Color(0,0,0);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                buffImage.setRGB(i, j, black.getRGB());
        }
    }

    public void drawPixel(int x, int y, int rgbColor) {
        buffImage.setRGB(x, y, rgbColor);
    }
}
