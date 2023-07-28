package com.project.log4j2_sample.user.service;

import com.project.log4j2_sample.user.dto.UserDto;
import com.project.log4j2_sample.user.mapper.UserMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

  public static final Logger logger = LogManager.getLogger(UserService.class);

  private final UserMapper userMapper;

  public int insertUser(UserDto userDto) {
    logger.trace("=============> ID : " + userDto.getId());
    logger.trace("=============> NAME : " + userDto.getName());
    logger.trace("=============> PASSWORD : " + userDto.getPassword());
    return userMapper.insertUser(userDto);
  }

  public List<UserDto> selectUser(String id) {
    System.out.println("dd2");
    return userMapper.selectUser(id);
  }
}
