from prestamo import Prestamo
from prestamo.libro import Libro
from prestamo.socio import Socio
class App:
    def exec(self):
        #Crear libros
        libro1: Libro = Libro("El senyor de los anillos", "J.R.R. Tolkien", 3)
        libro2: Libro = Libro("1984", "George Orwell", 5)

        #Crear socios
        socio1: Socio = Socio("Unai", "Rosal", 101)
        socio2: Socio = Socio("Oscar", "Gomez", 202)

        #Crear Prestamo
        prestamo1: Prestamo = Prestamo()
        prestamo2: Prestamo = Prestamo()

        #Realizar acciones
        libro1.informacion()
        socio2.informacion()
        socio1.solicitar_prestamo(libro1, "2024-03-15")
        libro1.informacion()
        socio2.devolver_prestamo(libro1)
        libro1.informacion()
        prestamo1.registrar_prestamo()
        prestamo2.devolver_prestamo()


app = App()
app.exec()