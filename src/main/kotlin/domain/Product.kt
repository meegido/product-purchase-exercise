package domain

import java.util.UUID

abstract class Product(
    val id: UUID,
    val price: Double,
    val name: String
) : IProduct
