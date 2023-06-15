package net.konohana.sakuya.maihime.enjurw.service

import net.konohana.sakuya.maihime.enjurw.service.dto.InquiryApiDto
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient


@Component
class InquiryApiService {
    private val webClient = WebClient.create()

    fun getFromStaName(url: String): InquiryApiDto? {
        return webClient.get()
            .uri(url)
            .retrieve()
            .bodyToMono(InquiryApiDto::class.java)
            .block()
    }
}
