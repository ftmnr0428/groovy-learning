def mymethod(Closure c) {
    c()
}

def foo = {
    println "foo.."
}
mymethod(foo)

mylist = ["burak Kiraz", "tarik Kiraz", "faruk Kiraz"]
mylist.each{ name ->   
    println name      // or just use it
}

mymap = [baseball:"cleveland island", basketball:"cleveland cavs", football:"cleveland fenefrbahce"]
mymap.each{k, v ->    // just it
    println "$k = $v"
}