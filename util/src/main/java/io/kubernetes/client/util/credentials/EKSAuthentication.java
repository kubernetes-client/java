/*
Copyright 2023 The Kubernetes Authors.
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
package io.kubernetes.client.util.credentials;

import io.kubernetes.client.openapi.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.http.SdkHttpMethod;
import software.amazon.awssdk.http.SdkHttpRequest;
import software.amazon.awssdk.http.auth.aws.signer.AwsV4FamilyHttpSigner;
import software.amazon.awssdk.http.auth.aws.signer.AwsV4HttpSigner;
import software.amazon.awssdk.http.auth.spi.signer.SignedRequest;
import software.amazon.awssdk.utils.http.SdkHttpUtils;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;

/**
 * EKS cluster authentication which generates a bearer token from AWS AK/SK. It doesn't require an "aws"
 * command line tool in the $PATH.
 */
public class EKSAuthentication implements Authentication {

    private static final Logger log = LoggerFactory.getLogger(EKSAuthentication.class);

    /**
     * Instantiates a new Eks authentication.
     *
     * @param provider    the AWS credential provider
     * @param region      the region where EKS cluster at
     * @param clusterName the EKS cluster name
     */
    public EKSAuthentication(AwsCredentialsProvider provider, String region, String clusterName) {
        this(provider, region, clusterName, MAX_EXPIRY_SECONDS);
    }

    public EKSAuthentication(AwsCredentialsProvider provider, String region, String clusterName, int expirySeconds) {
        this.provider = provider;
        this.region = region;
        this.clusterName = clusterName;
        if (expirySeconds > MAX_EXPIRY_SECONDS) {
            expirySeconds = MAX_EXPIRY_SECONDS;
        }
        this.expirySeconds = expirySeconds;
        this.stsEndpoint = URI.create("https://sts." + this.region + ".amazonaws.com");
    }

    private static final int MAX_EXPIRY_SECONDS = 60 * 15;
    private final AwsCredentialsProvider provider;
    private final String region;
    private final String clusterName;
    private final URI stsEndpoint;

    private final int expirySeconds;

    @Override
    public void provide(ApiClient client) {
        SdkHttpRequest httpRequest = generateStsRequest();
        String presignedUrl = requestToPresignedUrl(httpRequest);
        String encodedUrl = presignedUrlToEncodedUrl(presignedUrl);
        String token = "k8s-aws-v1." + encodedUrl;
        client.setApiKeyPrefix("Bearer");
        client.setApiKey(token);
        log.info("Generated BEARER token for ApiClient, expiring at {}", Instant.now().plus(expirySeconds, ChronoUnit.SECONDS));
    }

    private static String presignedUrlToEncodedUrl(String presignedUrl) {
        return Base64.getUrlEncoder()
                .withoutPadding()
                .encodeToString(SdkHttpUtils.urlEncodeIgnoreSlashes(presignedUrl).getBytes(StandardCharsets.UTF_8));
    }

    private SdkHttpRequest generateStsRequest() {
        return SdkHttpRequest.builder()
                .uri(stsEndpoint)
                .putRawQueryParameter("Version", "2011-06-15")
                .putRawQueryParameter("Action", "GetCallerIdentity")
                .method(SdkHttpMethod.GET)
                .putHeader("x-k8s-aws-id", clusterName)
                .build();
    }

    private String requestToPresignedUrl(SdkHttpRequest httpRequest) {
        AwsV4HttpSigner signer = AwsV4HttpSigner.create();
        SignedRequest signedRequest =
                signer.sign(r -> r.identity(this.provider.resolveCredentials())
                        .request(httpRequest)
                        .putProperty(AwsV4HttpSigner.SERVICE_SIGNING_NAME, "sts")
                        .putProperty(AwsV4HttpSigner.REGION_NAME, region)
                        .putProperty(AwsV4HttpSigner.AUTH_LOCATION, AwsV4HttpSigner.AuthLocation.QUERY_STRING)
                        .putProperty(AwsV4HttpSigner.EXPIRATION_DURATION, Duration.of(60, ChronoUnit.SECONDS)));
        SdkHttpRequest request = signedRequest.request();
        return request.getUri().toString();
    }
}
