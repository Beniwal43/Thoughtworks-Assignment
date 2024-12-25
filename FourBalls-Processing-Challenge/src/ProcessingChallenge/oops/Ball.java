package ProcessingChallenge.oops;

public class Ball {
    int x_pos;
    int y_pos;
    int speed;
    int diameter;

    public Ball(int ball, int windowHeight, int numberOfBalls) {
        this.x_pos = 0;
        this.y_pos = getY_pos(ball, windowHeight, numberOfBalls);
        this.speed = ball;
        this.diameter = 10;
    }

    private int getY_pos(int ball, int windowHeight, int numberOfBalls) {
        return (int) (windowHeight * ((float) ball / (numberOfBalls + 1)));
    }
}
