//1
fun printFullName(firstName: String, lastName: String) {
    val fullName = "$firstName $lastName"
    println("Полное имя: $fullName")
}

fun main() {
    val myFirstName = "Ваше имя"
    val myLastName = "Ваша фамилия"

    printFullName(myFirstName, myLastName)
    //2
    printFullName(firstName = "Катёна", lastName = "Овчаренко")


    //3
    fun calculateFullName(firstName: String, lastName: String): String {
        return "$firstName $lastName"
        // Возвращает полное имя в виде строки
    }
    val fullName = calculateFullName("Катёна", "Овчаренко")
    println(fullName)
    /*Сохранение своего имени в константу
      и вызываем функцию calculateFullName
      и передаём ей имя и фамилию в качестве аргументов
     */

    //4

    fun calculateFullName1(firstName: String, lastName: String): Pair<String, Int> {
        val fullName = "$firstName $lastName"
        val fullNameLength = fullName.length
        return Pair(fullName, fullNameLength)
    }
    val result = calculateFullName1("Катёна", "Овчаренко")
    val myFullName = result.first
    val fullNameLength = result.second

    println("Мое полное имя: $myFullName")
    println("Длина моего полного имени: $fullNameLength")
    //Используя эту функцию я определила длину полного имени

        //5
        fun isPrime(number: Int): Boolean
        {
            // проверка является ли число меньше или равным 1
            if (number <= 1)
            {
                return false
            }
                /*перебераем все числа от 2 до number -1
                  если это так, то число не является простым
                  и мы возвращаем false, затем проверяем делится
                  ли number на какое либо из них без остатка
                  если такое число найдено то number не явл. простым
                 */
            for (i in 2 until number) {
                if (number % i == 0) {
                    return false
                }
            }
            return true
        }
    val number = 17
    if (isPrime(number)) {
        println("$number является простым числом")
    } else {
        println("$number не является простым числом")
    }

    //6
    fun fibonacci(n: Int): Int {
        if (n <= 0) return 0
        if (n == 1 || n == 2) return 1

        var a = 1
        var b = 1
        var result = 0

        for (i in 3..n) {
            result = a + b
            a = b
            b = result
        }

        return result
    }
    val result1: Int = fibonacci(6)
    println("6-ое значение в последовательности Фибоначчи: $result")
// Вывод: 6-ое значение в последовательности Фибоначчи: 8

}









