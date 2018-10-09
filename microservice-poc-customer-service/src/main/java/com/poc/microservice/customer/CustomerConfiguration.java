package com.poc.microservice.customer;

import org.springframework.cloud.sleuth.sampler.ProbabilityBasedSampler;
import org.springframework.cloud.sleuth.sampler.SamplerProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.poc.microservice.customer")
public class CustomerConfiguration {

	@Bean
	public ProbabilityBasedSampler defaultSampler() {
		return new ProbabilityBasedSampler(new SamplerProperties());
	}

}
