package tuto;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import tuto.controller.ClientController;
import tuto.model.Client;

import java.io.IOException;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;

    //data as observable list
    private ObservableList<Client> clientData = FXCollections.observableArrayList();

    public MainApp() {
        clientData.add(new Client("Brice","Beumier"));
    }

    @Override
    public void start(Stage primaryStage){
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle(" Test java fx => client sgbd");

        initRootLayout();
        showPersonOverview();
    }

    private void initRootLayout() {
        try{
            // load root layout from fxml file
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("/tuto/view/RootLayout.fxml"));
            System.out.println(MainApp.class.getResource("/tuto/view/RootLayout.fxml"));
            rootLayout = loader.load();

            //show the scene containing the route layout
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //shows the person overview inside the root layout
    private void showPersonOverview() {
        try {
            //load person overview
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("/tuto/view/PersonOverview.fxml"));
            AnchorPane personOverview = loader.load();

            //set person overview into the center of root layout
            rootLayout.setCenter(personOverview);

            //give the controller access to the main class
            ClientController controller = loader.getController();
            controller.setMain(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public ObservableList<Client> getClientData(){
        return clientData;
    }
    public static void main(String[] args) {
        launch(args);
    }
}
