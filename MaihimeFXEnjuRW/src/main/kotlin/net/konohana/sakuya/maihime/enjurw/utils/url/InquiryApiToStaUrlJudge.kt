package net.konohana.sakuya.maihime.enjurw.utils.url

import net.konohana.sakuya.maihime.enjurw.constant.IndexConst
import net.konohana.sakuya.maihime.enjurw.constant.api.InquiryApiUrlConst

fun toStaInquiryApiUrlJudge(toStaCode: String): String {
    if (toStaCode.isEmpty()) {
        return "未入力"
    }
    val toStaRoute = toStaCode.substring(IndexConst.INDEX_START, IndexConst.INDEX_END)
    val apiUrlMap = mapOf(
        "TORW01" to InquiryApiUrlConst.INQUIRY_API_ENJURW01_TOSTA,
        "TORW02" to InquiryApiUrlConst.INQUIRY_API_ENJURW02_TOSTA,
        "TORW03" to InquiryApiUrlConst.INQUIRY_API_ENJURW03_TOSTA,
        "TORW04" to InquiryApiUrlConst.INQUIRY_API_ENJURW04_TOSTA,
    )
    val baseUrl = apiUrlMap.getOrDefault(toStaRoute, InquiryApiUrlConst.INQUIRY_API_NOTFOUND_TOSTA)
    return baseUrl + toStaCode
}
