package dao;

import org.springframework.stereotype.Repository;
import vo.User;
public interface UserDAO {
     User getUser(String id);
}
