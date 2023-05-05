package com.example.stepdefinitions;

import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleSteps implements En {

    public SimpleSteps() {
        Given("User opens {string}", (String url) -> open(url));
        When("User searches for {string}", (String searchInput) ->
                $("textarea[name='q']")
                        .setValue(searchInput)
                        .pressEnter());
        Then("First search result is {string}", (String expectedSearchResult) ->
                $("#search .yuRUbf h3")
                        .shouldHave(text(expectedSearchResult)));
    }
}
