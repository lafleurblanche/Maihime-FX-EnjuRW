package net.konohana.sakuya.maihime.enjurw.service

import net.konohana.sakuya.maihime.enjurw.constant.api.RequestDataConst
import net.konohana.sakuya.maihime.enjurw.service.dto.CerintheAPIResponse
import net.konohana.sakuya.maihime.enjurw.service.dto.CerintheFXRequestData
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono

@Component
class CerintheApiService {
    private val webClient = WebClient.create()

    fun postTicketRequest(msg: String): String? {
        return webClient.post()
            .uri("http://localhost:8080/post")
            .body(Mono.just(msg), String::class.java)
            .retrieve()
            .bodyToMono(String::class.java)
            .block()
    }

    fun postTicketRequestSample(
        fromSta: String,
        toSta: String,
        viaRouteConfig: String,
        adultMember: String,
        halfMember: String,
        childMember: String,
        monthOfUse: String,
        dayOfUse: String,
        ticketType: String,
        fromStaCode: String,
        toStaCode: String,
        specialNote: String,
        sectorKbn: String,
    ): CerintheAPIResponse? {
        val request = CerintheFXRequestData(
            fromSta = fromSta.ifEmpty { RequestDataConst.REQUEST_DEFAULT_FROM_STA },
            toSta = toSta.ifEmpty { RequestDataConst.REQUEST_DEFAULT_TO_STA },
            viaRouteConfig = viaRouteConfig.ifEmpty { RequestDataConst.REQUEST_DEFAULT_VIA_ROUTE },
            adultMember = adultMember.ifEmpty { RequestDataConst.REQUEST_DEFAULT_MEMBER },
            halfMember = halfMember.ifEmpty { RequestDataConst.REQUEST_DEFAULT_MEMBER },
            childMember = childMember.ifEmpty { RequestDataConst.REQUEST_DEFAULT_MEMBER },
            monthOfUse = monthOfUse.ifEmpty { RequestDataConst.REQUEST_DEFAULT_MONTH },
            dayOfUse = dayOfUse.ifEmpty { RequestDataConst.REQUEST_DEFAULT_DAY },
            ticketType = ticketType.ifEmpty { RequestDataConst.REQUEST_DEFAULT_TICKET_TYPE },
            fromStaCode = fromStaCode.ifEmpty { RequestDataConst.REQUEST_DEFAULT_FROM_STA_CODE },
            toStaCode = toStaCode.ifEmpty { RequestDataConst.REQUEST_DEFAULT_TO_STA_CODE },
            discountCode = "",
            postPayCode = "",
            specialNote = specialNote,
            sectorKbn = sectorKbn
        )
        return webClient.post()
            .uri("http://localhost:8085/cerinthe/fx/api/regist-ticket")
            .body(Mono.just(request), CerintheFXRequestData::class.java)
            .retrieve()
            .bodyToMono(CerintheAPIResponse::class.java)
            .block()
    }

    fun printPostTicketRequest(
        fromSta: String,
        toSta: String,
        viaRouteConfig: String,
        adultMember: String,
        halfMember: String,
        childMember: String,
        monthOfUse: String,
        dayOfUse: String,
        ticketType: String,
        fromStaCode: String,
        toStaCode: String,
        specialNote: String,
        sectorKbn: String
    ) {
        val request = CerintheFXRequestData(
            fromSta = fromSta.ifEmpty { RequestDataConst.REQUEST_DEFAULT_FROM_STA },
            toSta = toSta.ifEmpty { RequestDataConst.REQUEST_DEFAULT_TO_STA },
            viaRouteConfig = viaRouteConfig.ifEmpty { RequestDataConst.REQUEST_DEFAULT_VIA_ROUTE },
            adultMember = adultMember.ifEmpty { RequestDataConst.REQUEST_DEFAULT_MEMBER },
            halfMember = halfMember.ifEmpty { RequestDataConst.REQUEST_DEFAULT_MEMBER },
            childMember = childMember.ifEmpty { RequestDataConst.REQUEST_DEFAULT_MEMBER },
            monthOfUse = monthOfUse.ifEmpty { RequestDataConst.REQUEST_DEFAULT_MONTH },
            dayOfUse = dayOfUse.ifEmpty { RequestDataConst.REQUEST_DEFAULT_DAY },
            ticketType = ticketType.ifEmpty { RequestDataConst.REQUEST_DEFAULT_TICKET_TYPE },
            fromStaCode = fromStaCode.ifEmpty { RequestDataConst.REQUEST_DEFAULT_FROM_STA_CODE },
            toStaCode = toStaCode.ifEmpty { RequestDataConst.REQUEST_DEFAULT_TO_STA_CODE },
            discountCode = "",
            postPayCode = "",
            specialNote = specialNote,
            sectorKbn = sectorKbn
        )
        println(request)
    }
}
