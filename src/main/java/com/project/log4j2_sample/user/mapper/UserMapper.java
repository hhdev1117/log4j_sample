package com.project.log4j2_sample.user.mapper;

import com.project.log4j2_sample.user.dto.UserDto;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

  public List<UserDto> selectUser(String id);

  public int insertUser(UserDto userDto);

}
