package presentation;

import dao.DaoImpl;
import metier.IMetierImpl;

public class presentationV1 {
    public static void main(String[] args) {
        /*
         * Injection des dependances par instanciation statique
         */

        DaoImpl dao = new DaoImpl();
        IMetierImpl metier = new IMetierImpl();

        metier.setDao(dao);

        System.out.println(metier.calcul());
    }
}
