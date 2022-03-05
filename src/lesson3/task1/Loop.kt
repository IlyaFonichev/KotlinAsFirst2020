@file:Suppress("UNUSED_PARAMETER", "UNUSED_EXPRESSION")

package lesson3.task1

import kotlin.math.max
import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.math.abs
import kotlin.math.pow

// Урок 3: циклы
// Максимальное количество баллов = 9
// Рекомендуемое количество баллов = 7
// Вместе с предыдущими уроками = 16/21

/**
 * Пример
 *
 * Вычисление факториала
 */
fun factorial(n: Int): Double {
    var result = 1.0
    for (i in 1..n) {
        result = result * i // Please do not fix in master
    }
    return result
}

/**
 * Пример
 *
 * Проверка числа на простоту -- результат true, если число простое
 */
fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    if (n == 2) return true
    if (n % 2 == 0) return false
    for (m in 3..sqrt(n.toDouble()).toInt() step 2) {
        if (n % m == 0) return false
    }
    return true
}

/**
 * Пример
 *
 * Проверка числа на совершенность -- результат true, если число совершенное
 */
fun isPerfect(n: Int): Boolean {
    var sum = 1
    for (m in 2..n / 2) {
        if (n % m > 0) continue
        sum += m
        if (sum > n) break
    }
    return sum == n
}

/**
 * Пример
 *
 * Найти число вхождений цифры m в число n
 */
fun digitCountInNumber(n: Int, m: Int): Int =
    when {
        n == m -> 1
        n < 10 -> 0
        else -> digitCountInNumber(n / 10, m) + digitCountInNumber(n % 10, m)
    }

/**
 * Простая (2 балла)
 *
 * Найти количество цифр в заданном числе n.
 * Например, число 1 содержит 1 цифру, 456 -- 3 цифры, 65536 -- 5 цифр.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun digitNumber(n: Int): Int {
    var count = 1
    var num = abs(n)
    while (num > 9) {
        count++
        num /= 10
    }
    return count
}

/**
 * Простая (2 балла)
 *
 * Найти число Фибоначчи из ряда 1, 1, 2, 3, 5, 8, 13, 21, ... с номером n.
 * Ряд Фибоначчи определён следующим образом: fib(1) = 1, fib(2) = 1, fib(n+2) = fib(n) + fib(n+1)
 */
