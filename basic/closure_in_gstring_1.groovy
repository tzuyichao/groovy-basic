def x = 1
def gs = "x = ${-> x}"

assert gs == 'x = 1'

x = 2
assert gs == 'x = 2'