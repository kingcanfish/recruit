package top.guoxy.recruit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.guoxy.recruit.dao.FreshmanMapper;
import top.guoxy.recruit.model.Freshman;


import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class FreshmanService {
    @Autowired
    private FreshmanMapper mapper;


    public Freshman getFreshmanByID(int ID) throws Exception {
        Freshman freshman = mapper.selectByPrimaryKey(ID);
        return freshman;
    }

    public int insert(Freshman freshman) {
        freshman.setTime(new Timestamp(new Date().getTime()));
        System.out.println(new Timestamp(new Date().getTime()));
        return mapper.insert(freshman);

    }

}
