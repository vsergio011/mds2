package Helpers;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.server.StreamRegistration;

public class Notifications {
	public static enum NotificationType {
		ERROR,
		INFORMATION
	}
	
	public static void ShowAlert(String msg, NotificationType type) {
		Div content = new Div();
		
		if (type == NotificationType.ERROR)
		{
			content.getStyle().set("color", "red");
		}		
		content.setText(msg);

		Notification notification = new Notification(content);
		notification.setDuration(3000);
		notification.setPosition(Position.MIDDLE);
		notification.open();
	}
}
