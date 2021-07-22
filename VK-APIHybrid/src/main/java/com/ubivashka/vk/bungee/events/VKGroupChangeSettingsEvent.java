package com.ubivashka.vk.bungee.events;

import com.ubivashka.vk.VKEvent;
import com.vk.api.sdk.objects.callback.GroupChangeSettings;

import net.md_5.bungee.api.plugin.Event;

public class VKGroupChangeSettingsEvent extends Event implements VKEvent {
	private GroupChangeSettings settings;

	public VKGroupChangeSettingsEvent(GroupChangeSettings settings) {
		setSettings(settings);
	}

	public GroupChangeSettings getSettings() {
		return this.settings;
	}

	public void setSettings(GroupChangeSettings settings) {
		this.settings = settings;
	}
}