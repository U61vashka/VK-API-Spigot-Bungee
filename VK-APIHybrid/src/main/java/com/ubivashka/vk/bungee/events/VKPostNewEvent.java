package com.ubivashka.vk.bungee.events;

import com.ubivashka.vk.VKEvent;
import com.vk.api.sdk.objects.wall.Wallpost;

import net.md_5.bungee.api.plugin.Event;

public class VKPostNewEvent extends Event implements VKEvent {
	private Wallpost post;

	public VKPostNewEvent(Wallpost post) {
		setPost(post);
	}

	public Wallpost getPost() {
		return this.post;
	}

	public void setPost(Wallpost post) {
		this.post = post;
	}
}
