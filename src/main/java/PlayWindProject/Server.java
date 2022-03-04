package PlayWindProject;

import org.joda.time.DateTimeConstants;

public class Server {

    public Config config;
    public Long now;
    public Long tempNow = 0L;
    public Integer i = 0;

    public Server(Config config, long now) {
        this.config = config;
        this.now = now;
    }

    public DailyLoginAPIResponse dailyLoginAPI(Player player) {
        if (config.loginGiftPeriodDays == 0) {
            player.loginDays = 1L;
            config.loginGiftPeriodDays = 30L;
        }
        DailyLoginAPIResponse dailyLoginAPIResponse = new DailyLoginAPIResponse();
        if ((now - tempNow) <= DateTimeConstants.MILLIS_PER_DAY) {
            if (i > 6) {
                i = 0;
            }
            player.coins += config.dailyReward.get(i);
            dailyLoginAPIResponse.dailyRewardCoin = config.dailyReward.get(i);
            i++;
        }
        if ((now - tempNow) > DateTimeConstants.MILLIS_PER_DAY) {
            i = 0;
            player.coins += config.dailyReward.get(i);
            dailyLoginAPIResponse.dailyRewardCoin = 1L;
            i++;
        }
        if (player.loginDays == 5) {
            player.coins += config.loginGifts.get(5L);
            dailyLoginAPIResponse.loginGiftCoin = 5L;
        }
        if (player.loginDays == 10) {
            player.coins += config.loginGifts.get(10L);
            dailyLoginAPIResponse.loginGiftCoin = 10L;
        }
        if (player.loginDays == 15) {
            player.coins += config.loginGifts.get(15L);
            dailyLoginAPIResponse.loginGiftCoin = 15L;
        }
        if (player.loginDays == 20) {
            player.coins += config.loginGifts.get(20L);
            dailyLoginAPIResponse.loginGiftCoin = 20L;
        }
        if (player.loginDays == 25) {
            player.coins += config.loginGifts.get(25L);
            dailyLoginAPIResponse.loginGiftCoin = 25L;
        }
        player.loginDays++;
        tempNow = now;
        config.loginGiftPeriodDays--;
        return dailyLoginAPIResponse;
    }
}
