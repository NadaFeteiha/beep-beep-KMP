package org.thechance.service_taxi.domain.usecase

import org.thechance.service_taxi.domain.entity.Taxi

interface GetAllTaxesUseCase {
    suspend operator fun invoke(): List<Taxi>
}