package com.quiteinnocuous.ptgscribe.data

import androidx.room.Dao
import androidx.room.Query
import androidx.room.RewriteQueriesToDropUnusedColumns
import kotlinx.coroutines.flow.Flow

@RewriteQueriesToDropUnusedColumns
@Dao
interface PtgScribeDao {

    @Query("SELECT * FROM army_table")
    fun getArmies(): Flow<List<ArmyValues>>
}