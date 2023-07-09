
import javax.swing.*;

public class Principal {

    public static Object menu() {
        Object[] opcionMenu = {"1. Conversor de Monedas", "2. Conversor de Temperatura"}; //Creamo el objeto opcionMenu
        Object opcion = JOptionPane.showInputDialog(null, "Selecciona una opcion de conversion", "Menu", JOptionPane.QUESTION_MESSAGE, null, opcionMenu, opcionMenu[0]);//Mostramos la lista desplegable para el ususario
        return opcion;
    }

    public static void menuMoneda() {
        String cantidad;
        double cant;
        double total;
        String totalFormato;

        Object[] opcionMenuMonedas = {"1. Dolar a Lempira", "2. Euro a Lempira", "3. Yen Japones a Lempira",
            "4. LIbra Esterlina a Lempira", "5. Yuan Chino a Lempira", "6. Won Coreano a Lempira",
            "7. Lempira a Dolar", "8. Lempira a Euro", "9. Lempira a Yen Japones", "10. Lempira a LIbra Esterlin", "11. Lempira a Yuan Chino", "12. Lempira a Won Coreano"}; //Creamos el objeto opcionMenuMonedas
        Object opcionMonedas = JOptionPane.showInputDialog(null, "Selecciona la Moneda a convertir", "Menu de Monedas", JOptionPane.QUESTION_MESSAGE, null, opcionMenuMonedas, opcionMenuMonedas[0]);//Mostramos la lista desplegable para el ususario
        String opcion = (String) opcionMonedas;

        try {
            cantidad = JOptionPane.showInputDialog("La cantidad de Dinero que desea convertir");
            cant = Double.parseDouble(cantidad);

            switch (opcion) {
                case "1. Dolar a Lempira":
                    total = cant * 24.61;
                    totalFormato = String.format("%.2f", total);
                    JOptionPane.showMessageDialog(null, cant + " Dolares es igual a : " + totalFormato + " Lempiras");
                    break;

                case "2. Euro a Lempira":
                    total = cant * 26.97;
                    totalFormato = String.format("%.2f", total);
                    JOptionPane.showMessageDialog(null, cant + " Euros es igual a : " + totalFormato + " Lempiras");
                    break;

                case "3. Yen Japones a Lempira":
                    total = cant * 0.17;
                    totalFormato = String.format("%.2f", total);
                    JOptionPane.showMessageDialog(null, cant + " Euros es igual a " + totalFormato + " Lempiras");
                    break;

                case "4. LIbra Esterlina a Lempira":
                    total = cant * 31.59;
                    totalFormato = String.format("%.2f", total);
                    JOptionPane.showMessageDialog(null, cant + " LIbra Esterlina es igual a : " + totalFormato + " Lempiras");
                    break;

                case "5. Yuan Chino a Lempira":
                    total = cant * 3.40;
                    totalFormato = String.format("%.2f", total);
                    JOptionPane.showMessageDialog(null, cant + " Yuan Chino es igual a : " + totalFormato + " Lempiras");
                    break;

                case "6. Won Coreano a Lempira":
                    total = cant * 0.018;
                    totalFormato = String.format("%.2f", total);
                    JOptionPane.showMessageDialog(null, cant + " Yuan Chino es igual a : " + totalFormato + " Lempiras");
                    break;

                case "7. Lempira a Dolar":
                    total = cant / 24.61;
                    totalFormato = String.format("%.2f", total);
                    JOptionPane.showMessageDialog(null, cant + " Lempiras es igual a : " + totalFormato + " Dolares");
                    break;

                case "8. Lempira a Euro":
                    total = cant / 26.97;
                    totalFormato = String.format("%.2f", total);
                    JOptionPane.showMessageDialog(null, cant + " Lempiras es igual a : " + totalFormato + " Euros");
                    break;

                case "9. Lempira a Yen Japones":
                    total = cant / 0.17;
                    totalFormato = String.format("%.2f", total);
                    JOptionPane.showMessageDialog(null, cant + " Lempiras es igual a : " + totalFormato + " Yenes Japoneses");
                    break;

                case "10. Lempira a LIbra Esterlin":
                    total = cant / 31.59;
                    totalFormato = String.format("%.2f", total);
                    JOptionPane.showMessageDialog(null, cant + " Lempiras es igual a : " + totalFormato + " Libras Esterlinas");
                    break;

                case "11. Lempira a Yuan Chino":
                    total = cant / 3.40;
                    totalFormato = String.format("%.2f", total);
                    JOptionPane.showMessageDialog(null, cant + " Lempiras es igual a : " + totalFormato + " Yuanes Chinos");
                    break;

                case "12. Lempira a Won Coreano":
                    total = cant / 0.018;
                    totalFormato = String.format("%.2f", total);
                    JOptionPane.showMessageDialog(null, cant + " Lempiras es igual a : " + totalFormato + " Wons Coreanos");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, cant + "Error Desconocido");
            }//Fin del Switch Case
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Error el Caracter escrito no es correcto (Solo se admiten caracteres numericos)");
            menuMoneda();
        }//Fin del catch

    }//Fin del metodo menuMoneda

    public static void programa() {
        if (menu() == "1. Conversor de Monedas") {
            menuMoneda();
            int response = JOptionPane.showConfirmDialog(null, "Desea Continuar?", "Continuar",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Hasta Luego");
            } else if (response == JOptionPane.CANCEL_OPTION) {
                programa();
            } else if (response == JOptionPane.YES_OPTION) {
                programa();
            }
        }
    }//Fin del metodo programa

    public static void main(String[] args) {

        programa();

    }//Fin del Main

}//Fin de la clase principal
