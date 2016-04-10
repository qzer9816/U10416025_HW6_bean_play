//U10416025

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class BeanGame extends Application {
   @Override
   public void start(Stage primaryStage) {
   	//new pane
	Pane pane = new Pane();
	Polyline polyline = new Polyline();
	//get line
	pane.getChildren().add(polyline);
	//set the dots of lines
	ObservableList<Double> list = polyline.getPoints();
	
	list.add(90.0);
	list.add(35.0);

	list.add(90.0);
	list.add(65.0);

	list.add(20.0);
	list.add(165.0);
	
	list.add(20.0);
	list.add(200.0);

	list.add(40.0);
	list.add(200.0);
	list.add(40.0);
	list.add(165.0);
	list.add(40.0);
	list.add(200.0);

	list.add(60.0);
	list.add(200.0);
	list.add(60.0);
	list.add(165.0);
	list.add(60.0);
	list.add(200.0);

	list.add(80.0);
	list.add(200.0);
	list.add(80.0);
	list.add(165.0);
	list.add(80.0);
	list.add(200.0);

	list.add(100.0);
	list.add(200.0);
	list.add(100.0);
	list.add(165.0);
	list.add(100.0);
	list.add(200.0);

	list.add(120.0);
	list.add(200.0);
	list.add(120.0);
	list.add(165.0);
	list.add(120.0);
	list.add(200.0);

	list.add(140.0);
	list.add(200.0);
	list.add(140.0);
	list.add(165.0);
	list.add(140.0);
	list.add(200.0);

	list.add(160.0);
	list.add(200.0);
	list.add(160.0);
	list.add(165.0);
	list.add(160.0);
	list.add(200.0);

	list.add(180.0);
	list.add(200.0);
	
	list.add(180.0);
	list.add(165.0);

	list.add(110.0);
	list.add(65.0);

	list.add(110.0);
	list.add(35.0);
		
	//add the dots of bean game
	Ellipse e1 = new Ellipse(40,165,3,3);
	e1.setFill(Color.BLACK);
	
	Ellipse e2 = new Ellipse(60,165,3,3);
	e2.setFill(Color.BLACK);

	Ellipse e3 = new Ellipse(80,165,3,3);
	e3.setFill(Color.BLACK);

	Ellipse e4 = new Ellipse(100,165,3,3);
	e4.setFill(Color.BLACK);		

	Ellipse e5 = new Ellipse(120,165,3,3);
	e5.setFill(Color.BLACK);
		
	Ellipse e6 = new Ellipse(140,165,3,3);
	e6.setFill(Color.BLACK);

	Ellipse e7 = new Ellipse(160,165,3,3);
	e7.setFill(Color.BLACK);

	Ellipse e8 = new Ellipse(50,150,3,3);
	e8.setFill(Color.BLACK);

	Ellipse e9 = new Ellipse(70,150,3,3);
	e9.setFill(Color.BLACK);

	Ellipse e10 = new Ellipse(90,150,3,3);
	e10.setFill(Color.BLACK);

	Ellipse e11 = new Ellipse(110,150,3,3);
	e11.setFill(Color.BLACK);

	Ellipse e12 = new Ellipse(130,150,3,3);
	e12.setFill(Color.BLACK);

	Ellipse e13 = new Ellipse(150,150,3,3);
	e13.setFill(Color.BLACK);

	Ellipse e14 = new Ellipse(60,135,3,3);
	e14.setFill(Color.BLACK);

	Ellipse e15 = new Ellipse(80,135,3,3);
	e15.setFill(Color.BLACK);

	Ellipse e16 = new Ellipse(100,135,3,3);
	e16.setFill(Color.BLACK);

	Ellipse e17 = new Ellipse(120,135,3,3);
	e17.setFill(Color.BLACK);

	Ellipse e18 = new Ellipse(140,135,3,3);
	e18.setFill(Color.BLACK);

	Ellipse e19 = new Ellipse(70,120,3,3);
	e19.setFill(Color.BLACK);

	Ellipse e20 = new Ellipse(90,120,3,3);
	e20.setFill(Color.BLACK);

	Ellipse e21 = new Ellipse(110,120,3,3);
	e21.setFill(Color.BLACK);

	Ellipse e22 = new Ellipse(130,120,3,3);
	e22.setFill(Color.BLACK);

	Ellipse e23 = new Ellipse(80,105,3,3);
	e23.setFill(Color.BLACK);

	Ellipse e24 = new Ellipse(100,105,3,3);
	e24.setFill(Color.BLACK);

	Ellipse e25 = new Ellipse(120,105,3,3);
	e25.setFill(Color.BLACK);

	Ellipse e26 = new Ellipse(90,90,3,3);
	e26.setFill(Color.BLACK);

	Ellipse e27 = new Ellipse(110,90,3,3);
	e27.setFill(Color.BLACK);
		
	Ellipse e28 = new Ellipse(100,75,3,3);
	e28.setFill(Color.BLACK);
		
	//get the dots of bean game
	pane.getChildren().addAll(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,
		e17,e18,e19,e20,e21,e22,e23,e24,e25,e26,e27,e28);
		
	//set scene and title
	Scene scene = new Scene(pane, 200 , 250 );
       	primaryStage.setScene(scene);
      	primaryStage.setTitle("Bean Game");
        primaryStage.show();
   }
}
