package net.konohana.sakuya.maihime.enjurw.utils

/**
 * 入力ダイアログチェック
 */
fun checkInputValue(checkValue: String?): String {
    return if (checkValue == null || checkValue.isEmpty()) {
        showAlertDialog("未入力")
        ""
    } else if (!checkValue.matches(Regex("\\d+"))) {
        showAlertDialog("数字ではありません。")
        ""
    } else {
        checkValue
    }
}
