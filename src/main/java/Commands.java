public class Commands {
    /*

    SELECT * FROM table-name   -  выбрать все строки и колонки из таблицы
    ORDER BY customerNumber desc - сгрупировать по колонке customerNumber в порядке убывания

    select * from classicmodels.customers
    where creditLimit>=50000 and creditLimit<=60000;  => можно сортировать по значениям
    WHERE => используется для фильтрации

    SELECT employees.name, departments.department_name
    FROM employees JOIN departments ON employees.department_id = departments.id;

    INSERT INTO employees (name, age, department_id) VALUES ('John Doe', 28, 3);  => добавляет новую строку
    вставь в таблицу employees строку, где колоноки (name, age, department_id) будут иметь значение ('John Doe', 28, 3 )

   UPDATE employees SET age = 29 WHERE name = 'John Doe';  => изменить в таблице employees значение в колонке age
    на новое значение  29  в строке где name = 'John Doe'

   DELETE FROM employees WHERE age < 25;  => удаляет строки, если значение в колонке age меньше 25

    SELECT department_id, COUNT(*) FROM employees GROUP BY department_id;  => группирует строки по общим показателям

    SELECT COUNT(*) FROM employees WHERE age > 30;
    COUNT(*)  =>  указывает количество сгруппированных строк

    SELECT AVG(age) FROM employees WHERE department_id = 3;
    AVG(age)  =>  среднее арифметическое значение строк в столбце age

    SELECT department_id, COUNT(*) FROM employees
    GROUP BY department_id
    HAVING COUNT(*) > 5;   => фильтрует сгруппированные строки по заданным параметрам (после  GROUP BY)

     */
}
