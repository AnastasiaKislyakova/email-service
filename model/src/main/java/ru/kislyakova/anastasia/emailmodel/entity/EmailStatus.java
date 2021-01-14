package ru.kislyakova.anastasia.emailmodel.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum EmailStatus {
    @JsonProperty("Created")
    CREATED,
    @JsonProperty("Sent")
    SENT,
    @JsonProperty("Received")
    RECEIVED,
    @JsonProperty("Error")
    ERROR
}
