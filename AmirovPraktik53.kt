fun main(){
    //zad1
    println("Введите сколько набрал Ниф-Ниф");
    val x = readLine()!!.toDouble()
    println("Введите сколько набрал Нуф-Нуф");
    val a = readLine()!!.toDouble()
    println("Введите сколько набрал Наф-Наф");
    val b = readLine()!!.toDouble()
    when{
        a>x && b>x -> println("Ниф-Ниф самый ленивый")
        b>a && x>a -> println("Нуф-Нуф самый ленивый")
        x>b && a>b -> println("Наф-Наф самый ленивый")
    }
}
