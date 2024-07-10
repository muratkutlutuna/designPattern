package behavirolDP.observerDP;

public class ObserverRunner {
    public static void main(String[] args) {
        ObserverRunner runner = new ObserverRunner();
        runner.observerDemo();
    }

    void observerDemo() {
        //news channel obj
        Channel channel1 = new NewsChannel();
        Channel channel2 = new NewsChannel();
        Channel channel3 = new NewsChannel();

        //Agency obj
        NewsAgency agency = new NewsAgency();
        //register channels
        agency.addObserver(channel1);
        agency.addObserver(channel2);
        agency.addObserver(channel3);

        agency.sendNews("Learn Java at TechProEd");
        agency.sendNews("Batch 134-135 students are getting ready for the market");

        System.out.println("News from channel 1: ");
        channel1.printNews();
        System.out.println("News from channel 2: ");
        channel2.printNews();
        System.out.println("News from channel 3: ");
        channel3.printNews();
        //TODO: fourth video from the design patterns
    }
}
