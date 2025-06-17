package com.mycompany.quizapp;

import com.pah.utils.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class PrimaryController {
    public void handleQuestionManagement(ActionEvent event) throws IOException
    {
       // MyAlert.getInstance().showMsg("Question: Coming soon");
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("Questions.fxml")).load());
        
        Stage stage=new Stage();
        stage.setScene(scene);
        stage.setTitle("Quiz App");
        stage.show();
    }
    public void handlePracticeManagement(ActionEvent event)
    {
        MyAlert.getInstance().showMsg("Practice: Coming soon");
    }
}
