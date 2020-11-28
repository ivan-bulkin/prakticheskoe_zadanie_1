package prakticheskoe_zadanie_1;

//1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
//Задание № 1 выполнено ниже в трёх строчках кода
//public class Main {
//    public static void main(String[] args) {//просто пиши пока так и не думай
//    }

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {//просто пиши пока так и не думай
        System.out.println();
        System.out.println("Какое из практических заданий Вы хотите увидеть? Выберите:");
        System.out.println("2. Создать переменные всех пройденных типов данных, и инициализировать их значения;");
        System.out.println("3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;");
        System.out.println("4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;");
        System.out.println("5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.");
        System.out.println("6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;");
        System.out.println("7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;");
        System.out.println("8. Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.");
        System.out.println("сделал Иван Булкин");
        Scanner in = new Scanner(System.in);
        System.out.print("Выбирайте смелее, Вас ни кто не обидит: ");
        int nomer_zadaniya = in.nextInt();
//2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        if (nomer_zadaniya == 2) {
            Sozdat_Peremennye();
        }
//3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
        if (nomer_zadaniya == 3) {
            System.out.println();
            System.out.println("Сейчас мы будем вычислять выражение a * (b + (c / d))");
            System.out.println("Для этого Вам надо будет последовательно ввести значения переменных a, b, c и d");
            System.out.println("Переменные a, b, c и d должны быть целыми числами в диапазоне от –2 147 483 648 до 2 147 483 647");
            System.out.print("Введите переменную a: ");
            int permennaya_a = in.nextInt();//Фиг его знает, как здесь сделать защиту от Дурака на тот случай, если пользователь вводит не целое число, а букву или какую-то другую хрень. Думаю, что Тимофей нам позже про это расскажет
            System.out.print("Введите переменную b: ");
            int permennaya_b = in.nextInt();
            System.out.print("Введите переменную c: ");
            int permennaya_c = in.nextInt();
            System.out.print("Введите переменную d: ");
            int permennaya_d = in.nextInt();
            Vychislyaem_Vyrazhenie(permennaya_a, permennaya_b, permennaya_c, permennaya_d);
        }
//4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
        if (nomer_zadaniya == 4) {
            System.out.println();
            System.out.println("Сейчас мы будем проверять, что сумма двух чисел, что Вы введёте");
            System.out.println("лежит в пределах от 10 до 20(включительно).");
            System.out.println("Для этого Вам надо будет последовательно ввести два дисла");
            System.out.print("Введите первое число: ");
            float pervoe_chislo = (float) (in.nextFloat());//Фиг его знает, как здесь сделать защиту от Дурака на тот случай, если пользователь вводит не число, а букву или какую-то другую хрень. Думаю, что Тимофей нам позже про это расскажет
            //пробовал float, но когда вводим 10.01 всё равно выдаёт ошибку, не стал сейчас над этим заморачиваться. Тимофей да поможет мне разобраться
            System.out.print("Введите второе число: ");
            float vtoroe_chislo = (float) (in.nextFloat());
            Summa_chisel_10_20(pervoe_chislo, vtoroe_chislo);
        }
//5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
        if (nomer_zadaniya == 5) {
            System.out.println();
            System.out.println("Сейчас мы будем проверять, введёте Вы отрицательное число или положительное.");
            System.out.println("Можете вводить и ноль, мы будем считать, что это положительное число.");
            System.out.print("Пора, вводите скорее Ваше целое число: ");
            int chislo = (int) (in.nextInt());//Фиг его знает, как здесь сделать защиту от Дурака на тот случай, если пользователь вводит не целое число, а букву или какую-то другую хрень. Думаю, что Тимофей нам позже про это расскажет
            Polojitelnoe_li_chislo(chislo);
        }
//6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
        if (nomer_zadaniya == 6) {
            System.out.println();
            System.out.println("Сейчас мы будем проверять, введёте ли Вы целое отрицательное число");
            System.out.print("Пора, вводите скорее Ваше целое число: ");
            int chislo = (int) (in.nextInt());//Фиг его знает, как здесь сделать защиту от Дурака на тот случай, если пользователь вводит не целое число, а букву или какую-то другую хрень. Думаю, что Тимофей нам позже про это расскажет
            Otritsatelnoe_li_chislo(chislo);
        }
