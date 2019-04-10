package co.com.google.qa.myfirstserenity.steps;

import co.com.google.qa.myfirstserenity.page.GoogleHomePage;
import net.thucydides.core.annotations.Step;

public class FinalUserStep {
    GoogleHomePage googlePage;
    
    @Step
    public void isInHomePage() {
    	googlePage.open();
    }
    
    @Step
    public void writeWord(String word) {
    	googlePage.enterKeywords(word);
    }
    @Step
    public void lookup_terms() {
    	googlePage.lookup_terms();
    }
    
    @Step
    public void SearchFor(String term) {
    	writeWord(term);
    	lookup_terms();
    }
    

}
