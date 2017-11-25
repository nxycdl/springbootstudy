package com.example.demo.services;

import com.example.demo.modal.Grinfo;

import java.util.List;

/**
 * Created by Administrator on 2017-11-25.
 */
public interface GrinfoService {
    public List<Grinfo> getGrinfoByName(String name);

    public List<Grinfo> getGrinfoByRoute(String route);
}
