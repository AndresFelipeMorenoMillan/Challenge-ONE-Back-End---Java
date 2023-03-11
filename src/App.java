import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Object[] opciones = {"Convertir Divisas","Convertir Temperatura","Convertir distancias","Salir"};
        int eleccion = JOptionPane.showOptionDialog(null,"¿Qué quieres hacer?","Conversor",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opciones,opciones[0]);

        switch(eleccion){

            case 0:{

                DecimalFormat formatearDivisa = new DecimalFormat("#.##");
                boolean continuarPrograma = true;

                while(continuarPrograma){

                    String [] divisas = {"COP a Dolar","COP a Euro","COP a Libra Esterlina","COP a Yen","COP a Won","Dolar a COP","Euro a COP","Libra Esterlina a COP","Yen a COP","Won a COP"};
                    String cambio=(String) JOptionPane.showInputDialog(null, "Elija una opción: ", "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE,null,divisas,divisas[0]);

                    if(cambio == null || cambio == ""){
                        continuarPrograma = false;
                        JOptionPane.showMessageDialog(null, "Programa Finalizado");
                        System.exit(0);
                    } 

            
                    String input = JOptionPane.showInputDialog(null, "¿Cuánto dinero va a convertir?:");
                    double dinero = 0;

                    try {
                        dinero = Double.parseDouble(input);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Formato no valido");
                    }

                    if(cambio.equals("COP a Dolar")){
                        double dolares = dinero/4712.95;
                        JOptionPane.showMessageDialog(null, dinero+" COP son: "+formatearDivisa.format(dolares)+" dolares.");
                    }else  if(cambio.equals("COP a Euro")){
                        double euros = dinero/5020.72;
                        JOptionPane.showMessageDialog(null, dinero+" COP son: "+formatearDivisa.format(euros)+" euros.");
                    }else  if(cambio.equals("COP a Libra Esterlina")){
                        double libraesterlina = dinero/5677.46;
                        JOptionPane.showMessageDialog(null, dinero+" COP son: "+formatearDivisa.format(libraesterlina)+" libras esterlinas.");
                    }else  if(cambio.equals("COP a Yen")){
                        double yen = dinero/35.00;
                        JOptionPane.showMessageDialog(null, dinero+" COP son: "+formatearDivisa.format(yen)+" Yen.");
                    }else  if(cambio.equals("COP a Won")){
                        double won = dinero/3.58;
                        JOptionPane.showMessageDialog(null, dinero+" COP son: "+formatearDivisa.format(won)+" Won.");
                    }else  if(cambio.equals("Dolar a COP")){
                        double dolar = dinero*4712.95;
                        JOptionPane.showMessageDialog(null, dinero+" Dolar son: "+formatearDivisa.format(dolar)+" COP.");
                    }else  if(cambio.equals("Euro a COP")){
                        double euro = dinero*5020.72;
                        JOptionPane.showMessageDialog(null, dinero+" Euro son: "+formatearDivisa.format(euro)+" COP.");
                    }else  if(cambio.equals("Libra Esterlina a COP")){
                        double librasesterlinas = dinero*5677.46;
                        JOptionPane.showMessageDialog(null, dinero+" Libra Esterlina son: "+formatearDivisa.format(librasesterlinas)+" COP.");
                    }else  if(cambio.equals("Yen a COP")){
                        double yen = dinero*35.00;
                        JOptionPane.showMessageDialog(null, dinero+" COP son: "+formatearDivisa.format(yen)+" Won.");
                    }else  if(cambio.equals("Won a COP")){
                        double won = dinero*3.58;
                        JOptionPane.showMessageDialog(null, dinero+" COP son: "+formatearDivisa.format(won)+" Won.");
                    }

                    int confirma = JOptionPane.showConfirmDialog(null, "¿Desea continuar haciendo conversiones?","", JOptionPane.YES_NO_OPTION);

                    if(confirma == JOptionPane.NO_OPTION){
                        continuarPrograma = false;  
                        JOptionPane.showMessageDialog(null, "Programa Finalizado");
                        System.exit(0);
                    }
                }
            }

            case 1:{

                boolean seguirPrograma = true;

                while (seguirPrograma) {

                    String [] grados = {"Celsius a Fahrenheit","Fahrenheit a Celsius"};
                    int cambio = JOptionPane.showOptionDialog(null, "Elija una opción: ", "Conversor de Temperatura",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,grados,grados[0]);
                    String valorNominal = JOptionPane.showInputDialog(null, "Ingrese valor a convertir");

                    double valor = 0;

                    try {
                        valor = Double.parseDouble(valorNominal);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor no válido");
                        System.exit(0);
                    }

                    double resultado = 0;

                    if(cambio == 0){
                        resultado = (valor*9/5)+32;
                        JOptionPane.showMessageDialog(null, valor+" Grados Celsius son: "+resultado+" Grados Fahrenheit");
                    }else if(cambio == 1){
                        resultado = (valor-32)*5/9;
                        JOptionPane.showMessageDialog(null, valor+" Grados Fahrenheit son: "+resultado+" Grados Celsius");
                    }

                    int continuar = JOptionPane.showConfirmDialog(null, "¿Desea seguir usando el programa?","",JOptionPane.YES_NO_OPTION);

                    if(continuar == JOptionPane.NO_OPTION){
                        seguirPrograma = false;
                        JOptionPane.showMessageDialog(null, "Programa Finalizado");
                        System.exit(0);
                    }
                }
            }

            case 2:{

                boolean seguirPrograma = true;

                while(seguirPrograma){

                    String [] distancia = {"Centimetros a Metros","Metros a Kilometros","Kilometros a Millas", "Kilometros a Años Luz","Metros a Centimetros","Kilometros a Metros","Millas a Kilometros", "Años Luz a Kilometros"};
                    int cambio = JOptionPane.showOptionDialog(null, "Elija una opción: ", "Conversor de Temperatura",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,distancia,distancia[0]);
                    String valorNominal = JOptionPane.showInputDialog(null, "Ingrese valor a convertir");

                    double valor = 0;

                    try {
                        valor = Double.parseDouble(valorNominal);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor no válido");
                        System.exit(0);
                    }

                    double resultado = 0;

                    if(cambio == 0){
                        resultado = valor/100;
                        JOptionPane.showMessageDialog(null, valor+" Centimetros son: "+resultado+" Metros");
                    }else if(cambio == 1){
                        resultado = valor/1000;
                        JOptionPane.showMessageDialog(null, valor+" Metros son: "+resultado+" Kilometros");
                    }else if(cambio == 2){
                        resultado = valor*0.621371;
                        JOptionPane.showMessageDialog(null, valor+" Kilometros son: "+resultado+" Millas");
                    }else if(cambio == 3){
                        resultado = valor*0.00000000000010570;
                        JOptionPane.showMessageDialog(null, valor+" Kilometros son: "+resultado+" Años Luz");
                    }else if(cambio == 4){
                        resultado = valor*100;
                        JOptionPane.showMessageDialog(null, valor+" Metros son: "+resultado+" Centimetros");
                    }else if(cambio == 5){
                        resultado = valor*1000;
                        JOptionPane.showMessageDialog(null, valor+" Kilometros son: "+resultado+" Metros");
                    }else if(cambio == 6){
                        resultado = valor*1.609344;
                        JOptionPane.showMessageDialog(null, valor+" Millas son: "+resultado+" kilometros");
                    }else if(cambio == 7){
                        resultado = valor/0.00000000000010570;
                        JOptionPane.showMessageDialog(null, valor+" Años Luz son: "+resultado+" Kilometros");
                    }

                    int continuar = JOptionPane.showConfirmDialog(null, "¿Desea seguir usando el programa?","",JOptionPane.YES_NO_OPTION);

                    if(continuar == JOptionPane.NO_OPTION){
                        seguirPrograma = false;
                        JOptionPane.showMessageDialog(null, "Programa Finalizado");
                        System.exit(0);
                    }

                }

                
            }

            case 3:{

                JOptionPane.showMessageDialog(null, "Programa Cerrado");
                System.exit(0);
                break;

            }
        }

    }
}
