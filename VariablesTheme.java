public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их на консоль.");
        byte num = 8;
        System.out.println(num + " " + "количство ядер");
        short num2 = 8;
        System.out.println(num2 + " " + "Гб память");
        int num3 = 5;
        System.out.println(num3 + " " + "нанометров техпроцесс");
        long num4 = 10;
        System.out.println(num4 + " " + "Вт теплопакет");
        float num5 = 3.2f;
        System.out.println(num5 + " " + "ГГц частота процессора");
        double num6 = 2.6d;
        System.out.println(num6 + " " + "Tflops производительность интегрированной графики\n");

        System.out.println("2. Расчет стоимости товара со скидкой.");
        short price1 = 100;
        short price2 = 200;
        byte red = 11;
        int sum = price1 + price2;
        int sum2 = (sum / 100 * red);
        int sum3 = sum - sum2;
        System.out.println(sum2);
        System.out.println(sum3);

        System.out.println("\n3. Вывод на косноль слова JAVA");
        System.out.println("    " + "J" + "    " + "a" + "  " + "v" + "     " + "v" + "  " + "a");
        System.out.println("    " + "J" + "   " + "a" + " " + "a" + "  " + "v" + "   " + "v" + "  " + "a" + " " + "a");
        System.out.println("J" + "   " + "J" + "  " + "aaaaa" + "  " + "V" + " " + "V" + "  " + "aaaaa");
        System.out.println(" " + "JJ" + "   " + "a" + "     " + "a" + "  " + "V" + "  " + "a" + "     " + "a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных.");
        byte mean1 = 127; //создаем переменную с максимальным значением
        System.out.println("Mаксимальное значение переменной byte:" + mean1);
        ++mean1;
        System.out.println("Инкрементируем переменную byte:" + mean1);
        --mean1;
        System.out.println("Декрементируем переменную byte:" + mean1 + "\n");

        short mean2 = 32_767; //создаем переменную с максимальным значением
        System.out.println("Mаксимальное значение переменной short:" + mean2);
        ++mean2;
        System.out.println("Инкрементируем переменную short:" + mean2);
        --mean2;
        System.out.println("Декрементируем переменную short:" + mean2 + "\n");

        int mean3 = 2_147_483_647; //создаем переменную с максимальным значением
        System.out.println("Mаксимальное значение переменной int:" + mean3);
        ++mean3;
        System.out.println("Инкрементируем переменную int:" + mean3);
        --mean3;
        System.out.println("Декрементируем переменную int:" + mean3 + "\n");

        long mean4 = 9_223_372_036_854_775_807l; //создаем переменную с максимальным значением
        System.out.println("Mаксимальное значение переменной long:" + mean4);
        ++mean4;
        System.out.println("Инкрементируем переменную long:" + mean4);
        --mean4;
        System.out.println("Декрементируем переменную long:" + mean4);

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        int c = a; // дополнительная переменная
        System.out.println("Смена значений переменных при помощи дополнительной переменной");
        System.out.println("Значения до смены: a, b = " + a + ", " + b);
        a = b;
        b = c;
        System.out.println("Значения после смены: a, b = " + a + ", " + b);

        System.out.println("\nС помощью арифметических операций");
        System.out.println("Значения до смены: a, b = " + a + ", " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Значения после смены: a, b = " + a + ", " + b);

        System.out.println("\nС помощью побитной операции");
        System.out.println("Значения до смены: a, b = " + a + ", " + b);
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("Значения после смены: a, b = " + a + ", " + b);

        System.out.println("\n6. Вывод символов и их кодов");
        char c1 = 35;
        char c2 = 38;
        char c3 = 64;
        char c4 = 94;
        char c5 = 95;
        System.out.println("35" + " " + c1);
        System.out.println("38" + " " + c2);
        System.out.println("64" + " " + c3);
        System.out.println("94" + " " + c4);
        System.out.println("95" + " " + c5);

        System.out.println("\n7. Отображение количества сотен десятков и единиц числа");
        int n = 123;
        int n1 = n%10;
        int n2 = n/10%10;
        int n3 = n/100;
        System.out.println("Число 123 содержит:");
        System.out.println(n1 + " " + "единицы");
        System.out.println(n2 + " " + "десятка");
        System.out.println(n3 + " " + "сотня");

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        char sym = 47; // /
        char sym2 = 92; // \
        char sym3 = 95; // _
        char sym4 = 40; // (
        char sym5 = 41; // )
        System.out.println("     " + sym + sym2);
        System.out.println("    " + sym +"  " + sym2);
        System.out.println("   " + sym + sym3 + sym4 + " " + sym5 + sym2);
        System.out.println("  " + sym +"      " + sym2);
        System.out.println(" " + sym + sym3 +sym3 + sym3 + sym3 + sym + sym2 + sym3 + sym3 + sym2);

        System.out.println("\n9. Произведение и сумма цифр числа");
        int f = 345;
        int f1 = f%10; //единиц
        int f2 = f/10%10; //десятков
        int f3 = f/100; //сотен
        int sumnum = f1 + f2 + f3;
        int inc = f1 * f2 * f3;
        System.out.println("Сумма цифр числа" + " " + sumnum);
        System.out.println("Произведение цифр числа" + " " + inc);

        System.out.println("\n10. Преобразование секунд");
        int sec = 86399; //секунды исх
        int min = sec/60;
        int min2 = sec%60;
        int min3 = sec/60%60;
        int h2 = min/60;
        System.out.println(h2 + ":" + min3 + ":" + min2);
    }
}