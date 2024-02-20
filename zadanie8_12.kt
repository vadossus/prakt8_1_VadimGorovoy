fun main(){
    try {
        var b = Cinema();
        println("Хотите ознакомиться с кинотеатрами?: ")
        var yes_or_no = readLine()!!.toString()

        if (yes_or_no == "Да")
        {
            val url = "https://www.tripadvisor.ru/Attractions-g294459-Activities-c56-t97-Russia.html"
            b.OpenLink(url)
        }
        else
        {
            b.Input(b)
            b.Output()
            b.File(b)
        }
    }
    catch (ex:Exception)
    {
        println("Ошибка: ${ex.message}")
    }
}