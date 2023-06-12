package net.konohana.sakuya.maihime.enjurw.service

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
}
