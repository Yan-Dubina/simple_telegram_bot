package com.telegram_bot.Service;

import com.telegram_bot.Config.BotConfig;
import com.telegram_bot.Config.Command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BotConfigService {

    @Autowired
    private BotConfigRepo botConfigRepo;
    public  String getTelegramCallbackAnswerTemp()
    {
        return this.botConfigRepo.findAll().get(0).get;
    }
    public String getNowApiTemp()
    {
        return  null;
    }
    public List<Command> getAllCommands(){
        return null;
    }

    public String getBotUsername(){
        return null;
    }

    public String getBotAccessToken(){
        return null;
    }
}
