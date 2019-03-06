package com.paraparp.javafx.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@SpringBootApplication
public class Main extends Application {

	private ConfigurableApplicationContext springContext;

	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("/views/formulario.fxml"));

		Scene scene = new Scene(root);

		primaryStage.setScene(scene);

		primaryStage.show();

	}

	public static void main(String[] args) {

		launch(args);

	}

	@Override
	public void init() {
		springContext = SpringApplication.run(getClass());
		springContext.getAutowireCapableBeanFactory().autowireBean(this);
	}

	@Override
	public void stop() throws Exception {
		super.stop();
		springContext.close();
	}

}