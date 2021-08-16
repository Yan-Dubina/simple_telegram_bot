package com.telegram_bot.Component;

import com.telegram_bot.Service.BotConfigService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class WeatherBot extends TelegramLongPollingBot {
    @Autowired
    private BotConfigService botConfigService;
    @Autowired
    private WeatherBotFacade weatherBotFacade;

    @Override
    public String getBotUsername() {
        return botConfigService.getBotUsername();
    }

    @Override
    public String getBotToken() {
        return botConfigService.getBotAccessToken();
    }

    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {
        weatherBotFacade.handeUpdate(update);
    }
}
