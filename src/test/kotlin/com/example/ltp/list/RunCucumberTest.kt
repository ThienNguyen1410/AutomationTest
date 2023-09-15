package com.example.ltp.list

import io.cucumber.junit.CucumberOptions
import io.cucumber.junit.Cucumber
import io.cucumber.messages.internal.com.fasterxml.jackson.core.JsonParser
import org.junit.runner.RunWith


@RunWith(Cucumber::class)
@CucumberOptions(plugin = ["pretty", "json:target/cucumber-reports/Cucumber-Report.json"])
class RunCucumberTest
