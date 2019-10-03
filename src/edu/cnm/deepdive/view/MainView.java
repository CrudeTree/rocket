package edu.cnm.deepdive.view;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MainView extends Application {


  @Override
  public void start(Stage stage) {
    stage.setScene(createScene());
    stage.setTitle("RocketBox");
    stage.show();
  }

  private Scene createScene() {
    Group root = new Group(new Circle());
    Scene scene = new Scene(root, 1000, 1000);
    return scene;
  }

}
