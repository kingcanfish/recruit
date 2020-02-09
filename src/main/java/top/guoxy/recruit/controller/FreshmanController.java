package top.guoxy.recruit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import top.guoxy.recruit.model.FreshmanModel;
import top.guoxy.recruit.service.FreshmanService;
import top.guoxy.recruit.utils.Result;
import top.guoxy.recruit.utils.ResultUtil;

import java.util.List;

@RestController
public class FreshmanController {
    @Autowired
    private FreshmanService service;

    @GetMapping("/freshman/all")
    public Result freshmanList() {
         List<FreshmanModel> list = service.getFreshmanList(0);
         return ResultUtil.success(list);
    }
    @GetMapping("/freshman/{id}")
    public  Result freshman(@PathVariable("id") int id ) throws Exception {
        FreshmanModel freshmanModel = service.getFreshmanByID(id);
        return ResultUtil.success(freshmanModel);
    }
}
