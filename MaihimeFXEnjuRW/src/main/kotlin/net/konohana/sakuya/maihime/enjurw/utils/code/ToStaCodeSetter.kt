package net.konohana.sakuya.maihime.enjurw.utils.code

import net.konohana.sakuya.maihime.enjurw.constant.code.ToStaCodeConst

/**
 * ## 降車駅情報を取得します。
 * * BTN01(苆谷)
 * @return 降車駅情報
 */
fun getToStaCodeBtn01(): Pair<String, String> {
    return ToStaCodeConst.TOSTA_NAME_BTN01 to ToStaCodeConst.TOSTA_CODE_BTN01
}

/**
 * ## 降車駅情報を取得します。
 * * BTN02(東苆谷)
 * @return 降車駅情報
 */
fun getToStaCodeBtn02(): Pair<String, String> {
    return ToStaCodeConst.TOSTA_NAME_BTN02 to ToStaCodeConst.TOSTA_CODE_BTN02
}

/**
 * ## 降車駅情報を取得します。
 * * BTN03(茄谷)
 * @return 降車駅情報
 */
fun getToStaCodeBtn03(): Pair<String, String> {
    return ToStaCodeConst.TOSTA_NAME_BTN03 to ToStaCodeConst.TOSTA_CODE_BTN03
}
