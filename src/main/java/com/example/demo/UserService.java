package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class UserService {

    private final Map<String, String> users = new ConcurrentHashMap<>();

    public UserService() {
        // 初始化一些测试数据
        users.put("1", "Alice");
        users.put("2", "Bob");
    }

    public String getUser(String id) {
        return users.getOrDefault(id, "User not found");
    }

    public String addUser(String id, String name) {
        users.put(id, name);
        return "User added: " + name;
    }
}
