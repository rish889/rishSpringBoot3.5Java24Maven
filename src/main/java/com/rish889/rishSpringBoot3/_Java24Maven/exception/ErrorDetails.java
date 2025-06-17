package com.rish889.rishSpringBoot3._Java24Maven.exception;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ErrorDetails {
    private List<ErrorDetail> errorDetails;
}
