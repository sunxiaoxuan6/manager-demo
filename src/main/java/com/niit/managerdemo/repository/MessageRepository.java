package com.niit.managerdemo.repository;

import com.niit.managerdemo.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
/**
* 接口继承JpaRepository
 * Order：实体类的类型
 * Integer：主键的类型
**/
public interface MessageRepository extends JpaRepository<Message,Integer> {
}
