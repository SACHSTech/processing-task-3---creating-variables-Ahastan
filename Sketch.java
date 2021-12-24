import processing.core.PApplet;

public class Sketch extends PApplet {

  public float rectX = random(0, 300);
  public float rectY = random(0, 300);
  public float circleX1 = rectX + 10;
  public float circleY1 = rectY;
  public float circleX2 = rectX - 20;
  public float circleY2 = rectY;
  public float circleX3 = rectX + 40;
  public float circleY3 = rectY;
  public float circleX4 = rectX + 10;
  public float circleY4 = rectY - 30;

  
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
    
    //sand
    stroke(240,230,140);
    fill(240,230,140);
    rect(0,height/1.6f, width, height-100);
    
  //  grass
    stroke(55, 135, 39);
    fill(55, 135, 39);
    bezier(width,height/2, width, height/0.8f, width/0.8f, height/0.8f, width/2, height);
    
  //  sun
    stroke(230, 255, 8);
    fill(230, 255, 8);
    ellipse(0, 0, height/2, width/2);

    // tree
    stroke(165,42,42);
    fill(165,42,42);
    rect(rectX, rectY, width/20, height/2.7f);
    
    stroke(45, 201, 14);
    fill(45, 201, 14);
    ellipse(circleX1 , circleY1 , width/8 , height/8);
    
    stroke(45, 201, 14);
    fill(45, 201, 14);
    ellipse(circleX2, circleY2 , width/8 , width/8);
    
    stroke(45, 201, 14);
    fill(45, 201, 14);
    ellipse(circleX3, circleY3 , width/8 , height/8);
    
    stroke(45, 201, 14);
    fill(45, 201, 14);
    ellipse(circleX4, circleY4, width/8, height/8);
  
    
    //declaring variables for tree
    

  }
  
  // define other methods down here.
}