## LTL 2 Buchi Automaton Utility
Мы использовали ltl2ba (http://www.lsv.fr/~gastin/ltl2ba/). LTL to Buchi

## Сборка
* make в ltl2ba
* mvn clean package в корневой

## Синтаксис LTL формул 
Операторы `!`, `&`, `|`, `->`, `<->`, `X`, `G`, `F`, `R`, `U`

Доступны скобки и значения `true` и `false`

Переменные записываются в кавычках

## Пример
В файлах ./data/example* содержится автомат и корректные/некорректные формулы

## Запуск
java -jar ./target/verifier.jar -m ./data/example.xstd -f ./data/example_correct.ltl - запускает верификатор на модели example и проверяет все LTL формулы из файла data/example_correct.ltl;


