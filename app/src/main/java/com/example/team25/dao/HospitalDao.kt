package com.example.team25.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.team25.entity.HospitalEntity

@Dao
interface HospitalDao {
    @Insert
    suspend fun insertAll(hospitals: List<HospitalEntity>)

    @Query("SELECT * FROM hospitals LIMIT 1")
    suspend fun getAnyHospital(): HospitalEntity?
}
