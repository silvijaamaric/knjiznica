package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.*;

import java.io.IOException;

public class Main extends Application {

    private static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception{

        /*
        Teacher daniel = new Teacher();
        daniel.setFirstname("Daniel");
        daniel.setLastname("Vasic");
        daniel.setEmail("daniel.vasic@fpmoz.sum.ba");
        daniel.setPassword("1234");
        daniel.save();

        Teacher t = (Teacher) Teacher.get(Teacher.class, 1);
        t.setLastname("Vasić");
        t.update();

        Teacher t = (Teacher) Teacher.get(Teacher.class, 1);
        t.delete();


        Table.create(tip_korisnik.class);
        Table.create(korisnik.class);
        Table.create(autor.class);
        Table.create(knjiga.class);
        Table.create(rezervacija.class);
         */



        Main.primaryStage = primaryStage;
        Main.showWindow(
                getClass(),
                "../view/Login.fxml",
                "Prijavte se na sustav", 600, 215);
    }

    public static void showWindow(Class windowClass, String viewName, String title, int w, int h) throws IOException {
        Parent root = FXMLLoader.load(windowClass.getResource(viewName));
        primaryStage.setTitle(title);
        primaryStage.setScene(new Scene(root, w, h));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
