import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

int x = 1;
int r = 10;
int b = 10;
int g = 10;

public void setup()
{
background(255,141,218);
size(400,400);
}

public void draw()
{
	stroke(255,255,255);
	fill(r,g,b);
	ellipse((int)(Math.random()*400),(int)(Math.random()*400),50,50);
	x=x+2;
	if (x == 300001) {
		background(r, b, g);
		r=r+10;
		g=g+10;
		b=b+10;
	}
}







  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
