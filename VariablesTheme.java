public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их на консоль.");
        byte core = 8;
        System.out.println(core + " " + "количство ядер");
        short memory = 8;
        System.out.println(memory + " " + "Гб память");
        int tecproc = 5;
        System.out.println(tecproc + " " + "нанометров техпроцесс");
        long thermaldp = 10;
        System.out.println(thermaldp + " " + "Вт теплопакет");
        float clockrate = 3.2f;
        System.out.println(clockrate + " " + "ГГц частота процессора");
        double graphics = 2.6;
        System.out.println(graphics + " " + "Tflops производительность интегрированной графики\n");

        System.out.println("2. Расчет стоимости товара со скидкой.");
        short pricepen = 100;
        short pricebook = 200;
        byte reduction = 11;
        int cost = pricepen + pricebook;
        int discount = (cost / 100 * reduction);
        int costdiscont = cost - discount;
        System.out.println(discount);
        System.out.println(costdiscont);

        System.out.println("\n3. Вывод на косноль слова JAVA");
        System.out.println("    " + "J" + "    " + "a" + "  " + "v" + "     " + "v" + "  " + "a");
        System.out.println("    " + "J" + "   " + "a" + " " + "a" + "  " + "v" + "   " + "v" + "  " + "a" + " " + "a");
        System.out.println("J" + "   " + "J" + "  " + "aaaaa" + "  " + "V" + " " + "V" + "  " + "aaaaa");
        System.out.println(" " + "JJ" + "   " + "a" + "     " + "a" + "  " + "V" + "  " + "a" + "     " + "a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных.");
        byte maxByte = 127; //создаем переменную с максимальным значением
        System.out.println("Mаксимальное значение переменной byte:" + maxByte);
        System.out.println("Инкрементируем переменную byte:" + ++ maxByte);
        System.out.println("Декрементируем переменную byte:" + -- maxByte + "\n");

        short maxShort = 32_767; //создаем переменную с максимальным значением
        System.out.println("Mаксимальное значение переменной short:" + maxShort);
        System.out.println("Инкрементируем переменную short:" + ++ maxShort);
        System.out.println("Декрементируем переменную short:" + -- maxShort + "\n");

        int maxInt = 2_147_483_647; //создаем переменную с максимальным значением
        System.out.println("Mаксимальное значение переменной int:" + maxInt);
        System.out.println("Инкрементируем переменную int:" + ++ maxInt);
        System.out.println("Декрементируем переменную int:" + -- maxInt + "\n");

        long maxLong = 9_223_372_036_854_775_807l; //создаем переменную с максимальным значением
        System.out.println("Mаксимальное значение переменной long:" + maxLong);
        System.out.println("Инкрементируем переменную long:" + ++ maxLong);
        System.out.println("Декрементируем переменную long:" + -- maxLong);

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println("Смена значений переменных при помощи дополнительной переменной");
        System.out.println("Значения до смены: a, b = " + a + ", " + b);
        int c = a; // дополнительная переменная
        a = b;
        b = c;
        System.out.println("Значения после смены: a, b = " + a + ", " + b);

        System.out.println("\nС помощью арифметических операций");
        System.out.println("Значения до смены: a, b = " + a + ", " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Значения после смены: a, b = " + a + ", " + b);

        System.out.println("\nС помощью побитной операции");
        System.out.println("Значения до смены: a, b = " + a + ", " + b);
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("Значения после смены: a, b = " + a + ", " + b);

        System.out.println("\n6. Вывод символов и их кодов");
        char c1 = '#'; //35
        int dec1 = c1;
        char c2 = '&'; //38
        int dec2 = c2;
        char c3 = '@'; //64
        int dec3 = c3;
        char c4 = '^'; //94
        int dec4 = c4;
        char c5 = '_'; //95
        int dec5 = c5;
        System.out.println(dec1 + " " + c1);
        System.out.println(dec2 + " " + c2);
        System.out.println(dec3 + " " + c3);
        System.out.println(dec4 + " " + c4);
        System.out.println(dec5 + " " + c5);

        System.out.println("\n7. Отображение количества сотен десятков и единиц числа");
        int number = 123;
        int ones = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 100;
        System.out.println("Число 123 содержит:");
        System.out.println(ones + " " + "единицы");
        System.out.println(tens + " " + "десятка");
        System.out.println(hundreds + " " + "сотня");

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        char slash = '/'; // 47
        char backslash = '\\'; // 92
        char underscore = '_'; // 95
        char openpar = '('; // 40
        char closepar = ')'; // 41
        System.out.println("     " + slash + backslash);
        System.out.println("    " + slash +"  " + backslash);
        System.out.println("   " + slash + underscore + openpar + " " + closepar + backslash);
        System.out.println("  " + slash +"      " + backslash);
        System.out.println(" " + slash + underscore + underscore + underscore + underscore + slash + backslash + underscore + underscore + backslash);

        System.out.println("\n9. Произведение и сумма цифр числа");
        int numbers1 = 345;
        int ones1 = numbers1 % 10; //единиц
        int tens1 = numbers1 / 10 % 10; //десятков
        int hundreds1 = numbers1 / 100; //сотен
        int addition = ones1 + tens1 + hundreds1;
        int multiplication = ones1 * tens1 * hundreds1;
        System.out.println("Сумма цифр числа" + " " + addition);
        System.out.println("Произведение цифр числа" + " " + multiplication);

        System.out.println("\n10. Преобразование секунд");
        int sec = 86399; //секунды исх
        int min = sec / 60;
        int min2 = sec % 60;
        int min3 = sec / 60 % 60;
        int h2 = min / 60;
        System.out.println(h2 + ":" + min3 + ":" + min2);
    }
}