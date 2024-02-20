import java.io.File
import java.io.FileWriter



class Nacekomie
{
    var name = ""
    var speed = 0.0
    var paint = ""
    var eat = ""
    var location = ""

    fun input(nas:Nacekomie)
    {
        try
        {
            println("Введите имя насекомого")
            nas.name = readLine()!!.toString()
            println("Введите скорость насекомого")
            nas.speed = readLine()!!.toDouble()
            println("Введите окраску насекомого")
            nas.paint = readLine()!!.toString()
            println("Введите еду")
            nas.eat = readLine()!!.toString()
            println("Введите место обитания насекомого")
            nas.location = readLine()!!.toString()
        }
        catch (ex:Exception)
        {
            println("Ошибка: $ex")
        }

    }

    fun Output()
    {
        println("Имя насекомого: $name \nСкорость насекомого: $speed\nОкраска: $paint\nЕда: $eat\nМесто обитания: $location ")
    }

    fun Vibor()
    {
        println("Выберите:\n1 - Ввести самим:\n2 - Выбрать готовое")
        var n = readLine()!!.toInt()

        if (n == 1)
        {
            input(this)
        }
        else if (n == 2)
        {
            println("Выберите:\n1 - Кузнечик\n2 - Мошки\n3 - Стрекоза")
            var c = readLine()!!.toInt()
            try
            {
                if (c == 1)
                {
                    name = "Кузнечик"
                    speed = 20.0
                    paint = "Зеленый"
                    eat = "Личинки, мошки"
                    location = "Поля, лес"
                }
                else if (c == 2)
                {
                    name = "Мошки"
                    speed = 15.0
                    paint = "Черные"
                    eat = "Мелкие насекомые, кровь"
                    location = "Болота, леса"
                }
                else if (c == 3)
                {
                    name = "Стрекоза"
                    speed = 15.0
                    paint = "Зеленая, светый-зеленый"
                    eat = "Мелкие насекомые"
                    location = "Болота, леса, поля"
                }
                else
                {
                    System.exit(0)
                }
            }
            catch (ex:Exception)
            {
                println("Ошибка")
            }
        }
        else
        {
            println("Нужно выбрать либо 1 или 2")
            System.exit(0)
        }
    }
    fun File(nacekomie: Nacekomie)
    {
        println("Хотите записать в файл:\n1 - Да\n2 - Нет")
        var l = readLine()!!.toInt()

        if (l == 1)
        {
            var filename = readLine().toString()
            val writer = File("${nacekomie.name}.txt").bufferedWriter()
            writer.write("Имя насекомого: ${nacekomie.name}")
            writer.newLine()
            writer.write("Скорость насекомого: ${nacekomie.speed}")
            writer.newLine()
            writer.write("Окраска: ${nacekomie.paint}")
            writer.newLine()
            writer.write("Еда: ${nacekomie.eat}")
            writer.newLine()
            writer.write("Место обитания: ${nacekomie.location}")
            writer.close()
            println("Файл записан.")
        }
        else if (l == 2)
        {
            System.exit(0)
        }
        else
        {
            System.exit(0)
        }

    }
    fun Readfile(nacekomie: Nacekomie)
    {
        try {
            println("Хотите прочитать информацию с файла: 1 - Да, 2 - Нет")
            var n = readLine()!!.toInt()
            if (n == 1)
            {
                println("Введите директорию файла и название: ")
                var file_path = readLine()!!.toString()
                var name_file = readLine()!!.toString()

                var read = File(file_path,name_file).readText()
                println(read)
            }
            else
            {
                System.exit(0)
            }
        }
        catch (ex:Exception)
        {
            println("Ошибка: ${ex.message}");
        }

    }
}