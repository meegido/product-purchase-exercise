package domain

class Purchase (
    val lines: List<PurchaseLine>,
){
    val total: Double = lines.fold(0.0){
            acc, line -> acc + line.product.totalPrice() * line.quantity
    }
}