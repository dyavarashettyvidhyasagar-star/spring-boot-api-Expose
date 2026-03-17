package com.example.ExposingRestAPI.dto;

import lombok.*;
import org.springframework.resilience.annotation.ConcurrencyLimit;

import java.time.LocalDateTime;

@Data
public class ApiResponse<T>{

    private String status;

    private String message;

    private int code;

    private LocalDateTime timestamp;

    private T data;

    public ApiResponse(String status, String message, int code, T data) {
        this.status = status;
        this.message = message;
        this.code = code;
        this.timestamp = LocalDateTime.now();
        this.data = data;
    }
}
