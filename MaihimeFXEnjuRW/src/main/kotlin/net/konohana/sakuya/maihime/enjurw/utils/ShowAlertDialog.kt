package net.konohana.sakuya.maihime.enjurw.utils

import javafx.scene.control.Alert

/**
 * ダイアログ表示処理
 */
fun showAlertDialog(contextText: String) {
    val alert = Alert(Alert.AlertType.ERROR)
    alert.headerText = "入力内容に誤りがあります。"
    alert.contentText = contextText
    alert.showAndWait()
}
