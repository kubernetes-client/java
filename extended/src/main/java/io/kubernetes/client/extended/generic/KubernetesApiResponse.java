package io.kubernetes.client.extended.generic;

import io.kubernetes.client.openapi.models.V1Status;

public class KubernetesApiResponse<DataType> {

  private final DataType object;
  private final V1Status status;
  private final int httpStatusCode;

  public KubernetesApiResponse(DataType object) {
    this.object = object;
    this.status = null;
    this.httpStatusCode = -1;
  }

  public KubernetesApiResponse(V1Status status, int httpStatusCode) {
    this.object = null;
    this.status = status;
    this.httpStatusCode = httpStatusCode;
  }

  public DataType getObject() {
    return object;
  }

  public V1Status getStatus() {
    return status;
  }

  public int getHttpStatusCode() {
    return httpStatusCode;
  }

  public boolean isSuccess() {
    return this.httpStatusCode < 400;
  }
}
