class Student:
    def __init__(self, name):
        self.name = name  # Python doet in principe niet moeilijk over public/private


student1 = Student("Jan")
student2 = Student("Wim")

print(student1)
print(student1.name)
print(student2)
print(student2.name)

# Valt ook in Python een beetje tegen nietwaar?
