package com.example.demo.services;

import com.example.demo.mapper.GrinfoMapper;
import com.example.demo.modal.Grinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
