package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.test.AppleInterface;

@Service
public class TestService implements AppleInterface {
	
	public String execute() {
		System.out.println("テスト実装時に使用するサービスが呼び出されました");
		return "test";
	}

}
