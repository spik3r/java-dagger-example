import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Main_MembersInjector implements MembersInjector<Main> {
  private final Provider<Clock> clockProvider;

  public Main_MembersInjector(Provider<Clock> clockProvider) {
    assert clockProvider != null;
    this.clockProvider = clockProvider;
  }

  public static MembersInjector<Main> create(Provider<Clock> clockProvider) {
    return new Main_MembersInjector(clockProvider);
  }

  @Override
  public void injectMembers(Main instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.clock = clockProvider.get();
  }

  public static void injectClock(Main instance, Provider<Clock> clockProvider) {
    instance.clock = clockProvider.get();
  }
}
