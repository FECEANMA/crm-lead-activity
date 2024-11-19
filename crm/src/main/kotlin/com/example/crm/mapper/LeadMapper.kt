package com.example.crm.mapper

import com.example.crm.dto.LeadDto
import com.example.crm.entity.Lead

object LeadMapper {
    fun toEntity(leadDto: LeadDto): Lead {
        var lead = Lead()
        lead.fullName = leadDto.fullname
        lead.email = leadDto.email
        return lead
    }
}