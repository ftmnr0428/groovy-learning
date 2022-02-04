import groovy.transform.*

@ToString
@Sortable
class Person {

    String first
    String last
}
def p1 = new Person(first:"Joe", last:"Vega")
def p2 = new Person(first:"Dan", last:"Vega")

def people = [p1, p2]

println people.sort()

def number = "1"
number = 10
number = 10 + "1" //string
number.class

x = 15 //integer
x.class


y = 1.2 //big decimal
result = x/y
result.class

f = 787347834484773437473477374 //big integer

k = 6437867486782982828837874747777328877277747737878 //big integer
k.class
f.class

byte t = 1 //byte in java
t.class
short n = 5000 //short in java 
n.class

m = 15000000000000 //long 
m.class

float p = 5.55 //float in java 
p.class

double h = 19.99 //double in java
h.class

20.times {         // ---
    print '-'
}

1.upto(10) { num ->      //1 to 10
    println num
}

10.downto(1) { num ->   //10 to 1
    println num
}

0.step(1,0.1) { num ->
    println num 
}

//operator
a = "hello"
b = ", world"
println a + b
println a.plus(b)
