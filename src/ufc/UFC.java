
package ufc;

public class UFC {

    public static void main(String[] args) {
        
        //Vetores
        Lutador l[] = new Lutador[5];
            l[0] = new Lutador("Mario Pancada", "Italia", 31, 1.75f, 68.8f, 11, 2, 1);
            l[1] = new Lutador("Mike Voadora", "Estados Unidos", 27, 1.80f, 67.8f, 13, 2, 3);
            l[2] = new Lutador("Alisson Quebra-tudo", "Brasil", 39, 1.70f, 110.0f, 31, 0, 5);
            l[3] = new Lutador("Pedro Pedra", "Holanda", 25, 1.69f, 79.5f, 2, 9, 4);
            l[4] = new Lutador("Wagner Porrada", "Alemanha", 30, 1.87f, 90.2f, 22, 4, 3);
        
        l[0].apresentar();
        l[1].apresentar();
        l[2].apresentar();
        l[3].apresentar();
        l[4].apresentar();
    }
    
}
