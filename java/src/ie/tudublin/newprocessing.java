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
        circle(182, 151, 150);
        circle(298, 151, 150);
        triangle(135, 210, 240, 340,345,210);
        rect(170, 120, 140, 120);   
    }
}
