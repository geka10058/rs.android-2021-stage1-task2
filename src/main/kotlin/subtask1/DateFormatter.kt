package subtask1
import java.lang.Exception
import java.util.Calendar
import java.util.GregorianCalendar



class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        var dayOfWeek= 0

        var calendar = GregorianCalendar()
        calendar.set(Calendar.MONTH, month.toInt()-1)
        calendar.set(Calendar.YEAR,year.toInt())
        calendar.set(Calendar.DAY_OF_MONTH, day.toInt())
        dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK)
        var monthMap= mapOf( 0 to "января", 1 to "февраля", 2 to "марта", 3 to "апреля", 4 to "мая", 5 to "июня", 6 to "июля", 7 to "августя", 8 to "сентября", 9 to "октября", 10 to "ноября", 11 to "декабря")
        var dayOfWeekMap = mapOf(2 to "понедельник",3 to "вторник", 4 to "среда", 5 to "четверг", 6 to "пятница", 7 to "суббота", 1 to "воскресенье")
        var genasAnswer="$day ${monthMap.get(month.toInt()-1)}, ${dayOfWeekMap.get(dayOfWeek)}"

        if(calendar.get(Calendar.DAY_OF_MONTH) != day.toInt()|| month.toInt()-1>11){
            return "Такого дня не существует"}

        return genasAnswer

    }

}