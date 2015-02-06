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

public class OriginalFractal extends PApplet {

 
private double fractR = .8f;
private int smallestCirc=5;
private double circAng=.3f;

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
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
