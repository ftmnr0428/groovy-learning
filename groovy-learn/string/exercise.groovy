def text = 'Just saying: "Groovy is gr8!"'
 
// Return all characters before the first quote.
assert text.takeBefore('"') == 'Just saying: '
// return after colon 
assert text.takeAfter(': ') == '"Groovy is gr8!"'
// Return text between is and !.
assert text.takeBetween('is', '!') == ' gr8'

// When no value can be found
// an empty string is returned.
assert text.takeBefore('?') == ''
assert text.takeAfter('Java') == ''
assert text.takeBetween('-') == ''
assert text.takeBetween('[', '/') == ''

def sample = 'JVM languages are "Groovy", "Clojure", "Java".'
 
assert sample.takeBetween('"') == 'Groovy'
// We can also specify which occurrence we
// want for a text between same strings.
assert sample.takeBetween('"', 0) == 'Groovy'
assert sample.takeBetween('"', 1) == 'Clojure'
assert sample.takeBetween('"', 2) == 'Java'


// Check using !(obj instanceof type)
// if object is not an instance of type.
assert !("Groovy is awesome!" instanceof Number)
 
// Since Groovy 3 we can use !instanceof to check
// if object is not an instance of a type.
assert 42 !instanceof String
 
 