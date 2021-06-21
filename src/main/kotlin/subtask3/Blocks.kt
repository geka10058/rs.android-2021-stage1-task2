package subtask3

import java.lang.StringBuilder
import java.time.LocalDate
import kotlin.reflect.KClass

class Blocks {


    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        var sumInt = 0
        var concatStr = StringBuilder()
        var date = LocalDate.of(1000, 2, 11)
        for (i in blockA) {

            when (i) {
                is Int -> sumInt += i
                is String -> concatStr.append(i)
                is LocalDate -> {
                    blockA.forEach {
                        if (it is LocalDate) {
                            if (it > date) date = it
                        }
                    }

                }
            }
        }

        when(blockB){
            String::class -> return concatStr.toString()
            Int::class -> return sumInt
            LocalDate::class -> return "${date.dayOfMonth}.${date.monthValue}.${date.year}"
            else -> return 0
        }


    }
}