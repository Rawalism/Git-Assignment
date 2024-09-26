import turtle
raj_turtle = turtle.Turtle()
raj_turtle.speed(10)
"""
def square():
    raj_turtle.forward(100)
    raj_turtle.right(90)
    raj_turtle.forward(100)
    raj_turtle.right(90)
    raj_turtle.forward(100)
    raj_turtle.right(90)
    raj_turtle.forward(100)

for count in range(4):
    square()
"""
raj_turtle.color("red","yellow")
raj_turtle.begin_fill()
for i in range(50):
    raj_turtle.forward(200)
    raj_turtle.left(170)
raj_turtle.end_fill()
turtle.done()
