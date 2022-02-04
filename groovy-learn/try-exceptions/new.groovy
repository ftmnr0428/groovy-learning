//simple strategy
import groovy.transform.builder.*

@Builder(builderStrategy=SimpleStrategy)
class Person{
    String firstName
    String lastName
    int age
}
def person = new Person().setFirstName("robert").setLastName("vega").setAge(21)
assert person.firstName == "robert"
assert person.lastname == "vega"
assert person.age == 21


//map
def person = [first:"Dan",last:"Vega",email:"danvega@gmail.com"]
println person
println person.first
for ( i in person.keySet() ) {
    println "$i:${person[i]}"
}


name = "Fatma"
isitfatma = (name.toUpperCase() == 'FATMA') ? 'YES' : 'NO'
println isitfatma

//elvis
def msg
def output = (msg != null) ? msg : 'defult msg'
def elvis = msg ?: 'default msg' 
println msg
println output
println elvis

//for

for (String it in 'a'..'z'){
    if(it=='a') continue
    println it
    if(it>'e') break
}

//exception
def Fatma() {
    //do stuf
    throw new Exception("Foo Exception")
    
}
List log = []
try{
    Fatma()
} catch(Exception e){
    log << e.message
} finally{
    log << 'finally'
}
println log
