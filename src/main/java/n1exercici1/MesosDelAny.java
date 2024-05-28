package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class MesosDelAny {
	private List<String> mesos;

	public MesosDelAny() {
		mesos = new ArrayList<>();
		mesos.add("gener");
		mesos.add("febrer");
		mesos.add("març");
		mesos.add("abril");
		mesos.add("maig");
		mesos.add("juny");
		mesos.add("juliol");
		mesos.add("agost");
		mesos.add("setembre");
		mesos.add("octubre");
		mesos.add("novembre");
		mesos.add("desembre");
	}

	public String getMesos() {
		String missatge = "";
		for (int i = 0; i < mesos.size(); i++) {
			missatge = mesos.get(i);
		}
        return missatge;
    }

}