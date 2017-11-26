package com.example.demo.mapper;

import com.example.demo.modal.Grinfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;
import java.util.Map;

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

    String insertsql = "insert into grinfo(name, sex, tel, route, lxr, bz) values(#{name,jdbcType=VARCHAR},#{sex,jdbcType=VARCHAR},#{tel,jdbcType=VARCHAR},#{route,jdbcType=VARCHAR},#{lxr,jdbcType=VARCHAR},#{bz,jdbcType=VARCHAR})";

    @Insert(insertsql)
    public int insert(Map<String, Object> map);

    @Insert("insert into grinfo(name, sex, tel, route, lxr, bz) values(#{name},#{sex},#{tel},#{route},#{lxr},#{bz})")
    public int insert2(Grinfo grinfo);

}
