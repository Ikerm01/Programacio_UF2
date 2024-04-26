#Pre:Diseñar un sistema de gestion de una pizzeria
pedido = []
estoc = []
pizza_preparada = []
def tomar_la_comanda(pedido):
    pizza = input("¿Qué pizza desea? ")
    pedido.append(pizza)

def preparacion_de_pizzas(pizza_preparada,pedido):
    for pizza in pedido:
        pizza.append(pizza_preparada)
    if pizza in pizza_preparada:
        print("Preparando pizzas...")        

def gestion_del_estoc_ingredientes():
    for ingredientes in estoc:
        print("Pan, Queso, Tomate, Jamon, Carne, Huevo")

def proceso_de_pagar():
    total = 0 
    precio = 0
    for pizza in pedido:
        total += precio
        print("El precio de la ,",pizza,"es", total)

opcion = "0"
while opcion != "5":
    
    print("\n1. Tomar la comanda")
    print("2. Preparación de pizzas")
    print("3. Gestión del stock de ingredientes")
    print("4. Proceso de pagar")
    print("5. Salir")
    opcion = input("Seleccione una opción: ")
    
    
    if opcion == "1":
        tomar_la_comanda(pedido)
    elif opcion == "2":
        preparacion_de_pizzas(pizza_preparada,pedido)
    elif opcion == "3":
        gestion_del_estoc_ingredientes()
    elif opcion == "4":
        proceso_de_pagar()
    elif opcion == "5":
        print("Saliendo del programa...")
        break
    else:
        print("Opción no válida. Por favor, seleccione una opción válida.")

#Post:Acabar con un programa con cohesion y acoplat
#Post:Acabar con un programa con cohesion y acoplat

