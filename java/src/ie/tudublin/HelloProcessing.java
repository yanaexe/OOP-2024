package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(279, 328);
	}

	public void setup() {
		colorMode(HSB);
		background(0);

		x1 = random(0, width);
		x2 = random(0, width);
		y1 = random(0, height);
		y2 = random(0, height);

		float range = 6;

		x1dir = random(-range, range);
		x2dir = random(range, range);
		y1dir = random(-range, range);
		y2dir = random(range, range);

		smooth();
		
	}

	float x1, y1, x2, y2;
	float x1dir, x2dir, y1dir, y2dir;
	float c = 0;
	
	public void draw()
	{	
		strokeWeight(2);
		stroke(c, 255, 255);
		c = (c + 2f) % 255;
		//rect(x1, y1, x2, y2);
		image(loadImage("C:\\Users\\Anhre\\OneDrive\\Pictures\\Screenshots\\Screenshot_20230123_152603.png"),0,0);

		x1 += x1dir;
		x2 += x2dir;
		y1 += y1dir;
		y2 += y2dir;
		
		if (x1 < 0 || x1 > width)
		{
			x1dir = - x1dir;
		}
		if (y1 < 0 || y1 > height)
		{
			y1dir = - y1dir;
		}

		if (x2 < 0 || x2 > width)
		{
			x2dir = - x2dir;
		}
		if (y2 < 0 || y2 > height)
		{
			y2dir = - y2dir;
		}
	}
}
