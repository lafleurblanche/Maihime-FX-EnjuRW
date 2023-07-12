package net.konohana.sakuya.maihime.enjurw.inquiry

import javafx.fxml.FXML
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import javafx.scene.web.WebView
import javafx.stage.Stage
import net.konohana.sakuya.maihime.enjurw.constant.title.WebViewTitleConst
import net.konohana.sakuya.maihime.enjurw.constant.webview.WebViewUrlConst

/**
 * ## FXMLコントローラクラス
 * * 乗車駅照会メニュー画面
 * * 支線連絡系統
 * @author lafleurblanche
 */
class ArgwFromStaInquiryController {
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
        showWebViewContent(
            WebViewUrlConst.WEBVIEW_URL_AREAGW01,
            WebViewTitleConst.WEBVIEW_TITLE_AREAGW01_FROMSTA
        )
    }

    private fun showWebViewContent(url: String, title: String) {
        // WebViewの宣言
        val webView = WebView()
        val webEngine = webView.engine
        webEngine.isJavaScriptEnabled = true
        webEngine.load(url)

        val vbox = VBox()
        vbox.children.addAll(webView)
        val stage = Stage()
        val scene = Scene(vbox)
        stage.width = 400.0
        stage.height = 650.0
        stage.title = title
        stage.scene = scene
        stage.show()
    }
}
