# Втора лабораториска вежба по Софтверско инженерство
Мелиса Муслиоска, бр. на индекс 183082
### Група на код:
Функција која што за дадена листа од времиња во 24-часовен формат враќа листа на овие времиња претворени во секунди. 

### Control Flow Graph
![CFG - SLIKA](https://user-images.githubusercontent.com/82324735/119881445-98079780-bf2d-11eb-9a3e-997451d16fda.png)

### Цикломатска комплексност
Цикломатската комплексност на овој код е 8, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли[(3.1),(7),(8),(11),(17),(12),(14)]. Во случајoв P=7, па цикломатската комплексност изнесува 8. Исто така цикломатската комплексност на кодот може да се пресмета и со помош на бројот на јазли-ј и рабови-r, односно со формулата r-ј+2 = 27-21+2 = 8.

### Тест случаи според критериумот Every branch
![image](https://user-images.githubusercontent.com/82324735/119891116-ec644480-bf38-11eb-81da-49184892e961.png)


### Тест случаи според критериумот  Multiple condition
Во табелата се пркажани сите можни случаи според Multiple condition критериумот:
![image](https://user-images.githubusercontent.com/82324735/119890728-78c23780-bf38-11eb-88f1-3a8686080311.png)

Подоле се прикажани тест случаите(се праќаат објекти од класата Time):
![image](https://user-images.githubusercontent.com/82324735/119890843-998a8d00-bf38-11eb-8551-98293ea214f3.png)

### Објаснување на напишаните unit tests
Тестовите се напишани во две функции: EveryBranchTest - извршување на сите тестови според критериумот Every branch и MultipleConditionsTest - извршување на сите тестови според критериумот Multiple condition. Тестовите кои се извршуваат се прикажани во табелите погоре соодветно во функциите според критеримот. 
При извршување на тестовите се прави проверка на точни резултати што треба да ги врати тестот, како и на сите Exception-и што ги врќа функцијата за сите конверзии на времиња во секунди.
