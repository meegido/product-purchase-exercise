package domain

import java.util.UUID

class Coffee(id: UUID, val items: List<Item>? = emptyList(), name: String, val basePrice: Double) : Product(id, basePrice, name) {
    override fun totalPrice(): Double = (items?.sumOf { it.price } ?: 0.0) + basePrice
}
