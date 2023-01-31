fun main(){
    //zad2
    println("Введите двухзначное число")
    val x = readLine()!!.toString()

    when{
        x.length !=2 -> println("Двухзначное надо");
        x[0]=='2' || x[1]=='7' -> println("КЛАСС!!")
        else -> println("Нееет((((")
}
}