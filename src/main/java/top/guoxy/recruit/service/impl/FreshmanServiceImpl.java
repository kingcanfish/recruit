package top.guoxy.recruit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.guoxy.recruit.dao.FreshmanMapper;
import top.guoxy.recruit.dto.FreshmanBasicDto;
import top.guoxy.recruit.model.Freshman;
import top.guoxy.recruit.service.FreshmanService;


import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


@Service
public class FreshmanServiceImpl implements FreshmanService {
    final FreshmanMapper freshmanMapper;
    @Autowired
    public FreshmanServiceImpl (FreshmanMapper freshmanMapper) {
        this.freshmanMapper = freshmanMapper;
    }
    @Override
    public Freshman getFreshmanByID(int ID) {

            return freshmanMapper.selectByPrimaryKey(ID);
    }
    @Override
    public int insert(Freshman freshman) {
        freshman.setTime(new Timestamp(new Date().getTime()));
//        System.out.println(new Timestamp(new Date().getTime()));
        return freshmanMapper.insert(freshman);

    }

    @Override
    public List<Freshman> getFreshmanList(String group) {
        return null;
    }

}
