def name = 'Groovy'
def template = """
    Dear Mr ${name},

    You're tje winner of the lottery!

    Yours sincerly,

    Dave
"""

assert template.toString().contains('Groovy')
assert template.toString().startsWith('\n')
println template.toString()