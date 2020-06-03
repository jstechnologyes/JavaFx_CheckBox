
package checkbox;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class CheckBoxDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hbox= new HBox();
        hbox.setMinWidth(300);
        hbox.setMinHeight(300);
        
        
        VBox vbox1= new VBox();
        vbox1.setMinWidth(200);
        
        VBox vbox2 = new VBox();
        vbox2.setMinWidth(200);
        
        Label lbl1= new Label("All Fruts");
        Label lb12= new Label("Seclect Fruits");
        
        CheckBox c1= new CheckBox("Apple");
        CheckBox c2= new CheckBox("Orange");
        CheckBox c3= new CheckBox("Banana");
        CheckBox c4= new CheckBox("Lichi");
        
        vbox1.getChildren().addAll(lbl1, c1, c2, c3, c4);
        vbox2.getChildren().addAll(lb12);
        
        c1.setOnAction(e->checkBoxAction(c1,vbox1,vbox2));
        c2.setOnAction(e->checkBoxAction(c2,vbox1,vbox2));
        c3.setOnAction(e->checkBoxAction(c3,vbox1,vbox2));
        c4.setOnAction(e->checkBoxAction(c4,vbox1,vbox2));
        
       
        
        hbox.getChildren().addAll(vbox1,vbox2);
        
        Scene scene =new Scene(hbox);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
        
        
    }
    
     void checkBoxAction(CheckBox c, VBox vbox1, VBox vbox2)
         {
             if(c.isSelected()){
                  vbox2.getChildren().add(c);
             }
             else if(!c.isSelected()){
                 vbox1.getChildren().add(c);
             }
            
         }
    
}
