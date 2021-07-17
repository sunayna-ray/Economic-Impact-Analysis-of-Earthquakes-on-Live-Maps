package demos;

import processing.core.PApplet;
import processing.core.PImage;

/** 
 * A class to illustrate some use of the PApplet class
 * Used in module 3 of the UC San Diego MOOC Object Oriented Programming in Java
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * 
 *
 */
public class MyPApplet extends PApplet{
	PImage img;
	//setup runs once and draw runs on a loop
	
	public void setup() {
		//Add setup code for MyPApplet
		size(400,400);				//set canvas size
		background(255);			//set canvas color
		stroke(0);				//set pen color
		img = loadImage("palmTrees.jpg", "jpg"); //image loaded
		img.resize(0, height);			//resize loaded image to full height of canvas. 
		//width=0 matlab java will resize it according to height proportionally.
		//height is a dynamic variable and changes as we change window size.
		image(img, 0, 0);			//display image, 0,0 pr start hoga image 
	}
	
	public void draw() {
		//Add drawing code for MyPApplet
		int[] color = sunColorSec(second());		//calculate color code for sun in RGB values
		//second() returns the number of seconds that have elapsed since the last minute
		//similiarly minute() and hour()
		fill(color[0],color[1],color[2]);	//set sun color
		ellipse(width/4,height/5,width/4,height/5);	//draw sun with dynamic variables.
		//ellipse is library method to draw ellipse.
		
	}
	
	/** Return the RGB color of the sun at this number of seconds in the minute */
	public int[] sunColorSec(float seconds)
	{
		int[] rgb = new int[3];
		// Scale the brightness of the yellow based on the seconds.  0 seconds 
		// is bright yellow.  30 seconds is black.
		float diffFrom30 = Math.abs(30-seconds);
		
		float ratio = diffFrom30/30;
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[2] = 0;
		
		//System.out.println("R" + rgb[0] + " G" + rgb[1] + " B" + rgb[2]);
		return rgb;
	}	
	
	public static void main (String[] args) {
		//Add main method for running as application
		PApplet.main(new String[] {"--present", "MyPApplet"});
	}
}