package top.guoxy.recruit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.guoxy.recruit.model.Freshman;
import top.guoxy.recruit.service.FreshmanService;
import top.guoxy.recruit.utils.Exception;
import top.guoxy.recruit.utils.Result;
import top.guoxy.recruit.utils.ResultUtil;

import java.util.List;

@RestController
public class FreshmanController {
    @Autowired
    private FreshmanService service;


    @GetMapping("/freshman/{id}")
    public  Result freshman(@PathVariable("id") int id ) throws Exception {
        Freshman freshman = service.getFreshmanByID(id);
        if(freshman == null) {
            throw new Exception(1, "查无此人");
        }
        return ResultUtil.success(freshman);
    }

    @PostMapping("/freshman")
    public Result save(@RequestBody Freshman freshman) {
        System.out.println(freshman.toString());
        int status = service.insert(freshman);
        if (status == 1) {
            return ResultUtil.success("");
        }else {
            return ResultUtil.fail(-1,"请求失败，稍后再试");
        }
    }
}
