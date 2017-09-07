package io.kubernetes.client;

import io.kubernetes.client.ApiException;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.proto.Runtime.Unknown;

import com.google.common.io.ByteStreams;
import com.google.protobuf.Message;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class ProtoClient {
    private ApiClient apiClient;
    // Magic number for the beginning of proto encoded.
    // https://github.com/kubernetes/apimachinery/blob/master/pkg/runtime/serializer/protobuf/protobuf.go#L42
    private static final byte[] MAGIC = new byte[] { 0x6b, 0x38, 0x73, 0x00 };

    /**
     * Simple Protocol Budder API client constructor, uses default configuration
     */
    public ProtoClient() {
        this(Configuration.getDefaultApiClient());
    }

    /**
     * ProtocolBuffer Client Constructor
     * @param apiClient The api client to use.
     */
    public ProtoClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get the API client for these ProtocolBuffer operations.
     * @return The API client that will be used.
     */
    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Set the API client for subsequent ProtocolBuffer operations.
     * @param apiClient The new API client to use.
     */
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a Kubernetes API object using protocol buffer encoding.
     * @param builder The appropriate Builder for the object receveived from the request.
     * @param path The URL path to call (e.g. /api/v1/namespaces/default/pods/pod-name)
     * @return A Message of type T
     */
    public <T extends Message> T get(T.Builder builder, String path) throws ApiException, IOException {
        return (T) request(builder, path, "GET");
    }

    /**
     * List is fluent, semantic sugar method on top of get, which is intended
     * to convey that the object is a List of objects rather than a single object
     * @param builder The appropriate Builder for the object receveived from the request.
     * @param path The URL path to call (e.g. /api/v1/namespaces/default/pods/pod-name)
     * @return A Message of type T
     */
    public <T extends Message> T list(T.Builder listObj, String path) throws ApiException, IOException {
        return get(listObj, path);
    }

    /**
     * Generic protocol buffer based HTTP request.
     * Not intended for general consumption, but public for advance use cases.
     * @param builder The appropriate Builder for the object receveived from the request.
     * @param method The HTTP method (e.g. GET) for this request.
     * @param path The URL path to call (e.g. /api/v1/namespaces/default/pods/pod-name)
     * @return A Message of type T
     */
    public <T extends Message> T request(T.Builder builder, String path, String method) throws ApiException, IOException {
        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put("Content-type", "application/vnd.kubernetes.protobuf");
        headers.put("Accept", "application/vnd.kubernetes.protobuf");
        Request request = apiClient.buildRequest(path, method, new ArrayList<Pair>(), new ArrayList<Pair>(), null,
                headers, new HashMap<String, Object>(), new String[0], null);
        Response resp = apiClient.getHttpClient().newCall(request).execute();
        Unknown u = parse(resp.body().byteStream());
        return (T) builder.mergeFrom(u.getRaw()).build();
    }

    private Unknown parse(InputStream stream) throws ApiException, IOException {
        // This isn't really documented anywhere except the code, but
        // the proto-buf format is:
        //   * 4 byte magic number
        //   * Protocol Buffer encoded object of type runtime.Unknown
        //   * the 'raw' field in that object contains a Protocol Buffer
        //     encoding of the actual object.
        // TODO: Document this somewhere proper.
        byte[] magic = new byte[4];
        stream.read(magic);
        for (int i = 0; i < MAGIC.length; i++) {
            if (magic[i] != MAGIC[i]) {
                throw new ApiException("Unexpected magic number: " + magic);
            }
        }
        return Unknown.parseFrom(stream);
    }
}