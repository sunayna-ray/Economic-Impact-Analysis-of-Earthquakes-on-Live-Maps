package GUIModule;

import processing.core.PApplet;//https://processing.org/reference/

public class MyDisplay extends PApplet{
	public void setup(){
		size(400, 400); // size of window
		background(200,200,200);//change background colour
	}
	
	public void draw(){
		fill(255, 255, 0);
		ellipse(200, 200, 390, 390);//x,y of centre, xwidth and ywidth
		fill(0, 0, 0);
		ellipse(120, 130,50,70);
		ellipse(280, 130,50,70);
		noFill();
		arc(200, 280,75, 75,  0, PI); //x,y cordinate of start,xwidth,ywidth, start 
		//angle, end angle. Angle should be in radians.HALF_PI=90deg, QUARTER_PI=45deg
		//OPEN(Default), CHORD, PIE can be last parameter according to how we want.
	}

}
