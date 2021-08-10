
package poofiguras;

import javax.swing.JOptionPane;


public class figuras {
    public void cuadrado(){
        int lado,area;
        lado = Integer.parseInt(JOptionPane.showInputDialog("Digite el lado del cuadrado"));
        area=lado*lado;
        JOptionPane.showMessageDialog(null,"El area del cuadrado es: "+ area);
    }
    public void triangulo(){
        Double base,altura,area;
        base=Double.parseDouble(JOptionPane.showInputDialog("Digite la base del triangulo"));
        altura=Double.parseDouble(JOptionPane.showInputDialog("Digite la altura del triangulo"));
        area=(base*altura)/2;
        JOptionPane.showMessageDialog(null,"El area del triangulo es: "+area);
    }
    public void rectangulo(){
        int base,altura,area;
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite la base del rectagulo"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite la altura del rectagulo"));
        area=base*altura;
        JOptionPane.showMessageDialog(null,"El area del rectangulo es: "+ area); 
    }
    public void circulo(){
        double area,radio;
        radio=Double.parseDouble(JOptionPane.showInputDialog("Digite el radio del circulo"));
        area=3.14*(radio*radio);
        JOptionPane.showMessageDialog(null,"El area del circulo es: "+area);
    }
    
        
}
