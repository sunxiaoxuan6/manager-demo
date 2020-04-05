package com.niit.managerdemo.controller;

import com.niit.managerdemo.entity.Message;
import com.niit.managerdemo.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private MessageRepository messageRepository;

    @GetMapping("/findAll/{page}/{size}")
    public Page<Message> findAll(@PathVariable("page") Integer page,@PathVariable("size") Integer size){
        PageRequest request=PageRequest.of(page,size);
        return messageRepository.findAll(request);
    }

    @PostMapping("/save")
    public String save(@RequestBody Message message){
        Message result = messageRepository.save(message);
        if(result!=null) {
            return "success";
        }else {
            return "error";
        }
    }

    @GetMapping("/findById/{id}")
    public Message findById(@PathVariable("id") Integer id){
        return messageRepository.findById(id).get();
    }

    @PutMapping("/update")
    public String update(@RequestBody Message message){
        Message result = messageRepository.save(message);
        if(result!=null) {
            return "success";
        }else {
            return "error";
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        messageRepository.deleteById(id);
    }
}
