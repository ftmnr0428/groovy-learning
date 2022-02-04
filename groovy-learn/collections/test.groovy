// if
if( true )
  println "value is true"
  
// false | null | empty string 
if( false )
  println "value is false"
  
if( !false )
  println "value is false"
  
String name = null
if( name )
  println "name has a value"
  
String last = ""
if( last )
  println "name has a value"
  
String myname = "fatma"
if( myname )
  println "name has a value"
  
//if-else  
def x = 10
if( x == 10) {
  println "x is 10"
} else {
  println "x is not 10"
}

//classic while
def i = 1
while( i <= 10 ) {
  println i
  i++
}

//for in list
def list = [1,2,3,4]
for(num in list) {
  println num
}
  
//closure
def list2 = [1,2,3,4,5,6]
list2.each { println it }
  
//switch

def mynum = 10

switch(mynum) {
    case 1:
        println "num is 1"
        break
    default:
        println "we hit the default case"
}