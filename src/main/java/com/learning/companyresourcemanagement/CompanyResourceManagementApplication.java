package com.learning.companyresourcemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompanyResourceManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyResourceManagementApplication.class, args);
		String[] profiles = {"prod", "preprod"};
		if (args.length > 0) {
			profiles = args;
		}
		// Activate the profiles
		SpringApplication app = new SpringApplication(CompanyResourceManagementApplication.class);
		app.setAdditionalProfiles(profiles);
		app.run(args);
	}

}
