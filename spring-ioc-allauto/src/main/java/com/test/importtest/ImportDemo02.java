package com.test.importtest;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = ImportDemo.class)
public class ImportDemo02 {
}
