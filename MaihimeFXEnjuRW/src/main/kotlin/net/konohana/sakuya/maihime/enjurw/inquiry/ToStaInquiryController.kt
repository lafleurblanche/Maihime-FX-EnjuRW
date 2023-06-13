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
        showWebViewContent(
            WebViewUrlConst.WEBVIEW_URL_TOSTA_ENJURW01,
            WebViewTitleConst.WEBVIEW_TITLE_ENJURW01_TOSTA
        )
    }

    @FXML
    private fun onBtn02Click() {
        showWebViewContent(
            WebViewUrlConst.WEBVIEW_URL_TOSTA_ENJURW02,
            WebViewTitleConst.WEBVIEW_TITLE_ENJURW02_TOSTA
        )
    }

    @FXML
    private fun onBtn03Click() {
        showWebViewContent(
            WebViewUrlConst.WEBVIEW_URL_TOSTA_ENJURW03,
            WebViewTitleConst.WEBVIEW_TITLE_ENJURW03_TOSTA
        )
    }

    @FXML
    private fun onBtn04Click() {
        showWebViewContent(
            WebViewUrlConst.WEBVIEW_URL_TOSTA_ENJURW04,
            WebViewTitleConst.WEBVIEW_TITLE_ENJURW04_TOSTA
        )
    }

    @FXML
    private fun onBtn05Click() {
        showWebViewContent(
            WebViewUrlConst.WEBVIEW_URL_TOSTA_ENJURW05,
            WebViewTitleConst.WEBVIEW_TITLE_ENJURW05_TOSTA
        )
    }

    @FXML
    private fun onBtn06Click() {
        showWebViewContent(
            WebViewUrlConst.WEBVIEW_URL_TOSTA_ENJURW06,
            WebViewTitleConst.WEBVIEW_TITLE_ENJURW06_TOSTA
        )
    }

    @FXML
    private fun onBtn07Click() {
        showWebViewContent(
            WebViewUrlConst.WEBVIEW_URL_TOSTA_ENJURW07,
            WebViewTitleConst.WEBVIEW_TITLE_ENJURW07_TOSTA
        )
    }

    @FXML
    private fun onBtn08Click() {
        showWebViewContent(
            WebViewUrlConst.WEBVIEW_URL_TOSTA_ENJURW08,
            WebViewTitleConst.WEBVIEW_TITLE_ENJURW08_TOSTA
        )
    }

    @FXML
    private fun onBtn09Click() {
        showWebViewContent(
            WebViewUrlConst.WEBVIEW_URL_TOSTA_ENJURW09,
            WebViewTitleConst.WEBVIEW_TITLE_ENJURW09_TOSTA
        )
    }

    @FXML
    private fun onBtn10Click() {
        showWebViewContent(
            WebViewUrlConst.WEBVIEW_URL_TOSTA_ENJURW10,
            WebViewTitleConst.WEBVIEW_TITLE_ENJURW10_TOSTA
        )
    }

    @FXML
    private fun onBtn11Click() {
        showWebViewContent(
            WebViewUrlConst.WEBVIEW_URL_TOSTA_ENJURW11,
            WebViewTitleConst.WEBVIEW_TITLE_ENJURW11_TOSTA
        )
    }

    @FXML
    private fun onBtn12Click() {
        showWebViewContent(
            WebViewUrlConst.WEBVIEW_URL_TOSTA_ENJURW12,
            WebViewTitleConst.WEBVIEW_TITLE_ENJURW12_TOSTA
        )
    }

    @FXML
    private fun onBtn13Click() {
        showWebViewContent(
            WebViewUrlConst.WEBVIEW_URL_TOSTA_ENJURW13,
            WebViewTitleConst.WEBVIEW_TITLE_ENJURW13_TOSTA
        )
    }

    @FXML
    private fun onBtn14Click() {
        showWebViewContent(
            WebViewUrlConst.WEBVIEW_URL_TOSTA_ENJURW14,
            WebViewTitleConst.WEBVIEW_TITLE_ENJURW14_TOSTA
        )
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
