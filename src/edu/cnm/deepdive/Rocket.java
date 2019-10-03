package edu.cnm.deepdive;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Rocket extends Application {

    int width = 10;
    int height = 30;
    int x = 0;
    int y = 0;
  Rectangle rectangle = new Rectangle(x, y, width, height);

  @Override
  public void start(Stage primaryStage) throws Exception {

    Group root = new Group(rectangle);
    Scene scene = scene(group, 300, 600)

  }
}
