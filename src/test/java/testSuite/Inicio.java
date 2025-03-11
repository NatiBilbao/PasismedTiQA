package testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DescubrePasismed;
import pages.MenuOpciones;
import pages.PaginaInicial;
import session.Session;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Inicio {

    MenuOpciones menuOpciones = new MenuOpciones();

    PaginaInicial paginaInicial = new PaginaInicial();

    DescubrePasismed descubrePasismed = new DescubrePasismed();

    ChromeDriver chrome;

    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getBrowser().get("https://pasismed.gniepro.com/");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }

    @Test
    public void descubreLosProgramas() throws InterruptedException {

        Thread.sleep(5000);

        paginaInicial.descubrePrograma.click();

        Thread.sleep(10000);

    }
}
