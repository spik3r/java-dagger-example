import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerClockComponent implements ClockComponent {
  private Provider<Clock> provideClockProvider;

  private MembersInjector<Main> mainMembersInjector;

  private DaggerClockComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static ClockComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideClockProvider =
        DoubleCheck.provider(ClockModule_ProvideClockFactory.create(builder.clockModule));

    this.mainMembersInjector = Main_MembersInjector.create(provideClockProvider);
  }

  @Override
  public void inject(Main main) {
    mainMembersInjector.injectMembers(main);
  }

  public static final class Builder {
    private ClockModule clockModule;

    private Builder() {}

    public ClockComponent build() {
      if (clockModule == null) {
        this.clockModule = new ClockModule();
      }
      return new DaggerClockComponent(this);
    }

    public Builder clockModule(ClockModule clockModule) {
      this.clockModule = Preconditions.checkNotNull(clockModule);
      return this;
    }
  }
}
