package com.macys;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
@CucumberOptions(

        features="classpath:ApplicationLogin.feature",
        glue ={"classpath:com.macys"},
        tags={"@Login"},
        plugin = {"pretty", "html:target/cucumber-html-report"},
        dryRun = false,
        monochrome = true,
        strict = true,
        snippets = SnippetType.CAMELCASE

)


public  class TestRunner  {


}
