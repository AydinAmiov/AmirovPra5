fun main(){
    //zad1
    println("Введите число x");
    val x = readLine()!!.toDouble()
    when{
        x<=-3 -> println("9")
        x>-3 -> println(1/x*x+1)
    }

}