package uis;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class TwitchUis {
	
	public static final Target BTN_BUSCAR = Target.the("").located(By.id("tv.twitch.android.app:id/action_search"));
	public static final Target TXT_RUBIUS = Target.the("").locatedBy(("//*[contains(@text,'rubius')]"));
	public static final Target BTN_CANALES = Target.the("").locatedBy(("//*[contains(@text,'Canales')]"));
	public static final Target BTN_CATEGORIAS = Target.the("").locatedBy(("//*[contains(@text,'Categorías')]"));
	public static final Target BTN_VIDEOS = Target.the("").locatedBy(("//*[contains(@text,'Videos')]"));
	public static final Target BTN_MAS_POPULARES = Target.the("").locatedBy(("//*[contains(@text,'Más populares')]"));
	public static final Target BTN_IMAGEN = Target.the("").locatedBy(("//*[contains(@resource-id,'tv.twitch.android.app:id/thumbnail_image_view')]"));

}
