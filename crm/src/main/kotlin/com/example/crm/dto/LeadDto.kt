package com.example.crm.dto

import jakarta.validation.constraints.NotBlank
import org.jetbrains.annotations.NotNull

class LeadDto {
    @NotNull
    @NotBlank(message = "Fullname is required")
    var fullname: String? = null

    @NotNull
    @NotBlank(message = "Fullname is required")
    var email: String? = null
}