package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CSINodeSpecFluent<A extends V1CSINodeSpecFluent<A>> extends Fluent<A>{
  public A addToDrivers(Integer index,V1CSINodeDriver item);
  public A setToDrivers(Integer index,V1CSINodeDriver item);
  public A addToDrivers(io.kubernetes.client.openapi.models.V1CSINodeDriver... items);
  public A addAllToDrivers(Collection<V1CSINodeDriver> items);
  public A removeFromDrivers(io.kubernetes.client.openapi.models.V1CSINodeDriver... items);
  public A removeAllFromDrivers(Collection<V1CSINodeDriver> items);
  public A removeMatchingFromDrivers(Predicate<V1CSINodeDriverBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildDrivers instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1CSINodeDriver> getDrivers();
  public List<V1CSINodeDriver> buildDrivers();
  public V1CSINodeDriver buildDriver(Integer index);
  public V1CSINodeDriver buildFirstDriver();
  public V1CSINodeDriver buildLastDriver();
  public V1CSINodeDriver buildMatchingDriver(Predicate<V1CSINodeDriverBuilder> predicate);
  public Boolean hasMatchingDriver(Predicate<V1CSINodeDriverBuilder> predicate);
  public A withDrivers(List<V1CSINodeDriver> drivers);
  public A withDrivers(io.kubernetes.client.openapi.models.V1CSINodeDriver... drivers);
  public Boolean hasDrivers();
  public V1CSINodeSpecFluent.DriversNested<A> addNewDriver();
  public V1CSINodeSpecFluent.DriversNested<A> addNewDriverLike(V1CSINodeDriver item);
  public V1CSINodeSpecFluent.DriversNested<A> setNewDriverLike(Integer index,V1CSINodeDriver item);
  public V1CSINodeSpecFluent.DriversNested<A> editDriver(Integer index);
  public V1CSINodeSpecFluent.DriversNested<A> editFirstDriver();
  public V1CSINodeSpecFluent.DriversNested<A> editLastDriver();
  public V1CSINodeSpecFluent.DriversNested<A> editMatchingDriver(Predicate<V1CSINodeDriverBuilder> predicate);
  public interface DriversNested<N> extends Nested<N>,V1CSINodeDriverFluent<V1CSINodeSpecFluent.DriversNested<N>>{
    public N and();
    public N endDriver();
    
  }
  
}