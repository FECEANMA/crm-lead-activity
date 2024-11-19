package com.example.crm.mapper

import com.example.crm.dto.ActivityDto
import com.example.crm.entity.Activity

object ActivityMapper {
    fun toEntity(activityDto: ActivityDto): Activity{
        var activity = Activity()
        activity.activity_type = activityDto.activity_type
        return activity
    }
}