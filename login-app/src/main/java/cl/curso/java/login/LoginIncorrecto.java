package cl.curso.java.login;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;

public class LoginIncorrecto {
	
	public static void captura() throws IOException{
		
		
		  Webcam webcam = Webcam.getDefault();
		    webcam.setViewSize(WebcamResolution.VGA.getSize());
		    
		    webcam.open();
		    ImageIO.write(webcam.getImage(), "PNG", new File("/Users/usuario/.m2/repository" + new Date().getTime() + ".png"));
	}

}
