fun main(){
    var b = cinema();
    println("Хотите ознакомиться с кинотеатрами?: ")
    var yes_or_no = readLine()!!.toString()

    if (yes_or_no == "Да")
    {
        val url = "https://www.tripadvisor.ru/Attractions-g294459-Activities-c56-t97-Russia.html"
        b.openLink(url)
    }
    else
    {
        b.input(b)
        b.output()
        b.file(b)
    }

}