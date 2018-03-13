/**
 * nbellony
 */
package botTelegram.hamsterdame;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 * @author nbellony
 * botTelegram.hamsterdame
 * hamsterdame v1.0
 * @date 13 mars 2018
 */
public class MyAmazingBot extends TelegramLongPollingBot{


	/**
	 * {@inheritDoc}
	 */
	public String getBotUsername() {

		return "MyAmazingBot";
	}

	/**
	 * {@inheritDoc}
	 */
	public void onUpdateReceived(final Update update) {
		// We check if the update has a message and the message has text
		if (update.hasMessage() && update.getMessage().hasText()) {
			// Set variables
			final String message_text = update.getMessage().getText();
			final long chat_id = update.getMessage().getChatId();

			final SendMessage message = new SendMessage() // Create a message object object
					.setChatId(chat_id)
					.setText(message_text);
			try {
				execute(message); // Sending our message object to user
			} catch (final TelegramApiException e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getBotToken() {

		return "12345:qwertyuiopASDGFHKMK";
	}

}
