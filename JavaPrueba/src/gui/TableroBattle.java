
package gui;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class TableroBattle extends JPanel{
    public static void Tablero(){
        JFrame ventanaTablero = new JFrame(); //se crea la ventana 
        TableroBattle objetoPanel = new TableroBattle();//se crea el panel para poder dibujar dentro del JFrame 
        ventanaTablero.add(objetoPanel); //centrar ventana 
        ventanaTablero.setSize(600,600); //Tamaño de la ventana 
        ventanaTablero.setLocationRelativeTo(null); //posicion en el centro 
        ventanaTablero.setVisible(true);
        ventanaTablero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Se utiliza este metodo para poder cerrar la ventana correctamente 
        
    }
}
