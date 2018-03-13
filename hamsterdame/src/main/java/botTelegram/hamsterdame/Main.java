/**
 * nbellony
 */
package botTelegram.hamsterdame;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;

/**
 * @author nbellony
 * botTelegram.hamsterdame
 * hamsterdame v1.0
 * @date 13 mars 2018
 */
public class Main {

	/**
	 *
	 * @param args
	 */
	public static void main(final String[] args) {
		// Initialize Api Context
		ApiContextInitializer.init();
		// Instantiate Telegram Bots API
		final TelegramBotsApi botsApi = new TelegramBotsApi();
		// Register our bot
		try {
			botsApi.registerBot(new MyAmazingBot());
		} catch (final TelegramApiRequestException e) {
			e.printStackTrace();
		}

	}

}
