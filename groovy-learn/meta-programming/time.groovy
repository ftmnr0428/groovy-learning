//There are different category classes
import groovy.time.TimeCategory

//use --> keyword to use category classes
use(TimeCategory) {
    println 5.minute.from.now
    println 10.hours.ago
    
    def someDate = new Date()
    println someDate - 3.months
}






 