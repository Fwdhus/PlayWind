package PlayWindProject;

import java.util.*;

public class Config {
    public List<Long> dailyReward;
    public Map<Long, Long> loginGifts = new HashMap<>();
    public Long loginGiftPeriodDays;

    public Config() {
        this.loginGiftPeriodDays = 30L;
        dailyReward = Arrays.asList(1L, 2L, 3L, 4L, 5L, 6L, 7L);
        loginGifts.put(5L, 5L);
        loginGifts.put(10L, 10L);
        loginGifts.put(15L, 15L);
        loginGifts.put(20L, 20L);
        loginGifts.put(25L, 25L);
    }
}
