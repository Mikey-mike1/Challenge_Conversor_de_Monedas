
import javax.swing.*;

public class Principal {

    public static void main(String[] args) {
        Object[] opcionMenu = {"1. Conversor de Monedas", "2. Conversor de Temperatura"}; //Creamo el objeto opcionMenu
        Object opcion = JOptionPane.showInputDialog(null, "Selecciona una opcion de conversion", "Menu", JOptionPane.QUESTION_MESSAGE, null, opcionMenu, opcionMenu[0]);//Mostramos la lista desplegable para el ususario
       
        
        if (opcion == "1. Conversor de Monedas"){
        Object[] opcionMenuMonedas = {"1. Dolares a Lempiras", "2. Lempiras a Dolares", "3. Volver al Menu Principal"}; //Creamo el objeto opcionMenuMonedas
        Object opcionMonedas = JOptionPane.showInputDialog(null, "Selecciona una opcion de conversion", "Menu de Monedas", JOptionPane.QUESTION_MESSAGE, null, opcionMenuMonedas, opcionMenuMonedas[0]);//Mostramos la lista desplegable para el ususario

        int dls;
        String Slps;
        
        Slps = JOptionPane.showInputDialog("Cual es la cantidad de Dolares que desea convertir a Lempiras");
        dls = Integer.parseInt(Slps);
        
        System.out.println(dls);
        }
        
        
        
        
        
        
    }//Fin del Main

}//Fin de la clase principal
