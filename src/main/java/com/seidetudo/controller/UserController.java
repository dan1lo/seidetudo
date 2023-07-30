package com.seidetudo.controller;

import com.seidetudo.domain.DadosCadastrarUser;
import com.seidetudo.domain.User;
import com.seidetudo.domain.UserRepositoy;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepositoy repository;

    @Transactional
    @PostMapping
    public String cadastraUser(DadosCadastrarUser usuario){
        User user = new User(usuario);
        repository.save(user);
        return "redirect:/users";
}
    @GetMapping
    public  String carregaPaginaCadastro(){
        return "/user/cadastrar";
}

@GetMapping("/users/listarUsuarios")
    public String listarUsuarios(){

        return "/user";
}


}
