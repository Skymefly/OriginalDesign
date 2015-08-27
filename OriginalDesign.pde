int x = 1;
void setup()
{
background(255,255,255);
size(400,400);
frameRate(5000);
}

void draw()
{
	int r = (int)(Math.random()*256);
	int b = (int)(Math.random()*256);
	int g = (int)(Math.random()*256);
	stroke(255,255,255);
	fill(r,g,b);
	ellipse((int)(Math.random()*400),(int)(Math.random()*400),50,50);
	fill(255,255,255);
	ellipse(mouseX, mouseY, 50,50);
	x=x+2;
	if (x > 30000) {
			lines();
	}
}

void lines()
{
	int r = (int)(Math.random()*256);
	int b = (int)(Math.random()*256);
	int g = (int)(Math.random()*256);
	stroke(r,g,b);
	line((int)(Math.random()*400),(int)(Math.random()*400),(int)(Math.random()*400),(int)(Math.random()*400));
}





