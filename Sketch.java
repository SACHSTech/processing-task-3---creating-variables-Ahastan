import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(66, 135, 245);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Object using random locations
    
    float circleX = 200;
    float circleY = 200;
    float circleSize = 200;
    float circleDiameter = 200;
    float lineX1 = 200;
    float lineY1 = 200;
    float lineX2 = random(0, 800);
    float lineY2 = random(0, 800);
    
    // stroke(230, 255, 8);
    // fill(230, 255, 8);
    // ellipse(circleX, circleY, circleSize, circleDiameter);
    

    //Clock
    stroke(230, 255, 8);
    fill(230, 255, 8);
    ellipse(circleX, circleY, circleSize, circleDiameter);

    stroke(66, 135, 245);
    line(lineX1, lineY1, lineX2, lineY2);
  }
  
  // define other methods down here.
}