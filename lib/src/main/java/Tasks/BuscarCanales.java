package Tasks;

import interactions.Esperar;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import uis.TwitchUis;

public class BuscarCanales implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Esperar.estosSegundos(2),
				Click.on(TwitchUis.BTN_BUSCAR),
				Esperar.estosSegundos(1),
				Click.on(TwitchUis.TXT_RUBIUS),
				Esperar.estosSegundos(1),
				Click.on(TwitchUis.BTN_CANALES),
				Esperar.estosSegundos(1),
				Click.on(TwitchUis.BTN_CATEGORIAS),
				Esperar.estosSegundos(1),
				Click.on(TwitchUis.BTN_VIDEOS),
				Esperar.estosSegundos(1),
				Click.on(TwitchUis.BTN_MAS_POPULARES),
				Esperar.estosSegundos(1),
				Click.on(TwitchUis.BTN_IMAGEN),
				Esperar.estosSegundos(5));
	}
	
	public static BuscarCanales enTwitch() {
		return Instrumented.instanceOf(BuscarCanales.class).withProperties();
	}
}
