class Cat:
    def __init__(self,age,weight,height,color,first_name):                 999g       b          m     
        self.age = age
        self.weight = weight
        self.height = height
        self.color = color
        self.first_name = first_name


luke = Cat(3,5.25,30,'grey,white,black,brown',"Luke")

print(luke.first_name)

amber = Cat(4,3.4,26,'black',"Amber")

print(amber.color)


print(luke.weight)
print(amber.weight)

print(luke.weight-amber.weight)
