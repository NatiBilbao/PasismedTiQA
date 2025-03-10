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

public class RegistrarUsuario {

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

        paginaInicial.descubrePrograma.click();

        Thread.sleep(10000);

        String currentUrl = Session.getInstance().getBrowser().getCurrentUrl();

        String expectedUrl = "https://pasismed.gniepro.com/?postnombre=descubrePasismed";
        assertEquals(expectedUrl, currentUrl, "La URL después de hacer clic no es la esperada.");

        Thread.sleep(5000);
    }
}
