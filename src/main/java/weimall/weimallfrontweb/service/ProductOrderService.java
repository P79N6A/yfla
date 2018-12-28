package weimall.weimallfrontweb.service;

import weimall.weimallfrontweb.entity.OrderGroup;
import weimall.weimallfrontweb.entity.ProductOrder;
import weimall.weimallfrontweb.util.OrderUtil;
import weimall.weimallfrontweb.util.PageUtil;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface ProductOrderService {
    boolean add(ProductOrder productOrder);
    boolean update(ProductOrder productOrder);
    boolean deleteList(Integer[] productOrder_id_list);

    List<ProductOrder> getList(ProductOrder productOrder, Byte[] productOrder_status_array, OrderUtil orderUtil, PageUtil pageUtil);

    List<OrderGroup> getTotalByDate(Date beginDate, Date endDate);

    ProductOrder get(Integer productOrder_id);
    ProductOrder getByCode(String productOrder_code);
    Integer getTotal(ProductOrder productOrder, Byte[] productOrder_status_array);
}
