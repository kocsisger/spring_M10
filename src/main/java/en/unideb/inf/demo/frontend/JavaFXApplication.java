package en.unideb.inf.demo.frontend;

import en.unideb.inf.demo.SpringDataFxApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class JavaFXApplication extends Application {
    private ConfigurableApplicationContext ctx;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(
                getClass().getResource("/fxml/MainPage.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
        ctx = SpringApplication.run(SpringDataFxApplication.class);
    }

    @Override
    public void stop() throws Exception {
        ctx.close();
        super.stop();
    }
}
