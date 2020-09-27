# Кейс "Росатом", Сибирский IT Hub, Хакатон 2020
Project for hackathon2020

Задача: спроектировать систему отслеживания местоположения и состояния транспортных контейнеров
на территории предприятия.

Проект представляет из себя легковесную модульную систему использующую Java как основной язык. 
Все IoT устройства подключаются к системе через модули и микросервисы. База крутится отдельно на PostgeSQL
Ядро (тот кто принимает сообщения и решает что с ними делать) - отдельным сервисом со всей мощью Spring
Веб - отдельно. Так, чтобы можно было масштабироваться и менятья под любую смежную задачу. Тоже на Java+Spring+VUE.js
(фронт может поменяться)

Обмен информации с сервером базируется на REST API. 

Проект использует всю мощь современного RFID - погрузчики, весы, манипуляторы, станции налива и т.д.. - точно знают какой контейнер к ним попал.
Считали метку и готово. Максимальная автоматизация и роботизация.

Проект однозначно мне полюбился. 48 часов без перерыва болеть одной задачей - такое просто так не проходит. Мы будем его разрабатывать, дорабатывать
и однажды внедрять. А может и не однажды))

К сожалению прямо сейчас, когда я пишу ридми - это не более чем заготовка. Некий шаблон из которого уже выстрогается результат. Все же я Junior упорно стремящийся к Mid-у
но до этого еще сотни строк кода.

Самая большая ценность этого бранча - картинка с проработанной структурой и ядром.

![Схема](//p-ams1.pcloud.com/DLZe9rdoBZwxybCDZF3sy7ZZznbx37Z3VZZ0e5ZXZ67m7ZJpZZZl6vcTjfmJOHPDuDVa0bRRV41tqK7/th-25023749745-2048x1152.png)
