package dao;

public class DaoImpl implements IDao {
    public double getData() {
        System.out.println("Getting data from database");
        double data = 1.0;
        return data;
    }
}
