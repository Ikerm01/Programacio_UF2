from prestamo.libro import Libro
#from socio import Socio

class Prestamo:
    def __init__(self, libro: Libro,): #socio: Socio):
        self.libro = libro
        #self.socio = socio

    def registrar_prestamo(self, fecha: str):
        print(f"Prestamo registrado: Libro {self.libro.titulo}, Libro {self.libro.nombre}, Fecha: {self.fecha}")
        self.libro.prestar()

    def devolver_prestamo(self):
        print(f"Devolucion de Prestamo: Libro {self.libro.titulo}, Libro {self.libro.nombre}")
        self.libro.devolver()

    def informacion(self):
        print(f"Prestamo del libro {self.libro.titulo} al libro {self.libro.nombre} {self.libro.apellido}")