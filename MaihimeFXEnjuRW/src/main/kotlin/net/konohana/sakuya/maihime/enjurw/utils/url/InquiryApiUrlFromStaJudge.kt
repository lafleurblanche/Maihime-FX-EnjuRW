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
        "FRRW11" to InquiryApiUrlConst.INQUIRY_API_ENJURW11_FROMSTA,
        "FRRW12" to InquiryApiUrlConst.INQUIRY_API_ENJURW12_FROMSTA,
        "FRRW13" to InquiryApiUrlConst.INQUIRY_API_ENJURW13_FROMSTA,
        "FRRW14" to InquiryApiUrlConst.INQUIRY_API_ENJURW14_FROMSTA,
        "FRRW15" to InquiryApiUrlConst.INQUIRY_API_ENJURW15_FROMSTA,
        "FRRW16" to InquiryApiUrlConst.INQUIRY_API_ENJURW16_FROMSTA,
        "FRRW17" to InquiryApiUrlConst.INQUIRY_API_ENJURW17_FROMSTA,
        "FRRW18" to InquiryApiUrlConst.INQUIRY_API_ENJURW18_FROMSTA,
        "FRRW19" to InquiryApiUrlConst.INQUIRY_API_ENJURW19_FROMSTA,
    )
    val baseUrl = apiUrlMap.getOrDefault(fromStaRoute, InquiryApiUrlConst.INQUIRY_API_NOTFOUND_FROMSTA)
    return baseUrl + fromStaCode
}
