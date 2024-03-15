
package com.global.controller;

import com.global.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/vi/role")
@RequiredArgsConstructor
public class RoleController {


    private  RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(roleService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(roleService.findById(id));
    }
}
