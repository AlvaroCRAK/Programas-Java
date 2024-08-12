import math
simbolo = input("Ingrese la operacion: \nSuma: +\nResta: -\nMultiplicacion: *\nDivision: /\nPotencia: p\nRadicacion: r\n")
num1 = num2 = 0.0
texto = "Respuesta: "

if(simbolo[0] == '+' or simbolo[0] == '-' or simbolo == '*' or simbolo == '/'):

    num1 = float(input("Ingrese el primer operador: "))
    num2 = float(input("Ingrese el segundo operador: "))

    if(simbolo[0] == '+'):
        print(texto + str(num1 + num2))
    elif(simbolo[0] == '-'):
        print(texto + str(num1 - num2))
    elif(simbolo[0] == '*'):
        print(texto + str(num1 * num2))
    elif(simbolo[0] == '/'):
        print("{s} {:.2f}",texto, str(num1 / num2))

elif(simbolo[0] == 'p' or simbolo[0] == 'r'):

    num1 = float(input("Ingrese la base: "))
    num2 = float(input("Ingrese la potencia: "))
    if(simbolo == 'p'):
        print("{s} {:.2f}",texto, str(num1 ** num2))
    elif(simbolo == 'r'):
        print("{s} {:.2f}",texto, str(math.pow(num1, 1/num2)))

print("Gracias por usarme :)")
