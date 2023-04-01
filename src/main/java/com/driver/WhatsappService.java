package com.driver;

import java.util.Date;
import java.util.List;

public class WhatsappService {

    com.driver.WhatsappRepository repository = new WhatsappRepository();
    public String createUser(String name, String mobile) throws Exception {
        return repository.createUser(name,mobile);
    }

    public Group createGroup(List<com.driver.User> users) {
        return repository.createGroup(users);
    }

    public int createMessage(String content) {
        return repository.createMessage(content);
    }

    public int sendMessage(Message message, com.driver.User sender, Group group) throws Exception {
        return repository.sendMessage(message,sender,group);
    }

    public String changeAdmin(com.driver.User approver, com.driver.User user, Group group) throws Exception {
        return repository.changeAdmin(approver,user,group);
    }

    public int removeUser(User user) throws Exception {
        return repository.removeUser(user);
    }

    public String findMessage(Date start, Date end, int k) throws Exception {
        return repository.findMessage(start,end,k);
    }
}
