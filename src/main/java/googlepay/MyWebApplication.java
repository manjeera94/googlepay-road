package googlepay;

import org.orienteer.core.OrienteerWebApplication;
import org.orienteer.core.module.PerspectivesModule;

public class MyWebApplication extends OrienteerWebApplication
{
	@Override
	public void init()
	{
		super.init();
		mountPages("googlepay.web");
		registerModule(DataModel.class);
	}
	
}
