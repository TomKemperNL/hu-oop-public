class Student:
    def __init__(self, name, nr=0):
        self._name = name  # private wordt ongeveer opgelost met een underscore in python, als je dat echt wilt
        self.studentnr = nr

    def __str__(self):
        return "Deze student heet " + self._name + " en heeft nr " + str(self.studentnr)

    @property  # Dit is hoe je hetzelfde gedrag als in Java krijgt
    def name(self):
        return self._name


student1 = Student("Sylvester")
student2 = Student("Karel", 98765432)

print("naam: " + student1.name)
print("nummer: " + str(student1.studentnr))
student1.studentnr = 12345678 # Python heeft dus geen 'setXYZ' methodes zoals Java
print("__to_s__: " + str(student1))
print("")

print("naam: " + student2.name)
print("nummer: " + str(student2.studentnr))
print("__to_s__: " + str(student2))
