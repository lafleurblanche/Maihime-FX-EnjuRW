package net.konohana.sakuya.maihime.enjurw.utils

import javafx.scene.control.Alert

/**
 * ダイアログ表示処理
 */
fun showAlertDialog(contextText: String) {
    val alert = Alert(Alert.AlertType.ERROR)
    alert.contentText = contextText
    alert.showAndWait()
}
