package ru.kislyakova.anastasia.emailclient;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.kislyakova.anastasia.emailmodel.dto.EmailCreationDto;
import ru.kislyakova.anastasia.emailmodel.entity.Email;

@Headers({ "Accept: application/json" })
@FeignClient(name = "api/emails")
public interface EmailServiceClient {

    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    Mono<Email> sendEmail(EmailCreationDto emailDto);

    @RequestLine("GET /")
    Flux<Email> getEmails();

    @RequestLine("GET /{emailId}")
    Mono<Email> getEmailById(@Param("emailId")int emailId);
}
