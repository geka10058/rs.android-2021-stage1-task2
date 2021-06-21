package subtask2

class Abbreviation {


    fun abbreviationFromA(a: String, b: String):String {
        var p=0
        for(i in 0..b.length-1){
            for(j in i..a.length-1) {
                if (a[j].toLowerCase() == b[i].toLowerCase()) {
                    p++
                }
            }
        }
        return if (b.length==p){
            "YES"
        }else{
            "NO"
        }

    }
}