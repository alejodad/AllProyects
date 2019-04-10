package co.vom.google.qa.buscarengoogle.steps;

import co.vom.google.qa.buscarengoogle.pages.GoogleHomePage;
import net.thucydides.core.annotations.Step;

public class FinalUserSteps {
    GoogleHomePage googlePage;

    @Step
    public void enters(String keyword) {
        googlePage.enter_keywords(keyword);
    }

    @Step
    public void startsSearch() {
    	googlePage.lookup_terms();
    
    }


    @Step
    public void is_the_home_page() {
        googlePage.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        startsSearch();
    
    }
}
