package metier;

import dao.IDao;

public class IMetierImpl implements IMetier {
    //Couplage faible
    private IDao dao;

    public double calcul() {
        double data = dao.getData();
        System.out.println("Calculating data");
        data = data * 23;
        return data;
    }

    //pour injecter dans la variable dao un objet d'une classe qui implemente l'interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
