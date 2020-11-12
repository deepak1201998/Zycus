package com.demo.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.repository.AccountRepository;
import com.demo.repository.JdbcAccountRepositoryImpl;
import com.demo.repository.JdbcRewardRepositoryImpl;
import com.demo.repository.JdbcTransactionRepositoryImpl;
import com.demo.repository.RewardRepository;
import com.demo.repository.TransactionRepository;
import com.demo.service.BankService;
import com.demo.service.BankServiceImpl;
import com.demo.service.EmailService;
import com.demo.service.EmailServiceImpl;

	@Configuration
	//@Import(InfrastructureConfig.class)
	@EnableAutoConfiguration
	public class ApplicationConfig {
		
		@Autowired
		private DataSource dataSource;
		
		@Bean
		public DataSource dataSource(){		
			BasicDataSource dataSource= new BasicDataSource();
			dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
			dataSource.setUrl("jdbc:mysql://localhost/spring_db");
			dataSource.setUsername("root");
			dataSource.setPassword("abc@123");
			return dataSource;		
		}
		
	//	@Bean
	//	public AccountRepository accountRepository(){		
	//		return new JdbcAccountRepositoryImpl(dataSource());			
	//	}		
		
	//	@Bean
	//	public RewardRepository rewardRepository(){
	//		return  new JdbcRewardRepositoryImpl(dataSource());
	//	}
		
	//	@Bean
	//	public TransactionRepository transactionRepository(){
	//		return new JdbcTransactionRepositoryImpl(dataSource());
	//	}
		
		
	//	@Bean
	//	public EmailService emailService(){
	//		return new EmailServiceImpl();
	//	}
		
		
	//	@Bean
	//	public BankService bankService(){
	//		BankServiceImpl bankServiceImpl= new BankServiceImpl();
	//		bankServiceImpl.setAccountRepository(accountRepository());
	//		bankServiceImpl.setEmailService(emailService());
	//		bankServiceImpl.setRewardRepository(rewardRepository());
	//		bankServiceImpl.setTransactionRepository(transactionRepository());
	//		return bankServiceImpl;
	//	}
	
	}
