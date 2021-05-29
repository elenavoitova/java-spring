package app.db;

import app.Customer;

import java.util.*;

public class Customers <Customer> implements DAO <Customer>{

    private final List <Customer> list = new ArrayList<>();

    @Override
    public Customer save(Customer obj) {
        return null;
    }

    @Override
    public boolean delete(Customer obj) {
        return false;
    }

    @Override
    public void deleteAll(List<Customer> entities) {

    }

    @Override
    public void saveAll(List<Customer> entities) {

    }

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public boolean deleteById(long id) {
        return false;
    }

    @Override
    public Customer getOne(long id) {
        return null;
    }
}
