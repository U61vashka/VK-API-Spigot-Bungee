package com.ubivashka.vk.spigot.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.ubivashka.vk.VKEvent;
import com.vk.api.sdk.objects.callback.VideoComment;

public class VKVideoCommentEditEvent extends Event implements VKEvent {
	private static final HandlerList handlers = new HandlerList();
	private VideoComment videoComment;

	public VKVideoCommentEditEvent(VideoComment videoComment) {
		super(true);
		setVideoComment(videoComment);
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public final HandlerList getHandlers() {
		return handlers;
	}

	public VideoComment getVideoComment() {
		return videoComment;
	}

	public void setVideoComment(VideoComment videoComment) {
		this.videoComment = videoComment;
	}

}
