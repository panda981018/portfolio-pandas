package com.pandas.portfolio.domain.repository

import com.pandas.portfolio.domain.entity.ProjectSkill
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectSkillRepository: JpaRepository<ProjectSkill, Long> {
    
}