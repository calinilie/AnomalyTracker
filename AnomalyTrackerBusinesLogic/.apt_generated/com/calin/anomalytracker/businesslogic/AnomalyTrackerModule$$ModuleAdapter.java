// Code generated by dagger-compiler.  Do not edit.
package com.calin.anomalytracker.businesslogic;

import dagger.internal.Binding;
import dagger.internal.BindingsGroup;
import dagger.internal.Linker;
import dagger.internal.ModuleAdapter;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

/**
 * A manager of modules and provides adapters allowing for proper linking and
 * instance provision of types served by {@code @Provides} methods.
 */
public final class AnomalyTrackerModule$$ModuleAdapter extends ModuleAdapter<AnomalyTrackerModule> {
  private static final String[] INJECTS = { "members/com.calin.anomalytracker.businesslogic.restservices.AnomalyService", };
  private static final Class<?>[] STATIC_INJECTIONS = { };
  private static final Class<?>[] INCLUDES = { };

  public AnomalyTrackerModule$$ModuleAdapter() {
    super(com.calin.anomalytracker.businesslogic.AnomalyTrackerModule.class, INJECTS, STATIC_INJECTIONS, false /*overrides*/, INCLUDES, true /*complete*/, true /*library*/);
  }

  @Override
  public AnomalyTrackerModule newModule() {
    return new com.calin.anomalytracker.businesslogic.AnomalyTrackerModule();
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getBindings(BindingsGroup bindings, AnomalyTrackerModule module) {
    bindings.contributeProvidesBinding("com.calin.anomalytracker.businesslogic.models.factories.AnomalyAutoBeanFactoryWrapper", new ProvideAnomalyAutoBeanFactoryWrapperProvidesAdapter(module));
    bindings.contributeProvidesBinding("com.calin.anomalytracker.businesslogic.restservices.AnomalyService", new ProvideAnomalyServiceProvidesAdapter(module));
    bindings.contributeProvidesBinding("com.calin.anomalytracker.businesslogic.restservices.DataAccess", new ProvideDataAccessProvidesAdapter(module));
  }

  /**
   * A {@code Binding<com.calin.anomalytracker.businesslogic.models.factories.AnomalyAutoBeanFactoryWrapper>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Being a {@code Provider<com.calin.anomalytracker.businesslogic.models.factories.AnomalyAutoBeanFactoryWrapper>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideAnomalyAutoBeanFactoryWrapperProvidesAdapter extends ProvidesBinding<com.calin.anomalytracker.businesslogic.models.factories.AnomalyAutoBeanFactoryWrapper>
      implements Provider<com.calin.anomalytracker.businesslogic.models.factories.AnomalyAutoBeanFactoryWrapper> {
    private final AnomalyTrackerModule module;

    public ProvideAnomalyAutoBeanFactoryWrapperProvidesAdapter(AnomalyTrackerModule module) {
      super("com.calin.anomalytracker.businesslogic.models.factories.AnomalyAutoBeanFactoryWrapper", NOT_SINGLETON, "com.calin.anomalytracker.businesslogic.AnomalyTrackerModule", "provideAnomalyAutoBeanFactoryWrapper");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.calin.anomalytracker.businesslogic.models.factories.AnomalyAutoBeanFactoryWrapper>}.
     */
    @Override
    public com.calin.anomalytracker.businesslogic.models.factories.AnomalyAutoBeanFactoryWrapper get() {
      return module.provideAnomalyAutoBeanFactoryWrapper();
    }
  }

  /**
   * A {@code Binding<com.calin.anomalytracker.businesslogic.restservices.AnomalyService>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Owning the dependency links between {@code com.calin.anomalytracker.businesslogic.restservices.AnomalyService} and its
   * dependencies.
   *
   * Being a {@code Provider<com.calin.anomalytracker.businesslogic.restservices.AnomalyService>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideAnomalyServiceProvidesAdapter extends ProvidesBinding<com.calin.anomalytracker.businesslogic.restservices.AnomalyService>
      implements Provider<com.calin.anomalytracker.businesslogic.restservices.AnomalyService> {
    private final AnomalyTrackerModule module;
    private Binding<com.calin.anomalytracker.businesslogic.restservices.DataAccess> dataAccess;
    private Binding<com.calin.anomalytracker.businesslogic.models.factories.AnomalyAutoBeanFactoryWrapper> wrapper;

    public ProvideAnomalyServiceProvidesAdapter(AnomalyTrackerModule module) {
      super("com.calin.anomalytracker.businesslogic.restservices.AnomalyService", IS_SINGLETON, "com.calin.anomalytracker.businesslogic.AnomalyTrackerModule", "provideAnomalyService");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      dataAccess = (Binding<com.calin.anomalytracker.businesslogic.restservices.DataAccess>) linker.requestBinding("com.calin.anomalytracker.businesslogic.restservices.DataAccess", AnomalyTrackerModule.class, getClass().getClassLoader());
      wrapper = (Binding<com.calin.anomalytracker.businesslogic.models.factories.AnomalyAutoBeanFactoryWrapper>) linker.requestBinding("com.calin.anomalytracker.businesslogic.models.factories.AnomalyAutoBeanFactoryWrapper", AnomalyTrackerModule.class, getClass().getClassLoader());
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(dataAccess);
      getBindings.add(wrapper);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.calin.anomalytracker.businesslogic.restservices.AnomalyService>}.
     */
    @Override
    public com.calin.anomalytracker.businesslogic.restservices.AnomalyService get() {
      return module.provideAnomalyService(dataAccess.get(), wrapper.get());
    }
  }

  /**
   * A {@code Binding<com.calin.anomalytracker.businesslogic.restservices.DataAccess>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Being a {@code Provider<com.calin.anomalytracker.businesslogic.restservices.DataAccess>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideDataAccessProvidesAdapter extends ProvidesBinding<com.calin.anomalytracker.businesslogic.restservices.DataAccess>
      implements Provider<com.calin.anomalytracker.businesslogic.restservices.DataAccess> {
    private final AnomalyTrackerModule module;

    public ProvideDataAccessProvidesAdapter(AnomalyTrackerModule module) {
      super("com.calin.anomalytracker.businesslogic.restservices.DataAccess", IS_SINGLETON, "com.calin.anomalytracker.businesslogic.AnomalyTrackerModule", "provideDataAccess");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.calin.anomalytracker.businesslogic.restservices.DataAccess>}.
     */
    @Override
    public com.calin.anomalytracker.businesslogic.restservices.DataAccess get() {
      return module.provideDataAccess();
    }
  }
}
