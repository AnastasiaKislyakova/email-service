package ru.kislyakova.anastasia.emailmodel.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kislyakova.anastasia.emailmodel.entity.EmailStatus;

@Data
@NoArgsConstructor
public class EmailCreationDto {
    private Integer mailingId;

    private Integer mailingAttempt;

    private String recipient;

    private String subject;

    private String text;

    @NotNull
    private EmailStatus status = EmailStatus.CREATED;

    @JsonCreator
    public EmailCreationDto(@JsonProperty(value = "mailingId", required = false) Integer mailingId,
                            @JsonProperty(value = "mailingAttempt", required = false) Integer mailingAttempt,
                            @JsonProperty(value = "recipient", required = true) String recipient,
                            @JsonProperty(value = "subject", required = true) String subject,
                            @JsonProperty(value = "text", required = true) String text) {
        this.mailingId = mailingId;
        this.mailingAttempt = mailingAttempt;
        this.recipient = recipient;
        this.subject = subject;
        this.text = text;
    }
}
