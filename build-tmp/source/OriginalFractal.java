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

// private double fractionLength = .8; 
private double fractR = .8f;
// private int smallestBranch = 10; 
private int smallestCirc=5;
// private double branchAngle = .2;  
private double circAng=.3f;

public void setup() 
{   
	size(640,480);    
	//noLoop(); 
} 
public void draw() 
{   
    background(255);   
// 	stroke(0,255,0);   
// 	line(320,480,320,380);   
// 	drawBranches(320,380,10,3*(Math.PI/2)); 
    drawElf(mouseX,240,480,mouseX);
    fill(255);
    line(320,0,320,480);
} 
// public void drawBranches(int x,int y, double branchLength, double angle) 
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
// {   
// 	double angle1=angle+branchAngle;
// 	double angle2=angle-branchAngle;
// 	int endX1,endY1,endX2,endY2;
//     branchLength*=fractionLength;
//     endX1 = (int)(branchLength*Math.cos(angle1)+x);
//     endX2 = (int)(branchLength*Math.cos(angle2)+x);
//     endY1 = (int)(branchLength*Math.sin(angle1)+y);
//     endY2 = (int)(branchLength*Math.sin(angle2)+y);
//     line(x,y,endX1,endY1);
//     line(x,y,endX2,endY2);
//     if(branchLength>smallestBranch){
//     	drawBranches(endX1,endY1,branchLength-1,angle+Math.PI/3);
//     	drawBranches(endX2,endY2,branchLength-1,angle-Math.PI/4);
//     }
// }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
