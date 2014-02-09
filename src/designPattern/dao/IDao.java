//http://javarevisited.blogspot.mx/2013/01/data-access-object-dao-design-pattern-java-tutorial-example.html
//http://stackoverflow.com/questions/7232080/how-to-design-a-dao-class

package designPattern.dao;

public interface IDao<T> {
    boolean save(T t);
    boolean update(T t);
    boolean delete(T t);
}

enum CustomerDAO implements IDao<Customer> {
    
    DAO;
    
    @Override
    public boolean save(Customer t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Customer t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Customer t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

class CustomerDao implements IDao<Customer> {
    
    private static final CustomerDao CUSTOMER_DAO = new CustomerDao();
    
    private CustomerDao() {}
    
    public CustomerDao getInstance() {
        return CUSTOMER_DAO;
    }
    
    @Override
    public boolean save(Customer t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Customer t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Customer t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class Customer {}