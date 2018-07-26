package iniciante

import java.util.*

// Idade em Dias
fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    val entrada: Int = scanner.nextInt()

    val anos = entrada / 365
    val restoAnos = entrada % 365

    val meses = restoAnos / 30
    val dias = restoAnos % 30

    println("${anos} ano(s)")
    println("${meses} mes(es)")
    println("${dias} dia(s)")
}