
package MiniProyecto;


public class Main {
    public static void main(String[] args) {
        AppContacto empresa1 = new AppContacto();
        Menu menu1 = new Menu(empresa1);
        menu1.mostrar();
    }
    
}
