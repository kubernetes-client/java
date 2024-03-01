/*
Copyright 2020 The Kubernetes Authors.
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
package io.kubernetes.client;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Message;
import com.google.protobuf.Message.Builder;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.Pair;
import io.kubernetes.client.proto.Meta.DeleteOptions;
import io.kubernetes.client.proto.Meta.Status;
import io.kubernetes.client.proto.Runtime.TypeMeta;
import io.kubernetes.client.proto.Runtime.Unknown;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.BufferedSource;
import okio.ByteString;

public class ProtoClient {
  /**
   * ObjectOrStatus is an object that is the return from a method call it holds either an API Object
   * or an API Status object, but not both. Only one field may be non-null at a time.
   *
   * <p>Oh, how I long for multi-return...
   */
  public static class ObjectOrStatus<T extends Message> {
    public ObjectOrStatus(T obj, Status status) {
      this.object = obj;
      this.status = status;
    }

    public T object;
    public Status status;

    public String toString() {
      if (object != null) {
        return object.toString();
      }
      return status.toString();
    }
  }

  private ApiClient apiClient;
  // Magic number for the beginning of proto encoded.
  // https://github.com/kubernetes/apimachinery/blob/release-1.13/pkg/runtime/serializer/protobuf/protobuf.go#L44
  private static final byte[] MAGIC = new byte[] {0x6b, 0x38, 0x73, 0x00};
  private static final ByteString MAGIC_BYTESTRING = ByteString.of(MAGIC);
  private static final String MEDIA_TYPE = "application/vnd.kubernetes.protobuf";

  /** Simple Protocol Buffers API client constructor, uses default configuration */
  public ProtoClient() {
    this(Configuration.getDefaultApiClient());
  }

  /**
   * ProtocolBuffer Client Constructor
   *
   * @param apiClient The api client to use.
   */
  public ProtoClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client for these ProtocolBuffer operations.
   *
   * @return The API client that will be used.
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client for subsequent ProtocolBuffer operations.
   *
   * @param apiClient The new API client to use.
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get a Kubernetes API object using protocol buffer encoding.
   *
   * @param builder The appropriate Builder for the object received from the request.
   * @param path The URL path to call (e.g. /api/v1/namespaces/default/pods/pod-name)
   * @return An ObjectOrStatus which contains the Object requested, or a Status about the request.
   */
  public <T extends Message> ObjectOrStatus<T> get(T.Builder builder, String path)
      throws ApiException, IOException {
    return request(builder, path, "GET", null, null, null);
  }

  /**
   * List is fluent, semantic sugar method on top of get, which is intended to convey that the
   * object is a List of objects rather than a single object
   *
   * @param builder The appropriate Builder for the object received from the request.
   * @param path The URL path to call (e.g. /api/v1/namespaces/default/pods/pod-name)
   * @return An ObjectOrStatus which contains the Object requested, or a Status about the request.
   */
  public <T extends Message> ObjectOrStatus<T> list(T.Builder builder, String path)
      throws ApiException, IOException {
    return get(builder, path);
  }

  /**
   * Create a Kubernetes API object using protocol buffer encoding. Performs a POST
   *
   * @param obj The object to create
   * @param path The URL path to call
   * @param apiVersion The api version to use
   * @param kind The kind of the object
   * @return An ObjectOrStatus which contains the Object requested, or a Status about the request.
   */
  public <T extends Message> ObjectOrStatus<T> create(
      T obj, String path, String apiVersion, String kind) throws ApiException, IOException {
    return request(obj.newBuilderForType(), path, "POST", obj, apiVersion, kind);
  }

  /**
   * Update a Kubernetes API object using protocol buffer encoding. Performs a PUT
   *
   * @param obj The object to create
   * @param path The URL path to call
   * @param apiVersion The api version to use
   * @param kind The kind of the object
   * @return An ObjectOrStatus which contains the Object requested, or a Status about the request.
   */
  public <T extends Message> ObjectOrStatus<T> update(
      T obj, String path, String apiVersion, String kind) throws ApiException, IOException {
    return request(obj.newBuilderForType(), path, "PUT", obj, apiVersion, kind);
  }

  /**
   * Merge a Kubernetes API object using protocol buffer encoding. Performs a PATCH
   *
   * @param obj The object to merge
   * @param path The URL path to call
   * @param apiVersion The api version to use
   * @param kind The kind of the object
   * @return An ObjectOrStatus which contains the Object requested, or a Status about the request.
   */
  public <T extends Message> ObjectOrStatus<T> merge(
      T obj, String path, String apiVersion, String kind) throws ApiException, IOException {
    return request(obj.newBuilderForType(), path, "PATCH", obj, apiVersion, kind);
  }

  /**
   * Delete a kubernetes API object using protocol buffer encoding.
   *
   * @param builder The builder for the response
   * @param path The path to call in the API server
   * @return The response status
   */
  public <T extends Message> ObjectOrStatus<T> delete(T.Builder builder, String path)
      throws ApiException, IOException {
    return request(builder, path, "DELETE", null, null, null);
  }

  /**
   * Delete a kubernetes API object using protocol buffer encoding.
   *
   * @param builder The builder for the response
   * @param path The path to call in the API server
   * @param deleteOptions optional deleteOptions
   * @return The response status
   */
  public <T extends Message> ObjectOrStatus<T> delete(
      T.Builder builder, String path, DeleteOptions deleteOptions)
      throws ApiException, IOException {
    if (deleteOptions == null) {
      return delete(builder, path);
    }

    HashMap<String, String> headers = new HashMap<>();
    headers.put("Content-Type", MEDIA_TYPE);
    headers.put("Accept", MEDIA_TYPE);
    String[] localVarAuthNames = new String[] {"BearerToken"};
    Request request =
        apiClient.buildRequest(
            apiClient.getBasePath(),
            path,
            "DELETE",
            new ArrayList<Pair>(),
            new ArrayList<Pair>(),
            null,
            headers,
            new HashMap<String, String>(),
            new HashMap<String, Object>(),
            localVarAuthNames,
            null);
    byte[] bytes = encode(deleteOptions, "v1", "DeleteOptions");
    request =
        request.newBuilder().delete(RequestBody.create(MediaType.parse(MEDIA_TYPE), bytes)).build();
    return getObjectOrStatusFromServer(builder, request);
  }

  /**
   * Generic protocol buffer based HTTP request. Not intended for general consumption, but public
   * for advance use cases.
   *
   * @param builder The appropriate Builder for the object received from the request.
   * @param method The HTTP method (e.g. GET) for this request.
   * @param path The URL path to call (e.g. /api/v1/namespaces/default/pods/pod-name)
   * @param body The body to send with the request (optional)
   * @param apiVersion The 'apiVersion' to use when encoding, required if body is non-null, ignored
   *     otherwise.
   * @param kind The 'kind' field to use when encoding, required if body is non-null, ignored
   *     otherwise.
   * @return An ObjectOrStatus which contains the Object requested, or a Status about the request.
   */
  public <T extends Message> ObjectOrStatus<T> request(
      T.Builder builder, String path, String method, T body, String apiVersion, String kind)
      throws ApiException, IOException {
    HashMap<String, String> headers = new HashMap<>();
    headers.put("Content-Type", MEDIA_TYPE);
    headers.put("Accept", MEDIA_TYPE);
    String[] localVarAuthNames = new String[] {"BearerToken"};
    Request request =
        apiClient.buildRequest(
                apiClient.getBasePath(),
            path,
            method,
            new ArrayList<Pair>(),
            new ArrayList<Pair>(),
            null,
            headers,
            new HashMap<String, String>(),
            new HashMap<String, Object>(),
            localVarAuthNames,
            null);
    if (body != null) {
      byte[] bytes = encode(body, apiVersion, kind);
      switch (method) {
        case "POST":
          request =
              request
                  .newBuilder()
                  .post(RequestBody.create(MediaType.parse(MEDIA_TYPE), bytes))
                  .build();
          break;
        case "PUT":
          request =
              request
                  .newBuilder()
                  .put(RequestBody.create(MediaType.parse(MEDIA_TYPE), bytes))
                  .build();
          break;
        case "PATCH":
          request =
              request
                  .newBuilder()
                  .patch(RequestBody.create(MediaType.parse(MEDIA_TYPE), bytes))
                  .build();
          break;
        default:
          throw new ApiException("Unknown proto client API method: " + method);
      }
    }
    return getObjectOrStatusFromServer(builder, request);
  }

  private <T extends Message> ObjectOrStatus<T> getObjectOrStatusFromServer(
      Builder builder, Request request) throws IOException, ApiException {
    Unknown u;
    try (Response resp = apiClient.getHttpClient().newCall(request).execute()) {
      // Note: closing the response, closes the body and the underlying source.
      u = parse(resp.body().source());
    }

    if (u.getTypeMeta().getApiVersion().equals("v1")
        && u.getTypeMeta().getKind().equals("Status")) {
      Status status = Status.newBuilder().mergeFrom(u.getRaw()).build();
      return new ObjectOrStatus<>(null, status);
    }

    return new ObjectOrStatus<>((T) builder.mergeFrom(u.getRaw()).build(), null);
  }

  // This isn't really documented anywhere except the code, but
  // the proto-buf format is:
  //   * 4 byte magic number
  //   * Protocol Buffer encoded object of type runtime.Unknown
  //   * the 'raw' field in that object contains a Protocol Buffer
  //     encoding of the actual object.
  // TODO: Document this somewhere proper.

  private static byte[] encode(Message msg, String apiVersion, String kind) throws IOException {
    // It is unfortunate that we have to include apiVersion and kind,
    // since we should be able to extract it from the Message, but
    // for now at least, those fields are missing from the proto-buffer.
    Unknown u =
        Unknown.newBuilder()
            .setTypeMeta(TypeMeta.newBuilder().setApiVersion(apiVersion).setKind(kind))
            .setRaw(msg.toByteString())
            .build();

    // Encode directly to a sized array, to eliminate buffering
    int serializedSize = u.getSerializedSize();
    byte[] result = new byte[MAGIC.length + u.getSerializedSize()];
    System.arraycopy(MAGIC, 0, result, 0, MAGIC.length);
    u.writeTo(CodedOutputStream.newInstance(result, MAGIC.length, serializedSize));
    return result;
  }

  private static Unknown parse(BufferedSource responseBody) throws ApiException, IOException {
    if (!responseBody.request(MAGIC.length)) {
      throw new ApiException("Truncated reading magic number");
    }

    // Check the magic without allocating a byte array
    if (responseBody.rangeEquals(0, MAGIC_BYTESTRING)) {
      responseBody.skip(MAGIC.length);
    } else {
      ByteString badMagic = responseBody.readByteString(MAGIC.length);
      throw new ApiException("Unexpected magic number: " + badMagic.hex());
    }
    return Unknown.parseFrom(responseBody.inputStream());
  }
}
