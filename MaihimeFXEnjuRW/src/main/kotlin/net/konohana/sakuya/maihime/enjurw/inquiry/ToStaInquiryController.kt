package net.konohana.sakuya.maihime.enjurw.inquiry

import javafx.fxml.FXML
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import javafx.scene.web.WebView
import javafx.stage.Stage
import net.konohana.sakuya.maihime.enjurw.constant.webview.WebViewUrlConst

/**
 * ## FXMLコントローラクラス
 * * 降車駅照会メニュー画面
 * @author lafleurblanche
 */
class ToStaInquiryController {
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
    private lateinit var  btn09: Button

    @FXML
    private lateinit var  btn10: Button

    @FXML
    private lateinit var  btn11: Button

    @FXML
    private lateinit var  btn12: Button

    @FXML
    private lateinit var  btn13: Button

    @FXML
    private lateinit var  btn14: Button

    @FXML
    private lateinit var  btn15: Button

    @FXML
    private lateinit var  btn16: Button

    @FXML
    private lateinit var  btn17: Button

    @FXML
    private lateinit var  btn18: Button

    @FXML
    private lateinit var  btn19: Button


    @FXML
    private fun onBtn01Click() {
        // WebViewの宣言
        val webView = WebView()
        val webEngine = webView.engine
        webEngine.isJavaScriptEnabled = true
        webEngine.load(WebViewUrlConst.WEBVIEW_URL_TOSTA_ENJURW01)

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
        // WebViewの宣言
        val webView = WebView()
        val webEngine = webView.engine
        webEngine.isJavaScriptEnabled = true
        webEngine.load(WebViewUrlConst.WEBVIEW_URL_TOSTA_ENJURW02)

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
    private fun onBtn03Click() {
        // WebViewの宣言
        val webView = WebView()
        val webEngine = webView.engine
        webEngine.isJavaScriptEnabled = true
        webEngine.load(WebViewUrlConst.WEBVIEW_URL_TOSTA_ENJURW03)

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
    private fun onBtn04Click() {
        // WebViewの宣言
        val webView = WebView()
        val webEngine = webView.engine
        webEngine.isJavaScriptEnabled = true
        webEngine.load(WebViewUrlConst.WEBVIEW_URL_TOSTA_ENJURW04)

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
    private fun onBtn05Click() {

    }

    @FXML
    private fun onBtn06Click() {


    }

    @FXML
    private fun onBtn07Click() {

    }

    @FXML
    private fun onBtn08Click() {

    }

    @FXML
    private fun onBtn09Click() {

    }

    @FXML
    private fun onBtn10Click() {

    }

    @FXML
    private fun onBtn11Click() {

    }

    @FXML
    private fun onBtn12Click() {

    }

    @FXML
    private fun onBtn13Click() {

    }

    @FXML
    private fun onBtn14Click() {

    }

    @FXML
    private fun onBtn15Click() {

    }

    @FXML
    private fun onBtn16Click() {

    }

    @FXML
    private fun onBtn17Click() {

    }

    @FXML
    private fun onBtn18Click() {

    }

    @FXML
    private fun onBtn19Click() {

    }
}
