package net.konohana.sakuya.maihime.enjurw.inquiry

import javafx.fxml.FXML
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import javafx.scene.web.WebView
import javafx.stage.Stage

/**
 * ## FXMLコントローラクラス
 * * 乗車駅照会メニュー画面
 * @author lafleurblanche
 */
class FromStaInquiryController {
    @FXML
    private lateinit var stacodeInquiryLabel: Label

    @FXML
    private lateinit var  btn01: Button

    @FXML
    private lateinit var  btn02: Button

    @FXML
    private lateinit var  btn03: Button

    @FXML
    private lateinit var  btn04: Button

    @FXML
    private lateinit var  btn05: Button

    @FXML
    private lateinit var  btn06: Button

    @FXML
    private lateinit var  btn07: Button

    @FXML
    private lateinit var  btn08: Button

    @FXML
    private fun onBtn01Click() {
        // WebViewの宣言
        val webView = WebView()
        val webEngine = webView.engine
        webEngine.isJavaScriptEnabled = true
        webEngine.load("http://localhost:8080/")

        val vbox = VBox()
        vbox.children.addAll(webView)
        val stage = Stage()
        val scene = Scene(vbox)
        stage.width = 400.0
        stage.height = 650.0
        stage.title = ""
        stage.scene = scene
        stage.show()
    }

    @FXML
    private fun onBtn02Click() {
    }

    @FXML
    private fun onBtn03Click() {
    }

    @FXML
    private fun onBtn04Click() {
    }

    @FXML
    private fun onBtn05Click() {
    }
}
