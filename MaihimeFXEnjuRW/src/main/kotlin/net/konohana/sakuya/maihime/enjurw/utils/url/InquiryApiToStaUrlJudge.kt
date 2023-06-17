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
        "TORW05" to InquiryApiUrlConst.INQUIRY_API_ENJURW05_TOSTA,
        "TORW06" to InquiryApiUrlConst.INQUIRY_API_ENJURW06_TOSTA,
        "TORW07" to InquiryApiUrlConst.INQUIRY_API_ENJURW07_TOSTA,
        "TORW08" to InquiryApiUrlConst.INQUIRY_API_ENJURW08_TOSTA,
        "TORW09" to InquiryApiUrlConst.INQUIRY_API_ENJURW09_TOSTA,
        "TORW10" to InquiryApiUrlConst.INQUIRY_API_ENJURW10_TOSTA,
        "TORW11" to InquiryApiUrlConst.INQUIRY_API_ENJURW11_TOSTA,
        "TORW12" to InquiryApiUrlConst.INQUIRY_API_ENJURW12_TOSTA,
        "TORW13" to InquiryApiUrlConst.INQUIRY_API_ENJURW13_TOSTA,
        "TORW14" to InquiryApiUrlConst.INQUIRY_API_ENJURW14_TOSTA,
        "TORW15" to InquiryApiUrlConst.INQUIRY_API_ENJURW15_TOSTA,
        "TORW16" to InquiryApiUrlConst.INQUIRY_API_ENJURW16_TOSTA,
        "TORW17" to InquiryApiUrlConst.INQUIRY_API_ENJURW17_TOSTA,
        "TORW18" to InquiryApiUrlConst.INQUIRY_API_ENJURW18_TOSTA,
        "TORW19" to InquiryApiUrlConst.INQUIRY_API_ENJURW19_TOSTA,
    )
    val baseUrl = apiUrlMap.getOrDefault(toStaRoute, InquiryApiUrlConst.INQUIRY_API_NOTFOUND_TOSTA)
    return baseUrl + toStaCode
}
