package _03_FXML;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppFXML extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		String arquivoCSS = getClass().getResource("/_03_FXML/Login.css").toExternalForm();
		
		//carregando a interface grafica
		URL arquivoFXML = getClass().getResource("/_03_FXML/Login.fxml");
		
		//lendo arquivo
		GridPane raiz =  FXMLLoader.load(arquivoFXML);
		
		//criando a cena
		Scene cena = new Scene(raiz, 300, 300);
		
		cena.getStylesheets().add(arquivoCSS);
		
		//desabilitando o redimencionamento da tela
		primaryStage.setResizable(false);
		
		primaryStage.setTitle("Tela de Login");
		
		primaryStage.setScene(cena);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
