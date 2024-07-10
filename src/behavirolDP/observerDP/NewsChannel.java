package behavirolDP.observerDP;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel implements Channel{
    //list of news

    private List<String> newList = new ArrayList<>();

    @Override
    public void update(String news) {
        //add new news to the list
        newList.add(news);
    }

    @Override
    public void printNews() {
        //method to print all list of news
        for (String news : newList) {
            System.out.println(news);
        }
    }
}
