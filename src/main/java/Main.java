import javax.inject.Inject;

public class Main {
    @Inject
    Clock clock;
    
    ClockComponent component;
    
    public void printTime() {
        component = DaggerClockComponent.builder().build();
        component.inject(this);
        System.out.print("The time is: ");
        System.out.println(clock.getNow());
    }
    
    public static void main(String[] args)
    {
        System.out.println("Starting Main");
        Main main = new Main();
        main.printTime();
        System.out.println("Finished Main");
    }
}
