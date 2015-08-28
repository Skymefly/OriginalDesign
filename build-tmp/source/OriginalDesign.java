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
public void setup()
{
background(255,255,255);
size(400,400);
frameRate(5000);
}

public void draw()
{
	int r = (int)(Math.random()*256);
	int b = (int)(Math.random()*256);
	int g = (int)(Math.random()*256);
	stroke(255,255,255);
	fill(r,g,b);
	ellipse((int)(Math.random()*400),(int)(Math.random()*400),50,50);
	
	x=x+2;
	mouse();
	if (x > 3500) {
			lines();
			mouse();
	}
}

public void lines()
{
	int r = (int)(Math.random()*256);
	int b = (int)(Math.random()*256);
	int g = (int)(Math.random()*256);
	stroke(r,g,b);
	line((int)(Math.random()*400),(int)(Math.random()*400),(int)(Math.random()*400),(int)(Math.random()*400));
}

public void mouse()
{
	fill(255,255,255);
	ellipse(mouseX, mouseY, (int)(Math.random()*100),(int)(Math.random()*100));
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
