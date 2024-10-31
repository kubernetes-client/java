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

import com.amazonaws.DefaultRequest;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.auth.AWSSessionCredentialsProvider;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.securitytoken.model.GetCallerIdentityRequest;
import com.amazonaws.util.RuntimeHttpUtils;
import io.kubernetes.client.openapi.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Clock;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Date;

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
    public EKSAuthentication(AWSSessionCredentialsProvider provider, String region, String clusterName) {
        this(provider, region, clusterName, MAX_EXPIRY_SECONDS);
    }

    public EKSAuthentication(AWSSessionCredentialsProvider provider, String region, String clusterName, int expirySeconds) {
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
    private final AWSSessionCredentialsProvider provider;
    private final String region;
    private final String clusterName;
    private final URI stsEndpoint;

    private final int expirySeconds;

    @Override
    public void provide(ApiClient client) {
        DefaultRequest<GetCallerIdentityRequest> defaultRequest =
                new DefaultRequest<>(new GetCallerIdentityRequest(), "sts");
        defaultRequest.setResourcePath("/");
        defaultRequest.setEndpoint(stsEndpoint);
        defaultRequest.setHttpMethod(HttpMethodName.GET);
        defaultRequest.addParameter("Action", "GetCallerIdentity");
        defaultRequest.addParameter("Version", "2011-06-15");
        defaultRequest.addHeader("x-k8s-aws-id", clusterName);
        AWS4Signer signer = new AWS4Signer();
        Date expirationTime = new Date(Clock.systemDefaultZone().millis() + 60 * 1000);
        signer.setServiceName("sts");
        signer.presignRequest(
                defaultRequest,
                this.provider.getCredentials(),
                expirationTime);
        String encodedUrl =
                Base64.getUrlEncoder()
                        .withoutPadding()
                        .encodeToString( RuntimeHttpUtils.convertRequestToUrl(
                                defaultRequest, true, false).toString()
                                        .getBytes(StandardCharsets.UTF_8));
        String token = "k8s-aws-v1." + encodedUrl;
        client.setApiKeyPrefix("Bearer");
        client.setApiKey(token);
        log.info("Generated BEARER token for ApiClient, expiring at {}", Instant.now().plus(expirySeconds, ChronoUnit.SECONDS));
    }
}
