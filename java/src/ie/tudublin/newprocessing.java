package ie.tudublin;

import processing.core.PApplet;

public class newprocessing extends PApplet{

    public void settings()
    {
        size(500,500);
    }
    public void setup()
    {

    }
    float x1,y1,x2,y2;
    float x1dir,y1dir,x2dir,y2dir;
    float c = 0;
    public void draw()
    {
        background(255,102,150);
        stroke(255,255,255);
        circle(180, 150, 150);
        circle(300, 150, 150);
        triangle(100, -200, 100, -200, 240, 100);
        
    }
}