<<<<<<< .merge_file_a04000
fun fib(n: Int): Int {
    var t1 = 1
    var t2 = 1
    for (i in 3..n) {
        print("$t1 + ")
        val s = t1 + t2
        t1 = t2
        t2 = s
    }
    return t2
=======
/**fun fib(n: Int): Int =
    if (n < 3) 1
    else fib(n - 1) + fib(n - 2)
*/

fun fib(n: Int): Int {
    var fb1 = 1
    var fb2 = 1
    var result = 0
    if (n < 3) result = 1
    else {
        for (i in 3..n) {
            result = fb1 + fb2
            fb1 = fb2
            fb2 = result
        }
    }
    return result
>>>>>>> .merge_file_a07856
}

/**
 * Простая (2 балла)
 *
 * Для заданного числа n > 1 найти минимальный делитель, превышающий 1
 */
fun minDivisor(n: Int): Int {
    var a = n
    for (i in 2..n / 2) {
        if (n % i == 0) {
            a = i
            break
        }
    }
    return a
}

/**
 * Простая (2 балла)
 *
 * Для заданного числа n > 1 найти максимальный делитель, меньший n
 */
fun maxDivisor(n: Int): Int {
    var a = 1
    for (i in n / 2 downTo 1) {
        if (n % i == 0) {
            a = i
            break
        }
    }
    return a
}

/**
 * Простая (2 балла)
 *
 * Гипотеза Коллатца. Рекуррентная последовательность чисел задана следующим образом:
 *
 *   ЕСЛИ (X четное)
 *     Xслед = X /2
 *   ИНАЧЕ
 *     Xслед = 3 * X + 1
 *
 * например
 *   15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 4 2 1 4 2 1 ...
 * Данная последовательность рано или поздно встречает X == 1.
 * Написать функцию, которая находит, сколько шагов требуется для
 * этого для какого-либо начального X > 0.
 */
fun collatzSteps(x: Int): Int = TODO()

/**
 * Средняя (3 балла)
 *
 * Для заданных чисел m и n найти наименьшее общее кратное, то есть,
 * минимальное число k, которое делится и на m и на n без остатка
 */

fun nod(m: Int, n: Int): Int {
    var m1 = m
    var n1 = n
    while (m1 != n1) {
        if (m1 > n1) m1 -= n1
        else n1 -= m1
    }
    return (m1)
}

fun lcm(m: Int, n: Int): Int = (m * n) / nod(m, n)


/**
 * Средняя (3 балла)
 *
 * Определить, являются ли два заданных числа m и n взаимно простыми.
 * Взаимно простые числа не имеют общих делителей, кроме 1.
 * Например, 25 и 49 взаимно простые, а 6 и 8 -- нет.
 */

fun isCoPrime(m: Int, n: Int): Boolean = TODO()

<<<<<<< .merge_file_a04000
=======
/**{
var firstArray = mutableListOf(0)
var secondArray = mutableListOf(0)
var a = false
for (i in 2..m) {
if (m % i == 0) firstArray.add(i)
}
for (i in 2..n) {
if (n % i == 0) secondArray.add(i)
}
secondArray.remove(0)
firstArray.remove(0)
for (i in firstArray) {
for (k in secondArray) {
if (k == i) break
else a = true
}
}
return a
}
 */

>>>>>>> .merge_file_a07856
/**
 * Средняя (3 балла)
 *
 * Поменять порядок цифр заданного числа n на обратный: 13478 -> 87431.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun revert(n: Int): Int {
<<<<<<< .merge_file_a04000
    var number = n
    var y = 0
    while (number > 0) {
        val x = number % 10
        number /= 10
        y *= 10
        y += x
    }
    return y
=======
    val myArray = mutableListOf(0)
    var number = n
    var num: Int
    var midResult: Int
    var result = 0
    while (number > 0) {
        num = number % 10
        myArray.add(num)
        number /= 10
    }
    myArray.removeAt(0)
    var dl = myArray.size
    val dl2 = dl
    for (i in 0 until dl2) {
        midResult = (myArray[i] * 10.0.pow(dl - 1)).toInt()
        result += midResult
        dl -= 1
    }
    return result
>>>>>>> .merge_file_a07856
}

/**
 * Средняя (3 балла)
 *
 * Проверить, является ли заданное число n палиндромом:
 * первая цифра равна последней, вторая -- предпоследней и так далее.
 * 15751 -- палиндром, 3653 -- нет.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun isPalindrome(n: Int): Boolean = TODO()

/**
 * Средняя (3 балла)
 *
 * Для заданного числа n определить, содержит ли оно различающиеся цифры.
 * Например, 54 и 323 состоят из разных цифр, а 111 и 0 из одинаковых.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun hasDifferentDigits(n: Int): Boolean = TODO()

/**
 * Средняя (4 балла)
 *
 * Для заданного x рассчитать с заданной точностью eps
 * sin(x) = x - x^3 / 3! + x^5 / 5! - x^7 / 7! + ...
 * Нужную точность считать достигнутой, если очередной член ряда меньше eps по модулю.
 * Подумайте, как добиться более быстрой сходимости ряда при больших значениях x.
 * Использовать kotlin.math.sin и другие стандартные реализации функции синуса в этой задаче запрещается.
 */
fun sin(x: Double, eps: Double): Double = TODO()

/**
 * Средняя (4 балла)
 *
 * Для заданного x рассчитать с заданной точностью eps
 * cos(x) = 1 - x^2 / 2! + x^4 / 4! - x^6 / 6! + ...
 * Нужную точность считать достигнутой, если очередной член ряда меньше eps по модулю
 * Подумайте, как добиться более быстрой сходимости ряда при больших значениях x.
 * Использовать kotlin.math.cos и другие стандартные реализации функции косинуса в этой задаче запрещается.
 */
fun cos(x: Double, eps: Double): Double = TODO()

/**
 * Сложная (4 балла)
 *
 * Найти n-ю цифру последовательности из квадратов целых чисел:
 * 149162536496481100121144...
 * Например, 2-я цифра равна 4, 7-я 5, 12-я 6.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun squareSequenceDigit(n: Int): Int = TODO()


/**
 * Сложная (5 баллов)
 *
 * Найти n-ю цифру последовательности из чисел Фибоначчи (см. функцию fib выше):
 * 1123581321345589144...
 * Например, 2-я цифра равна 1, 9-я 2, 14-я 5.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun fibSequenceDigit(n: Int): Int {
<<<<<<< .merge_file_a04000
    var count: Int
    var quantity = 0
    var x = 0
    var f: Int
    var t: Int
    for (i in 1..n) {
        f = fib(i)
        t = f
        count = 0
        while (t > 0) {
            t /= 10
            count++
        }
        var d = 10.0.pow(count - 1).toInt()
        while ((d > 0) && (quantity != n)) {
            x = ((f / d) % 10)
            f %= d
            quantity++
            d /= 10
        }
    }
    return x
}
=======
    var num = 0
    var i = 1
    var result = 0
    while (num != n) {
        val a = fib(i)
        if (a / 10 == 0) {
            result = a
            num += 1
        } else {
            var b = a
            var d = 0
            while (b > 0) {
                b /= 10
                d += 1
            }
            while (d > 0) {
                result = (a / (10.0.pow(d - 1).toInt())) % 10
                d -= 1
                num += 1
                if (num == n) break
            }
        }
        i += 1
    }
    return result
}


/**fun fibSequenceDigit(n: Int): Int {
val myArray = mutableListOf(0)
val finalArray = mutableListOf(0)
for (i in 1..n) {
if (i == 1 || i == 2) myArray.add(1)
else {
val a = myArray[i - 1] + myArray[i - 2]
myArray.add(a)
}
}
var midResult: Int
for (i in myArray) {
var a = i
if (a / 10 != 0) {
val midArray = mutableListOf(0)
while (a > 0) {
midResult = a % 10
midArray.add(midResult)
a /= 10
}
midArray.removeAt(0)
midArray.reverse()
val dl = midArray.size
for (b in 0 until dl) {
finalArray.add(midArrayb)
}
} else finalArray.add(a)
}
return finalArray[n + 1]
}
 */
>>>>>>> .merge_file_a07856
