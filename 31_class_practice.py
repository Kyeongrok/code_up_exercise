class cat:
    def __init__(self,age,weight,height,color,first_name):
        self.age=age
        self.weight=weight
        self.height=height
        self.color=color
        self.first_name=first_name
luke=cat(3,5.25,30,'grey,white,black,brown',"Luke")
print(luke.color)

amber=cat(4,3.4,26,'black',"Amber")
print(amber.height)

print(luke.weight)
print(amber.weight)
print(luke.weight-amber.weight)