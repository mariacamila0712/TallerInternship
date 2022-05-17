package com.tcs.proyectoscreenplay.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src\\test\\resources\\features\\select_product.feature",
        glue = "com.tcs.proyectoscreenplay.stepdefinitions",
        snippets = SnippetType.CAMELCASE

)
public class SelectProduct {

}
