package weimall.weimallfrontweb.dao;


import weimall.weimallfrontweb.entity.Admin;
import weimall.weimallfrontweb.util.PageUtil;


import java.util.List;
@Mapper
public interface AdminMapper {
    Integer insertOne(@param Admin admin);
    Integer updateOne(@Param("admin") Admin admin);

    List<Admin> select(@Param("admin_name") String admin_name, @Param("pageUtil") PageUtil pageUtil);
    Admin selectOne(@Param("admin_name") String admin_name, @Param("admin_id") Integer admin_id);
    Admin selectByLogin(@Param("admin_name") String admin_name, @Param("admin_password") String admin_password);
    Integer selectTotal(@Param("admin_name") String admin_name);
}