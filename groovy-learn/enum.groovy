enum Days {
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

def dayRange = Days.SUNDAY..Days.SATURDAY

dayRange.each { day ->
    println day
}

println dayRange.size()
println dayRange.contains(Days.WEDNESDAY)

/ Bonus: next() and previous() are equivalent to
// ++ and -- operators.
def wednesday = Days.WEDNESDAY
assert Days.THURSDAY == ++wednesday
assert Days.WEDNESDAY == --wednesda


for( int x = 1; x <= 10; ++x) { 
    print x
}

println ""

for( int y = 10; y >= 1; --y) {
    print y
}

println ""

def letters = ['a','b','c']
for( int i = 0; i < letters.size(); ++i) {
    print letters[i]
}

