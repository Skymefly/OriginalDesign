int x = 1;
int r = 10;
int b = 10;
int g = 10;

void setup()
{
background(255,141,218);
size(400,400);
}

void draw()
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







