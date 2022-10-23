public class Main {
    public static void main(String[] args) {

        Printer printPaper = new Printer(3, true);

        Printer printer = new Printer(100, false);
        printPaper.printPage(1);

        printer.printPage(100);
//        BetterPlayer player = new BetterPlayer(10, "timmy " , "Sword");
//
//        System.out.println("init health of player is : " + player.getHitPoints());

//        Player player = new Player();
//        player.name = "Time";
//        player.health = 20;
//        player.weapon = "knife";
//
//        player.loseHealth(10);
//        System.out.println("Remaing HP: " + player.healthRemaining());
//        player.loseHealth(10);
//        System.out.println("Remaing HP: " + player.healthRemaining());

    }
}