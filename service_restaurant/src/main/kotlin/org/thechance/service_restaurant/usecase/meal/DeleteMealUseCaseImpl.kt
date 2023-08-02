package org.thechance.service_restaurant.usecase.meal

import org.koin.core.annotation.Single
import org.thechance.service_restaurant.data.gateway.MealGateway

@Single
class DeleteMealUseCaseImpl(private val mealGateway: MealGateway) : DeleteMealUseCase {
    override suspend fun invoke(id: String) : Boolean  = mealGateway.deleteMealById(id)


}