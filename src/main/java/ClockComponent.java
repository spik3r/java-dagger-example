import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = ClockModule.class)
public interface ClockComponent {
    void inject(Main main);
}

