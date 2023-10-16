import java.awt.*;

public class Ball {
    private int volume;
    private Color color;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Ball(int volume, Color color) {
        this.volume = volume;
        this.color = color;
    }
}
