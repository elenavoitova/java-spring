package app.db;

import java.util.ArrayList;
import java.util.List;

public class Accounts<Account> implements DAO<Account> {

    private final List <Account> list = new ArrayList<>();

    @Override
    public Account save(Account obj) {
        return null;
    }

    @Override
    public boolean delete(Account obj) {
        return false;
    }

    @Override
    public void deleteAll(List<Account> entities) {

    }

    @Override
    public void saveAll(List<Account> entities) {

    }

    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public boolean deleteById(long id) {
        return false;
    }

    @Override
    public Account getOne(long id) {
        return null;
    }
}
