package com.example.crm.dto

import jakarta.validation.constraints.NotBlank
import org.jetbrains.annotations.NotNull

class ActivityDto {
    @NotNull
    @NotBlank(message = "Activity is required")
    var activity_type: String? = null
}