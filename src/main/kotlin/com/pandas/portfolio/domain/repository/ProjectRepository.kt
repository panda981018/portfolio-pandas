package com.pandas.portfolio.domain.repository

import com.pandas.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository : JpaRepository<Link, Long>