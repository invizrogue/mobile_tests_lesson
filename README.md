# Автоматизация тестирования <a href="https://www.browserstack.com/" target="_blank">Browserstack</a>

## :scroll: Содержание
- [Технологии и инструменты](#pushpin-технологии-и-инструменты)
- [Запуск тестов](#pushpin-запуск-тестов)
- [Конфигурация тестов](#pushpin-конфигурация-тестов)
- [Описание параметров для сборки](#pushpin-описание-параметров-для-сборки)
- [Задача в Jenkins](#pushpin-задача-в-jenkins)
- [Отчёт Allure](#pushpin-отчёт-allure)
- [Отчёт Telegram](#pushpin-отчёт-telegram)

## :pushpin: Технологии и инструменты
<p align="center">
<a href="https://rest-assured.io/"><img src="readme/images/restassured.png" width="50" height="50" title="IntelliJ Idea" alt="IDEA"/></a>
<a href="https://www.jetbrains.com/idea/"><img src="readme/images/IntelliJ_IDEA_Icon.svg" width="50" height="50" title="IntelliJ Idea" alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="readme/images/java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://gradle.org/"><img src="readme/images/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://github.com/"><img src="readme/images/Github.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="readme/images/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="readme/images/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<img src="readme/images/Telegram.svg" width="50" height="50"  alt="Telegram"/>
</p>

## :pushpin: Запуск тестов
### Локально
для android-тестов: <code>gradle clean android -Denv=android</code>
для ios-тестов: <code>gradle clean ios -Denv=ios</code>

### Удалённо
для android-тестов: <code>clean android -Denv=android</code>
для ios-тестов: <code>clean ios -Denv=ios</code>

## :pushpin: Конфигурация тестов
### android.properties
### ios.properties
- **user** - имя пользователя
- **key** - пароль
- **app_url** - идентификатор приложения
- **device** - мобильное устройство
- **os_version** - версия операционной системы
- **project** - название проекта в BS
- **build** - название билда в BS
- **name** - название теста в BS
- **remote_url** - hub URI

## :pushpin: Описание параметров для сборки
- <code>device</code> устройство, для которого запускаются тесты (android или ios)

## :pushpin: Задача в Jenkins
<a href="https://jenkins.autotests.cloud/job/C17-dmikhaylov_ru-mobile21/"><img src="readme/screenshots/jenkins.png" alt="Задача в jenkins"></a>

## :pushpin: Отчёт Allure
<img src="readme/screenshots/allure_overview.png" alt="Allure_overview"/>
<img src="readme/screenshots/allure_suites.png" alt="Allure_suites"/>
<img src="readme/screenshots/allure_graphs.png" alt="Allure_graphs"/>

## :pushpin: Отчёт Telegram
<img src="readme/screenshots/telegram.png" alt="telegram"/>

[Вернуться к содержанию](#scroll-содержание)