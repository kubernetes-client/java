/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

/** Generated */
public interface V1CSINodeSpecFluent<
        A extends io.kubernetes.client.openapi.models.V1CSINodeSpecFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToDrivers(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1CSINodeDriver item);

  public A setToDrivers(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1CSINodeDriver item);

  public A addToDrivers(io.kubernetes.client.openapi.models.V1CSINodeDriver... items);

  public A addAllToDrivers(
      java.util.Collection<io.kubernetes.client.openapi.models.V1CSINodeDriver> items);

  public A removeFromDrivers(io.kubernetes.client.openapi.models.V1CSINodeDriver... items);

  public A removeAllFromDrivers(
      java.util.Collection<io.kubernetes.client.openapi.models.V1CSINodeDriver> items);

  public A removeMatchingFromDrivers(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CSINodeDriverBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildDrivers instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1CSINodeDriver> getDrivers();

  public java.util.List<io.kubernetes.client.openapi.models.V1CSINodeDriver> buildDrivers();

  public io.kubernetes.client.openapi.models.V1CSINodeDriver buildDriver(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1CSINodeDriver buildFirstDriver();

  public io.kubernetes.client.openapi.models.V1CSINodeDriver buildLastDriver();

  public io.kubernetes.client.openapi.models.V1CSINodeDriver buildMatchingDriver(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CSINodeDriverBuilder>
          predicate);

  public java.lang.Boolean hasMatchingDriver(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CSINodeDriverBuilder>
          predicate);

  public A withDrivers(java.util.List<io.kubernetes.client.openapi.models.V1CSINodeDriver> drivers);

  public A withDrivers(io.kubernetes.client.openapi.models.V1CSINodeDriver... drivers);

  public java.lang.Boolean hasDrivers();

  public io.kubernetes.client.openapi.models.V1CSINodeSpecFluent.DriversNested<A> addNewDriver();

  public io.kubernetes.client.openapi.models.V1CSINodeSpecFluent.DriversNested<A> addNewDriverLike(
      io.kubernetes.client.openapi.models.V1CSINodeDriver item);

  public io.kubernetes.client.openapi.models.V1CSINodeSpecFluent.DriversNested<A> setNewDriverLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1CSINodeDriver item);

  public io.kubernetes.client.openapi.models.V1CSINodeSpecFluent.DriversNested<A> editDriver(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1CSINodeSpecFluent.DriversNested<A> editFirstDriver();

  public io.kubernetes.client.openapi.models.V1CSINodeSpecFluent.DriversNested<A> editLastDriver();

  public io.kubernetes.client.openapi.models.V1CSINodeSpecFluent.DriversNested<A>
      editMatchingDriver(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CSINodeDriverBuilder>
              predicate);

  public interface DriversNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1CSINodeDriverFluent<
              io.kubernetes.client.openapi.models.V1CSINodeSpecFluent.DriversNested<N>> {
    public N and();

    public N endDriver();
  }
}
