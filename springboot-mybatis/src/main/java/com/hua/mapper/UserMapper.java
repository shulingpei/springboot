package com.hua.mapper;

import com.hua.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2018/3/26.
 */
@Mapper
public interface UserMapper {

    List<User> getAll();

}
