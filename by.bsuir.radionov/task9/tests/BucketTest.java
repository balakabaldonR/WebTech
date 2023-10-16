import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class BucketTest {
    private Bucket bucket;

    @BeforeEach
    void setUp() {
        bucket = new Bucket(22);
    }

    @Test
    void testAddBall() {
        Ball ball1 = new Ball(1, Color.GREEN);
        Ball ball2 = new Ball(2, Color.BLUE);

        assertTrue(bucket.addBall(ball1));
        assertTrue(bucket.addBall(ball2));
        assertFalse(bucket.addBall(null));

        assertEquals(3, bucket.countWeight());
    }

    @Test
    void testAddBallOverflow() {
        Ball ball1 = new Ball(1, Color.GREEN);
        Ball ball2 = new Ball(2, Color.BLUE);

        assertTrue(bucket.addBall(ball1));
        assertTrue(bucket.addBall(ball2));
        assertFalse(bucket.addBall(new Ball(20, Color.RED)));

        assertEquals(3, bucket.countWeight());
    }

    @Test
    void testCountBlue() {
        Ball ball1 = new Ball(1, Color.GREEN);
        Ball ball2 = new Ball(2, Color.BLUE);
        Ball ball3 = new Ball(3, Color.GREEN);
        Ball ball4 = new Ball(13, Color.GREEN);

        bucket.addBall(ball1);
        bucket.addBall(ball2);
        bucket.addBall(ball3);
        bucket.addBall(ball4);

        assertEquals(1, bucket.countBlue());
    }
}