package net.konohana.sakuya.maihime.enjurw.service

import net.konohana.sakuya.maihime.enjurw.service.dto.InquiryApiDto
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient


@Component
class InquiryApiService {
    private val webClient = WebClient.create()

    fun getFromStaName(fromStaCode: String): InquiryApiDto? {
        return webClient.get()
            .uri("http://localhost:8080/api/fromsta/enjurw01/{stacode}", fromStaCode)
            .retrieve()
            .bodyToMono(InquiryApiDto::class.java)
            .block()
    }
}
