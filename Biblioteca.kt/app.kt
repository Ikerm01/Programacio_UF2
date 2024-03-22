Package Biblioteca
import Biblioteca.Libro
import Biblioteca.Socio


Class app{
    fun exec(){
        var libro1: Libro = Libro("El senyor de los anillos", "J.R.R. Tolkien", 3)
        var libro2: Libro = Libro("1984", "George Orwell", 5)
    
        var socio1: Socio = Socio("Unai", "Rosal", 101)
        var socio2: Socio = Socio("Oscar", "Gomez", 202)

		libro1.informacion()
		socio1.solicitarPrestamo(libro1, "2024-03-01")
		libro1.informacion()
		libro2.informacion()
		socio2.solicitarPrestamo(libro2, "2024-03-01")
		libro2.informacion()
		libro1.informacion()
		socio1.devolverPrestamo(libro1)
		libro1.informacion()
    }
}


fun main() {
	App().exec()
}