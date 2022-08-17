package com.quiteinnocuous.ptgscribe.data

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    version = 0,
    entities = [ArmyEntity::class]
)
abstract class PtgScribeDatabase: RoomDatabase() {

}