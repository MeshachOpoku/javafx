/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linemakingplusnotext;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author mesha
 */
public class Linemakingplusnotext extends Application {
     public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage web) {
    Group yell =new Group ();
      Scene spell =new Scene(yell,600,500,Color.RED);
      //CREATIMG AN OBJECT OF LINE 
      Line myLine =new Line ();
      myLine.setStartX( 0);
      myLine.setStartY(880);
      myLine.setEndX(50);
      myLine.setEndY(90) 
              ;
      myLine.setStrokeWidth(10);            myLine.setStroke(Color.WHITE);
 //CREATING AN OBJECT FOR TEXT
     Text thyText=new Text();
     thyText.setText("BETTER WAYS");
     thyText.setX(40);
     thyText.setY(490);
     thyText.setFont(Font.font("Verdana",100));
     
      yell.getChildren().add(thyText);
     
     
     
      yell.getChildren().add(myLine);
      web.setTitle ("LINE MAKING");
      web.setScene(spell);
      web.show();
       
    
    }
               
    }

    