package net.konohana.sakuya.maihime.enjurw.utils.date

import java.time.LocalDate

/**
 * 当日の日付を取得します。
 */
fun getTodayDate(): Pair<String, String> {
    val date = LocalDate.now()
    val month = date.monthValue.toString()
    val day = date.dayOfMonth.toString()
    return month to day
}

/**
 * 明日の日付を取得します。
 */
fun getTomorrowDate(): Pair<String, String> {
    val date = LocalDate.now()
    val date2 = date.plusDays(1)
    val month = date2.monthValue.toString()
    val day = date2.dayOfMonth.toString()
    return month to day
}

/**
 * 明後日の日付を取得します。
 */
fun getDayAfterTomorrowDate(): Pair<String, String> {
    val date = LocalDate.now()
    val date2 = date.plusDays(2)
    val month = date2.monthValue.toString()
    val day = date2.dayOfMonth.toString()
    return month to day
}

/**
 * 1か月後の日付を取得します。
 */
fun getDayMonthLaterDate(): Pair<String, String> {
    val date = LocalDate.now()
    val date2 = date.plusMonths(1)
    val month = date2.monthValue.toString()
    val day = date2.dayOfMonth.toString()
    return month to day
}
