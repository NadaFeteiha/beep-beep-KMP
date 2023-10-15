package domain.entity

data class Meal(
    val id: String,
    val name: String,
    val description: String,
    val restaurantId: String,
    val restaurantName: String,
    val cuisines: List<String>,
    val imageUrl: String,
    val price: Price,
)
