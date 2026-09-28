import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args){
        double numero,metade;
        numero=Double.parseDouble(JOptionPane.showlnputDialog("Insira um nemero:"));
if ( numero > 10){
    metade = numero / 2;
    JOptionPane.showMessageDialog(null,"A metade é:" + metade);
}
}
}