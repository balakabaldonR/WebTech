import java.awt.*;
import java.util.ArrayList;

public class Bucket {
    private int capacity;
    private int realWeight;
    private ArrayList<Ball> bucketArrayList = new ArrayList<Ball>(capacity);

    public Bucket(int capacity) {
        this.capacity = capacity;
    }

    public Bucket(ArrayList<Ball> bucketArrayList) {
        this.bucketArrayList = bucketArrayList;
    }

    public boolean addBall(Ball ball) {
        if (ball == null) {
            System.out.println("Exception");
            return false;
        }
        if (realWeight + ball.getVolume() <= capacity) {
            bucketArrayList.add(ball);
            realWeight += ball.getVolume();
            return true;
        } else {
            System.out.println("Exception");
            return false;
        }
    }

    public int countBlue() {
        int k = 0;

        for (Ball ball : bucketArrayList) {
            if (ball.getColor().equals(Color.BLUE)) {
                k++;
            }
        }

        return k;
    }

    public int countWeight() {
        return realWeight;
    }
}
