package com.niit.managerdemo;

import com.niit.managerdemo.entity.Message;
import com.niit.managerdemo.repository.MessageRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@SpringBootTest
class ManagerDemoApplicationTests {
    @Autowired
    private MessageRepository messageRepository;

    @Test
    void contextLoads() {
        PageRequest pageRequest=PageRequest.of(0,5);
        Page<Message> page= messageRepository.findAll(pageRequest);
        int i=0;
    }

    @Test
    void save(){
        Message message=new Message();
        message.setBrand("123");
        message.setPrice(4500);
        message.setNum(10);
        Message message1 = messageRepository.save(message);
        System.out.println(message1);
    }

    @Test
    void findById(){
        Message message = messageRepository.findById(1).get();
        System.out.println(message);
    }

    @Test
    void update(){
        Message message=new Message();
        message.setId(9);
        message.setBrand("小");
        Message message1=messageRepository.save(message);
        System.out.println(message1);
    }

    @Test
    void delete(){
        messageRepository.deleteById(8);
    }
}

