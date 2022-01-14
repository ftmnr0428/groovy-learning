def map = [:]
println map
println map.getClass().getName()

def person = [first:"dan",last:"vega",email:"dan@gmail.com"]
println person
println person.first

person.twitter = "@thereisdan"
println person
def twitter = [username:"Fatma", email:"@gmail.com"]
//def twitter = [username:"Fatma", "email address":"@gmail.com"]

println twitter
println person.size()
println twitter.size()
println person.sort()

//for 
for( entry in person ) {
    println entry
}

for( key in person.keySet() ) {
    println "$key:${person[key]}"
}