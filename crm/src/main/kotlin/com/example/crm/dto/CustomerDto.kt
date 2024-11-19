package com.example.crm.dto

import jakarta.validation.constraints.NotBlank
import org.jetbrains.annotations.NotNull

class CustomerDto {
    @NotNull
    @NotBlank(message = "Fullname is required")
    var fullName: String? = null

    @NotNull
    @NotBlank(message = "Fullname is required")
    var email: String? = null
}