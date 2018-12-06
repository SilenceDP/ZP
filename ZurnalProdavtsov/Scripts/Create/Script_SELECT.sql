--Вывести все данные таблицы "SOTRUDNIK"
--SELECT * FROM SOTRUDNIK;

--Вывести данные по выбранным полям таблицы "SOTRUDNIK"
--SELECT id,last_name FROM SOTRUDNIK;

--Выбор по условию
--SELECT _поле_(поле1, поле2,.... или *-все поля) FROM _таблица_ WHERE поле (оператор сравнения: =, <, <=, >, >=, <>) значение;

--SELECT _поле_(поле1, поле2,.... или *-все поля) FROM _таблица_ WHERE поле LIKE '% _(символы из значения)';
-- %-любое множество символов('Победа'--> '%бе%'),   _ -любой символ ('Победа'--> 'Побед_') 

--SELECT _поле_(поле1, поле2,.... или *-все поля) FROM _таблица_ WHERE поле IN(значение1,значение2,значение3.....);

--SELECT _поле_(поле1, поле2,.... или *-все поля) 
--FROM _таблица_ WHERE поле (оператор сравнения: =, <, <=, >, >=, <>) значение
--AND/OR поле (оператор сравнения: =, <, <=, >, >=, <>) значение;

--BETWEEN-значения в диапазоне
--SELECT _поле_(поле1, поле2,.... или *-все поля) FROM _таблица_ WHERE поле BETWEEN(значение_min) AND (значение_max);

--WHERE NOT поле BETWEEN-значения вне диапазоне
--SELECT _поле_(поле1, поле2,.... или *-все поля) FROM _таблица_ WHERE NOT поле BETWEEN(значение_min) AND (значение_max);

--ALTER TABLE SOTRUDNIK ADD COLUMN Subdivision  VARCHAR(10) NOT NULL AFTER date_off; --добавление поля

--ALTER TABLE SOTRUDNIK ALTER COLUMN DATA_ON RENAME TO DATE_ON; --переименование поля
--ALTER TABLE SOTRUDNIK ALTER COLUMN DATE_ON SET NOT NULL;  --изменение атрибута поля 

--ALTER TABLE SOTRUDNIK ALTER COLUMN DATE_OFF DATE(8);--измениние атрибута тип данных

--Добавить сотрудника
INSERT INTO SOTRUDNIK --id,LAST_NAME,FIRST_NAME,SECOND_NAME,POST,DATE_ON,DATE_OFF,SUBDIVISION 
VALUES (DEFAULT,'Емец','Надежда',' ','Товаровед',DATE '2018-01-01',NULL,'Сибирь')

