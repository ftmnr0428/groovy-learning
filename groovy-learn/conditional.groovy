if( true ) {
    println "true"
}

if(false){
    println "true"
} else{
    println "false"
}

def age = 35
if(age >= 35){
    println "can run for president"
}

// ternary operator (expression) ? true : false

def name = 'Dan'
def isitdan = (name.toUpperCase() == 'DAN') ? 'YES' : 'NO'
println isitdan