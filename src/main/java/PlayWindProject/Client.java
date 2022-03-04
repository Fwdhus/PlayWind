package PlayWindProject;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;

public class Client {
    public static void main(String[] args) {
        var config = new Config();
        var now = DateTime.now().getMillisOfDay();
        var server = new Server(config, now);
        var alice = new Player();
        alice.id = "alice";
        alice.coins = 0L;

        // Day 1 login
        var LoginReward = server.dailyLoginAPI(alice);
        System.out.println("Player: " + alice.id);
        System.out.println("Player coins: " + alice.coins);
        System.out.println("Daily Reward Coins " + LoginReward.dailyRewardCoin);
        System.out.println("Login Gift Coins " + LoginReward.loginGiftCoin);

        // Day 2 login
        server.now = (long) (now + DateTimeConstants.MILLIS_PER_DAY);
        server.dailyLoginAPI(alice);
        System.out.println("Player: " + alice.id);
        System.out.println("Player coins: " + alice.coins);
        System.out.println("Daily Reward Coins " + LoginReward.dailyRewardCoin);
        System.out.println("Login Gift Coins " + LoginReward.loginGiftCoin);

        // Day 3 login
        server.now = (long) (now + DateTimeConstants.MILLIS_PER_DAY);
        server.dailyLoginAPI(alice);
        System.out.println("Player: " + alice.id);
        System.out.println("Player coins: " + alice.coins);
        System.out.println("Daily Reward Coins " + LoginReward.dailyRewardCoin);
        System.out.println("Login Gift Coins " + LoginReward.loginGiftCoin);

        // Day 4 login
        server.now = (long) (now + DateTimeConstants.MILLIS_PER_DAY);
        server.dailyLoginAPI(alice);
        System.out.println("Player: " + alice.id);
        System.out.println("Player coins: " + alice.coins);
        System.out.println("Daily Reward Coins " + LoginReward.dailyRewardCoin);
        System.out.println("Login Gift Coins " + LoginReward.loginGiftCoin);

        // Day 5 login
        server.now = (long) (now + DateTimeConstants.MILLIS_PER_DAY);
        server.dailyLoginAPI(alice);
        System.out.println("Player: " + alice.id);
        System.out.println("Player coins: " + alice.coins);
        System.out.println("Daily Reward Coins " + LoginReward.dailyRewardCoin);
        System.out.println("Login Gift Coins " + LoginReward.loginGiftCoin);

        // Day 6 login
        server.now = (long) (now + DateTimeConstants.MILLIS_PER_DAY);
        server.dailyLoginAPI(alice);
        System.out.println("Player: " + alice.id);
        System.out.println("Player coins: " + alice.coins);
        System.out.println("Daily Reward Coins " + LoginReward.dailyRewardCoin);
        System.out.println("Login Gift Coins " + LoginReward.loginGiftCoin);

        // Day 7 login
        server.now = (long) (now + DateTimeConstants.MILLIS_PER_DAY);
        server.dailyLoginAPI(alice);
        System.out.println("Player: " + alice.id);
        System.out.println("Player coins: " + alice.coins);
        System.out.println("Daily Reward Coins " + LoginReward.dailyRewardCoin);
        System.out.println("Login Gift Coins " + LoginReward.loginGiftCoin);

        // Day 8 login
        server.now = (long) (now + DateTimeConstants.MILLIS_PER_DAY);
        server.dailyLoginAPI(alice);
        System.out.println("Player: " + alice.id);
        System.out.println("Player coins: " + alice.coins);
        System.out.println("Daily Reward Coins " + LoginReward.dailyRewardCoin);
        System.out.println("Login Gift Coins " + LoginReward.loginGiftCoin);

        // Day 9 login
        server.now = (long) (now + DateTimeConstants.MILLIS_PER_DAY);
        server.dailyLoginAPI(alice);
        System.out.println("Player: " + alice.id);
        System.out.println("Player coins: " + alice.coins);
        System.out.println("Daily Reward Coins " + LoginReward.dailyRewardCoin);
        System.out.println("Login Gift Coins " + LoginReward.loginGiftCoin);
    }
}
