package com.ubivashka.vk.spigot.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.ubivashka.vk.VKEvent;
import com.vk.api.sdk.objects.callback.GroupJoin;

public class VKUserGroupJoinEvent extends Event implements VKEvent {
	private static final HandlerList handlers = new HandlerList();
	private GroupJoin join;

	public VKUserGroupJoinEvent(GroupJoin join) {
		super(true);
		setJoin(join);
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public final HandlerList getHandlers() {
		return handlers;
	}

	public GroupJoin getJoin() {
		return join;
	}

	public void setJoin(GroupJoin join) {
		this.join = join;
	}

}
