fun main(){
    try {
        var b: Nacekomie = Nacekomie()
        b.Vibor()
        b.Output()
        b.File(b)
        b.Readfile(b)
    }
    catch (ex:Exception)
    {
        println("Ошибка: ${ex.message}")
    }

}