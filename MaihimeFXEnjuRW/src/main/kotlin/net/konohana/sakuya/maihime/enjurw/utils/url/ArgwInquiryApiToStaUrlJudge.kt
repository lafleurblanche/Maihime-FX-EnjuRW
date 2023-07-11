package net.konohana.sakuya.maihime.enjurw.utils.url

import net.konohana.sakuya.maihime.enjurw.constant.IndexConst
import net.konohana.sakuya.maihime.enjurw.constant.api.ArgwInquiryApiUrlConst

fun argwToStaInquiryApiUrlJudge(toStaCode: String): String {
    if (toStaCode.isEmpty()) {
        return "未入力"
    }
    val toStaRoute = toStaCode.substring(IndexConst.INDEX_START, IndexConst.INDEX_END)
    val apiUrlMap = mapOf(
        "TORW01" to ArgwInquiryApiUrlConst.INQUIRY_API_AREAGW01_TOSTA,
    )
    val baseUrl = apiUrlMap.getOrDefault(toStaRoute, ArgwInquiryApiUrlConst.INQUIRY_API_NOTFOUND_TOSTA)
    return baseUrl + toStaCode
}
