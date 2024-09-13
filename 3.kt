fun main() {
    println("Введите натуральное число для преобразования в двоичную систему:")
    val input = readLine()

    val number = input?.toIntOrNull()
    if (number == null || number <= 0) {
        println("Ошибка: Введено некорректное число.")
        return
    }

    val binary = Integer.toBinaryString(number)
    println("Результат: $binary")
}
