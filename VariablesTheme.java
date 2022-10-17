public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их на консоль.");
        byte core = 8;
        System.out.println(core + " " + "количество ядер");
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
        short pricePen = 100;
        short priceBook = 200;
        byte reduction = 11;
        int cost = pricePen + priceBook;
        int discount = (cost / 100 * reduction);
        int discontCost = cost - discount;
        System.out.println("Сумма скидки:" + discount);
        System.out.println("Стоимость товаров со скидкой" + discontCost);

        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println("J   J  aaaaa  V V  aaaaa");
        System.out.println(" JJ   a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных.");
        byte maxByte = 127; //создаем переменную с максимальным значением
        System.out.println("Максимальное значение переменной byte:" + maxByte);
        System.out.println("Инкрементируем переменную byte:" + ++maxByte);
        System.out.println("Декрементируем переменную byte:" + --maxByte + "\n");

        short maxShort = 32_767; //создаем переменную с максимальным значением
        System.out.println("Максимальное значение переменной short:" + maxShort);
        System.out.println("Инкрементируем переменную short:" + ++maxShort);
        System.out.println("Декрементируем переменную short:" + --maxShort + "\n");

        int maxInt = 2_147_483_647; //создаем переменную с максимальным значением
        System.out.println("Максимальное значение переменной int:" + maxInt);
        System.out.println("Инкрементируем переменную int:" + ++maxInt);
        System.out.println("Декрементируем переменную int:" + --maxInt + "\n");

        long maxLong = 9_223_372_036_854_775_807l; //создаем переменную с максимальным значением
        System.out.println("Максимальное значение переменной long:" + maxLong);
        System.out.println("Инкрементируем переменную long:" + ++maxLong);
        System.out.println("Декрементируем переменную long:" + --maxLong);

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
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Значения после смены: a, b = " + a + ", " + b);

        System.out.println("\n6. Вывод символов и их кодов");
        char c1 = '#';
        char c2 = '&';
        char c3 = '@';
        char c4 = '^';
        char c5 = '_';
        System.out.println((int) c1 + " " + c1);
        System.out.println((int) c2 + " " + c2);
        System.out.println((int) c3 + " " + c3);
        System.out.println((int) c4 + " " + c4);
        System.out.println((int) c5 + " " + c5);

        System.out.println("\n7. Отображение количества сотен десятков и единиц числа");
        int srcNum = 123;
        int ones = srcNum % 10;
        int tens = srcNum / 10 % 10;
        int hundreds = srcNum / 100;
        System.out.println("Число 123 содержит:");
        System.out.println(ones + " " + "единицы");
        System.out.println(tens + " " + "десятка");
        System.out.println(hundreds + " " + "сотня");

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        char slash = '/'; // 47
        char backSlash = '\\'; // 92
        char underScore = '_'; // 95
        char openPar = '('; // 40
        char closePar = ')'; // 41
        System.out.println("     " + slash + backSlash);
        System.out.println("    " + slash +"  " + backSlash);
        System.out.println("   " + slash + underScore + openPar + " " + closePar + backSlash);
        System.out.println("  " + slash +"      " + backSlash);
        System.out.println(" " + slash + underScore + underScore + underScore + underScore + slash +
            backSlash + underScore + underScore + backSlash);

        System.out.println("\n9. Произведение и сумма цифр числа");
        int srcNum1 = 345;
        int ones1 = srcNum1 % 10; //единиц
        int tens1 = srcNum1 / 10 % 10; //десятков
        int hundreds1 = srcNum1 / 100; //сотен
        int sumDigits = ones1 + tens1 + hundreds1;
        int multDigits = ones1 * tens1 * hundreds1;
        System.out.println("Сумма цифр числа" + " " + sumDigits);
        System.out.println("Произведение цифр числа" + " " + multDigits);

        System.out.println("\n10. Преобразование секунд");
        int totalSec = 86399; //секунды исх
        int hours = totalSec / 60 / 60;//23
        int minutes = totalSec / 60 % 60;//59
        int seconds = totalSec % 60;//59
        
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}