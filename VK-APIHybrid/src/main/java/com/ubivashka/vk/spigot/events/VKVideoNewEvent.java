package com.ubivashka.vk.spigot.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.ubivashka.vk.VKEvent;
import com.vk.api.sdk.objects.video.Video;

public class VKVideoNewEvent extends Event implements VKEvent {
	private static final HandlerList handlers = new HandlerList();
	private Video video;

	public VKVideoNewEvent(Video video) {
		super(true);
		setVideo(video);
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public final HandlerList getHandlers() {
		return handlers;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}
}
