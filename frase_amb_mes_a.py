
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
    frase = input("Introduce la frase") 
    frases.append(frase)
    return frase    

def llegir_frase(frase):
    contador = 0    
    for letra in frase.lower():
        if letra == 'a':
            contador +=1
    return contador
def mostrar_frase(frase,contador):
    print("La frase amb mes 'a' es: ")

def final_del_programa():
    global fi
    fi = True

inici()