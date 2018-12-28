package weimall.weimallfrontweb.service.impl;

import weimall.weimallfrontweb.dao.LastIDMapper;
import weimall.weimallfrontweb.service.LastIDService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("lastIDService")
public class LastIDServiceImpl implements LastIDService {
    private LastIDMapper lastIDMapper;

    @Resource(name = "lastIDMapper")
    public void setLastIDMapper(LastIDMapper lastIDMapper) {
        this.lastIDMapper = lastIDMapper;
    }

    @Override
    public int selectLastID() {
        return lastIDMapper.selectLastID();
    }
}
