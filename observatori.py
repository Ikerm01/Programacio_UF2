#Pre: Hacer un programa que regriste la temperatura semanal para un observatorio
temperatura_semanal = []
fecha_acutal = []
########################.replace(',','.')
#for temperatura in lector.split():
#temperaturas.append(float(temperatura.replace(',','.')))
def regristar_temperatura_setmanal(temperatura_semanal):
    temperaturas = input("Escriu les temperatures d'aquesta setmana")
    temperatura_semanal.append(temperaturas)
def consultar_temperatura_mitjana():
    for temperaturas in temperatura_semanal:
        suma = 0
        media_temperatura = temperaturas.split(',')
        for temperatura in media_temperatura:
            suma += int(temperatura)
        media = suma /len(temperaturas)
        media_temperatura.append(media)
        print(media_temperatura)
def consultar_diferencia_maxima(array):
    size = len(array)
    for i in range(0, len(array)):
        for j in range(0,size - i -1):
            if array[j] > array[j+1]:
                array[j], array[j+1] = array[j+1], array[j]
    maximo = array[-1]
    minimo = array[0]
    diferencia = maximo - minimo
    print(diferencia)

opcion = 0

while opcion != "FI":
    print("[RT]. Registrar temperatures setmanals.")
    print("[MJ]. Consultar temperatura mitjana. ")
    print("[DF]. Consultar diferència màxima.")
    print("[FI]. Salir")
    
    opcion = input("Seleccione una opción: ")

    if opcion == "RT":
        regristar_temperatura_setmanal(temperatura_semanal)
    elif opcion == "MJ":
        consultar_temperatura_mitjana()
    elif opcion == "DF":
        consultar_diferencia_maxima(temperatura_semanal)
    elif opcion == "FI":
        print("Saliendo del programa...")
        break
#Post:Poder consultar en cualquier momento cuál ha sido la temperatura media y la diferencia entre el valor máximo y mínimo registrados y la fecha actual también se muestra en pantalla.
