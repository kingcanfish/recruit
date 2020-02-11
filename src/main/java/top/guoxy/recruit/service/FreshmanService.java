package top.guoxy.recruit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.guoxy.recruit.dao.FreshmanMapper;
import top.guoxy.recruit.model.Freshman;
import top.guoxy.recruit.utils.Exception;


import java.sql.Timestamp;
import java.util.Date;



@Service
public class FreshmanService {
    final FreshmanMapper freshmanMapper;
    @Autowired
    public FreshmanService( FreshmanMapper freshmanMapper) {
        this.freshmanMapper = freshmanMapper;
    }

    public Freshman getFreshmanByID(int ID) {

            return freshmanMapper.selectByPrimaryKey(ID);
    }

    public int insert(Freshman freshman) {
        freshman.setTime(new Timestamp(new Date().getTime()));
//        System.out.println(new Timestamp(new Date().getTime()));
        return freshmanMapper.insert(freshman);

    }

}
