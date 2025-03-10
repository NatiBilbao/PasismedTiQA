package pages;

import controls.Button;
import org.openqa.selenium.By;

public class PaginaInicial {
    public Button descubrePrograma = new Button(By.xpath("/html/body/div[3]/div/div/div[1]/div/div/div/a"));

    public Button conoceMas = new Button(By.xpath("/html/body/div[3]/div/div/div[3]/div[1]/a"));
}
