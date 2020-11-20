package LoginForm;

import javafx.application.Application;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView; 
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginForm extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage FirstStage) throws FileNotFoundException {
        FirstStage.setTitle("JavaFX Login Form");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Image image = new Image(new FileInputStream("https://picsum.photos/200"));
        ImageView imageView = new ImageView(image);
            imageView.setX(50); 
            imageView.setY(25);
            imageView.setFitHeight(50); 
            imageView.setFitWidth(50);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        btn.setOnAction((ActionEvent e) -> {
            actiontarget.setFill(Color.FIREBRICK);
            actiontarget.setText("login Successful");
        });

        Scene scene = new Scene(grid, 300, 275);
        FirstStage.setScene(scene);
        FirstStage.show();
    }
}