fun main() {
    val comission = 0.0075
    val amount = 600000

    val totalComission = amount * comission
    val totalSum = if (totalComission < 3500) amount - 3500 else amount - totalComission
    println(" Общая сумма комиссии $totalComission")
    println(" Общая сумма перевода за минусом комиссии $totalSum")
}
