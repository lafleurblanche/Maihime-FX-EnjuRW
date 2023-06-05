package net.konohana.sakuya.maihime.enjurw;

import com.gluonhq.ignite.spring.SpringContext;
import java.io.IOException;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
    "com.gluonhq.ignite.spring",
    "net.konohana.sakuya.maihime.enjurw"
})
public class MaihimeFXEnjuRWCliApp extends Application {
    public static void main(String[] args) {
        Application.launch(MaihimeFXEnjuRWCliApp.class, args);
    }

    @Autowired
    private FXMLLoader loader;

    private final SpringContext context = new SpringContext(this);
    private ConfigurableApplicationContext ctx;

    @Override
    public void start(Stage stage) throws IOException {
        context.init(() -> ctx = SpringApplication.run(MaihimeFXEnjuRWCliApp.class));
        loader.setLocation(getClass().getResource("mainmenu/main-menu.fxml"));
        // アイコン設定
        Image icon = new Image(String.valueOf(getClass().getResource("image/8thicona2.png")));
        Parent primaryView = loader.load();
        stage.getIcons().add( icon );
        stage.setTitle("MaihimeFX:舞姫発券システム");
        stage.setScene(new Scene(primaryView));
        stage.show();
    }

    @Override
    public void stop() {
        Platform.exit();
        // Close this application context,
        // destroys all beans in its bean factory
        ctx.close();
    }
}
