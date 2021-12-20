package com.infotech.service;

import com.infotech.message.Messaging;

public class Communication {
	private Messaging messaging;//field injection

	public void setMessaging(Messaging messaging) {
		this.messaging = messaging;
	}
	public String Communicate ()
	{
		messaging.sendmessage();
		return null;
	}

	
}