//7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        if (nomer_zadaniya == 7) {
            System.out.println();
            System.out.println("Сейчас мы будем проверять, введёте ли Вы целое отрицательное число");
            System.out.print("Введите Ваше имя, пожалуйста: ");
//            String imya = in.nextLine()//Ты хоть тресни, но эта конструкция почему-то здесь не работает, не даёт ввести имя, просто идёт дальше и всё. Разберусь потом или с помощью Тимофея
            Scanner console = new Scanner(System.in);//а создание нового console(что это???) помогло
            String imya = console.nextLine();
            Vivesti_soobschenie(imya);
        }
//8. Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        if (nomer_zadaniya == 8) {
            Visokosnyy_li_god();
        }
        if (nomer_zadaniya > 8 || nomer_zadaniya < 2) {
            System.out.println();
            System.out.println("Вы ввели: " + nomer_zadaniya + " - такого номера задания нет в списке.");
            System.out.println("Попробуйте ещё разик, указав номер задания от 2 до 8");
        }


        in.close();//Необходимо закрыть объект in
    }

    //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
    private static void Sozdat_Peremennye() {
        System.out.println();
        System.out.println("Целочисленные переменные:");
        byte tip_dannix_byte;//Создаём тип данных byte
        tip_dannix_byte = 127;//инициализируем значение переменной
        System.out.println("Тип данных byte: " + tip_dannix_byte);
        short tip_dannix_short;//Создаём тип данных short
        tip_dannix_short = 1024;//инициализируем значение переменной
        System.out.println("Тип данных short: " + tip_dannix_short);
        int tip_dannix_int;//Создаём тип данных int
        tip_dannix_int = 3;//инициализируем значение переменной
        System.out.println("Тип данных int: " + tip_dannix_int);
        long tip_dannix_long;//Создаём тип данных long
        tip_dannix_long = 3_000_000_000L;//инициализируем значение переменной
        System.out.println("Тип данных long: " + tip_dannix_long);
        System.out.println("Переменные с плавающей запятой:");
        float tip_dannix_float;//Создаём тип данных float
        tip_dannix_float = 3.044F;//инициализируем значение переменной
        System.out.println("Тип данных float: " + tip_dannix_float);
        double tip_dannix_double;//Создаём тип данных double
        tip_dannix_double = 333.33D;//инициализируем значение переменной
        System.out.println("Тип данных double: " + tip_dannix_double);
        System.out.println("Символьные переменные:");
        char tip_dannix_char;//Создаём тип данных char
        tip_dannix_char = 33;//инициализируем значение переменной
        System.out.println("Тип данных char: " + tip_dannix_char + " (33 - это номер символа восклицательного знака)");
        System.out.println("Логические переменные:");
        boolean tip_dannix_boolean;//Создаём тип данных boolean
        tip_dannix_boolean = false;//инициализируем значение переменной
        System.out.println("Тип данных boolean: " + tip_dannix_boolean + ", а ещё может принимать значение: true");
        System.out.println("Строковые переменные:");
        String tip_dannix_String;//Создаём тип данных String
        tip_dannix_String = "тип данных String пишется с большой буквы, остальные типы данных - с маленькой.";//инициализируем значение переменной
        System.out.println("Тип данных String: " + tip_dannix_String);
    }

    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    private static void Vychislyaem_Vyrazhenie(int permennaya_a, int permennaya_b, int permennaya_c, int permennaya_d) {
//А вот проверить, что в переменную d ввели не ноль, я смогу. Надо проверить, чтобы исключить деление на ноль
        if (permennaya_d == 0) {
            System.out.println();
            System.out.println("Вы ввели значение переменной d: НОЛЬ.");
            System.out.println("Так делать нельзя, т.к. у нас в выражении a * (b + (c / d)) мы должны делить на переменную d");
            System.out.println("Если мы будем делить на НОЛЬ, то фиг его знает, как всё дальше сложится,");
            System.out.println("а случайности нам здесь не нужны.");
            System.out.println("Введите переменную d отличную от НУЛЯ и попробуйте ещё разик.");
        } else {
            System.out.println();
            System.out.println("Поздравляем! Выражение a * (b + (c / d)) успешно вычислено.");
            System.out.println("Вы хотели знать, сколько же будет " + permennaya_a + " * (" + permennaya_b + " + (" + permennaya_c + " / " + permennaya_d + "))");
            System.out.println("Вот ответ на Ващ вопрос: " + permennaya_a * (permennaya_b + (permennaya_c / permennaya_d)));
        }
    }

    //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    private static void Summa_chisel_10_20(float pervoe_chislo, float vtoroe_chislo) {
        if ((pervoe_chislo + vtoroe_chislo >= 10) & (pervoe_chislo + vtoroe_chislo <= 20)) {
            boolean tip_dannix_boolean = true;
            System.out.println(tip_dannix_boolean + "(верно), что означает, что сумма чисел, что Вы ввели: " + pervoe_chislo + "+" + vtoroe_chislo + " лежит в пределах от 10 до 20(включительно)");
        } else {
            boolean tip_dannix_boolean = false;
            System.out.println(tip_dannix_boolean + "(ложь), что означает, что сумма чисел, что Вы ввели: " + pervoe_chislo + "+" + vtoroe_chislo + " лежит за пределами от 10 до 20(включительно)");
        }
    }

    //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    private static void Polojitelnoe_li_chislo(int chislo) {
        if (chislo >= 0) {
            System.out.println("Вы только что ввели: " + chislo + " и это положительное целое число!!!");
        } else {
            System.out.println("Вы только что ввели: " + chislo + " и это отрицательное целое число!!!");
        }
    }

    //6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    private static void Otritsatelnoe_li_chislo(int chislo) {
        if (chislo < 0) {
            boolean tip_dannix_boolean = true;
            System.out.println(tip_dannix_boolean + "(верно), что означает Вы только что ввели отрицательное целое число. Вы ввели: " + chislo + " и это отрицательное целое число");
        } else {
            boolean tip_dannix_boolean = false;
            System.out.println(tip_dannix_boolean + "(ложь), по условиям задачи это ровным счётом ничего не означает, Вы ввели: " + chislo);
        }
    }

    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    private static void Vivesti_soobschenie(String imya) {
        System.out.println("«Привет, " + imya + "!»");
    }

    //8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    private static void Visokosnyy_li_god() {
        System.out.println();
        System.out.println("Сейчас мы будем определять, является ли год високосным");
        System.out.print("Введите год: ");
        Scanner in = new Scanner(System.in);
        int peremennaya_god = in.nextInt();//Фиг его знает, как здесь сделать защиту от Дурака на тот случай, если пользователь вводит не целое число, а букву или какую-то другую хрень. Думаю, что Тимофей нам позже про это расскажет
        if (peremennaya_god <= 0) {
            System.out.println("Вы ввели: " + peremennaya_god + " - такого года не существует, мы не можем определить високосный это год или нет.");
            System.out.println("Введите год как целое положительное число и попробуйте ещё разик.");
            return;
        }
        int ostatok_ot_delenya = peremennaya_god % 400;
        if (ostatok_ot_delenya == 0) {
            System.out.println("Вы ввели: " + peremennaya_god + " - это високосный год!!!");
            return;
        }
        ostatok_ot_delenya = peremennaya_god % 100;
        if (ostatok_ot_delenya == 0) {
            System.out.println("Вы ввели: " + peremennaya_god + " - это НЕ високосный год!!!");
            return;
        }
        ostatok_ot_delenya = peremennaya_god % 4;
        if (ostatok_ot_delenya == 0) {
            System.out.println("Вы ввели: " + peremennaya_god + " - это високосный год!!!");
            return;
        }
        System.out.println("Вы ввели: " + peremennaya_god + " - это НЕ високосный год!!!");
    }
}

