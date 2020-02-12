package top.guoxy.recruit.service;

import top.guoxy.recruit.dto.FreshmanBasicDto;
import top.guoxy.recruit.model.Freshman;

import java.util.List;

/**
 * @author: GuoXinYu <gxylong@126.com>
 * @datetime: 2020/2/11 19:04
 **/
public interface FreshmanService {
    //通过id获取新生基本信息
    Freshman getFreshmanByID(int id);

    //插入一条数据

    int insert(Freshman freshman);

    List<FreshmanBasicDto> getFreshmanList(String group);


    List<FreshmanBasicDto> getFreshmanBasicListDto(String group);

}
