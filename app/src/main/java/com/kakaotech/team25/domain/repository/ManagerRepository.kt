package com.kakaotech.team25.domain.repository

import com.kakaotech.team25.domain.model.ManagerDomain
import kotlinx.coroutines.flow.Flow

interface ManagerRepository {
    fun getManagersFlow(formattedDate: String, region: String): Flow<List<ManagerDomain>>

    fun getManagerNameFlow(managerId: String): Flow<String>
}
