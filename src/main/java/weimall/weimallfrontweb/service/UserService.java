package weimall.weimallfrontweb.service;

import weimall.weimallfrontweb.entity.User;
import weimall.weimallfrontweb.util.OrderUtil;
import weimall.weimallfrontweb.util.PageUtil;

import java.util.List;

public interface UserService {
    boolean add(User user);
    boolean update(User user);

    List<User> getList(User user, OrderUtil orderUtil, PageUtil pageUtil);
    User get(Integer user_id);
    User login(String user_name, String user_password);
    Integer getTotal(User user);
}
