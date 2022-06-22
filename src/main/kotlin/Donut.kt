import kotlin.contracts.CallsInPlace

data class Donut(
    val isDonut: Boolean,
    val paidDuration: Int,
    val placeHolder: PlaceHolder,
    val canPublishFreeCopy: Boolean,
    val editMode: String
)
