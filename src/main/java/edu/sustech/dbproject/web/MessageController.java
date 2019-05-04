package edu.sustech.dbproject.web;

import edu.sustech.dbproject.entity.Message;
import edu.sustech.dbproject.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/chat")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/messages", method = RequestMethod.GET)
    private Map<String, Object> messageList(){
        Map<String, Object> map = new HashMap<>();
        List<Message> list = messageService.queryMessages();
        map.put("messageList", list);
        return map;
    }

    @RequestMapping(value = "/insertMessage", method = RequestMethod.POST)
    private Map<String, Object> insertMessage(@RequestBody Message message){
        System.out.println(message);
        Map<String, Object> map = new HashMap<>();
        map.put("success", message);
//        map.put("success", messageService.insertMessage(message));
        return map;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    private String getMessage(){
        return "hello";
    }
}
