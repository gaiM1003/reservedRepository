package com.example.demo.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.example.test.AppleInterface;

@Service
public class SonemService implements AppleInterface{

		public String execute() {
			System.out.println("本実装時に使用するサービスが呼び出されました");
			return "OK";
		}

	
}
