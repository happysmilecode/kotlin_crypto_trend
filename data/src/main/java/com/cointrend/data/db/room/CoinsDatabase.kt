package com.cointrend.data.db.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.cointrend.data.db.room.models.CoinMarketDataEntity
import com.cointrend.data.features.favouritecoins.local.FavouriteCoinsDao
import com.cointrend.data.features.favouritecoins.local.models.FavouriteCoinEntity
import com.cointrend.data.features.marketdata.local.CoinsMarketDataDao
import com.cointrend.data.features.topcoins.local.TopCoinsDao
import com.cointrend.data.features.topcoins.local.models.TopCoinEntity
import com.cointrend.data.features.trendingcoins.local.TrendingCoinsDao
import com.cointrend.data.features.trendingcoins.local.models.TrendingCoinEntity

@Database(
    entities = [
        TopCoinEntity::class,
        CoinMarketDataEntity::class,
        TrendingCoinEntity::class,
        FavouriteCoinEntity::class
    ],
    version = 1,
    exportSchema = true
)
abstract class CoinsDatabase : RoomDatabase() {

    abstract fun topCoinsDao(): TopCoinsDao
    abstract fun coinsMarketDataDao(): CoinsMarketDataDao
    abstract fun trendingCoinsDao(): TrendingCoinsDao
    abstract fun favouriteCoinsDao(): FavouriteCoinsDao

}