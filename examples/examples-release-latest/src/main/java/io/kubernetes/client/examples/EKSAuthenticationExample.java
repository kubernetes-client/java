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
package io.kubernetes.client.examples;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.VersionInfo;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.credentials.EKSAuthentication;
import io.kubernetes.client.util.version.Version;

import java.io.IOException;

public class EKSAuthenticationExample {
    public static void main(String[] args) throws IOException, ApiException {

        // Connecting an EKS cluster using {@link io.kubernetes.client.util.credentials.EKSAuthentication }

        // This role should have access to the EKS cluster.
        String roleArn = "arn:aws:iam::123456789:role/TestRole";
        // Arbitrary role session name.
        String roleSessionName = "test";
        // Region where the EKS cluster at.
        String region = "us-west-2";
        // EKS cluster name.
        String clusterName = "test-2";

        STSAssumeRoleSessionCredentialsProvider credProvider = new STSAssumeRoleSessionCredentialsProvider(
                new DefaultAWSCredentialsProviderChain().getCredentials(),
                roleArn,
                roleSessionName);

        ApiClient apiClient = ClientBuilder.standard()
                .setAuthentication(new EKSAuthentication(credProvider, region, clusterName))
                .build();

        Version version = new Version(apiClient);
        VersionInfo versionInfo = version.getVersion();
        System.out.println(versionInfo);
    }
}
