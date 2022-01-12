class Student:
    def __init__(self, name):
        self._name = name  # private wordt ongeveer opgelost met een underscore in python, als je dat echt wilt

    def __str__(self):
        return "Deze student heet " + self._name

    @property  # Dit is hoe je hetzelfde gedrag als in Java krijgt
    def name(self):
        return self._name


student1 = Student("Sylvester")
student2 = Student("Karel")

print("__to_s__: " + str(student1))
# print("__to_s__: " + student1) dit mag niet in Python, dus 'impliciet' toStringen is er niet bij
print("getter: " + student1.name)
print("__to_s__: " + str(student2))
print("getter: " + student2.name)

# Das beter
