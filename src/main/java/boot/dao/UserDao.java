package boot.dao;



import boot.model.User;

import java.util.List;

public interface UserDao {
    User getByUserName(String username);

    void create(User a);

    User read(long id);

    void delete(long id);

    void update(User f);

    List<User> getAll();

    void createTable();

    void dropTable();

    void cleanTable();
}
