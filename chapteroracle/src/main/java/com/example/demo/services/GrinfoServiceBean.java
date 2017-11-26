package com.example.demo.services;

import com.example.demo.mapper.GrinfoMapper;
import com.example.demo.modal.Grinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017-11-25.
 */
@Service
public class GrinfoServiceBean implements GrinfoService {

    @Autowired
    private GrinfoMapper grinfoMapper;

    @Override
    public List<Grinfo> getGrinfoByName(String name) {
        return grinfoMapper.getGrinfoByName(name);
    }

    @Override
    public List<Grinfo> getGrinfoByRoute(String route) {
        return grinfoMapper.getGrinfoByRoute(route);
    }

    @Override
    public int insert(String name, String sex, String tel, String route, String lxr, String bz) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("name", name);
        map.put("sex", sex);
        map.put("tel", tel);
        map.put("route", route);
        map.put("lxr", lxr);
        map.put("bz", bz);
        return grinfoMapper.insert(map);
    }

    @Override
    public int insert2(Grinfo grinfo) {
        return grinfoMapper.insert2(grinfo);
    }
}
