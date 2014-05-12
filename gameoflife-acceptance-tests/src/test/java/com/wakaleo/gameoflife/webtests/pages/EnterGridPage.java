package com.wakaleo.gameoflife.webtests.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.Test;

@DefaultUrl("http://localhost:9090/gameoflife/new")
public class EnterGridPage extends GameOfLifePage {

    @FindBy(id = "submit")
    WebElement goButton;
    @Test
    public EnterGridPage(WebDriver driver) {
        super(driver);
    }
    @Test
    public void clickOnGoButton() {
        clickOn(goButton);
    }
    @Test
    public void clickOnCellAt(int row, int column) {
        String cellName = "cell_" + row + "_" + column;
        getDriver().findElement(By.name(cellName)).click();
    }


}
