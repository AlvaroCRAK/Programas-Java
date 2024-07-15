import javax.swing.JOptionPane;
public class Main{
	public static void main(String[] args) {
		int codigo = 0, cantidad = 0;
		double precio = 0;
		JOptionPane.showMessageDialog(null, "Bienvenido a la heladeria palermo:");
		do {
			try {
				codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto:\n101:     [1]\n102:     [2]\n103:     [3]\n"));
			}catch(NumberFormatException exception) {
				JOptionPane.showMessageDialog(null, "Ingrese bien los datos:\n");
			}
		}while(codigo != 1 && codigo != 2 && codigo != 3);
		
		do {
			try {
				cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a comprar: "));
			}catch(NumberFormatException exception){
				JOptionPane.showMessageDialog(null, "Ingrese un dato valido:");
			}
		}while(cantidad <= 0);
		switch(codigo) {
		case 1:
			precio = 21.5; break;
		case 2:
			precio = 30; break;
		case 3:
			precio = 15.5; break;
		}
		
		if(precio * cantidad >= 700) JOptionPane.showMessageDialog(null,"El importe de compra es de: " + (precio * cantidad) + "\nEl importe del descuento es de: " + (precio * cantidad * 0.16) + "\nEl importe a pagar es de: " + (precio * cantidad * 0.84));
		else if(precio * cantidad >= 500) JOptionPane.showMessageDialog(null,"El importe de compra es de: " + (precio * cantidad) + "\nEl importe del descuento es de: " + (precio * cantidad * 0.14) + "\nEl importe a pagar es de: " + (precio * cantidad * 0.86));
		else if(precio * cantidad >= 200)JOptionPane.showMessageDialog(null,"El importe de compra es de: " + (precio * cantidad) + "\nEl importe del descuento es de: " + (precio * cantidad * 0.12) + "\nEl importe a pagar es de: " + (precio * cantidad * 0.88));
		else JOptionPane.showMessageDialog(null,"El importe de compra es de: " + (precio * cantidad) + "\nEl importe del descuento es de: " + (precio * cantidad * 0.10) + "\nEl importe a pagar es de: " + (precio * cantidad * 0.90));
		
	}
}
//zublime
