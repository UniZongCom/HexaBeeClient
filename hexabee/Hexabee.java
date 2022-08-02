package hexabee;

import hexabee.event.EventManager;

public class Hexabee {
	public String NAME = "HexaBee Client", VERSION = "1.0.0", AUTHOR = "HexaForce";
	public static Hexabee INSTANCE = new Hexabee();
	
	public EventManager eventManager;
	
	public void Startup() {
		eventManager = new EventManager();
		System.out.println("Starting " + NAME + " " + VERSION + " by " + AUTHOR);
		eventManager.register(this);
	}
	
	public void Shutdown() {
		System.out.println("Stopping " + NAME + " " + VERSION);
		eventManager.unregister(this);
	}
}
