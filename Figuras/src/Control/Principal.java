package Control;

import Vista.Menu;

public class Principal {
    public static void main(String[] args) {
        Menu frame = new Menu();
        frame.setLocation(100,100);
        frame.setSize(980,550);
        frame.addEventos();
        frame.setVisible(true);
    }
}