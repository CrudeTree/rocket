package edu.cnm.deepdive.model;

public class Rocket {

  // Rocket Position
  private double x;
  private double y;
  private double xVelocity;
  private double yVelocity;
  private double gravity = 10;

  public void step() {
    x += xVelocity;
    y += yVelocity;
  }


  public void accelerate(double xChange, double yChange) {
    xVelocity += xChange;
    yVelocity += yChange - gravity;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }
}
