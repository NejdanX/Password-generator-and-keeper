package com.nejdangroup.pgk.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/*
    Содержит navbar как на главной
    В центре настройки для генерации пароля:
        o   длина пароля (по умолчанию 12);
        o   используемые символы (по умолчанию буквы, цифры, спец. символы)
        o   исключение простых паролей (есть файл с часто используемыми паролями),
        o   основанная на фразе (справа кликабельный вопросик "Что это?", подбирается фраза и берутся определенные символы из неё);
        o   Добавление префикса и постфикса
        o   Напомнить ли о изменении пароля (если да, то через сколько)
    после настроек кнопка Сгенерировать
    внизу поле с результатом (пароль скрыт, но можно открыть)
    внизу footer как на главной
 */
@Controller
@RequestMapping("/generation")
public class PasswordGenerationController {

    @GetMapping("generate")
    public String generatePassword(ModelMap model) {
        return "";
    }
}
