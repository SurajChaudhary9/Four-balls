import processing.core.PApplet;
public class FourBalls extends PApplet{
    
public static final int WIDTH = 750;
    public static final int HEIGHT = 500;
    public static final int DIAMETER_OF_CIRCLE = 15;

    //Speed, height and starting of ball1,ball2, ball3, ball4
    int startOfBall1,startOfBall2,startOfBall3,startOfBall4 = 0;
    int speed1 = 1,speed2 = 2,speed3 = 3,speed4 = 4;
    int heightOfBall1 = HEIGHT / 5, heightOfBall2 = HEIGHT * 2 / 5, heightOfBall3 = HEIGHT * 3 / 5, heightOfBall4 = HEIGHT * 4 / 5;

    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();
    }

    //    for ball1
    private void drawCircle1() {
        ellipse(startOfBall1, heightOfBall1, DIAMETER_OF_CIRCLE,DIAMETER_OF_CIRCLE);
        startOfBall1 += speed1;
    }

    //    for ball2
    private void drawCircle2(){
        ellipse(startOfBall2,heightOfBall2,DIAMETER_OF_CIRCLE,DIAMETER_OF_CIRCLE);
        startOfBall2 += speed2;
    }

    //    for ball3
    private void drawCircle3(){
        ellipse(startOfBall3,heightOfBall3,DIAMETER_OF_CIRCLE,DIAMETER_OF_CIRCLE);
        startOfBall3 += speed3;
    }

    //    for ball4
    private void drawCircle4(){
        ellipse(startOfBall4,heightOfBall4,DIAMETER_OF_CIRCLE,DIAMETER_OF_CIRCLE);
        startOfBall4 += speed4;
    }
}

