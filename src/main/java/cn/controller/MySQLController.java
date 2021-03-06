package cn.controller;

import cn.pojo.mysql.Rideyear;
import cn.pojo.mysql.yearpeople;
import cn.service.MySQLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
public class MySQLController {
    @Autowired
    private MySQLService MySQLService;

    @RequestMapping(value = "/main22", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public List main22() {
        List list = new ArrayList();
        List<Rideyear> o = MySQLService.selectrideyear();
        List Member = new ArrayList();
        List Casual = new ArrayList();
        for (Rideyear i : o) {
            Member.add(i.getMember());
            Casual.add(i.getCasual());
        }
        list.add(Member);
        list.add(Casual);
        return list;
    }


    @RequestMapping(value = "/main33", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public List main33() {
        List list = new ArrayList();
        List<yearpeople> o = MySQLService.selectpp();
        List High = new ArrayList();
        List Low = new ArrayList();
        for (yearpeople i : o) {
            High.add(i.getHigh());
            Low.add(i.getLow());
        }
        list.add(High);
        list.add(Low);
        return list;
    }


    @RequestMapping(value = "/MySQLService", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public void getRatingSum() {
        System.out.println("MySQLService..");
    }


}
