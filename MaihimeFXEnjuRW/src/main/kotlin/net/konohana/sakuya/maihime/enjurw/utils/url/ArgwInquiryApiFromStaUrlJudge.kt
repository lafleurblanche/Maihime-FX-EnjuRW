package net.konohana.sakuya.maihime.enjurw.utils.url

import net.konohana.sakuya.maihime.enjurw.constant.IndexConst
import net.konohana.sakuya.maihime.enjurw.constant.api.ArgwInquiryApiUrlConst

fun argwFromStaInquiryApiUrlJudge(fromStaCode: String): String {
    if (fromStaCode.isEmpty()) {
        return "未入力"
    }
    val fromStaRoute = fromStaCode.substring(IndexConst.INDEX_START, IndexConst.INDEX_END)
    val apiUrlMap = mapOf(
        "FRGW01" to ArgwInquiryApiUrlConst.INQUIRY_API_AREAGW01_FROMSTA,

    )
    val baseUrl = apiUrlMap.getOrDefault(fromStaRoute, ArgwInquiryApiUrlConst.INQUIRY_API_NOTFOUND_FROMSTA)
    return baseUrl + fromStaCode
}
