package com.myapp.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.myapp.modelo.Usuario;


@Controller
public class DefaultController {


	@GetMapping("/")
    public String home1() {
        return "/home";
    }

    @GetMapping("/home")
    public String home() {
        return "/home";
    }

    @GetMapping("/admin")
    public String admin() {
        return "/admin";
    }

    @GetMapping("/user")
    public String user() {
        return "/user";
    }

    @GetMapping("/about")
    public String about() {
        return "/about";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }
    
    @GetMapping("/loginAdm")
    public String loginAdm() {
    	return "loginAdm";
    }

    @GetMapping(path="/CadastroLogin")
    public String CadastroLogin() { 
    	    	
    	return "CadastroLogin";
    } 
    
    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }

    public List<Usuario> listaUser(){
    	Usuario usuario, usuario2;
    	usuario = new Usuario();
    	usuario.setId(1);
    	usuario.setEmail("teste@123");
    	usuario.setLogin("123");
    	
    	usuario2 = new Usuario();
    	usuario2.setId(1);
    	usuario2.setEmail("teste@456");
    	usuario2.setLogin("456");
    	List<Usuario> list = new ArrayList<>();
    	list.add(usuario);
    	list.add(usuario2);
    	
		return list;
    	
    }
    
}
