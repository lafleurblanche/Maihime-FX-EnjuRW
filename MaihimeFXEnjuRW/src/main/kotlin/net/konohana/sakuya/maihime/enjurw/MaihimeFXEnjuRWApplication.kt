package net.konohana.sakuya.maihime.enjurw

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class MaihimeFXEnjuRWApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(MaihimeFXEnjuRWApplication::class.java.getResource("mainmenu/main-menu.fxml"))
        val scene = Scene(fxmlLoader.load(), 1200.0, 915.0)
        stage.title = "発券システム(仮)"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(MaihimeFXEnjuRWApplication::class.java)
}
