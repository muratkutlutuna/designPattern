package behavirolDP.observerDP;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private String news;
    private List<Channel> channelList = new ArrayList<>();

    /**
     * method to add subscribed channel
     */
    public void addObserver(Channel channel) {
        this.channelList.add(channel);
    }

    /**
     * remove channels
     * @param channel
     */
    public void removeObserver(Channel channel) {
        this.channelList.remove(channel);
    }

    /**
     * method to send new updates subscriber channels
     * @param news
     */
    public void sendNews(String news) {
        this.news = news;
        for (Channel channel : channelList) {
            channel.update(this.news);
        }
    }
}
