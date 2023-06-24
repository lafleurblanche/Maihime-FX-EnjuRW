package net.konohana.sakuya.maihime.enjurw.utils

import javafx.scene.control.Alert

/**
 * ダイアログ表示
 * INFOダイアログ
 */
fun showInfoDialog(contextText: String) {
    val alert = Alert(Alert.AlertType.INFORMATION)
    alert.contentText = contextText
    alert.showAndWait()
}
