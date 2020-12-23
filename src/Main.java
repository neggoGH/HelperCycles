public class Main {
    public static void main(String[] args)
            throws java.io.IOException {
        char choiсe, ignore;
           do {
                   System.out.println("Справка: ");
                   System.out.println("    1. if");
                   System.out.println("    2. switch");
                   System.out.println("    3. for");
                   System.out.println("    4. while");
                   System.out.println("    5. do-while");
                   System.out.println("Выберете: ");

                   choiсe = (char) System.in.read();
                   do {
                       ignore = (char) System.in.read();
                   } while (ignore != '\n');
               } while (choiсe < '1' | choiсe > '5');

            switch (choiсe) {
                case '1':
                    System.out.println("Инструкция if:\n");
                    System.out.println("if(условие) {инструкция}");
                    System.out.println("else {инструкция}\n");
                    break;
                case '2':
                    System.out.println("Инструкция switch:\n");
                    System.out.println("switch (выражение) {");
                    System.out.println("  case константанта:");
                    System.out.println("     последовательность инструкций");
                    System.out.println("  break;");
                    System.out.println("//...");
                    System.out.println("}\n");
                    break;
                case '3':
                    System.out.println("Цикл for:\n");
                    System.out.println("for(инициализацияж условиеж итерация) {");
                    System.out.println("  инструкция;}\n");
                    break;
                case '4':
                    System.out.println("Цикл while:\n");
                    System.out.println("while (условие) {инструкция}\n");
                    break;
                case '5':
                    System.out.println("Цикл do-while:\n");
                    System.out.println("do {");
                    System.out.println("    инструкция;");
                    System.out.println("} while (условие);\n");
                    break;

                default:
                    System.out.println("Запрос не найден\n");
            }
        }
}
