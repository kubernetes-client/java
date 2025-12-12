package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class CoreV1EventSeriesBuilder extends CoreV1EventSeriesFluent<CoreV1EventSeriesBuilder> implements VisitableBuilder<CoreV1EventSeries,CoreV1EventSeriesBuilder>{

  CoreV1EventSeriesFluent<?> fluent;

  public CoreV1EventSeriesBuilder() {
    this(new CoreV1EventSeries());
  }
  
  public CoreV1EventSeriesBuilder(CoreV1EventSeriesFluent<?> fluent) {
    this(fluent, new CoreV1EventSeries());
  }
  
  public CoreV1EventSeriesBuilder(CoreV1EventSeries instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public CoreV1EventSeriesBuilder(CoreV1EventSeriesFluent<?> fluent,CoreV1EventSeries instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public CoreV1EventSeries build() {
    CoreV1EventSeries buildable = new CoreV1EventSeries();
    buildable.setCount(fluent.getCount());
    buildable.setLastObservedTime(fluent.getLastObservedTime());
    return buildable;
  }
  
}