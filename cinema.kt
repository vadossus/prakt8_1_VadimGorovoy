import java.io.File
import java.awt.Desktop
import java.net.URI

class cinema {
    var name_cinema = ""
    var sianse = ""
    var price = 0.0
    var zal = ""
    var count_zritelei = 0.0

    fun input(cin: cinema) {
        try {
            println("Введите название кинотеатра")
            cin.name_cinema = readLine()!!.toString()
            println("Введите сеанс в кинотеатре")
            cin.sianse = readLine()!!.toString()
            println("Введите цену билета")
            cin.price = readLine()!!.toDouble()
            println("Введите зал")
            cin.zal = readLine()!!.toString()
            println("Введите количество зрителей")
            cin.count_zritelei = readLine()!!.toDouble()
        } catch (ex: Exception) {
            println("Ошибка")
        }
    }

    fun output() {
        println("Кинотеатр: $name_cinema\nСеанс: $sianse\nЦена: $price\nЗал: $zal\nКоличество зрителей: $count_zritelei")
    }

    fun file(cin: cinema) {
        println("Хотите записать в файл:\n1 - Да\n2 - Открыть файл\n3 - Закрыть программу")
        var l = readLine()!!.toInt()

        if (l == 1) {
            var filename = readLine().toString()
            val writer = File("${cin.name_cinema}.txt").bufferedWriter()
            writer.write("Название кинотеатра: ${cin.name_cinema}")
            writer.newLine()
            writer.write("Сеанс: ${cin.sianse}")
            writer.newLine()
            writer.write("Цена билета: ${cin.price}")
            writer.newLine()
            writer.write("Зал: ${cin.zal}")
            writer.newLine()
            writer.write("Количество зрителей: ${cin.count_zritelei}")
            println("Файл записан.")
            writer.close()
        }
        if (l == 2) {
            readfile(this)
        } else {
            System.exit(0)
        }

    }

    fun readfile(cin: cinema)
    {
        try {
            println("Хотите прочитать информацию с файла: 1 - Да, 2 - Нет")
            var n = readLine()!!.toInt()
            if (n == 1)
            {
                println("Введите директорию файла и название: ")
                var file_path = readLine()!!.toString()
                var name_file = readLine()!!.toString()

                var read = File(file_path, name_file).readText()
                println(read)
            }
            else
            {
                System.exit(0)
            }
        }
        catch (ex:Exception)
        {
            println("Ошибка: ${ex.message}")
        }




    }

    fun openLink(url: String)
    {
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE))
        {
            val desktop = Desktop.getDesktop()
            desktop.browse(URI(url))
        }
        else
        {
            println("Не поддерживается открытие ссылки")
        }
    }
}