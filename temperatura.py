
def calcular(temp, medida):
    global c, f, k
    c = k = f = 0.0
    if(medida == "c" or medida == "C"):
        c = temp
        f = (temp * 9 / 5) + 32
        k = temp + 273
    elif(medida == "f" or medida == "F"):
        f = temp
        c = (temp - 32) * 5 / 9
        k = ((temp - 32) * 5 / 9) + 273
    elif(medida == "k" or medida == "K"):
        k = temp
        c = temp + 273
        f = ((temp - 273) * 9 / 5) + 32


medida = input("Ingrese la escala inicial: \nCentigrados: [c]\nFahrenheit: [f]\nKelvin: [k]")
temp = float(input("Ingrese la magnitud: "))
calcular(temp, medida)
print("Temperaturas: \nCentigrados: {:.2f}\nFahrenheit: {:.2f}\nKelvin: {:.2f}".format(c, f, k))
