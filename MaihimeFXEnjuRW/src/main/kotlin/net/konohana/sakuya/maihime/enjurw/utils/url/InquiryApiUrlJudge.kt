package net.konohana.sakuya.maihime.enjurw.utils.url

import net.konohana.sakuya.maihime.enjurw.constant.IndexConst.Companion.INDEX_END
import net.konohana.sakuya.maihime.enjurw.constant.IndexConst.Companion.INDEX_START
import net.konohana.sakuya.maihime.enjurw.constant.api.InquiryApiUrlConst

fun fromStaInquiryApiUrlJudge(fromStaCode: String): String {
    if (fromStaCode.isEmpty()) {
        return "未入力"
    }
    val fromStaRoute = fromStaCode.substring(INDEX_START, INDEX_END)
    val apiUrlMap = mapOf(
        "FRRW01" to InquiryApiUrlConst.INQUIRY_API_ENJURW01_FROMSTA,
        "FRRW02" to InquiryApiUrlConst.INQUIRY_API_ENJURW02_FROMSTA,
        "FRRW03" to InquiryApiUrlConst.INQUIRY_API_ENJURW03_FROMSTA,
        "FRRW04" to InquiryApiUrlConst.INQUIRY_API_ENJURW04_FROMSTA,
        "FRRW05" to InquiryApiUrlConst.INQUIRY_API_ENJURW05_FROMSTA,
        "FRRW06" to InquiryApiUrlConst.INQUIRY_API_ENJURW06_FROMSTA,
        "FRRW07" to InquiryApiUrlConst.INQUIRY_API_ENJURW07_FROMSTA,
        "FRRW08" to InquiryApiUrlConst.INQUIRY_API_ENJURW08_FROMSTA,
        "FRRW09" to InquiryApiUrlConst.INQUIRY_API_ENJURW09_FROMSTA,
        "FRRW10" to InquiryApiUrlConst.INQUIRY_API_ENJURW10_FROMSTA,
    )
    val baseUrl = apiUrlMap.getOrDefault(fromStaRoute, InquiryApiUrlConst.INQUIRY_API_NOTFOUND_FROMSTA)
    return baseUrl + fromStaCode
}
