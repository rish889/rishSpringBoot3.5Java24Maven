package com.rish889.rishSpringBoot3._Java24Maven.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorDetail {
    private String message;

    private String errorCode;
}
