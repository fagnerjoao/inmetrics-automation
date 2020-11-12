package tools;

import org.openqa.selenium.support.PageFactory;
import runner.Driver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CapturarTela {

    public CapturarTela() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    Datas gerarData = new Datas();

    public void capturaTela() throws AWTException, IOException {

        Robot robotObject = new Robot();

        // Obtem os detalhes do tamanho da tela
        Rectangle screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

        // Captura imagem da tela
        BufferedImage tmp = robotObject.createScreenCapture(screenSize);

        // Fornece os detalhes do caminho para copiar a captura de tela
        String path = "/Users/fagner.joao.f.silva/Desktop/EvidenciaTeste/testStep_ID" + System.currentTimeMillis() + ".jpg";

        // Copia a imagem para o caminho de destino
        ImageIO.write(tmp, "jpg", new File(path));

    }

}
