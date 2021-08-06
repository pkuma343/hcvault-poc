package com.nagarro.poc.hcvault.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@PropertySource("file:\\D:\\Docs\\POCs\\HashiCorp-Vault\\HCVaultPoc\\secret-credentials.txt")
@PropertySource("file:/vault/secrets/secret-credentials.txt")
public class AppConfig {
}
