public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.fullname = "Mike";
//        player.health = 20;
//        player.weapon = "Miecz";
//
//        int damage = 10;
//        player.loseHealtch(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        player.health = 30;
//
//        damage = 11;
//        player.loseHealtch(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        EnchancedPlayer player = new EnchancedPlayer("Michał", 200, "Sword");
//        System.out.println("Initial health is " + player.getHealth());

        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
    }
}
