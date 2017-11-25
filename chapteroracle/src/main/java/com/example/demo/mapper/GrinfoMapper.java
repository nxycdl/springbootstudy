package com.example.demo.mapper;

import com.example.demo.modal.Grinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

/**
 * Created by Administrator on 2017-11-25.
 */
@Component
@Mapper
public interface GrinfoMapper {

    @Select(("select * from grinfo where name = #{name}"))
    public List<Grinfo> getGrinfoByName(String name);

    @Select(("select * from grinfo where route = #{route}"))
    public List<Grinfo> getGrinfoByRoute(String route);

}
