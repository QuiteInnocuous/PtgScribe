package com.quiteinnocuous.ptgscribe.data

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "army_table")
data class ArmyEntity(
    @Embedded(prefix = "army_") val values: ArmyValues
) {
    @PrimaryKey(autoGenerate = true)
    var id = 0
}

data class ArmyValues(
    val name: String?
)