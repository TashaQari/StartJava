public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");
        int age = 16; // age
        char gender = 'm'; //gender is
        double height = 1.70; //person's height
        if (age > 20){
            System.out.println("Возраст больше 20 лет");
        } else if (age < 20){
            System.out.println("Возраст меньше 20 лет");
        }
        if (gender == 'm'){
            System.out.println("Пол мужской");
        } else if (gender != 'm'){
            System.out.println("Другой пол");
        }
        if (height < 1.80){
            System.out.println("Рост до 1.80");
        } else if (height > 1.80){
            System.out.println("Рост больше 1.80");
        }
        char firstInitial = "Micael".charAt(0);
        if (firstInitial == 'M'){
            System.out.println("Имя на букву М");
        } if (firstInitial == 'I'){
            System.out.println("Имя на букву I");
        } else if (firstInitial != 'I' & firstInitial != 'M'){
            System.out.println("Имя на другую букву");
        }
        System.out.println("\n2. Поиск max и min числа");
        int num1 = 3245;
        int num2 = 56743;
        System.out.println("Число с max значением: " + Math.max(num1,num2));
        System.out.println("Число с min значением: " + Math.min(num1,num2));
        if (num1 == num2){
            System.out.println("Числа равны");
        } else if (num1 != num2){
            System.out.println("Числа не равны");
        }
        System.out.println("\n3. Работа с числом");
        int mean = 47;
        if (mean == 0){
            System.out.println("Число 0");
            if (mean == 0) return;{
            }
        } else if (mean != 0){
            System.out.println("Число " + mean);
        }
        if (mean % 2 == 0){
            System.out.println("Число четное");
        } else if (mean % 2 != 0){
            System.out.println("Число не четное");
        }
        if (mean < 0){
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int comparableNum1 = 386;
        int comparableNum2 = 286;
        System.out.println(comparableNum1 + " " + comparableNum2);
        int ones1 = comparableNum1 % 10;
        int tens1 = comparableNum1 / 10 % 10;
        int hundreds1 = comparableNum1 / 100;
        int ones2 = comparableNum2 % 10;
        int tens2 = comparableNum2 / 10 % 10;
        int hundreds2 = comparableNum2 / 100;
        if (ones1 == ones2){
            System.out.println(ones1 + " третий разряд");
            } if (tens1 == tens2){
                System.out.print(tens1 + " второй разряд");
            } if (hundreds1 == hundreds2){
                System.out.print(hundreds1 + " первый разряд");
            }
        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char code = '\u0057';
        System.out.println(code);
        char[] diapason = {'\u0061', '\u0062', '\u0063', '\u0064', '\u0065', '\u0066','\u0067',
        '\u0068', '\u0069', '\u006A', '\u006B', '\u006C', '\u006D', '\u006E', '\u006F', '\u0070',
        '\u0071', '\u0072', '\u0073', '\u0074', '\u0075', '\u0076', '\u0077', '\u0078', '\u0079',
        '\u007A'};
        for (char elemnt : diapason)
            if (code >= elemnt & code <= elemnt){
            System.out.println("маленькая буква");
        }
        char[] diapason2 = {'\u0041', '\u0042', '\u0043', '\u0044', '\u0045', '\u0046','\u0047',
        '\u0048', '\u0049', '\u004A', '\u004B', '\u004C', '\u004D', '\u004E', '\u004F', '\u0050',
        '\u0051', '\u0052', '\u0053', '\u0054', '\u0055', '\u0056', '\u0057', '\u0058', '\u0059',
        '\u005A'};
        for (char elemnt2 : diapason2)
            if (code >= elemnt2 & code <= elemnt2){
            System.out.println("большая буква");
        }
        char[] diapason3 = {'\u0030', '\u0031', '\u0032', '\u0033', '\u0034', '\u0035', '\u0036',
        '\u0037', '\u0038', '\u0039'};
        for (char elemnt3 : diapason3)
            if (code >= elemnt3 & code <= elemnt3){
            System.out.println("число");
        }
        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int deposit = 300000;
            System.out.println("Сумма вклада " + deposit);
        if (deposit < 100000){
            System.out.println("Начисленный % " + deposit / 100 * 5);
        } else if (deposit >= 100000 && deposit <= 300000){
            System.out.println("Начисленный % " + deposit / 100 * 7);
        } else if (deposit > 300000){
            System.out.println("Начисленный % " + deposit / 100 * 10);
        }
        if (deposit < 100000){
            System.out.println("Начисленный % " + (deposit / 100 * 5 + deposit));
        } else if (deposit >= 100000 && deposit <= 300000){
            System.out.println("Начисленный % " + (deposit / 100 * 7 + deposit));
        } else if (deposit > 300000){
            System.out.println("Начисленный % " + (deposit / 100 * 10 + deposit));
        }
        System.out.println("\n7. Определение оценки по предметам");
        int percentHist = 54;
        int valuation;
        if(percentHist > 91){
            valuation = 5;
        }else if(percentHist > 73){
            valuation=4;
        }else if(percentHist > 60){
            valuation=3;
        }else if(percentHist <=60){
            valuation=2;
        }else{
            valuation=0;
        }
        System.out.println("Оценка " + valuation);
        int percentProg = 91;
        int valuation1;
        if(percentProg > 91){
            valuation1 = 5;
        }else if(percentProg > 73){
            valuation1=4;
        }else if(percentProg > 60){
            valuation1=3;
        }else if(percentProg <=60){
            valuation1=2;
        }else{
            valuation1=0;
        }
        System.out.println("Оценка " + valuation1);
        System.out.println(((valuation + valuation1) / 2) + " средняя оценка по предметам");
        System.out.println(((percentHist + percentProg) / 2) + " средний процент по предметам");

        System.out.println("\n8. Расчет прибыли");
        int revenue = 13000;
        int cost = 9000;
        int expenses = 5000;
        int profityear = (revenue - cost - expenses) * 12;
        if (profityear > 0){
            System.out.println("+ " + profityear);
        } else {
            System.out.println(profityear);
        }
        System.out.println("\n9. Подсчет количества банкнот");
        int amountusd = 567;
        int ones3 = amountusd % 10;
        int tens3 = amountusd / 10 % 10;
        int hundreds3 = amountusd / 100;
        int value100 = 10;
        int value10 = 5;
        int value1 = 50;
        if (hundreds3 <= value100){
            System.out.println("100 usd " + hundreds3);
        } else if(hundreds3 > value100){
            System.out.println("100 usd " + value100 + "\n10 usd " + (hundreds3 - value100) * 10);
        }
        if (tens3 <= value10){
                System.out.println("10 usd " + tens3);
        } else if (tens3 > value10){
            System.out.println("10 usd " + value10 + "\n1 usd " + (tens3 - value10) * 10);
        }
        if (ones3 <= value1){
            System.out.println("1 usd " + ones3);
        } else if (ones3 > value1){
            System.out.println("NOT");
        }
    }
}