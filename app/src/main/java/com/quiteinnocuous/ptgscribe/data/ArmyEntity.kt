package com.quiteinnocuous.ptgscribe.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ArmyEntity(
    val name: String?
) {
    @PrimaryKey(autoGenerate = true)
    var id = 0
}