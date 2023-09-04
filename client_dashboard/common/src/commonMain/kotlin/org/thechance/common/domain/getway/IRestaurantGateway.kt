package org.thechance.common.domain.getway

import org.thechance.common.domain.entity.DataWrapper
import org.thechance.common.domain.entity.NewRestaurantInfo
import org.thechance.common.domain.entity.Restaurant

interface IRestaurantGateway {
    suspend fun getRestaurants(): DataWrapper<Restaurant>

    suspend fun searchRestaurantsByRestaurantName(restaurantName: String): DataWrapper<Restaurant>

    suspend fun filterRestaurants(rating: Double, priceLevel: Int): DataWrapper<Restaurant>

    suspend fun searchFilterRestaurants(
        restaurantName: String,
        rating: Double,
        priceLevel: Int
    ): DataWrapper<Restaurant>

    suspend fun createRestaurant(restaurant: NewRestaurantInfo): Restaurant

    suspend fun deleteRestaurants(restaurant: Restaurant): Restaurant

    suspend fun getCuisines(): List<String>

    suspend fun createCuisine(cuisineName: String): String?

    suspend fun deleteCuisine(cuisineName: String): List<String>
}