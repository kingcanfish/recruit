package top.guoxy.recruit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.guoxy.recruit.dao.CommentMapper;
import top.guoxy.recruit.dao.FreshmanMapper;
import top.guoxy.recruit.dto.CommentCountDto;
import top.guoxy.recruit.dto.FreshmanBasicDto;
import top.guoxy.recruit.model.Freshman;
import top.guoxy.recruit.service.FreshmanService;
import top.guoxy.recruit.utils.Exception;
import top.guoxy.recruit.utils.ResultUtil;


import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class FreshmanServiceImpl implements FreshmanService {
    final FreshmanMapper freshmanMapper;
    final CommentMapper commentMapper;
    @Autowired
    public FreshmanServiceImpl (FreshmanMapper freshmanMapper, CommentMapper commentMapper) {
        this.freshmanMapper = freshmanMapper;
        this.commentMapper =commentMapper;
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
    public List<FreshmanBasicDto> getFreshmanList(String group) {
         try {
             List<FreshmanBasicDto> freshmanBasicDtos = freshmanMapper.getFreshmanListByGroup(group);
             for (FreshmanBasicDto freshmanBasicDto:freshmanBasicDtos) {
                 CommentCountDto commentCount = commentMapper.getCommentCount(freshmanBasicDto.getId());
                 freshmanBasicDto.setCommentCount(commentCount.getCommentCount());

             }
             return freshmanBasicDtos;

         }catch (Exception e ) {
             throw new Exception(-1 , e.getMessage());
         }
    }

    @Override
    public List<FreshmanBasicDto> getFreshmanBasicListDto(String group) {
        List<FreshmanBasicDto> freshmen = getFreshmanList(group);
        List<FreshmanBasicDto>  freshmanBasicDtos = new ArrayList<>();
        return null;

    }



}
