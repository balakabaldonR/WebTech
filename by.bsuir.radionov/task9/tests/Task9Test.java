import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task9Test {

    @Test
    void testTask9Main() {
        Ball ball1 = new Ball(1, Color.GREEN);
        Ball ball2 = new Ball(2, Color.BLUE);
        Ball ball3 = new Ball(3, Color.GREEN);
        Ball ball4 = new Ball(13, Color.GREEN);

        Bucket bucket = new Bucket(22);

        bucket.addBall(ball1);
        bucket.addBall(ball2);
        bucket.addBall(ball3);
        bucket.addBall(ball4);

        assertEquals(1, bucket.countBlue());
    }

    @Test
    void testTask9EmptyBucket() {
        Bucket bucket = new Bucket(22);

        assertEquals(0, bucket.countBlue());
    }

    @Test
    void testTask9NullBall() {
        Bucket bucket = new Bucket(22);

        bucket.addBall(null);
        assertEquals(0, bucket.countWeight());
    }

    @Test
    void testTask9Overflow() {
        Bucket bucket = new Bucket(5);

        Ball ball1 = new Ball(1, Color.GREEN);
        Ball ball2 = new Ball(2, Color.BLUE);

        bucket.addBall(ball1);
        bucket.addBall(ball2);
        bucket.addBall(new Ball(4, Color.RED));

        assertEquals(3, bucket.countWeight());
    }

    @Test
    void testTask9UnderCapacity() {
        Bucket bucket = new Bucket(10);

        Ball ball1 = new Ball(2, Color.GREEN);
        Ball ball2 = new Ball(3, Color.BLUE);

        bucket.addBall(ball1);
        bucket.addBall(ball2);

        assertEquals(5, bucket.countWeight());
    }
}