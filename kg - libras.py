
try:
    character = input("Ingrese la unidad: \nKilogramos: [k]\nLibras: [l]\n")
    masa = float(input(f"Ingrese la masa: "))

    if(character == 'k' or character == 'K'):
        masa = masa * 2.205
        character = "Libras"

    elif(character == "L" or character == 'l'):
        masa = masa / 2.205
        character = "Kg"
    print(f"su conversion es de : {round(masa, 2)} {character}")
except Exception as e:
    print("Error de excepcion!")
