package com.kakaotech.team25.data.remote

import com.kakaotech.team25.data.network.calladapter.Result
import com.kakaotech.team25.data.network.dto.ServiceResponse
import com.kakaotech.team25.data.network.dto.ManagerDto
import com.kakaotech.team25.data.network.dto.ManagerNameDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ManagerApiService {
    @GET("/api/managers")
    suspend fun getManagers(
        @Query("date") date: String,
        @Query("region") region: String
    ): Result<ServiceResponse<List<ManagerDto>>>

    @GET("/api/manager/profile/{manager_id}")
    suspend fun getManagerProfile(
        @Path("manager_id") managerId: String,
    ): Result<ServiceResponse<ManagerNameDto>>
}
