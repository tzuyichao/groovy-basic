assert "one: ${1}".hashCode() != "one: 1".hashCode()

def key = "a"
def m = ["${key}": "letter ${key}"]
assert m["a"] == null
println m.toString()
