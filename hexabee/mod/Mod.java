package hexabee.mod;

import hexabee.Hexabee;

public class Mod {
	public String name, description;
	public boolean enabled;
	public Category category;
	
	public Mod(String name, String description, Category category) {
		this.name = name;
		this.description = description;
		this.category = category;
		
		this.enabled = true;
	}
	
	private void onEnable() {
		Hexabee.INSTANCE.eventManager.register(this);
	}
	
	private void onDisable() {
		Hexabee.INSTANCE.eventManager.unregister(this);
	}
	
	private void setEnabled(boolean enabled) {
		this.enabled = true;
		if(enabled) {
			onEnable();
		} else {
			onDisable();
		}
	}
	private void toggle() {
		setEnabled(!this.enabled);
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public Category getCategory() {
		return category;
	}
}