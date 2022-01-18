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
public interface AdmissionregistrationV1WebhookClientConfigFluent<
        A extends
            io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A withCaBundle(byte... caBundle);

  public byte[] getCaBundle();

  public A addToCaBundle(java.lang.Integer index, java.lang.Byte item);

  public A setToCaBundle(java.lang.Integer index, java.lang.Byte item);

  public A addToCaBundle(java.lang.Byte... items);

  public A addAllToCaBundle(java.util.Collection<java.lang.Byte> items);

  public A removeFromCaBundle(java.lang.Byte... items);

  public A removeAllFromCaBundle(java.util.Collection<java.lang.Byte> items);

  public java.lang.Boolean hasCaBundle();

  /**
   * This method has been deprecated, please use method buildService instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReference getService();

  public io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReference buildService();

  public A withService(
      io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReference service);

  public java.lang.Boolean hasService();

  public io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigFluent
              .ServiceNested<
          A>
      withNewService();

  public io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigFluent
              .ServiceNested<
          A>
      withNewServiceLike(
          io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReference item);

  public io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigFluent
              .ServiceNested<
          A>
      editService();

  public io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigFluent
              .ServiceNested<
          A>
      editOrNewService();

  public io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigFluent
              .ServiceNested<
          A>
      editOrNewServiceLike(
          io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReference item);

  public java.lang.String getUrl();

  public A withUrl(java.lang.String url);

  public java.lang.Boolean hasUrl();

  /** Method is deprecated. use withUrl instead. */
  @java.lang.Deprecated
  public A withNewUrl(java.lang.String original);

  public interface ServiceNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReferenceFluent<
              io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigFluent
                      .ServiceNested<
                  N>> {
    public N and();

    public N endService();
  }
}
