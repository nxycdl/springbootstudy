package com.example.demo.services;

import com.example.demo.modal.Grinfo;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017-11-25.
 */
public interface GrinfoService {
    public List<Grinfo> getGrinfoByName(String name);

    public List<Grinfo> getGrinfoByRoute(String route);

    public int insert(String name,String sex,String tel,String route,String lxr,String bz );

    public int insert2(Grinfo grinfo);
}
