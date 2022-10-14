package it.lsdf.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.polls.SendPoll;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

/** Defines a controller to handle HTTP requests */
@Component
public final class LsdfPollBotComponent extends TelegramLongPollingBot {
	
	private static final Logger logger = LoggerFactory.getLogger(LsdfPollBotComponent.class);
	
	
	@Override
	public String getBotUsername() {
		return "LSDFPollBot";
	}
	
	@Override
	public String getBotToken() {
		return "5482061522:AAGsPy7cuiuBmy9P7xNRe86WxPLOQWc_qhQ";
	}
	
	@Override
	public void onUpdateReceived(Update update) {
	
	}
	
//	@Scheduled(cron = "0 15 10 15 * ?", zone = "Europe/Paris")
@Scheduled(fixedRate = 10000000)
	private void sendMondayPoll(){
		String question = "Oggi allenamento dalle 20.00 alle 22.45";
		List<String> options = new ArrayList<>();
		options.add("Presente");
		options.add("Assente");
		options.add("Coach");
		var response = new SendPoll("769495246", question, options, false, "regular", false, null, false, false, null, null, 39600000, null, null, null, null, null, null);
		
		try {
			execute(response);
		} catch (TelegramApiException e) {
			throw new RuntimeException(e);
		}
	}
}
