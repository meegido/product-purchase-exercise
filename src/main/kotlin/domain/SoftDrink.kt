package domain

import java.util.UUID

class SoftDrink(id: UUID, name: String, val basePrice: Double) : Product(id, basePrice, name) {
    override fun totalPrice(): Double = basePrice
}
