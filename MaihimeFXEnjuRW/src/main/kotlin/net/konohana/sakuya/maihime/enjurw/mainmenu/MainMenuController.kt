package net.konohana.sakuya.maihime.enjurw.mainmenu

import javafx.application.Platform
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.stage.Stage
import net.konohana.sakuya.maihime.enjurw.MaihimeFXEnjuRWApplication
import kotlin.system.exitProcess

/**
 * ## FXMLコントローラークラス
 * * 業務メニュー画面
 * @author lafleurblanche
 */
class MainMenuController {

    @FXML
    private lateinit var menuLabel: Label

    @FXML
    private lateinit var  btn01: Button

    @FXML
    private fun onBtn01Click() {
        val stage = Stage()
        val fxmlLoader = FXMLLoader(MaihimeFXEnjuRWApplication::class.java.getResource("ticket01/ticket-01.fxml"))
        val scene = Scene(fxmlLoader.load(), 1200.0, 915.0)
        stage.title = "舞姫-乗車券発券システムBeta-"
        stage.scene = scene
        stage.show()
    }

    @FXML
    private fun onBtn02Click() {
        val stage = Stage()
        val fxmlLoader = FXMLLoader(MaihimeFXEnjuRWApplication::class.java.getResource("ticket02/ticket-02.fxml"))
        val scene = Scene(fxmlLoader.load(), 1200.0, 915.0)
        stage.title = "舞姫-乗車券発券システムBeta-"
        stage.scene = scene
        stage.show()
    }

    @FXML
    private fun onBtnExitClick() {
        Platform.exit()
        exitProcess(0)
    }
}
