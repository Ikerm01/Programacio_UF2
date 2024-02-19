fi = False
frases = []

def inici():
    while not fi:
        mostrar_opcio()
        tratar_opcio()

def mostrar_opcio():
    print("[1] Para introducir la frase")
    print("[2] Para finalizar el programa")

def tratar_opcio():
    opcio = input("Opcio: ")
    if opcio.casefold() == "1".casefold():
        pedir_frase()
    elif opcio.casefold() == "2".casefold():
        final_del_programa()
    else:
        print("Opcio incorrecta!")

def pedir_frase():
    frase = input("Escriu una frase: ")
    frases.append(frase)
    mostrar_resultado(frase)

def llegir_frase(frase):
    contador = 0
    for letra in frase.lower():
        if letra == 'a':
            contador += 1
    return contador

def mostrar_resultado(frase):
    frase_con_mas_a = []
    cantidad_de_a_maxima = 0
    for frase in frases:
        cantidad_de_a = llegir_frase(frase)
        if cantidad_de_a > cantidad_de_a_maxima:
            cantidad_de_a_maxima = cantidad_de_a
            frase_con_mas_a = frase
    print('La frase con más letras "a" es: ',frase_con_mas_a)
    print('Té',cantidad_de_a_maxima,"a.")

def final_del_programa():
    global fi
    fi = True

inici()
