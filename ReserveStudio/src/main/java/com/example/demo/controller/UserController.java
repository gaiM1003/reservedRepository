package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	// ログイン画面取得
	@GetMapping(value = "/user_login")
	public String getLogin() {
		return "user_login";
	}

	// 新規ユーザー登録画面取得
	@GetMapping(value = "/new_user")
	public String getNew() {
		return "new_user";
	}

	// 新規ユーザー登録画面取得
	@GetMapping(value = "/new_user")
	public String getNewCheck(Model model) {

		return "new_user";
	}

	@GetMapping(value = "/user")
	public String getUser(@RequestParam("id") long id,Model model) {
		model.addAttribute("user", userService.view(id));
		return "user";
	}
//
//	// 新規ユーザー登録画面取得
//	@PostMapping(value = "/new_user")
//	public String getNew() {
//		return "new_user";
//	}

}
