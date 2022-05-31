package com.example.delete.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteApiController {

    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable String userId, @RequestParam String account){
        System.out.println(userId);
        System.out.println(account);

        // delete --> 리소스 삭제 200 OK
        // 왠안하면 통과. 자료가 없으면 없어서 ok. 자료 삭제하면 삭제해서 ok
    }


}
