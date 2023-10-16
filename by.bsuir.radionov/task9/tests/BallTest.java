import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class BallTest {
    @Test
    public void testBallProperties() {
        Ball ball = new Ball(1, Color.GREEN);

        assertEquals(1, ball.getVolume());
        assertEquals(Color.GREEN, ball.getColor());
    }
}