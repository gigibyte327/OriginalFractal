 
private double fractR = .8;
private int smallestCirc=5;
private double circAng=.3;

public void setup() 
{   
	size(640,480);    
	noLoop(); 
} 
public void draw() 
{   
    background(255);   
    drawElf(320,240,480,mouseX);
    fill(255);
    line(320,0,320,480);
} 
public void drawElf(int x, int y, float circR, int blurb){
    int x1=x-10;
    int x2=x+10;
    fill((int)(Math.random()*25)+50,(int)(Math.random()*100)+25,blurb, circR/8);
    noStroke();
    ellipse(x,y,circR,circR);
    if(circR>5){
        drawElf(x1,y,circR/2,blurb);
        drawElf(x2,y,circR/2,blurb);
    }
}
