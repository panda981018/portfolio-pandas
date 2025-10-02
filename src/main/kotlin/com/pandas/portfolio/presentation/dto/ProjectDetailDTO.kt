package com.pandas.portfolio.presentation.dto

import com.pandas.portfolio.domain.entity.ProjectDetail

data class ProjectDetailDTO(
        val content: String,
        val url: String?
) {
    constructor(projectDetail: ProjectDetail) : this(
            content = projectDetail.content,
            url = projectDetail.url
    )
}