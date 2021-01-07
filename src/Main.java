public class Main {
    public static void main(String[] args)
            throws java.io.IOException {
        char choiсe, ignore;
        Help hlpobj = new Help();

        for(;;) {
            do {
                hlpobj.showmenu();
                choiсe = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!hlpobj.isvalid(choiсe));
            if (choiсe == 'q') break;
            System.out.println("\n");
            hlpobj.helpon(choiсe);
        }
    }
}