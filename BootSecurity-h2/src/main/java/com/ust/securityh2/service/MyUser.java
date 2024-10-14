package com.ust.securityh2.service;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EntityScan
public class MyUser {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		private String username;
		private String password;
		private String role;
		
		
}
