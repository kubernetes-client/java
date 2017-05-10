# client-java

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.kubernetes</groupId>
    <artifactId>client-java</artifactId>
    <version>1.0-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.kubernetes:client-java:1.0-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/client-java-1.0-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import kubernetes.*;
import kubernetes.auth.*;
import kubernetes.models.*;
import kubernetes.apis.ApisApi;

import java.io.File;
import java.util.*;

public class ApisApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: BearerToken
        ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
        BearerToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //BearerToken.setApiKeyPrefix("Token");

        ApisApi apiInstance = new ApisApi();
        try {
            V1APIGroupList result = apiInstance.getAPIVersions();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApisApi#getAPIVersions");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApisApi* | [**getAPIVersions**](docs/ApisApi.md#getAPIVersions) | **GET** /apis/ | 
*AppsApi* | [**getAPIGroup**](docs/AppsApi.md#getAPIGroup) | **GET** /apis/apps/ | 
*AppsV1beta1Api* | [**createNamespacedDeployment**](docs/AppsV1beta1Api.md#createNamespacedDeployment) | **POST** /apis/apps/v1beta1/namespaces/{namespace}/deployments | 
*AppsV1beta1Api* | [**createNamespacedDeploymentRollbackRollback**](docs/AppsV1beta1Api.md#createNamespacedDeploymentRollbackRollback) | **POST** /apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/rollback | 
*AppsV1beta1Api* | [**createNamespacedStatefulSet**](docs/AppsV1beta1Api.md#createNamespacedStatefulSet) | **POST** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets | 
*AppsV1beta1Api* | [**deleteCollectionNamespacedDeployment**](docs/AppsV1beta1Api.md#deleteCollectionNamespacedDeployment) | **DELETE** /apis/apps/v1beta1/namespaces/{namespace}/deployments | 
*AppsV1beta1Api* | [**deleteCollectionNamespacedStatefulSet**](docs/AppsV1beta1Api.md#deleteCollectionNamespacedStatefulSet) | **DELETE** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets | 
*AppsV1beta1Api* | [**deleteNamespacedDeployment**](docs/AppsV1beta1Api.md#deleteNamespacedDeployment) | **DELETE** /apis/apps/v1beta1/namespaces/{namespace}/deployments/{name} | 
*AppsV1beta1Api* | [**deleteNamespacedStatefulSet**](docs/AppsV1beta1Api.md#deleteNamespacedStatefulSet) | **DELETE** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name} | 
*AppsV1beta1Api* | [**getAPIResources**](docs/AppsV1beta1Api.md#getAPIResources) | **GET** /apis/apps/v1beta1/ | 
*AppsV1beta1Api* | [**listDeploymentForAllNamespaces**](docs/AppsV1beta1Api.md#listDeploymentForAllNamespaces) | **GET** /apis/apps/v1beta1/deployments | 
*AppsV1beta1Api* | [**listNamespacedDeployment**](docs/AppsV1beta1Api.md#listNamespacedDeployment) | **GET** /apis/apps/v1beta1/namespaces/{namespace}/deployments | 
*AppsV1beta1Api* | [**listNamespacedStatefulSet**](docs/AppsV1beta1Api.md#listNamespacedStatefulSet) | **GET** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets | 
*AppsV1beta1Api* | [**listStatefulSetForAllNamespaces**](docs/AppsV1beta1Api.md#listStatefulSetForAllNamespaces) | **GET** /apis/apps/v1beta1/statefulsets | 
*AppsV1beta1Api* | [**patchNamespacedDeployment**](docs/AppsV1beta1Api.md#patchNamespacedDeployment) | **PATCH** /apis/apps/v1beta1/namespaces/{namespace}/deployments/{name} | 
*AppsV1beta1Api* | [**patchNamespacedDeploymentStatus**](docs/AppsV1beta1Api.md#patchNamespacedDeploymentStatus) | **PATCH** /apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/status | 
*AppsV1beta1Api* | [**patchNamespacedScaleScale**](docs/AppsV1beta1Api.md#patchNamespacedScaleScale) | **PATCH** /apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/scale | 
*AppsV1beta1Api* | [**patchNamespacedStatefulSet**](docs/AppsV1beta1Api.md#patchNamespacedStatefulSet) | **PATCH** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name} | 
*AppsV1beta1Api* | [**patchNamespacedStatefulSetStatus**](docs/AppsV1beta1Api.md#patchNamespacedStatefulSetStatus) | **PATCH** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/status | 
*AppsV1beta1Api* | [**readNamespacedDeployment**](docs/AppsV1beta1Api.md#readNamespacedDeployment) | **GET** /apis/apps/v1beta1/namespaces/{namespace}/deployments/{name} | 
*AppsV1beta1Api* | [**readNamespacedDeploymentStatus**](docs/AppsV1beta1Api.md#readNamespacedDeploymentStatus) | **GET** /apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/status | 
*AppsV1beta1Api* | [**readNamespacedScaleScale**](docs/AppsV1beta1Api.md#readNamespacedScaleScale) | **GET** /apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/scale | 
*AppsV1beta1Api* | [**readNamespacedStatefulSet**](docs/AppsV1beta1Api.md#readNamespacedStatefulSet) | **GET** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name} | 
*AppsV1beta1Api* | [**readNamespacedStatefulSetStatus**](docs/AppsV1beta1Api.md#readNamespacedStatefulSetStatus) | **GET** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/status | 
*AppsV1beta1Api* | [**replaceNamespacedDeployment**](docs/AppsV1beta1Api.md#replaceNamespacedDeployment) | **PUT** /apis/apps/v1beta1/namespaces/{namespace}/deployments/{name} | 
*AppsV1beta1Api* | [**replaceNamespacedDeploymentStatus**](docs/AppsV1beta1Api.md#replaceNamespacedDeploymentStatus) | **PUT** /apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/status | 
*AppsV1beta1Api* | [**replaceNamespacedScaleScale**](docs/AppsV1beta1Api.md#replaceNamespacedScaleScale) | **PUT** /apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/scale | 
*AppsV1beta1Api* | [**replaceNamespacedStatefulSet**](docs/AppsV1beta1Api.md#replaceNamespacedStatefulSet) | **PUT** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name} | 
*AppsV1beta1Api* | [**replaceNamespacedStatefulSetStatus**](docs/AppsV1beta1Api.md#replaceNamespacedStatefulSetStatus) | **PUT** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/status | 
*AuthenticationApi* | [**getAPIGroup**](docs/AuthenticationApi.md#getAPIGroup) | **GET** /apis/authentication.k8s.io/ | 
*AuthenticationV1Api* | [**createTokenReview**](docs/AuthenticationV1Api.md#createTokenReview) | **POST** /apis/authentication.k8s.io/v1/tokenreviews | 
*AuthenticationV1Api* | [**getAPIResources**](docs/AuthenticationV1Api.md#getAPIResources) | **GET** /apis/authentication.k8s.io/v1/ | 
*AuthenticationV1beta1Api* | [**createTokenReview**](docs/AuthenticationV1beta1Api.md#createTokenReview) | **POST** /apis/authentication.k8s.io/v1beta1/tokenreviews | 
*AuthenticationV1beta1Api* | [**getAPIResources**](docs/AuthenticationV1beta1Api.md#getAPIResources) | **GET** /apis/authentication.k8s.io/v1beta1/ | 
*AuthorizationApi* | [**getAPIGroup**](docs/AuthorizationApi.md#getAPIGroup) | **GET** /apis/authorization.k8s.io/ | 
*AuthorizationV1Api* | [**createNamespacedLocalSubjectAccessReview**](docs/AuthorizationV1Api.md#createNamespacedLocalSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1/namespaces/{namespace}/localsubjectaccessreviews | 
*AuthorizationV1Api* | [**createSelfSubjectAccessReview**](docs/AuthorizationV1Api.md#createSelfSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1/selfsubjectaccessreviews | 
*AuthorizationV1Api* | [**createSubjectAccessReview**](docs/AuthorizationV1Api.md#createSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1/subjectaccessreviews | 
*AuthorizationV1Api* | [**getAPIResources**](docs/AuthorizationV1Api.md#getAPIResources) | **GET** /apis/authorization.k8s.io/v1/ | 
*AuthorizationV1beta1Api* | [**createNamespacedLocalSubjectAccessReview**](docs/AuthorizationV1beta1Api.md#createNamespacedLocalSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1beta1/namespaces/{namespace}/localsubjectaccessreviews | 
*AuthorizationV1beta1Api* | [**createSelfSubjectAccessReview**](docs/AuthorizationV1beta1Api.md#createSelfSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1beta1/selfsubjectaccessreviews | 
*AuthorizationV1beta1Api* | [**createSubjectAccessReview**](docs/AuthorizationV1beta1Api.md#createSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1beta1/subjectaccessreviews | 
*AuthorizationV1beta1Api* | [**getAPIResources**](docs/AuthorizationV1beta1Api.md#getAPIResources) | **GET** /apis/authorization.k8s.io/v1beta1/ | 
*AutoscalingApi* | [**getAPIGroup**](docs/AutoscalingApi.md#getAPIGroup) | **GET** /apis/autoscaling/ | 
*AutoscalingV1Api* | [**createNamespacedHorizontalPodAutoscaler**](docs/AutoscalingV1Api.md#createNamespacedHorizontalPodAutoscaler) | **POST** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers | 
*AutoscalingV1Api* | [**deleteCollectionNamespacedHorizontalPodAutoscaler**](docs/AutoscalingV1Api.md#deleteCollectionNamespacedHorizontalPodAutoscaler) | **DELETE** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers | 
*AutoscalingV1Api* | [**deleteNamespacedHorizontalPodAutoscaler**](docs/AutoscalingV1Api.md#deleteNamespacedHorizontalPodAutoscaler) | **DELETE** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*AutoscalingV1Api* | [**getAPIResources**](docs/AutoscalingV1Api.md#getAPIResources) | **GET** /apis/autoscaling/v1/ | 
*AutoscalingV1Api* | [**listHorizontalPodAutoscalerForAllNamespaces**](docs/AutoscalingV1Api.md#listHorizontalPodAutoscalerForAllNamespaces) | **GET** /apis/autoscaling/v1/horizontalpodautoscalers | 
*AutoscalingV1Api* | [**listNamespacedHorizontalPodAutoscaler**](docs/AutoscalingV1Api.md#listNamespacedHorizontalPodAutoscaler) | **GET** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers | 
*AutoscalingV1Api* | [**patchNamespacedHorizontalPodAutoscaler**](docs/AutoscalingV1Api.md#patchNamespacedHorizontalPodAutoscaler) | **PATCH** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*AutoscalingV1Api* | [**patchNamespacedHorizontalPodAutoscalerStatus**](docs/AutoscalingV1Api.md#patchNamespacedHorizontalPodAutoscalerStatus) | **PATCH** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status | 
*AutoscalingV1Api* | [**readNamespacedHorizontalPodAutoscaler**](docs/AutoscalingV1Api.md#readNamespacedHorizontalPodAutoscaler) | **GET** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*AutoscalingV1Api* | [**readNamespacedHorizontalPodAutoscalerStatus**](docs/AutoscalingV1Api.md#readNamespacedHorizontalPodAutoscalerStatus) | **GET** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status | 
*AutoscalingV1Api* | [**replaceNamespacedHorizontalPodAutoscaler**](docs/AutoscalingV1Api.md#replaceNamespacedHorizontalPodAutoscaler) | **PUT** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*AutoscalingV1Api* | [**replaceNamespacedHorizontalPodAutoscalerStatus**](docs/AutoscalingV1Api.md#replaceNamespacedHorizontalPodAutoscalerStatus) | **PUT** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status | 
*AutoscalingV2alpha1Api* | [**createNamespacedHorizontalPodAutoscaler**](docs/AutoscalingV2alpha1Api.md#createNamespacedHorizontalPodAutoscaler) | **POST** /apis/autoscaling/v2alpha1/namespaces/{namespace}/horizontalpodautoscalers | 
*AutoscalingV2alpha1Api* | [**deleteCollectionNamespacedHorizontalPodAutoscaler**](docs/AutoscalingV2alpha1Api.md#deleteCollectionNamespacedHorizontalPodAutoscaler) | **DELETE** /apis/autoscaling/v2alpha1/namespaces/{namespace}/horizontalpodautoscalers | 
*AutoscalingV2alpha1Api* | [**deleteNamespacedHorizontalPodAutoscaler**](docs/AutoscalingV2alpha1Api.md#deleteNamespacedHorizontalPodAutoscaler) | **DELETE** /apis/autoscaling/v2alpha1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*AutoscalingV2alpha1Api* | [**getAPIResources**](docs/AutoscalingV2alpha1Api.md#getAPIResources) | **GET** /apis/autoscaling/v2alpha1/ | 
*AutoscalingV2alpha1Api* | [**listHorizontalPodAutoscalerForAllNamespaces**](docs/AutoscalingV2alpha1Api.md#listHorizontalPodAutoscalerForAllNamespaces) | **GET** /apis/autoscaling/v2alpha1/horizontalpodautoscalers | 
*AutoscalingV2alpha1Api* | [**listNamespacedHorizontalPodAutoscaler**](docs/AutoscalingV2alpha1Api.md#listNamespacedHorizontalPodAutoscaler) | **GET** /apis/autoscaling/v2alpha1/namespaces/{namespace}/horizontalpodautoscalers | 
*AutoscalingV2alpha1Api* | [**patchNamespacedHorizontalPodAutoscaler**](docs/AutoscalingV2alpha1Api.md#patchNamespacedHorizontalPodAutoscaler) | **PATCH** /apis/autoscaling/v2alpha1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*AutoscalingV2alpha1Api* | [**patchNamespacedHorizontalPodAutoscalerStatus**](docs/AutoscalingV2alpha1Api.md#patchNamespacedHorizontalPodAutoscalerStatus) | **PATCH** /apis/autoscaling/v2alpha1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status | 
*AutoscalingV2alpha1Api* | [**readNamespacedHorizontalPodAutoscaler**](docs/AutoscalingV2alpha1Api.md#readNamespacedHorizontalPodAutoscaler) | **GET** /apis/autoscaling/v2alpha1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*AutoscalingV2alpha1Api* | [**readNamespacedHorizontalPodAutoscalerStatus**](docs/AutoscalingV2alpha1Api.md#readNamespacedHorizontalPodAutoscalerStatus) | **GET** /apis/autoscaling/v2alpha1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status | 
*AutoscalingV2alpha1Api* | [**replaceNamespacedHorizontalPodAutoscaler**](docs/AutoscalingV2alpha1Api.md#replaceNamespacedHorizontalPodAutoscaler) | **PUT** /apis/autoscaling/v2alpha1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*AutoscalingV2alpha1Api* | [**replaceNamespacedHorizontalPodAutoscalerStatus**](docs/AutoscalingV2alpha1Api.md#replaceNamespacedHorizontalPodAutoscalerStatus) | **PUT** /apis/autoscaling/v2alpha1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status | 
*BatchApi* | [**getAPIGroup**](docs/BatchApi.md#getAPIGroup) | **GET** /apis/batch/ | 
*BatchV1Api* | [**createNamespacedJob**](docs/BatchV1Api.md#createNamespacedJob) | **POST** /apis/batch/v1/namespaces/{namespace}/jobs | 
*BatchV1Api* | [**deleteCollectionNamespacedJob**](docs/BatchV1Api.md#deleteCollectionNamespacedJob) | **DELETE** /apis/batch/v1/namespaces/{namespace}/jobs | 
*BatchV1Api* | [**deleteNamespacedJob**](docs/BatchV1Api.md#deleteNamespacedJob) | **DELETE** /apis/batch/v1/namespaces/{namespace}/jobs/{name} | 
*BatchV1Api* | [**getAPIResources**](docs/BatchV1Api.md#getAPIResources) | **GET** /apis/batch/v1/ | 
*BatchV1Api* | [**listJobForAllNamespaces**](docs/BatchV1Api.md#listJobForAllNamespaces) | **GET** /apis/batch/v1/jobs | 
*BatchV1Api* | [**listNamespacedJob**](docs/BatchV1Api.md#listNamespacedJob) | **GET** /apis/batch/v1/namespaces/{namespace}/jobs | 
*BatchV1Api* | [**patchNamespacedJob**](docs/BatchV1Api.md#patchNamespacedJob) | **PATCH** /apis/batch/v1/namespaces/{namespace}/jobs/{name} | 
*BatchV1Api* | [**patchNamespacedJobStatus**](docs/BatchV1Api.md#patchNamespacedJobStatus) | **PATCH** /apis/batch/v1/namespaces/{namespace}/jobs/{name}/status | 
*BatchV1Api* | [**readNamespacedJob**](docs/BatchV1Api.md#readNamespacedJob) | **GET** /apis/batch/v1/namespaces/{namespace}/jobs/{name} | 
*BatchV1Api* | [**readNamespacedJobStatus**](docs/BatchV1Api.md#readNamespacedJobStatus) | **GET** /apis/batch/v1/namespaces/{namespace}/jobs/{name}/status | 
*BatchV1Api* | [**replaceNamespacedJob**](docs/BatchV1Api.md#replaceNamespacedJob) | **PUT** /apis/batch/v1/namespaces/{namespace}/jobs/{name} | 
*BatchV1Api* | [**replaceNamespacedJobStatus**](docs/BatchV1Api.md#replaceNamespacedJobStatus) | **PUT** /apis/batch/v1/namespaces/{namespace}/jobs/{name}/status | 
*BatchV2alpha1Api* | [**createNamespacedCronJob**](docs/BatchV2alpha1Api.md#createNamespacedCronJob) | **POST** /apis/batch/v2alpha1/namespaces/{namespace}/cronjobs | 
*BatchV2alpha1Api* | [**createNamespacedScheduledJob**](docs/BatchV2alpha1Api.md#createNamespacedScheduledJob) | **POST** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs | 
*BatchV2alpha1Api* | [**deleteCollectionNamespacedCronJob**](docs/BatchV2alpha1Api.md#deleteCollectionNamespacedCronJob) | **DELETE** /apis/batch/v2alpha1/namespaces/{namespace}/cronjobs | 
*BatchV2alpha1Api* | [**deleteCollectionNamespacedScheduledJob**](docs/BatchV2alpha1Api.md#deleteCollectionNamespacedScheduledJob) | **DELETE** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs | 
*BatchV2alpha1Api* | [**deleteNamespacedCronJob**](docs/BatchV2alpha1Api.md#deleteNamespacedCronJob) | **DELETE** /apis/batch/v2alpha1/namespaces/{namespace}/cronjobs/{name} | 
*BatchV2alpha1Api* | [**deleteNamespacedScheduledJob**](docs/BatchV2alpha1Api.md#deleteNamespacedScheduledJob) | **DELETE** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs/{name} | 
*BatchV2alpha1Api* | [**getAPIResources**](docs/BatchV2alpha1Api.md#getAPIResources) | **GET** /apis/batch/v2alpha1/ | 
*BatchV2alpha1Api* | [**listCronJobForAllNamespaces**](docs/BatchV2alpha1Api.md#listCronJobForAllNamespaces) | **GET** /apis/batch/v2alpha1/cronjobs | 
*BatchV2alpha1Api* | [**listNamespacedCronJob**](docs/BatchV2alpha1Api.md#listNamespacedCronJob) | **GET** /apis/batch/v2alpha1/namespaces/{namespace}/cronjobs | 
*BatchV2alpha1Api* | [**listNamespacedScheduledJob**](docs/BatchV2alpha1Api.md#listNamespacedScheduledJob) | **GET** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs | 
*BatchV2alpha1Api* | [**listScheduledJobForAllNamespaces**](docs/BatchV2alpha1Api.md#listScheduledJobForAllNamespaces) | **GET** /apis/batch/v2alpha1/scheduledjobs | 
*BatchV2alpha1Api* | [**patchNamespacedCronJob**](docs/BatchV2alpha1Api.md#patchNamespacedCronJob) | **PATCH** /apis/batch/v2alpha1/namespaces/{namespace}/cronjobs/{name} | 
*BatchV2alpha1Api* | [**patchNamespacedCronJobStatus**](docs/BatchV2alpha1Api.md#patchNamespacedCronJobStatus) | **PATCH** /apis/batch/v2alpha1/namespaces/{namespace}/cronjobs/{name}/status | 
*BatchV2alpha1Api* | [**patchNamespacedScheduledJob**](docs/BatchV2alpha1Api.md#patchNamespacedScheduledJob) | **PATCH** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs/{name} | 
*BatchV2alpha1Api* | [**patchNamespacedScheduledJobStatus**](docs/BatchV2alpha1Api.md#patchNamespacedScheduledJobStatus) | **PATCH** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs/{name}/status | 
*BatchV2alpha1Api* | [**readNamespacedCronJob**](docs/BatchV2alpha1Api.md#readNamespacedCronJob) | **GET** /apis/batch/v2alpha1/namespaces/{namespace}/cronjobs/{name} | 
*BatchV2alpha1Api* | [**readNamespacedCronJobStatus**](docs/BatchV2alpha1Api.md#readNamespacedCronJobStatus) | **GET** /apis/batch/v2alpha1/namespaces/{namespace}/cronjobs/{name}/status | 
*BatchV2alpha1Api* | [**readNamespacedScheduledJob**](docs/BatchV2alpha1Api.md#readNamespacedScheduledJob) | **GET** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs/{name} | 
*BatchV2alpha1Api* | [**readNamespacedScheduledJobStatus**](docs/BatchV2alpha1Api.md#readNamespacedScheduledJobStatus) | **GET** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs/{name}/status | 
*BatchV2alpha1Api* | [**replaceNamespacedCronJob**](docs/BatchV2alpha1Api.md#replaceNamespacedCronJob) | **PUT** /apis/batch/v2alpha1/namespaces/{namespace}/cronjobs/{name} | 
*BatchV2alpha1Api* | [**replaceNamespacedCronJobStatus**](docs/BatchV2alpha1Api.md#replaceNamespacedCronJobStatus) | **PUT** /apis/batch/v2alpha1/namespaces/{namespace}/cronjobs/{name}/status | 
*BatchV2alpha1Api* | [**replaceNamespacedScheduledJob**](docs/BatchV2alpha1Api.md#replaceNamespacedScheduledJob) | **PUT** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs/{name} | 
*BatchV2alpha1Api* | [**replaceNamespacedScheduledJobStatus**](docs/BatchV2alpha1Api.md#replaceNamespacedScheduledJobStatus) | **PUT** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs/{name}/status | 
*CertificatesApi* | [**getAPIGroup**](docs/CertificatesApi.md#getAPIGroup) | **GET** /apis/certificates.k8s.io/ | 
*CertificatesV1beta1Api* | [**createCertificateSigningRequest**](docs/CertificatesV1beta1Api.md#createCertificateSigningRequest) | **POST** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests | 
*CertificatesV1beta1Api* | [**deleteCertificateSigningRequest**](docs/CertificatesV1beta1Api.md#deleteCertificateSigningRequest) | **DELETE** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name} | 
*CertificatesV1beta1Api* | [**deleteCollectionCertificateSigningRequest**](docs/CertificatesV1beta1Api.md#deleteCollectionCertificateSigningRequest) | **DELETE** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests | 
*CertificatesV1beta1Api* | [**getAPIResources**](docs/CertificatesV1beta1Api.md#getAPIResources) | **GET** /apis/certificates.k8s.io/v1beta1/ | 
*CertificatesV1beta1Api* | [**listCertificateSigningRequest**](docs/CertificatesV1beta1Api.md#listCertificateSigningRequest) | **GET** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests | 
*CertificatesV1beta1Api* | [**patchCertificateSigningRequest**](docs/CertificatesV1beta1Api.md#patchCertificateSigningRequest) | **PATCH** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name} | 
*CertificatesV1beta1Api* | [**readCertificateSigningRequest**](docs/CertificatesV1beta1Api.md#readCertificateSigningRequest) | **GET** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name} | 
*CertificatesV1beta1Api* | [**replaceCertificateSigningRequest**](docs/CertificatesV1beta1Api.md#replaceCertificateSigningRequest) | **PUT** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name} | 
*CertificatesV1beta1Api* | [**replaceCertificateSigningRequestApproval**](docs/CertificatesV1beta1Api.md#replaceCertificateSigningRequestApproval) | **PUT** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name}/approval | 
*CertificatesV1beta1Api* | [**replaceCertificateSigningRequestStatus**](docs/CertificatesV1beta1Api.md#replaceCertificateSigningRequestStatus) | **PUT** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name}/status | 
*CoreApi* | [**getAPIVersions**](docs/CoreApi.md#getAPIVersions) | **GET** /api/ | 
*CoreV1Api* | [**connectDeleteNamespacedPodProxy**](docs/CoreV1Api.md#connectDeleteNamespacedPodProxy) | **DELETE** /api/v1/namespaces/{namespace}/pods/{name}/proxy | 
*CoreV1Api* | [**connectDeleteNamespacedPodProxyWithPath**](docs/CoreV1Api.md#connectDeleteNamespacedPodProxyWithPath) | **DELETE** /api/v1/namespaces/{namespace}/pods/{name}/proxy/{path} | 
*CoreV1Api* | [**connectDeleteNamespacedServiceProxy**](docs/CoreV1Api.md#connectDeleteNamespacedServiceProxy) | **DELETE** /api/v1/namespaces/{namespace}/services/{name}/proxy | 
*CoreV1Api* | [**connectDeleteNamespacedServiceProxyWithPath**](docs/CoreV1Api.md#connectDeleteNamespacedServiceProxyWithPath) | **DELETE** /api/v1/namespaces/{namespace}/services/{name}/proxy/{path} | 
*CoreV1Api* | [**connectDeleteNodeProxy**](docs/CoreV1Api.md#connectDeleteNodeProxy) | **DELETE** /api/v1/nodes/{name}/proxy | 
*CoreV1Api* | [**connectDeleteNodeProxyWithPath**](docs/CoreV1Api.md#connectDeleteNodeProxyWithPath) | **DELETE** /api/v1/nodes/{name}/proxy/{path} | 
*CoreV1Api* | [**connectGetNamespacedPodAttach**](docs/CoreV1Api.md#connectGetNamespacedPodAttach) | **GET** /api/v1/namespaces/{namespace}/pods/{name}/attach | 
*CoreV1Api* | [**connectGetNamespacedPodExec**](docs/CoreV1Api.md#connectGetNamespacedPodExec) | **GET** /api/v1/namespaces/{namespace}/pods/{name}/exec | 
*CoreV1Api* | [**connectGetNamespacedPodPortforward**](docs/CoreV1Api.md#connectGetNamespacedPodPortforward) | **GET** /api/v1/namespaces/{namespace}/pods/{name}/portforward | 
*CoreV1Api* | [**connectGetNamespacedPodProxy**](docs/CoreV1Api.md#connectGetNamespacedPodProxy) | **GET** /api/v1/namespaces/{namespace}/pods/{name}/proxy | 
*CoreV1Api* | [**connectGetNamespacedPodProxyWithPath**](docs/CoreV1Api.md#connectGetNamespacedPodProxyWithPath) | **GET** /api/v1/namespaces/{namespace}/pods/{name}/proxy/{path} | 
*CoreV1Api* | [**connectGetNamespacedServiceProxy**](docs/CoreV1Api.md#connectGetNamespacedServiceProxy) | **GET** /api/v1/namespaces/{namespace}/services/{name}/proxy | 
*CoreV1Api* | [**connectGetNamespacedServiceProxyWithPath**](docs/CoreV1Api.md#connectGetNamespacedServiceProxyWithPath) | **GET** /api/v1/namespaces/{namespace}/services/{name}/proxy/{path} | 
*CoreV1Api* | [**connectGetNodeProxy**](docs/CoreV1Api.md#connectGetNodeProxy) | **GET** /api/v1/nodes/{name}/proxy | 
*CoreV1Api* | [**connectGetNodeProxyWithPath**](docs/CoreV1Api.md#connectGetNodeProxyWithPath) | **GET** /api/v1/nodes/{name}/proxy/{path} | 
*CoreV1Api* | [**connectHeadNamespacedPodProxy**](docs/CoreV1Api.md#connectHeadNamespacedPodProxy) | **HEAD** /api/v1/namespaces/{namespace}/pods/{name}/proxy | 
*CoreV1Api* | [**connectHeadNamespacedPodProxyWithPath**](docs/CoreV1Api.md#connectHeadNamespacedPodProxyWithPath) | **HEAD** /api/v1/namespaces/{namespace}/pods/{name}/proxy/{path} | 
*CoreV1Api* | [**connectHeadNamespacedServiceProxy**](docs/CoreV1Api.md#connectHeadNamespacedServiceProxy) | **HEAD** /api/v1/namespaces/{namespace}/services/{name}/proxy | 
*CoreV1Api* | [**connectHeadNamespacedServiceProxyWithPath**](docs/CoreV1Api.md#connectHeadNamespacedServiceProxyWithPath) | **HEAD** /api/v1/namespaces/{namespace}/services/{name}/proxy/{path} | 
*CoreV1Api* | [**connectHeadNodeProxy**](docs/CoreV1Api.md#connectHeadNodeProxy) | **HEAD** /api/v1/nodes/{name}/proxy | 
*CoreV1Api* | [**connectHeadNodeProxyWithPath**](docs/CoreV1Api.md#connectHeadNodeProxyWithPath) | **HEAD** /api/v1/nodes/{name}/proxy/{path} | 
*CoreV1Api* | [**connectOptionsNamespacedPodProxy**](docs/CoreV1Api.md#connectOptionsNamespacedPodProxy) | **OPTIONS** /api/v1/namespaces/{namespace}/pods/{name}/proxy | 
*CoreV1Api* | [**connectOptionsNamespacedPodProxyWithPath**](docs/CoreV1Api.md#connectOptionsNamespacedPodProxyWithPath) | **OPTIONS** /api/v1/namespaces/{namespace}/pods/{name}/proxy/{path} | 
*CoreV1Api* | [**connectOptionsNamespacedServiceProxy**](docs/CoreV1Api.md#connectOptionsNamespacedServiceProxy) | **OPTIONS** /api/v1/namespaces/{namespace}/services/{name}/proxy | 
*CoreV1Api* | [**connectOptionsNamespacedServiceProxyWithPath**](docs/CoreV1Api.md#connectOptionsNamespacedServiceProxyWithPath) | **OPTIONS** /api/v1/namespaces/{namespace}/services/{name}/proxy/{path} | 
*CoreV1Api* | [**connectOptionsNodeProxy**](docs/CoreV1Api.md#connectOptionsNodeProxy) | **OPTIONS** /api/v1/nodes/{name}/proxy | 
*CoreV1Api* | [**connectOptionsNodeProxyWithPath**](docs/CoreV1Api.md#connectOptionsNodeProxyWithPath) | **OPTIONS** /api/v1/nodes/{name}/proxy/{path} | 
*CoreV1Api* | [**connectPostNamespacedPodAttach**](docs/CoreV1Api.md#connectPostNamespacedPodAttach) | **POST** /api/v1/namespaces/{namespace}/pods/{name}/attach | 
*CoreV1Api* | [**connectPostNamespacedPodExec**](docs/CoreV1Api.md#connectPostNamespacedPodExec) | **POST** /api/v1/namespaces/{namespace}/pods/{name}/exec | 
*CoreV1Api* | [**connectPostNamespacedPodPortforward**](docs/CoreV1Api.md#connectPostNamespacedPodPortforward) | **POST** /api/v1/namespaces/{namespace}/pods/{name}/portforward | 
*CoreV1Api* | [**connectPostNamespacedPodProxy**](docs/CoreV1Api.md#connectPostNamespacedPodProxy) | **POST** /api/v1/namespaces/{namespace}/pods/{name}/proxy | 
*CoreV1Api* | [**connectPostNamespacedPodProxyWithPath**](docs/CoreV1Api.md#connectPostNamespacedPodProxyWithPath) | **POST** /api/v1/namespaces/{namespace}/pods/{name}/proxy/{path} | 
*CoreV1Api* | [**connectPostNamespacedServiceProxy**](docs/CoreV1Api.md#connectPostNamespacedServiceProxy) | **POST** /api/v1/namespaces/{namespace}/services/{name}/proxy | 
*CoreV1Api* | [**connectPostNamespacedServiceProxyWithPath**](docs/CoreV1Api.md#connectPostNamespacedServiceProxyWithPath) | **POST** /api/v1/namespaces/{namespace}/services/{name}/proxy/{path} | 
*CoreV1Api* | [**connectPostNodeProxy**](docs/CoreV1Api.md#connectPostNodeProxy) | **POST** /api/v1/nodes/{name}/proxy | 
*CoreV1Api* | [**connectPostNodeProxyWithPath**](docs/CoreV1Api.md#connectPostNodeProxyWithPath) | **POST** /api/v1/nodes/{name}/proxy/{path} | 
*CoreV1Api* | [**connectPutNamespacedPodProxy**](docs/CoreV1Api.md#connectPutNamespacedPodProxy) | **PUT** /api/v1/namespaces/{namespace}/pods/{name}/proxy | 
*CoreV1Api* | [**connectPutNamespacedPodProxyWithPath**](docs/CoreV1Api.md#connectPutNamespacedPodProxyWithPath) | **PUT** /api/v1/namespaces/{namespace}/pods/{name}/proxy/{path} | 
*CoreV1Api* | [**connectPutNamespacedServiceProxy**](docs/CoreV1Api.md#connectPutNamespacedServiceProxy) | **PUT** /api/v1/namespaces/{namespace}/services/{name}/proxy | 
*CoreV1Api* | [**connectPutNamespacedServiceProxyWithPath**](docs/CoreV1Api.md#connectPutNamespacedServiceProxyWithPath) | **PUT** /api/v1/namespaces/{namespace}/services/{name}/proxy/{path} | 
*CoreV1Api* | [**connectPutNodeProxy**](docs/CoreV1Api.md#connectPutNodeProxy) | **PUT** /api/v1/nodes/{name}/proxy | 
*CoreV1Api* | [**connectPutNodeProxyWithPath**](docs/CoreV1Api.md#connectPutNodeProxyWithPath) | **PUT** /api/v1/nodes/{name}/proxy/{path} | 
*CoreV1Api* | [**createNamespace**](docs/CoreV1Api.md#createNamespace) | **POST** /api/v1/namespaces | 
*CoreV1Api* | [**createNamespacedBinding**](docs/CoreV1Api.md#createNamespacedBinding) | **POST** /api/v1/namespaces/{namespace}/bindings | 
*CoreV1Api* | [**createNamespacedBindingBinding**](docs/CoreV1Api.md#createNamespacedBindingBinding) | **POST** /api/v1/namespaces/{namespace}/pods/{name}/binding | 
*CoreV1Api* | [**createNamespacedConfigMap**](docs/CoreV1Api.md#createNamespacedConfigMap) | **POST** /api/v1/namespaces/{namespace}/configmaps | 
*CoreV1Api* | [**createNamespacedEndpoints**](docs/CoreV1Api.md#createNamespacedEndpoints) | **POST** /api/v1/namespaces/{namespace}/endpoints | 
*CoreV1Api* | [**createNamespacedEvent**](docs/CoreV1Api.md#createNamespacedEvent) | **POST** /api/v1/namespaces/{namespace}/events | 
*CoreV1Api* | [**createNamespacedEvictionEviction**](docs/CoreV1Api.md#createNamespacedEvictionEviction) | **POST** /api/v1/namespaces/{namespace}/pods/{name}/eviction | 
*CoreV1Api* | [**createNamespacedLimitRange**](docs/CoreV1Api.md#createNamespacedLimitRange) | **POST** /api/v1/namespaces/{namespace}/limitranges | 
*CoreV1Api* | [**createNamespacedPersistentVolumeClaim**](docs/CoreV1Api.md#createNamespacedPersistentVolumeClaim) | **POST** /api/v1/namespaces/{namespace}/persistentvolumeclaims | 
*CoreV1Api* | [**createNamespacedPod**](docs/CoreV1Api.md#createNamespacedPod) | **POST** /api/v1/namespaces/{namespace}/pods | 
*CoreV1Api* | [**createNamespacedPodTemplate**](docs/CoreV1Api.md#createNamespacedPodTemplate) | **POST** /api/v1/namespaces/{namespace}/podtemplates | 
*CoreV1Api* | [**createNamespacedReplicationController**](docs/CoreV1Api.md#createNamespacedReplicationController) | **POST** /api/v1/namespaces/{namespace}/replicationcontrollers | 
*CoreV1Api* | [**createNamespacedResourceQuota**](docs/CoreV1Api.md#createNamespacedResourceQuota) | **POST** /api/v1/namespaces/{namespace}/resourcequotas | 
*CoreV1Api* | [**createNamespacedSecret**](docs/CoreV1Api.md#createNamespacedSecret) | **POST** /api/v1/namespaces/{namespace}/secrets | 
*CoreV1Api* | [**createNamespacedService**](docs/CoreV1Api.md#createNamespacedService) | **POST** /api/v1/namespaces/{namespace}/services | 
*CoreV1Api* | [**createNamespacedServiceAccount**](docs/CoreV1Api.md#createNamespacedServiceAccount) | **POST** /api/v1/namespaces/{namespace}/serviceaccounts | 
*CoreV1Api* | [**createNode**](docs/CoreV1Api.md#createNode) | **POST** /api/v1/nodes | 
*CoreV1Api* | [**createPersistentVolume**](docs/CoreV1Api.md#createPersistentVolume) | **POST** /api/v1/persistentvolumes | 
*CoreV1Api* | [**deleteCollectionNamespace**](docs/CoreV1Api.md#deleteCollectionNamespace) | **DELETE** /api/v1/namespaces | 
*CoreV1Api* | [**deleteCollectionNamespacedConfigMap**](docs/CoreV1Api.md#deleteCollectionNamespacedConfigMap) | **DELETE** /api/v1/namespaces/{namespace}/configmaps | 
*CoreV1Api* | [**deleteCollectionNamespacedEndpoints**](docs/CoreV1Api.md#deleteCollectionNamespacedEndpoints) | **DELETE** /api/v1/namespaces/{namespace}/endpoints | 
*CoreV1Api* | [**deleteCollectionNamespacedEvent**](docs/CoreV1Api.md#deleteCollectionNamespacedEvent) | **DELETE** /api/v1/namespaces/{namespace}/events | 
*CoreV1Api* | [**deleteCollectionNamespacedLimitRange**](docs/CoreV1Api.md#deleteCollectionNamespacedLimitRange) | **DELETE** /api/v1/namespaces/{namespace}/limitranges | 
*CoreV1Api* | [**deleteCollectionNamespacedPersistentVolumeClaim**](docs/CoreV1Api.md#deleteCollectionNamespacedPersistentVolumeClaim) | **DELETE** /api/v1/namespaces/{namespace}/persistentvolumeclaims | 
*CoreV1Api* | [**deleteCollectionNamespacedPod**](docs/CoreV1Api.md#deleteCollectionNamespacedPod) | **DELETE** /api/v1/namespaces/{namespace}/pods | 
*CoreV1Api* | [**deleteCollectionNamespacedPodTemplate**](docs/CoreV1Api.md#deleteCollectionNamespacedPodTemplate) | **DELETE** /api/v1/namespaces/{namespace}/podtemplates | 
*CoreV1Api* | [**deleteCollectionNamespacedReplicationController**](docs/CoreV1Api.md#deleteCollectionNamespacedReplicationController) | **DELETE** /api/v1/namespaces/{namespace}/replicationcontrollers | 
*CoreV1Api* | [**deleteCollectionNamespacedResourceQuota**](docs/CoreV1Api.md#deleteCollectionNamespacedResourceQuota) | **DELETE** /api/v1/namespaces/{namespace}/resourcequotas | 
*CoreV1Api* | [**deleteCollectionNamespacedSecret**](docs/CoreV1Api.md#deleteCollectionNamespacedSecret) | **DELETE** /api/v1/namespaces/{namespace}/secrets | 
*CoreV1Api* | [**deleteCollectionNamespacedServiceAccount**](docs/CoreV1Api.md#deleteCollectionNamespacedServiceAccount) | **DELETE** /api/v1/namespaces/{namespace}/serviceaccounts | 
*CoreV1Api* | [**deleteCollectionNode**](docs/CoreV1Api.md#deleteCollectionNode) | **DELETE** /api/v1/nodes | 
*CoreV1Api* | [**deleteCollectionPersistentVolume**](docs/CoreV1Api.md#deleteCollectionPersistentVolume) | **DELETE** /api/v1/persistentvolumes | 
*CoreV1Api* | [**deleteNamespace**](docs/CoreV1Api.md#deleteNamespace) | **DELETE** /api/v1/namespaces/{name} | 
*CoreV1Api* | [**deleteNamespacedConfigMap**](docs/CoreV1Api.md#deleteNamespacedConfigMap) | **DELETE** /api/v1/namespaces/{namespace}/configmaps/{name} | 
*CoreV1Api* | [**deleteNamespacedEndpoints**](docs/CoreV1Api.md#deleteNamespacedEndpoints) | **DELETE** /api/v1/namespaces/{namespace}/endpoints/{name} | 
*CoreV1Api* | [**deleteNamespacedEvent**](docs/CoreV1Api.md#deleteNamespacedEvent) | **DELETE** /api/v1/namespaces/{namespace}/events/{name} | 
*CoreV1Api* | [**deleteNamespacedLimitRange**](docs/CoreV1Api.md#deleteNamespacedLimitRange) | **DELETE** /api/v1/namespaces/{namespace}/limitranges/{name} | 
*CoreV1Api* | [**deleteNamespacedPersistentVolumeClaim**](docs/CoreV1Api.md#deleteNamespacedPersistentVolumeClaim) | **DELETE** /api/v1/namespaces/{namespace}/persistentvolumeclaims/{name} | 
*CoreV1Api* | [**deleteNamespacedPod**](docs/CoreV1Api.md#deleteNamespacedPod) | **DELETE** /api/v1/namespaces/{namespace}/pods/{name} | 
*CoreV1Api* | [**deleteNamespacedPodTemplate**](docs/CoreV1Api.md#deleteNamespacedPodTemplate) | **DELETE** /api/v1/namespaces/{namespace}/podtemplates/{name} | 
*CoreV1Api* | [**deleteNamespacedReplicationController**](docs/CoreV1Api.md#deleteNamespacedReplicationController) | **DELETE** /api/v1/namespaces/{namespace}/replicationcontrollers/{name} | 
*CoreV1Api* | [**deleteNamespacedResourceQuota**](docs/CoreV1Api.md#deleteNamespacedResourceQuota) | **DELETE** /api/v1/namespaces/{namespace}/resourcequotas/{name} | 
*CoreV1Api* | [**deleteNamespacedSecret**](docs/CoreV1Api.md#deleteNamespacedSecret) | **DELETE** /api/v1/namespaces/{namespace}/secrets/{name} | 
*CoreV1Api* | [**deleteNamespacedService**](docs/CoreV1Api.md#deleteNamespacedService) | **DELETE** /api/v1/namespaces/{namespace}/services/{name} | 
*CoreV1Api* | [**deleteNamespacedServiceAccount**](docs/CoreV1Api.md#deleteNamespacedServiceAccount) | **DELETE** /api/v1/namespaces/{namespace}/serviceaccounts/{name} | 
*CoreV1Api* | [**deleteNode**](docs/CoreV1Api.md#deleteNode) | **DELETE** /api/v1/nodes/{name} | 
*CoreV1Api* | [**deletePersistentVolume**](docs/CoreV1Api.md#deletePersistentVolume) | **DELETE** /api/v1/persistentvolumes/{name} | 
*CoreV1Api* | [**getAPIResources**](docs/CoreV1Api.md#getAPIResources) | **GET** /api/v1/ | 
*CoreV1Api* | [**listComponentStatus**](docs/CoreV1Api.md#listComponentStatus) | **GET** /api/v1/componentstatuses | 
*CoreV1Api* | [**listConfigMapForAllNamespaces**](docs/CoreV1Api.md#listConfigMapForAllNamespaces) | **GET** /api/v1/configmaps | 
*CoreV1Api* | [**listEndpointsForAllNamespaces**](docs/CoreV1Api.md#listEndpointsForAllNamespaces) | **GET** /api/v1/endpoints | 
*CoreV1Api* | [**listEventForAllNamespaces**](docs/CoreV1Api.md#listEventForAllNamespaces) | **GET** /api/v1/events | 
*CoreV1Api* | [**listLimitRangeForAllNamespaces**](docs/CoreV1Api.md#listLimitRangeForAllNamespaces) | **GET** /api/v1/limitranges | 
*CoreV1Api* | [**listNamespace**](docs/CoreV1Api.md#listNamespace) | **GET** /api/v1/namespaces | 
*CoreV1Api* | [**listNamespacedConfigMap**](docs/CoreV1Api.md#listNamespacedConfigMap) | **GET** /api/v1/namespaces/{namespace}/configmaps | 
*CoreV1Api* | [**listNamespacedEndpoints**](docs/CoreV1Api.md#listNamespacedEndpoints) | **GET** /api/v1/namespaces/{namespace}/endpoints | 
*CoreV1Api* | [**listNamespacedEvent**](docs/CoreV1Api.md#listNamespacedEvent) | **GET** /api/v1/namespaces/{namespace}/events | 
*CoreV1Api* | [**listNamespacedLimitRange**](docs/CoreV1Api.md#listNamespacedLimitRange) | **GET** /api/v1/namespaces/{namespace}/limitranges | 
*CoreV1Api* | [**listNamespacedPersistentVolumeClaim**](docs/CoreV1Api.md#listNamespacedPersistentVolumeClaim) | **GET** /api/v1/namespaces/{namespace}/persistentvolumeclaims | 
*CoreV1Api* | [**listNamespacedPod**](docs/CoreV1Api.md#listNamespacedPod) | **GET** /api/v1/namespaces/{namespace}/pods | 
*CoreV1Api* | [**listNamespacedPodTemplate**](docs/CoreV1Api.md#listNamespacedPodTemplate) | **GET** /api/v1/namespaces/{namespace}/podtemplates | 
*CoreV1Api* | [**listNamespacedReplicationController**](docs/CoreV1Api.md#listNamespacedReplicationController) | **GET** /api/v1/namespaces/{namespace}/replicationcontrollers | 
*CoreV1Api* | [**listNamespacedResourceQuota**](docs/CoreV1Api.md#listNamespacedResourceQuota) | **GET** /api/v1/namespaces/{namespace}/resourcequotas | 
*CoreV1Api* | [**listNamespacedSecret**](docs/CoreV1Api.md#listNamespacedSecret) | **GET** /api/v1/namespaces/{namespace}/secrets | 
*CoreV1Api* | [**listNamespacedService**](docs/CoreV1Api.md#listNamespacedService) | **GET** /api/v1/namespaces/{namespace}/services | 
*CoreV1Api* | [**listNamespacedServiceAccount**](docs/CoreV1Api.md#listNamespacedServiceAccount) | **GET** /api/v1/namespaces/{namespace}/serviceaccounts | 
*CoreV1Api* | [**listNode**](docs/CoreV1Api.md#listNode) | **GET** /api/v1/nodes | 
*CoreV1Api* | [**listPersistentVolume**](docs/CoreV1Api.md#listPersistentVolume) | **GET** /api/v1/persistentvolumes | 
*CoreV1Api* | [**listPersistentVolumeClaimForAllNamespaces**](docs/CoreV1Api.md#listPersistentVolumeClaimForAllNamespaces) | **GET** /api/v1/persistentvolumeclaims | 
*CoreV1Api* | [**listPodForAllNamespaces**](docs/CoreV1Api.md#listPodForAllNamespaces) | **GET** /api/v1/pods | 
*CoreV1Api* | [**listPodTemplateForAllNamespaces**](docs/CoreV1Api.md#listPodTemplateForAllNamespaces) | **GET** /api/v1/podtemplates | 
*CoreV1Api* | [**listReplicationControllerForAllNamespaces**](docs/CoreV1Api.md#listReplicationControllerForAllNamespaces) | **GET** /api/v1/replicationcontrollers | 
*CoreV1Api* | [**listResourceQuotaForAllNamespaces**](docs/CoreV1Api.md#listResourceQuotaForAllNamespaces) | **GET** /api/v1/resourcequotas | 
*CoreV1Api* | [**listSecretForAllNamespaces**](docs/CoreV1Api.md#listSecretForAllNamespaces) | **GET** /api/v1/secrets | 
*CoreV1Api* | [**listServiceAccountForAllNamespaces**](docs/CoreV1Api.md#listServiceAccountForAllNamespaces) | **GET** /api/v1/serviceaccounts | 
*CoreV1Api* | [**listServiceForAllNamespaces**](docs/CoreV1Api.md#listServiceForAllNamespaces) | **GET** /api/v1/services | 
*CoreV1Api* | [**patchNamespace**](docs/CoreV1Api.md#patchNamespace) | **PATCH** /api/v1/namespaces/{name} | 
*CoreV1Api* | [**patchNamespaceStatus**](docs/CoreV1Api.md#patchNamespaceStatus) | **PATCH** /api/v1/namespaces/{name}/status | 
*CoreV1Api* | [**patchNamespacedConfigMap**](docs/CoreV1Api.md#patchNamespacedConfigMap) | **PATCH** /api/v1/namespaces/{namespace}/configmaps/{name} | 
*CoreV1Api* | [**patchNamespacedEndpoints**](docs/CoreV1Api.md#patchNamespacedEndpoints) | **PATCH** /api/v1/namespaces/{namespace}/endpoints/{name} | 
*CoreV1Api* | [**patchNamespacedEvent**](docs/CoreV1Api.md#patchNamespacedEvent) | **PATCH** /api/v1/namespaces/{namespace}/events/{name} | 
*CoreV1Api* | [**patchNamespacedLimitRange**](docs/CoreV1Api.md#patchNamespacedLimitRange) | **PATCH** /api/v1/namespaces/{namespace}/limitranges/{name} | 
*CoreV1Api* | [**patchNamespacedPersistentVolumeClaim**](docs/CoreV1Api.md#patchNamespacedPersistentVolumeClaim) | **PATCH** /api/v1/namespaces/{namespace}/persistentvolumeclaims/{name} | 
*CoreV1Api* | [**patchNamespacedPersistentVolumeClaimStatus**](docs/CoreV1Api.md#patchNamespacedPersistentVolumeClaimStatus) | **PATCH** /api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}/status | 
*CoreV1Api* | [**patchNamespacedPod**](docs/CoreV1Api.md#patchNamespacedPod) | **PATCH** /api/v1/namespaces/{namespace}/pods/{name} | 
*CoreV1Api* | [**patchNamespacedPodStatus**](docs/CoreV1Api.md#patchNamespacedPodStatus) | **PATCH** /api/v1/namespaces/{namespace}/pods/{name}/status | 
*CoreV1Api* | [**patchNamespacedPodTemplate**](docs/CoreV1Api.md#patchNamespacedPodTemplate) | **PATCH** /api/v1/namespaces/{namespace}/podtemplates/{name} | 
*CoreV1Api* | [**patchNamespacedReplicationController**](docs/CoreV1Api.md#patchNamespacedReplicationController) | **PATCH** /api/v1/namespaces/{namespace}/replicationcontrollers/{name} | 
*CoreV1Api* | [**patchNamespacedReplicationControllerStatus**](docs/CoreV1Api.md#patchNamespacedReplicationControllerStatus) | **PATCH** /api/v1/namespaces/{namespace}/replicationcontrollers/{name}/status | 
*CoreV1Api* | [**patchNamespacedResourceQuota**](docs/CoreV1Api.md#patchNamespacedResourceQuota) | **PATCH** /api/v1/namespaces/{namespace}/resourcequotas/{name} | 
*CoreV1Api* | [**patchNamespacedResourceQuotaStatus**](docs/CoreV1Api.md#patchNamespacedResourceQuotaStatus) | **PATCH** /api/v1/namespaces/{namespace}/resourcequotas/{name}/status | 
*CoreV1Api* | [**patchNamespacedScaleScale**](docs/CoreV1Api.md#patchNamespacedScaleScale) | **PATCH** /api/v1/namespaces/{namespace}/replicationcontrollers/{name}/scale | 
*CoreV1Api* | [**patchNamespacedSecret**](docs/CoreV1Api.md#patchNamespacedSecret) | **PATCH** /api/v1/namespaces/{namespace}/secrets/{name} | 
*CoreV1Api* | [**patchNamespacedService**](docs/CoreV1Api.md#patchNamespacedService) | **PATCH** /api/v1/namespaces/{namespace}/services/{name} | 
*CoreV1Api* | [**patchNamespacedServiceAccount**](docs/CoreV1Api.md#patchNamespacedServiceAccount) | **PATCH** /api/v1/namespaces/{namespace}/serviceaccounts/{name} | 
*CoreV1Api* | [**patchNamespacedServiceStatus**](docs/CoreV1Api.md#patchNamespacedServiceStatus) | **PATCH** /api/v1/namespaces/{namespace}/services/{name}/status | 
*CoreV1Api* | [**patchNode**](docs/CoreV1Api.md#patchNode) | **PATCH** /api/v1/nodes/{name} | 
*CoreV1Api* | [**patchNodeStatus**](docs/CoreV1Api.md#patchNodeStatus) | **PATCH** /api/v1/nodes/{name}/status | 
*CoreV1Api* | [**patchPersistentVolume**](docs/CoreV1Api.md#patchPersistentVolume) | **PATCH** /api/v1/persistentvolumes/{name} | 
*CoreV1Api* | [**patchPersistentVolumeStatus**](docs/CoreV1Api.md#patchPersistentVolumeStatus) | **PATCH** /api/v1/persistentvolumes/{name}/status | 
*CoreV1Api* | [**proxyDELETENamespacedPod**](docs/CoreV1Api.md#proxyDELETENamespacedPod) | **DELETE** /api/v1/proxy/namespaces/{namespace}/pods/{name} | 
*CoreV1Api* | [**proxyDELETENamespacedPodWithPath**](docs/CoreV1Api.md#proxyDELETENamespacedPodWithPath) | **DELETE** /api/v1/proxy/namespaces/{namespace}/pods/{name}/{path} | 
*CoreV1Api* | [**proxyDELETENamespacedService**](docs/CoreV1Api.md#proxyDELETENamespacedService) | **DELETE** /api/v1/proxy/namespaces/{namespace}/services/{name} | 
*CoreV1Api* | [**proxyDELETENamespacedServiceWithPath**](docs/CoreV1Api.md#proxyDELETENamespacedServiceWithPath) | **DELETE** /api/v1/proxy/namespaces/{namespace}/services/{name}/{path} | 
*CoreV1Api* | [**proxyDELETENode**](docs/CoreV1Api.md#proxyDELETENode) | **DELETE** /api/v1/proxy/nodes/{name} | 
*CoreV1Api* | [**proxyDELETENodeWithPath**](docs/CoreV1Api.md#proxyDELETENodeWithPath) | **DELETE** /api/v1/proxy/nodes/{name}/{path} | 
*CoreV1Api* | [**proxyGETNamespacedPod**](docs/CoreV1Api.md#proxyGETNamespacedPod) | **GET** /api/v1/proxy/namespaces/{namespace}/pods/{name} | 
*CoreV1Api* | [**proxyGETNamespacedPodWithPath**](docs/CoreV1Api.md#proxyGETNamespacedPodWithPath) | **GET** /api/v1/proxy/namespaces/{namespace}/pods/{name}/{path} | 
*CoreV1Api* | [**proxyGETNamespacedService**](docs/CoreV1Api.md#proxyGETNamespacedService) | **GET** /api/v1/proxy/namespaces/{namespace}/services/{name} | 
*CoreV1Api* | [**proxyGETNamespacedServiceWithPath**](docs/CoreV1Api.md#proxyGETNamespacedServiceWithPath) | **GET** /api/v1/proxy/namespaces/{namespace}/services/{name}/{path} | 
*CoreV1Api* | [**proxyGETNode**](docs/CoreV1Api.md#proxyGETNode) | **GET** /api/v1/proxy/nodes/{name} | 
*CoreV1Api* | [**proxyGETNodeWithPath**](docs/CoreV1Api.md#proxyGETNodeWithPath) | **GET** /api/v1/proxy/nodes/{name}/{path} | 
*CoreV1Api* | [**proxyHEADNamespacedPod**](docs/CoreV1Api.md#proxyHEADNamespacedPod) | **HEAD** /api/v1/proxy/namespaces/{namespace}/pods/{name} | 
*CoreV1Api* | [**proxyHEADNamespacedPodWithPath**](docs/CoreV1Api.md#proxyHEADNamespacedPodWithPath) | **HEAD** /api/v1/proxy/namespaces/{namespace}/pods/{name}/{path} | 
*CoreV1Api* | [**proxyHEADNamespacedService**](docs/CoreV1Api.md#proxyHEADNamespacedService) | **HEAD** /api/v1/proxy/namespaces/{namespace}/services/{name} | 
*CoreV1Api* | [**proxyHEADNamespacedServiceWithPath**](docs/CoreV1Api.md#proxyHEADNamespacedServiceWithPath) | **HEAD** /api/v1/proxy/namespaces/{namespace}/services/{name}/{path} | 
*CoreV1Api* | [**proxyHEADNode**](docs/CoreV1Api.md#proxyHEADNode) | **HEAD** /api/v1/proxy/nodes/{name} | 
*CoreV1Api* | [**proxyHEADNodeWithPath**](docs/CoreV1Api.md#proxyHEADNodeWithPath) | **HEAD** /api/v1/proxy/nodes/{name}/{path} | 
*CoreV1Api* | [**proxyOPTIONSNamespacedPod**](docs/CoreV1Api.md#proxyOPTIONSNamespacedPod) | **OPTIONS** /api/v1/proxy/namespaces/{namespace}/pods/{name} | 
*CoreV1Api* | [**proxyOPTIONSNamespacedPodWithPath**](docs/CoreV1Api.md#proxyOPTIONSNamespacedPodWithPath) | **OPTIONS** /api/v1/proxy/namespaces/{namespace}/pods/{name}/{path} | 
*CoreV1Api* | [**proxyOPTIONSNamespacedService**](docs/CoreV1Api.md#proxyOPTIONSNamespacedService) | **OPTIONS** /api/v1/proxy/namespaces/{namespace}/services/{name} | 
*CoreV1Api* | [**proxyOPTIONSNamespacedServiceWithPath**](docs/CoreV1Api.md#proxyOPTIONSNamespacedServiceWithPath) | **OPTIONS** /api/v1/proxy/namespaces/{namespace}/services/{name}/{path} | 
*CoreV1Api* | [**proxyOPTIONSNode**](docs/CoreV1Api.md#proxyOPTIONSNode) | **OPTIONS** /api/v1/proxy/nodes/{name} | 
*CoreV1Api* | [**proxyOPTIONSNodeWithPath**](docs/CoreV1Api.md#proxyOPTIONSNodeWithPath) | **OPTIONS** /api/v1/proxy/nodes/{name}/{path} | 
*CoreV1Api* | [**proxyPATCHNamespacedPod**](docs/CoreV1Api.md#proxyPATCHNamespacedPod) | **PATCH** /api/v1/proxy/namespaces/{namespace}/pods/{name} | 
*CoreV1Api* | [**proxyPATCHNamespacedPodWithPath**](docs/CoreV1Api.md#proxyPATCHNamespacedPodWithPath) | **PATCH** /api/v1/proxy/namespaces/{namespace}/pods/{name}/{path} | 
*CoreV1Api* | [**proxyPATCHNamespacedService**](docs/CoreV1Api.md#proxyPATCHNamespacedService) | **PATCH** /api/v1/proxy/namespaces/{namespace}/services/{name} | 
*CoreV1Api* | [**proxyPATCHNamespacedServiceWithPath**](docs/CoreV1Api.md#proxyPATCHNamespacedServiceWithPath) | **PATCH** /api/v1/proxy/namespaces/{namespace}/services/{name}/{path} | 
*CoreV1Api* | [**proxyPATCHNode**](docs/CoreV1Api.md#proxyPATCHNode) | **PATCH** /api/v1/proxy/nodes/{name} | 
*CoreV1Api* | [**proxyPATCHNodeWithPath**](docs/CoreV1Api.md#proxyPATCHNodeWithPath) | **PATCH** /api/v1/proxy/nodes/{name}/{path} | 
*CoreV1Api* | [**proxyPOSTNamespacedPod**](docs/CoreV1Api.md#proxyPOSTNamespacedPod) | **POST** /api/v1/proxy/namespaces/{namespace}/pods/{name} | 
*CoreV1Api* | [**proxyPOSTNamespacedPodWithPath**](docs/CoreV1Api.md#proxyPOSTNamespacedPodWithPath) | **POST** /api/v1/proxy/namespaces/{namespace}/pods/{name}/{path} | 
*CoreV1Api* | [**proxyPOSTNamespacedService**](docs/CoreV1Api.md#proxyPOSTNamespacedService) | **POST** /api/v1/proxy/namespaces/{namespace}/services/{name} | 
*CoreV1Api* | [**proxyPOSTNamespacedServiceWithPath**](docs/CoreV1Api.md#proxyPOSTNamespacedServiceWithPath) | **POST** /api/v1/proxy/namespaces/{namespace}/services/{name}/{path} | 
*CoreV1Api* | [**proxyPOSTNode**](docs/CoreV1Api.md#proxyPOSTNode) | **POST** /api/v1/proxy/nodes/{name} | 
*CoreV1Api* | [**proxyPOSTNodeWithPath**](docs/CoreV1Api.md#proxyPOSTNodeWithPath) | **POST** /api/v1/proxy/nodes/{name}/{path} | 
*CoreV1Api* | [**proxyPUTNamespacedPod**](docs/CoreV1Api.md#proxyPUTNamespacedPod) | **PUT** /api/v1/proxy/namespaces/{namespace}/pods/{name} | 
*CoreV1Api* | [**proxyPUTNamespacedPodWithPath**](docs/CoreV1Api.md#proxyPUTNamespacedPodWithPath) | **PUT** /api/v1/proxy/namespaces/{namespace}/pods/{name}/{path} | 
*CoreV1Api* | [**proxyPUTNamespacedService**](docs/CoreV1Api.md#proxyPUTNamespacedService) | **PUT** /api/v1/proxy/namespaces/{namespace}/services/{name} | 
*CoreV1Api* | [**proxyPUTNamespacedServiceWithPath**](docs/CoreV1Api.md#proxyPUTNamespacedServiceWithPath) | **PUT** /api/v1/proxy/namespaces/{namespace}/services/{name}/{path} | 
*CoreV1Api* | [**proxyPUTNode**](docs/CoreV1Api.md#proxyPUTNode) | **PUT** /api/v1/proxy/nodes/{name} | 
*CoreV1Api* | [**proxyPUTNodeWithPath**](docs/CoreV1Api.md#proxyPUTNodeWithPath) | **PUT** /api/v1/proxy/nodes/{name}/{path} | 
*CoreV1Api* | [**readComponentStatus**](docs/CoreV1Api.md#readComponentStatus) | **GET** /api/v1/componentstatuses/{name} | 
*CoreV1Api* | [**readNamespace**](docs/CoreV1Api.md#readNamespace) | **GET** /api/v1/namespaces/{name} | 
*CoreV1Api* | [**readNamespaceStatus**](docs/CoreV1Api.md#readNamespaceStatus) | **GET** /api/v1/namespaces/{name}/status | 
*CoreV1Api* | [**readNamespacedConfigMap**](docs/CoreV1Api.md#readNamespacedConfigMap) | **GET** /api/v1/namespaces/{namespace}/configmaps/{name} | 
*CoreV1Api* | [**readNamespacedEndpoints**](docs/CoreV1Api.md#readNamespacedEndpoints) | **GET** /api/v1/namespaces/{namespace}/endpoints/{name} | 
*CoreV1Api* | [**readNamespacedEvent**](docs/CoreV1Api.md#readNamespacedEvent) | **GET** /api/v1/namespaces/{namespace}/events/{name} | 
*CoreV1Api* | [**readNamespacedLimitRange**](docs/CoreV1Api.md#readNamespacedLimitRange) | **GET** /api/v1/namespaces/{namespace}/limitranges/{name} | 
*CoreV1Api* | [**readNamespacedPersistentVolumeClaim**](docs/CoreV1Api.md#readNamespacedPersistentVolumeClaim) | **GET** /api/v1/namespaces/{namespace}/persistentvolumeclaims/{name} | 
*CoreV1Api* | [**readNamespacedPersistentVolumeClaimStatus**](docs/CoreV1Api.md#readNamespacedPersistentVolumeClaimStatus) | **GET** /api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}/status | 
*CoreV1Api* | [**readNamespacedPod**](docs/CoreV1Api.md#readNamespacedPod) | **GET** /api/v1/namespaces/{namespace}/pods/{name} | 
*CoreV1Api* | [**readNamespacedPodLog**](docs/CoreV1Api.md#readNamespacedPodLog) | **GET** /api/v1/namespaces/{namespace}/pods/{name}/log | 
*CoreV1Api* | [**readNamespacedPodStatus**](docs/CoreV1Api.md#readNamespacedPodStatus) | **GET** /api/v1/namespaces/{namespace}/pods/{name}/status | 
*CoreV1Api* | [**readNamespacedPodTemplate**](docs/CoreV1Api.md#readNamespacedPodTemplate) | **GET** /api/v1/namespaces/{namespace}/podtemplates/{name} | 
*CoreV1Api* | [**readNamespacedReplicationController**](docs/CoreV1Api.md#readNamespacedReplicationController) | **GET** /api/v1/namespaces/{namespace}/replicationcontrollers/{name} | 
*CoreV1Api* | [**readNamespacedReplicationControllerStatus**](docs/CoreV1Api.md#readNamespacedReplicationControllerStatus) | **GET** /api/v1/namespaces/{namespace}/replicationcontrollers/{name}/status | 
*CoreV1Api* | [**readNamespacedResourceQuota**](docs/CoreV1Api.md#readNamespacedResourceQuota) | **GET** /api/v1/namespaces/{namespace}/resourcequotas/{name} | 
*CoreV1Api* | [**readNamespacedResourceQuotaStatus**](docs/CoreV1Api.md#readNamespacedResourceQuotaStatus) | **GET** /api/v1/namespaces/{namespace}/resourcequotas/{name}/status | 
*CoreV1Api* | [**readNamespacedScaleScale**](docs/CoreV1Api.md#readNamespacedScaleScale) | **GET** /api/v1/namespaces/{namespace}/replicationcontrollers/{name}/scale | 
*CoreV1Api* | [**readNamespacedSecret**](docs/CoreV1Api.md#readNamespacedSecret) | **GET** /api/v1/namespaces/{namespace}/secrets/{name} | 
*CoreV1Api* | [**readNamespacedService**](docs/CoreV1Api.md#readNamespacedService) | **GET** /api/v1/namespaces/{namespace}/services/{name} | 
*CoreV1Api* | [**readNamespacedServiceAccount**](docs/CoreV1Api.md#readNamespacedServiceAccount) | **GET** /api/v1/namespaces/{namespace}/serviceaccounts/{name} | 
*CoreV1Api* | [**readNamespacedServiceStatus**](docs/CoreV1Api.md#readNamespacedServiceStatus) | **GET** /api/v1/namespaces/{namespace}/services/{name}/status | 
*CoreV1Api* | [**readNode**](docs/CoreV1Api.md#readNode) | **GET** /api/v1/nodes/{name} | 
*CoreV1Api* | [**readNodeStatus**](docs/CoreV1Api.md#readNodeStatus) | **GET** /api/v1/nodes/{name}/status | 
*CoreV1Api* | [**readPersistentVolume**](docs/CoreV1Api.md#readPersistentVolume) | **GET** /api/v1/persistentvolumes/{name} | 
*CoreV1Api* | [**readPersistentVolumeStatus**](docs/CoreV1Api.md#readPersistentVolumeStatus) | **GET** /api/v1/persistentvolumes/{name}/status | 
*CoreV1Api* | [**replaceNamespace**](docs/CoreV1Api.md#replaceNamespace) | **PUT** /api/v1/namespaces/{name} | 
*CoreV1Api* | [**replaceNamespaceFinalize**](docs/CoreV1Api.md#replaceNamespaceFinalize) | **PUT** /api/v1/namespaces/{name}/finalize | 
*CoreV1Api* | [**replaceNamespaceStatus**](docs/CoreV1Api.md#replaceNamespaceStatus) | **PUT** /api/v1/namespaces/{name}/status | 
*CoreV1Api* | [**replaceNamespacedConfigMap**](docs/CoreV1Api.md#replaceNamespacedConfigMap) | **PUT** /api/v1/namespaces/{namespace}/configmaps/{name} | 
*CoreV1Api* | [**replaceNamespacedEndpoints**](docs/CoreV1Api.md#replaceNamespacedEndpoints) | **PUT** /api/v1/namespaces/{namespace}/endpoints/{name} | 
*CoreV1Api* | [**replaceNamespacedEvent**](docs/CoreV1Api.md#replaceNamespacedEvent) | **PUT** /api/v1/namespaces/{namespace}/events/{name} | 
*CoreV1Api* | [**replaceNamespacedLimitRange**](docs/CoreV1Api.md#replaceNamespacedLimitRange) | **PUT** /api/v1/namespaces/{namespace}/limitranges/{name} | 
*CoreV1Api* | [**replaceNamespacedPersistentVolumeClaim**](docs/CoreV1Api.md#replaceNamespacedPersistentVolumeClaim) | **PUT** /api/v1/namespaces/{namespace}/persistentvolumeclaims/{name} | 
*CoreV1Api* | [**replaceNamespacedPersistentVolumeClaimStatus**](docs/CoreV1Api.md#replaceNamespacedPersistentVolumeClaimStatus) | **PUT** /api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}/status | 
*CoreV1Api* | [**replaceNamespacedPod**](docs/CoreV1Api.md#replaceNamespacedPod) | **PUT** /api/v1/namespaces/{namespace}/pods/{name} | 
*CoreV1Api* | [**replaceNamespacedPodStatus**](docs/CoreV1Api.md#replaceNamespacedPodStatus) | **PUT** /api/v1/namespaces/{namespace}/pods/{name}/status | 
*CoreV1Api* | [**replaceNamespacedPodTemplate**](docs/CoreV1Api.md#replaceNamespacedPodTemplate) | **PUT** /api/v1/namespaces/{namespace}/podtemplates/{name} | 
*CoreV1Api* | [**replaceNamespacedReplicationController**](docs/CoreV1Api.md#replaceNamespacedReplicationController) | **PUT** /api/v1/namespaces/{namespace}/replicationcontrollers/{name} | 
*CoreV1Api* | [**replaceNamespacedReplicationControllerStatus**](docs/CoreV1Api.md#replaceNamespacedReplicationControllerStatus) | **PUT** /api/v1/namespaces/{namespace}/replicationcontrollers/{name}/status | 
*CoreV1Api* | [**replaceNamespacedResourceQuota**](docs/CoreV1Api.md#replaceNamespacedResourceQuota) | **PUT** /api/v1/namespaces/{namespace}/resourcequotas/{name} | 
*CoreV1Api* | [**replaceNamespacedResourceQuotaStatus**](docs/CoreV1Api.md#replaceNamespacedResourceQuotaStatus) | **PUT** /api/v1/namespaces/{namespace}/resourcequotas/{name}/status | 
*CoreV1Api* | [**replaceNamespacedScaleScale**](docs/CoreV1Api.md#replaceNamespacedScaleScale) | **PUT** /api/v1/namespaces/{namespace}/replicationcontrollers/{name}/scale | 
*CoreV1Api* | [**replaceNamespacedSecret**](docs/CoreV1Api.md#replaceNamespacedSecret) | **PUT** /api/v1/namespaces/{namespace}/secrets/{name} | 
*CoreV1Api* | [**replaceNamespacedService**](docs/CoreV1Api.md#replaceNamespacedService) | **PUT** /api/v1/namespaces/{namespace}/services/{name} | 
*CoreV1Api* | [**replaceNamespacedServiceAccount**](docs/CoreV1Api.md#replaceNamespacedServiceAccount) | **PUT** /api/v1/namespaces/{namespace}/serviceaccounts/{name} | 
*CoreV1Api* | [**replaceNamespacedServiceStatus**](docs/CoreV1Api.md#replaceNamespacedServiceStatus) | **PUT** /api/v1/namespaces/{namespace}/services/{name}/status | 
*CoreV1Api* | [**replaceNode**](docs/CoreV1Api.md#replaceNode) | **PUT** /api/v1/nodes/{name} | 
*CoreV1Api* | [**replaceNodeStatus**](docs/CoreV1Api.md#replaceNodeStatus) | **PUT** /api/v1/nodes/{name}/status | 
*CoreV1Api* | [**replacePersistentVolume**](docs/CoreV1Api.md#replacePersistentVolume) | **PUT** /api/v1/persistentvolumes/{name} | 
*CoreV1Api* | [**replacePersistentVolumeStatus**](docs/CoreV1Api.md#replacePersistentVolumeStatus) | **PUT** /api/v1/persistentvolumes/{name}/status | 
*ExtensionsApi* | [**getAPIGroup**](docs/ExtensionsApi.md#getAPIGroup) | **GET** /apis/extensions/ | 
*ExtensionsV1beta1Api* | [**createNamespacedDaemonSet**](docs/ExtensionsV1beta1Api.md#createNamespacedDaemonSet) | **POST** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets | 
*ExtensionsV1beta1Api* | [**createNamespacedDeployment**](docs/ExtensionsV1beta1Api.md#createNamespacedDeployment) | **POST** /apis/extensions/v1beta1/namespaces/{namespace}/deployments | 
*ExtensionsV1beta1Api* | [**createNamespacedDeploymentRollbackRollback**](docs/ExtensionsV1beta1Api.md#createNamespacedDeploymentRollbackRollback) | **POST** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/rollback | 
*ExtensionsV1beta1Api* | [**createNamespacedIngress**](docs/ExtensionsV1beta1Api.md#createNamespacedIngress) | **POST** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses | 
*ExtensionsV1beta1Api* | [**createNamespacedNetworkPolicy**](docs/ExtensionsV1beta1Api.md#createNamespacedNetworkPolicy) | **POST** /apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies | 
*ExtensionsV1beta1Api* | [**createNamespacedReplicaSet**](docs/ExtensionsV1beta1Api.md#createNamespacedReplicaSet) | **POST** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets | 
*ExtensionsV1beta1Api* | [**createPodSecurityPolicy**](docs/ExtensionsV1beta1Api.md#createPodSecurityPolicy) | **POST** /apis/extensions/v1beta1/podsecuritypolicies | 
*ExtensionsV1beta1Api* | [**createThirdPartyResource**](docs/ExtensionsV1beta1Api.md#createThirdPartyResource) | **POST** /apis/extensions/v1beta1/thirdpartyresources | 
*ExtensionsV1beta1Api* | [**deleteCollectionNamespacedDaemonSet**](docs/ExtensionsV1beta1Api.md#deleteCollectionNamespacedDaemonSet) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets | 
*ExtensionsV1beta1Api* | [**deleteCollectionNamespacedDeployment**](docs/ExtensionsV1beta1Api.md#deleteCollectionNamespacedDeployment) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/deployments | 
*ExtensionsV1beta1Api* | [**deleteCollectionNamespacedIngress**](docs/ExtensionsV1beta1Api.md#deleteCollectionNamespacedIngress) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses | 
*ExtensionsV1beta1Api* | [**deleteCollectionNamespacedNetworkPolicy**](docs/ExtensionsV1beta1Api.md#deleteCollectionNamespacedNetworkPolicy) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies | 
*ExtensionsV1beta1Api* | [**deleteCollectionNamespacedReplicaSet**](docs/ExtensionsV1beta1Api.md#deleteCollectionNamespacedReplicaSet) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets | 
*ExtensionsV1beta1Api* | [**deleteCollectionPodSecurityPolicy**](docs/ExtensionsV1beta1Api.md#deleteCollectionPodSecurityPolicy) | **DELETE** /apis/extensions/v1beta1/podsecuritypolicies | 
*ExtensionsV1beta1Api* | [**deleteCollectionThirdPartyResource**](docs/ExtensionsV1beta1Api.md#deleteCollectionThirdPartyResource) | **DELETE** /apis/extensions/v1beta1/thirdpartyresources | 
*ExtensionsV1beta1Api* | [**deleteNamespacedDaemonSet**](docs/ExtensionsV1beta1Api.md#deleteNamespacedDaemonSet) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name} | 
*ExtensionsV1beta1Api* | [**deleteNamespacedDeployment**](docs/ExtensionsV1beta1Api.md#deleteNamespacedDeployment) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name} | 
*ExtensionsV1beta1Api* | [**deleteNamespacedIngress**](docs/ExtensionsV1beta1Api.md#deleteNamespacedIngress) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name} | 
*ExtensionsV1beta1Api* | [**deleteNamespacedNetworkPolicy**](docs/ExtensionsV1beta1Api.md#deleteNamespacedNetworkPolicy) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies/{name} | 
*ExtensionsV1beta1Api* | [**deleteNamespacedReplicaSet**](docs/ExtensionsV1beta1Api.md#deleteNamespacedReplicaSet) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name} | 
*ExtensionsV1beta1Api* | [**deletePodSecurityPolicy**](docs/ExtensionsV1beta1Api.md#deletePodSecurityPolicy) | **DELETE** /apis/extensions/v1beta1/podsecuritypolicies/{name} | 
*ExtensionsV1beta1Api* | [**deleteThirdPartyResource**](docs/ExtensionsV1beta1Api.md#deleteThirdPartyResource) | **DELETE** /apis/extensions/v1beta1/thirdpartyresources/{name} | 
*ExtensionsV1beta1Api* | [**getAPIResources**](docs/ExtensionsV1beta1Api.md#getAPIResources) | **GET** /apis/extensions/v1beta1/ | 
*ExtensionsV1beta1Api* | [**listDaemonSetForAllNamespaces**](docs/ExtensionsV1beta1Api.md#listDaemonSetForAllNamespaces) | **GET** /apis/extensions/v1beta1/daemonsets | 
*ExtensionsV1beta1Api* | [**listDeploymentForAllNamespaces**](docs/ExtensionsV1beta1Api.md#listDeploymentForAllNamespaces) | **GET** /apis/extensions/v1beta1/deployments | 
*ExtensionsV1beta1Api* | [**listIngressForAllNamespaces**](docs/ExtensionsV1beta1Api.md#listIngressForAllNamespaces) | **GET** /apis/extensions/v1beta1/ingresses | 
*ExtensionsV1beta1Api* | [**listNamespacedDaemonSet**](docs/ExtensionsV1beta1Api.md#listNamespacedDaemonSet) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets | 
*ExtensionsV1beta1Api* | [**listNamespacedDeployment**](docs/ExtensionsV1beta1Api.md#listNamespacedDeployment) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/deployments | 
*ExtensionsV1beta1Api* | [**listNamespacedIngress**](docs/ExtensionsV1beta1Api.md#listNamespacedIngress) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses | 
*ExtensionsV1beta1Api* | [**listNamespacedNetworkPolicy**](docs/ExtensionsV1beta1Api.md#listNamespacedNetworkPolicy) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies | 
*ExtensionsV1beta1Api* | [**listNamespacedReplicaSet**](docs/ExtensionsV1beta1Api.md#listNamespacedReplicaSet) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets | 
*ExtensionsV1beta1Api* | [**listNetworkPolicyForAllNamespaces**](docs/ExtensionsV1beta1Api.md#listNetworkPolicyForAllNamespaces) | **GET** /apis/extensions/v1beta1/networkpolicies | 
*ExtensionsV1beta1Api* | [**listPodSecurityPolicy**](docs/ExtensionsV1beta1Api.md#listPodSecurityPolicy) | **GET** /apis/extensions/v1beta1/podsecuritypolicies | 
*ExtensionsV1beta1Api* | [**listReplicaSetForAllNamespaces**](docs/ExtensionsV1beta1Api.md#listReplicaSetForAllNamespaces) | **GET** /apis/extensions/v1beta1/replicasets | 
*ExtensionsV1beta1Api* | [**listThirdPartyResource**](docs/ExtensionsV1beta1Api.md#listThirdPartyResource) | **GET** /apis/extensions/v1beta1/thirdpartyresources | 
*ExtensionsV1beta1Api* | [**patchNamespacedDaemonSet**](docs/ExtensionsV1beta1Api.md#patchNamespacedDaemonSet) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name} | 
*ExtensionsV1beta1Api* | [**patchNamespacedDaemonSetStatus**](docs/ExtensionsV1beta1Api.md#patchNamespacedDaemonSetStatus) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name}/status | 
*ExtensionsV1beta1Api* | [**patchNamespacedDeployment**](docs/ExtensionsV1beta1Api.md#patchNamespacedDeployment) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name} | 
*ExtensionsV1beta1Api* | [**patchNamespacedDeploymentStatus**](docs/ExtensionsV1beta1Api.md#patchNamespacedDeploymentStatus) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/status | 
*ExtensionsV1beta1Api* | [**patchNamespacedDeploymentsScale**](docs/ExtensionsV1beta1Api.md#patchNamespacedDeploymentsScale) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/scale | 
*ExtensionsV1beta1Api* | [**patchNamespacedIngress**](docs/ExtensionsV1beta1Api.md#patchNamespacedIngress) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name} | 
*ExtensionsV1beta1Api* | [**patchNamespacedIngressStatus**](docs/ExtensionsV1beta1Api.md#patchNamespacedIngressStatus) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name}/status | 
*ExtensionsV1beta1Api* | [**patchNamespacedNetworkPolicy**](docs/ExtensionsV1beta1Api.md#patchNamespacedNetworkPolicy) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies/{name} | 
*ExtensionsV1beta1Api* | [**patchNamespacedReplicaSet**](docs/ExtensionsV1beta1Api.md#patchNamespacedReplicaSet) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name} | 
*ExtensionsV1beta1Api* | [**patchNamespacedReplicaSetStatus**](docs/ExtensionsV1beta1Api.md#patchNamespacedReplicaSetStatus) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/status | 
*ExtensionsV1beta1Api* | [**patchNamespacedReplicasetsScale**](docs/ExtensionsV1beta1Api.md#patchNamespacedReplicasetsScale) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/scale | 
*ExtensionsV1beta1Api* | [**patchNamespacedReplicationcontrollersScale**](docs/ExtensionsV1beta1Api.md#patchNamespacedReplicationcontrollersScale) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/replicationcontrollers/{name}/scale | 
*ExtensionsV1beta1Api* | [**patchPodSecurityPolicy**](docs/ExtensionsV1beta1Api.md#patchPodSecurityPolicy) | **PATCH** /apis/extensions/v1beta1/podsecuritypolicies/{name} | 
*ExtensionsV1beta1Api* | [**patchThirdPartyResource**](docs/ExtensionsV1beta1Api.md#patchThirdPartyResource) | **PATCH** /apis/extensions/v1beta1/thirdpartyresources/{name} | 
*ExtensionsV1beta1Api* | [**readNamespacedDaemonSet**](docs/ExtensionsV1beta1Api.md#readNamespacedDaemonSet) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name} | 
*ExtensionsV1beta1Api* | [**readNamespacedDaemonSetStatus**](docs/ExtensionsV1beta1Api.md#readNamespacedDaemonSetStatus) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name}/status | 
*ExtensionsV1beta1Api* | [**readNamespacedDeployment**](docs/ExtensionsV1beta1Api.md#readNamespacedDeployment) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name} | 
*ExtensionsV1beta1Api* | [**readNamespacedDeploymentStatus**](docs/ExtensionsV1beta1Api.md#readNamespacedDeploymentStatus) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/status | 
*ExtensionsV1beta1Api* | [**readNamespacedDeploymentsScale**](docs/ExtensionsV1beta1Api.md#readNamespacedDeploymentsScale) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/scale | 
*ExtensionsV1beta1Api* | [**readNamespacedIngress**](docs/ExtensionsV1beta1Api.md#readNamespacedIngress) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name} | 
*ExtensionsV1beta1Api* | [**readNamespacedIngressStatus**](docs/ExtensionsV1beta1Api.md#readNamespacedIngressStatus) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name}/status | 
*ExtensionsV1beta1Api* | [**readNamespacedNetworkPolicy**](docs/ExtensionsV1beta1Api.md#readNamespacedNetworkPolicy) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies/{name} | 
*ExtensionsV1beta1Api* | [**readNamespacedReplicaSet**](docs/ExtensionsV1beta1Api.md#readNamespacedReplicaSet) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name} | 
*ExtensionsV1beta1Api* | [**readNamespacedReplicaSetStatus**](docs/ExtensionsV1beta1Api.md#readNamespacedReplicaSetStatus) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/status | 
*ExtensionsV1beta1Api* | [**readNamespacedReplicasetsScale**](docs/ExtensionsV1beta1Api.md#readNamespacedReplicasetsScale) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/scale | 
*ExtensionsV1beta1Api* | [**readNamespacedReplicationcontrollersScale**](docs/ExtensionsV1beta1Api.md#readNamespacedReplicationcontrollersScale) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/replicationcontrollers/{name}/scale | 
*ExtensionsV1beta1Api* | [**readPodSecurityPolicy**](docs/ExtensionsV1beta1Api.md#readPodSecurityPolicy) | **GET** /apis/extensions/v1beta1/podsecuritypolicies/{name} | 
*ExtensionsV1beta1Api* | [**readThirdPartyResource**](docs/ExtensionsV1beta1Api.md#readThirdPartyResource) | **GET** /apis/extensions/v1beta1/thirdpartyresources/{name} | 
*ExtensionsV1beta1Api* | [**replaceNamespacedDaemonSet**](docs/ExtensionsV1beta1Api.md#replaceNamespacedDaemonSet) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name} | 
*ExtensionsV1beta1Api* | [**replaceNamespacedDaemonSetStatus**](docs/ExtensionsV1beta1Api.md#replaceNamespacedDaemonSetStatus) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name}/status | 
*ExtensionsV1beta1Api* | [**replaceNamespacedDeployment**](docs/ExtensionsV1beta1Api.md#replaceNamespacedDeployment) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name} | 
*ExtensionsV1beta1Api* | [**replaceNamespacedDeploymentStatus**](docs/ExtensionsV1beta1Api.md#replaceNamespacedDeploymentStatus) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/status | 
*ExtensionsV1beta1Api* | [**replaceNamespacedDeploymentsScale**](docs/ExtensionsV1beta1Api.md#replaceNamespacedDeploymentsScale) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/scale | 
*ExtensionsV1beta1Api* | [**replaceNamespacedIngress**](docs/ExtensionsV1beta1Api.md#replaceNamespacedIngress) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name} | 
*ExtensionsV1beta1Api* | [**replaceNamespacedIngressStatus**](docs/ExtensionsV1beta1Api.md#replaceNamespacedIngressStatus) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name}/status | 
*ExtensionsV1beta1Api* | [**replaceNamespacedNetworkPolicy**](docs/ExtensionsV1beta1Api.md#replaceNamespacedNetworkPolicy) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies/{name} | 
*ExtensionsV1beta1Api* | [**replaceNamespacedReplicaSet**](docs/ExtensionsV1beta1Api.md#replaceNamespacedReplicaSet) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name} | 
*ExtensionsV1beta1Api* | [**replaceNamespacedReplicaSetStatus**](docs/ExtensionsV1beta1Api.md#replaceNamespacedReplicaSetStatus) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/status | 
*ExtensionsV1beta1Api* | [**replaceNamespacedReplicasetsScale**](docs/ExtensionsV1beta1Api.md#replaceNamespacedReplicasetsScale) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/scale | 
*ExtensionsV1beta1Api* | [**replaceNamespacedReplicationcontrollersScale**](docs/ExtensionsV1beta1Api.md#replaceNamespacedReplicationcontrollersScale) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/replicationcontrollers/{name}/scale | 
*ExtensionsV1beta1Api* | [**replacePodSecurityPolicy**](docs/ExtensionsV1beta1Api.md#replacePodSecurityPolicy) | **PUT** /apis/extensions/v1beta1/podsecuritypolicies/{name} | 
*ExtensionsV1beta1Api* | [**replaceThirdPartyResource**](docs/ExtensionsV1beta1Api.md#replaceThirdPartyResource) | **PUT** /apis/extensions/v1beta1/thirdpartyresources/{name} | 
*LogsApi* | [**logFileHandler**](docs/LogsApi.md#logFileHandler) | **GET** /logs/{logpath} | 
*LogsApi* | [**logFileListHandler**](docs/LogsApi.md#logFileListHandler) | **GET** /logs/ | 
*PolicyApi* | [**getAPIGroup**](docs/PolicyApi.md#getAPIGroup) | **GET** /apis/policy/ | 
*PolicyV1beta1Api* | [**createNamespacedPodDisruptionBudget**](docs/PolicyV1beta1Api.md#createNamespacedPodDisruptionBudget) | **POST** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets | 
*PolicyV1beta1Api* | [**deleteCollectionNamespacedPodDisruptionBudget**](docs/PolicyV1beta1Api.md#deleteCollectionNamespacedPodDisruptionBudget) | **DELETE** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets | 
*PolicyV1beta1Api* | [**deleteNamespacedPodDisruptionBudget**](docs/PolicyV1beta1Api.md#deleteNamespacedPodDisruptionBudget) | **DELETE** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name} | 
*PolicyV1beta1Api* | [**getAPIResources**](docs/PolicyV1beta1Api.md#getAPIResources) | **GET** /apis/policy/v1beta1/ | 
*PolicyV1beta1Api* | [**listNamespacedPodDisruptionBudget**](docs/PolicyV1beta1Api.md#listNamespacedPodDisruptionBudget) | **GET** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets | 
*PolicyV1beta1Api* | [**listPodDisruptionBudgetForAllNamespaces**](docs/PolicyV1beta1Api.md#listPodDisruptionBudgetForAllNamespaces) | **GET** /apis/policy/v1beta1/poddisruptionbudgets | 
*PolicyV1beta1Api* | [**patchNamespacedPodDisruptionBudget**](docs/PolicyV1beta1Api.md#patchNamespacedPodDisruptionBudget) | **PATCH** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name} | 
*PolicyV1beta1Api* | [**patchNamespacedPodDisruptionBudgetStatus**](docs/PolicyV1beta1Api.md#patchNamespacedPodDisruptionBudgetStatus) | **PATCH** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name}/status | 
*PolicyV1beta1Api* | [**readNamespacedPodDisruptionBudget**](docs/PolicyV1beta1Api.md#readNamespacedPodDisruptionBudget) | **GET** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name} | 
*PolicyV1beta1Api* | [**readNamespacedPodDisruptionBudgetStatus**](docs/PolicyV1beta1Api.md#readNamespacedPodDisruptionBudgetStatus) | **GET** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name}/status | 
*PolicyV1beta1Api* | [**replaceNamespacedPodDisruptionBudget**](docs/PolicyV1beta1Api.md#replaceNamespacedPodDisruptionBudget) | **PUT** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name} | 
*PolicyV1beta1Api* | [**replaceNamespacedPodDisruptionBudgetStatus**](docs/PolicyV1beta1Api.md#replaceNamespacedPodDisruptionBudgetStatus) | **PUT** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name}/status | 
*RbacAuthorizationApi* | [**getAPIGroup**](docs/RbacAuthorizationApi.md#getAPIGroup) | **GET** /apis/rbac.authorization.k8s.io/ | 
*RbacAuthorizationV1alpha1Api* | [**createClusterRole**](docs/RbacAuthorizationV1alpha1Api.md#createClusterRole) | **POST** /apis/rbac.authorization.k8s.io/v1alpha1/clusterroles | 
*RbacAuthorizationV1alpha1Api* | [**createClusterRoleBinding**](docs/RbacAuthorizationV1alpha1Api.md#createClusterRoleBinding) | **POST** /apis/rbac.authorization.k8s.io/v1alpha1/clusterrolebindings | 
*RbacAuthorizationV1alpha1Api* | [**createNamespacedRole**](docs/RbacAuthorizationV1alpha1Api.md#createNamespacedRole) | **POST** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/roles | 
*RbacAuthorizationV1alpha1Api* | [**createNamespacedRoleBinding**](docs/RbacAuthorizationV1alpha1Api.md#createNamespacedRoleBinding) | **POST** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/rolebindings | 
*RbacAuthorizationV1alpha1Api* | [**deleteClusterRole**](docs/RbacAuthorizationV1alpha1Api.md#deleteClusterRole) | **DELETE** /apis/rbac.authorization.k8s.io/v1alpha1/clusterroles/{name} | 
*RbacAuthorizationV1alpha1Api* | [**deleteClusterRoleBinding**](docs/RbacAuthorizationV1alpha1Api.md#deleteClusterRoleBinding) | **DELETE** /apis/rbac.authorization.k8s.io/v1alpha1/clusterrolebindings/{name} | 
*RbacAuthorizationV1alpha1Api* | [**deleteCollectionClusterRole**](docs/RbacAuthorizationV1alpha1Api.md#deleteCollectionClusterRole) | **DELETE** /apis/rbac.authorization.k8s.io/v1alpha1/clusterroles | 
*RbacAuthorizationV1alpha1Api* | [**deleteCollectionClusterRoleBinding**](docs/RbacAuthorizationV1alpha1Api.md#deleteCollectionClusterRoleBinding) | **DELETE** /apis/rbac.authorization.k8s.io/v1alpha1/clusterrolebindings | 
*RbacAuthorizationV1alpha1Api* | [**deleteCollectionNamespacedRole**](docs/RbacAuthorizationV1alpha1Api.md#deleteCollectionNamespacedRole) | **DELETE** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/roles | 
*RbacAuthorizationV1alpha1Api* | [**deleteCollectionNamespacedRoleBinding**](docs/RbacAuthorizationV1alpha1Api.md#deleteCollectionNamespacedRoleBinding) | **DELETE** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/rolebindings | 
*RbacAuthorizationV1alpha1Api* | [**deleteNamespacedRole**](docs/RbacAuthorizationV1alpha1Api.md#deleteNamespacedRole) | **DELETE** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/roles/{name} | 
*RbacAuthorizationV1alpha1Api* | [**deleteNamespacedRoleBinding**](docs/RbacAuthorizationV1alpha1Api.md#deleteNamespacedRoleBinding) | **DELETE** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/rolebindings/{name} | 
*RbacAuthorizationV1alpha1Api* | [**getAPIResources**](docs/RbacAuthorizationV1alpha1Api.md#getAPIResources) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/ | 
*RbacAuthorizationV1alpha1Api* | [**listClusterRole**](docs/RbacAuthorizationV1alpha1Api.md#listClusterRole) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/clusterroles | 
*RbacAuthorizationV1alpha1Api* | [**listClusterRoleBinding**](docs/RbacAuthorizationV1alpha1Api.md#listClusterRoleBinding) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/clusterrolebindings | 
*RbacAuthorizationV1alpha1Api* | [**listNamespacedRole**](docs/RbacAuthorizationV1alpha1Api.md#listNamespacedRole) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/roles | 
*RbacAuthorizationV1alpha1Api* | [**listNamespacedRoleBinding**](docs/RbacAuthorizationV1alpha1Api.md#listNamespacedRoleBinding) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/rolebindings | 
*RbacAuthorizationV1alpha1Api* | [**listRoleBindingForAllNamespaces**](docs/RbacAuthorizationV1alpha1Api.md#listRoleBindingForAllNamespaces) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/rolebindings | 
*RbacAuthorizationV1alpha1Api* | [**listRoleForAllNamespaces**](docs/RbacAuthorizationV1alpha1Api.md#listRoleForAllNamespaces) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/roles | 
*RbacAuthorizationV1alpha1Api* | [**patchClusterRole**](docs/RbacAuthorizationV1alpha1Api.md#patchClusterRole) | **PATCH** /apis/rbac.authorization.k8s.io/v1alpha1/clusterroles/{name} | 
*RbacAuthorizationV1alpha1Api* | [**patchClusterRoleBinding**](docs/RbacAuthorizationV1alpha1Api.md#patchClusterRoleBinding) | **PATCH** /apis/rbac.authorization.k8s.io/v1alpha1/clusterrolebindings/{name} | 
*RbacAuthorizationV1alpha1Api* | [**patchNamespacedRole**](docs/RbacAuthorizationV1alpha1Api.md#patchNamespacedRole) | **PATCH** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/roles/{name} | 
*RbacAuthorizationV1alpha1Api* | [**patchNamespacedRoleBinding**](docs/RbacAuthorizationV1alpha1Api.md#patchNamespacedRoleBinding) | **PATCH** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/rolebindings/{name} | 
*RbacAuthorizationV1alpha1Api* | [**readClusterRole**](docs/RbacAuthorizationV1alpha1Api.md#readClusterRole) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/clusterroles/{name} | 
*RbacAuthorizationV1alpha1Api* | [**readClusterRoleBinding**](docs/RbacAuthorizationV1alpha1Api.md#readClusterRoleBinding) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/clusterrolebindings/{name} | 
*RbacAuthorizationV1alpha1Api* | [**readNamespacedRole**](docs/RbacAuthorizationV1alpha1Api.md#readNamespacedRole) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/roles/{name} | 
*RbacAuthorizationV1alpha1Api* | [**readNamespacedRoleBinding**](docs/RbacAuthorizationV1alpha1Api.md#readNamespacedRoleBinding) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/rolebindings/{name} | 
*RbacAuthorizationV1alpha1Api* | [**replaceClusterRole**](docs/RbacAuthorizationV1alpha1Api.md#replaceClusterRole) | **PUT** /apis/rbac.authorization.k8s.io/v1alpha1/clusterroles/{name} | 
*RbacAuthorizationV1alpha1Api* | [**replaceClusterRoleBinding**](docs/RbacAuthorizationV1alpha1Api.md#replaceClusterRoleBinding) | **PUT** /apis/rbac.authorization.k8s.io/v1alpha1/clusterrolebindings/{name} | 
*RbacAuthorizationV1alpha1Api* | [**replaceNamespacedRole**](docs/RbacAuthorizationV1alpha1Api.md#replaceNamespacedRole) | **PUT** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/roles/{name} | 
*RbacAuthorizationV1alpha1Api* | [**replaceNamespacedRoleBinding**](docs/RbacAuthorizationV1alpha1Api.md#replaceNamespacedRoleBinding) | **PUT** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/rolebindings/{name} | 
*RbacAuthorizationV1beta1Api* | [**createClusterRole**](docs/RbacAuthorizationV1beta1Api.md#createClusterRole) | **POST** /apis/rbac.authorization.k8s.io/v1beta1/clusterroles | 
*RbacAuthorizationV1beta1Api* | [**createClusterRoleBinding**](docs/RbacAuthorizationV1beta1Api.md#createClusterRoleBinding) | **POST** /apis/rbac.authorization.k8s.io/v1beta1/clusterrolebindings | 
*RbacAuthorizationV1beta1Api* | [**createNamespacedRole**](docs/RbacAuthorizationV1beta1Api.md#createNamespacedRole) | **POST** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/roles | 
*RbacAuthorizationV1beta1Api* | [**createNamespacedRoleBinding**](docs/RbacAuthorizationV1beta1Api.md#createNamespacedRoleBinding) | **POST** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/rolebindings | 
*RbacAuthorizationV1beta1Api* | [**deleteClusterRole**](docs/RbacAuthorizationV1beta1Api.md#deleteClusterRole) | **DELETE** /apis/rbac.authorization.k8s.io/v1beta1/clusterroles/{name} | 
*RbacAuthorizationV1beta1Api* | [**deleteClusterRoleBinding**](docs/RbacAuthorizationV1beta1Api.md#deleteClusterRoleBinding) | **DELETE** /apis/rbac.authorization.k8s.io/v1beta1/clusterrolebindings/{name} | 
*RbacAuthorizationV1beta1Api* | [**deleteCollectionClusterRole**](docs/RbacAuthorizationV1beta1Api.md#deleteCollectionClusterRole) | **DELETE** /apis/rbac.authorization.k8s.io/v1beta1/clusterroles | 
*RbacAuthorizationV1beta1Api* | [**deleteCollectionClusterRoleBinding**](docs/RbacAuthorizationV1beta1Api.md#deleteCollectionClusterRoleBinding) | **DELETE** /apis/rbac.authorization.k8s.io/v1beta1/clusterrolebindings | 
*RbacAuthorizationV1beta1Api* | [**deleteCollectionNamespacedRole**](docs/RbacAuthorizationV1beta1Api.md#deleteCollectionNamespacedRole) | **DELETE** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/roles | 
*RbacAuthorizationV1beta1Api* | [**deleteCollectionNamespacedRoleBinding**](docs/RbacAuthorizationV1beta1Api.md#deleteCollectionNamespacedRoleBinding) | **DELETE** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/rolebindings | 
*RbacAuthorizationV1beta1Api* | [**deleteNamespacedRole**](docs/RbacAuthorizationV1beta1Api.md#deleteNamespacedRole) | **DELETE** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/roles/{name} | 
*RbacAuthorizationV1beta1Api* | [**deleteNamespacedRoleBinding**](docs/RbacAuthorizationV1beta1Api.md#deleteNamespacedRoleBinding) | **DELETE** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/rolebindings/{name} | 
*RbacAuthorizationV1beta1Api* | [**getAPIResources**](docs/RbacAuthorizationV1beta1Api.md#getAPIResources) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/ | 
*RbacAuthorizationV1beta1Api* | [**listClusterRole**](docs/RbacAuthorizationV1beta1Api.md#listClusterRole) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/clusterroles | 
*RbacAuthorizationV1beta1Api* | [**listClusterRoleBinding**](docs/RbacAuthorizationV1beta1Api.md#listClusterRoleBinding) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/clusterrolebindings | 
*RbacAuthorizationV1beta1Api* | [**listNamespacedRole**](docs/RbacAuthorizationV1beta1Api.md#listNamespacedRole) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/roles | 
*RbacAuthorizationV1beta1Api* | [**listNamespacedRoleBinding**](docs/RbacAuthorizationV1beta1Api.md#listNamespacedRoleBinding) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/rolebindings | 
*RbacAuthorizationV1beta1Api* | [**listRoleBindingForAllNamespaces**](docs/RbacAuthorizationV1beta1Api.md#listRoleBindingForAllNamespaces) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/rolebindings | 
*RbacAuthorizationV1beta1Api* | [**listRoleForAllNamespaces**](docs/RbacAuthorizationV1beta1Api.md#listRoleForAllNamespaces) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/roles | 
*RbacAuthorizationV1beta1Api* | [**patchClusterRole**](docs/RbacAuthorizationV1beta1Api.md#patchClusterRole) | **PATCH** /apis/rbac.authorization.k8s.io/v1beta1/clusterroles/{name} | 
*RbacAuthorizationV1beta1Api* | [**patchClusterRoleBinding**](docs/RbacAuthorizationV1beta1Api.md#patchClusterRoleBinding) | **PATCH** /apis/rbac.authorization.k8s.io/v1beta1/clusterrolebindings/{name} | 
*RbacAuthorizationV1beta1Api* | [**patchNamespacedRole**](docs/RbacAuthorizationV1beta1Api.md#patchNamespacedRole) | **PATCH** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/roles/{name} | 
*RbacAuthorizationV1beta1Api* | [**patchNamespacedRoleBinding**](docs/RbacAuthorizationV1beta1Api.md#patchNamespacedRoleBinding) | **PATCH** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/rolebindings/{name} | 
*RbacAuthorizationV1beta1Api* | [**readClusterRole**](docs/RbacAuthorizationV1beta1Api.md#readClusterRole) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/clusterroles/{name} | 
*RbacAuthorizationV1beta1Api* | [**readClusterRoleBinding**](docs/RbacAuthorizationV1beta1Api.md#readClusterRoleBinding) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/clusterrolebindings/{name} | 
*RbacAuthorizationV1beta1Api* | [**readNamespacedRole**](docs/RbacAuthorizationV1beta1Api.md#readNamespacedRole) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/roles/{name} | 
*RbacAuthorizationV1beta1Api* | [**readNamespacedRoleBinding**](docs/RbacAuthorizationV1beta1Api.md#readNamespacedRoleBinding) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/rolebindings/{name} | 
*RbacAuthorizationV1beta1Api* | [**replaceClusterRole**](docs/RbacAuthorizationV1beta1Api.md#replaceClusterRole) | **PUT** /apis/rbac.authorization.k8s.io/v1beta1/clusterroles/{name} | 
*RbacAuthorizationV1beta1Api* | [**replaceClusterRoleBinding**](docs/RbacAuthorizationV1beta1Api.md#replaceClusterRoleBinding) | **PUT** /apis/rbac.authorization.k8s.io/v1beta1/clusterrolebindings/{name} | 
*RbacAuthorizationV1beta1Api* | [**replaceNamespacedRole**](docs/RbacAuthorizationV1beta1Api.md#replaceNamespacedRole) | **PUT** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/roles/{name} | 
*RbacAuthorizationV1beta1Api* | [**replaceNamespacedRoleBinding**](docs/RbacAuthorizationV1beta1Api.md#replaceNamespacedRoleBinding) | **PUT** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/rolebindings/{name} | 
*SettingsApi* | [**getAPIGroup**](docs/SettingsApi.md#getAPIGroup) | **GET** /apis/settings.k8s.io/ | 
*SettingsV1alpha1Api* | [**createNamespacedPodPreset**](docs/SettingsV1alpha1Api.md#createNamespacedPodPreset) | **POST** /apis/settings.k8s.io/v1alpha1/namespaces/{namespace}/podpresets | 
*SettingsV1alpha1Api* | [**deleteCollectionNamespacedPodPreset**](docs/SettingsV1alpha1Api.md#deleteCollectionNamespacedPodPreset) | **DELETE** /apis/settings.k8s.io/v1alpha1/namespaces/{namespace}/podpresets | 
*SettingsV1alpha1Api* | [**deleteNamespacedPodPreset**](docs/SettingsV1alpha1Api.md#deleteNamespacedPodPreset) | **DELETE** /apis/settings.k8s.io/v1alpha1/namespaces/{namespace}/podpresets/{name} | 
*SettingsV1alpha1Api* | [**getAPIResources**](docs/SettingsV1alpha1Api.md#getAPIResources) | **GET** /apis/settings.k8s.io/v1alpha1/ | 
*SettingsV1alpha1Api* | [**listNamespacedPodPreset**](docs/SettingsV1alpha1Api.md#listNamespacedPodPreset) | **GET** /apis/settings.k8s.io/v1alpha1/namespaces/{namespace}/podpresets | 
*SettingsV1alpha1Api* | [**listPodPresetForAllNamespaces**](docs/SettingsV1alpha1Api.md#listPodPresetForAllNamespaces) | **GET** /apis/settings.k8s.io/v1alpha1/podpresets | 
*SettingsV1alpha1Api* | [**patchNamespacedPodPreset**](docs/SettingsV1alpha1Api.md#patchNamespacedPodPreset) | **PATCH** /apis/settings.k8s.io/v1alpha1/namespaces/{namespace}/podpresets/{name} | 
*SettingsV1alpha1Api* | [**readNamespacedPodPreset**](docs/SettingsV1alpha1Api.md#readNamespacedPodPreset) | **GET** /apis/settings.k8s.io/v1alpha1/namespaces/{namespace}/podpresets/{name} | 
*SettingsV1alpha1Api* | [**replaceNamespacedPodPreset**](docs/SettingsV1alpha1Api.md#replaceNamespacedPodPreset) | **PUT** /apis/settings.k8s.io/v1alpha1/namespaces/{namespace}/podpresets/{name} | 
*StorageApi* | [**getAPIGroup**](docs/StorageApi.md#getAPIGroup) | **GET** /apis/storage.k8s.io/ | 
*StorageV1Api* | [**createStorageClass**](docs/StorageV1Api.md#createStorageClass) | **POST** /apis/storage.k8s.io/v1/storageclasses | 
*StorageV1Api* | [**deleteCollectionStorageClass**](docs/StorageV1Api.md#deleteCollectionStorageClass) | **DELETE** /apis/storage.k8s.io/v1/storageclasses | 
*StorageV1Api* | [**deleteStorageClass**](docs/StorageV1Api.md#deleteStorageClass) | **DELETE** /apis/storage.k8s.io/v1/storageclasses/{name} | 
*StorageV1Api* | [**getAPIResources**](docs/StorageV1Api.md#getAPIResources) | **GET** /apis/storage.k8s.io/v1/ | 
*StorageV1Api* | [**listStorageClass**](docs/StorageV1Api.md#listStorageClass) | **GET** /apis/storage.k8s.io/v1/storageclasses | 
*StorageV1Api* | [**patchStorageClass**](docs/StorageV1Api.md#patchStorageClass) | **PATCH** /apis/storage.k8s.io/v1/storageclasses/{name} | 
*StorageV1Api* | [**readStorageClass**](docs/StorageV1Api.md#readStorageClass) | **GET** /apis/storage.k8s.io/v1/storageclasses/{name} | 
*StorageV1Api* | [**replaceStorageClass**](docs/StorageV1Api.md#replaceStorageClass) | **PUT** /apis/storage.k8s.io/v1/storageclasses/{name} | 
*StorageV1beta1Api* | [**createStorageClass**](docs/StorageV1beta1Api.md#createStorageClass) | **POST** /apis/storage.k8s.io/v1beta1/storageclasses | 
*StorageV1beta1Api* | [**deleteCollectionStorageClass**](docs/StorageV1beta1Api.md#deleteCollectionStorageClass) | **DELETE** /apis/storage.k8s.io/v1beta1/storageclasses | 
*StorageV1beta1Api* | [**deleteStorageClass**](docs/StorageV1beta1Api.md#deleteStorageClass) | **DELETE** /apis/storage.k8s.io/v1beta1/storageclasses/{name} | 
*StorageV1beta1Api* | [**getAPIResources**](docs/StorageV1beta1Api.md#getAPIResources) | **GET** /apis/storage.k8s.io/v1beta1/ | 
*StorageV1beta1Api* | [**listStorageClass**](docs/StorageV1beta1Api.md#listStorageClass) | **GET** /apis/storage.k8s.io/v1beta1/storageclasses | 
*StorageV1beta1Api* | [**patchStorageClass**](docs/StorageV1beta1Api.md#patchStorageClass) | **PATCH** /apis/storage.k8s.io/v1beta1/storageclasses/{name} | 
*StorageV1beta1Api* | [**readStorageClass**](docs/StorageV1beta1Api.md#readStorageClass) | **GET** /apis/storage.k8s.io/v1beta1/storageclasses/{name} | 
*StorageV1beta1Api* | [**replaceStorageClass**](docs/StorageV1beta1Api.md#replaceStorageClass) | **PUT** /apis/storage.k8s.io/v1beta1/storageclasses/{name} | 
*VersionApi* | [**getCode**](docs/VersionApi.md#getCode) | **GET** /version/ | 


## Documentation for Models

 - [AppsV1beta1Deployment](docs/AppsV1beta1Deployment.md)
 - [AppsV1beta1DeploymentCondition](docs/AppsV1beta1DeploymentCondition.md)
 - [AppsV1beta1DeploymentList](docs/AppsV1beta1DeploymentList.md)
 - [AppsV1beta1DeploymentRollback](docs/AppsV1beta1DeploymentRollback.md)
 - [AppsV1beta1DeploymentSpec](docs/AppsV1beta1DeploymentSpec.md)
 - [AppsV1beta1DeploymentStatus](docs/AppsV1beta1DeploymentStatus.md)
 - [AppsV1beta1DeploymentStrategy](docs/AppsV1beta1DeploymentStrategy.md)
 - [AppsV1beta1RollbackConfig](docs/AppsV1beta1RollbackConfig.md)
 - [AppsV1beta1RollingUpdateDeployment](docs/AppsV1beta1RollingUpdateDeployment.md)
 - [AppsV1beta1Scale](docs/AppsV1beta1Scale.md)
 - [AppsV1beta1ScaleSpec](docs/AppsV1beta1ScaleSpec.md)
 - [AppsV1beta1ScaleStatus](docs/AppsV1beta1ScaleStatus.md)
 - [ExtensionsV1beta1Deployment](docs/ExtensionsV1beta1Deployment.md)
 - [ExtensionsV1beta1DeploymentCondition](docs/ExtensionsV1beta1DeploymentCondition.md)
 - [ExtensionsV1beta1DeploymentList](docs/ExtensionsV1beta1DeploymentList.md)
 - [ExtensionsV1beta1DeploymentRollback](docs/ExtensionsV1beta1DeploymentRollback.md)
 - [ExtensionsV1beta1DeploymentSpec](docs/ExtensionsV1beta1DeploymentSpec.md)
 - [ExtensionsV1beta1DeploymentStatus](docs/ExtensionsV1beta1DeploymentStatus.md)
 - [ExtensionsV1beta1DeploymentStrategy](docs/ExtensionsV1beta1DeploymentStrategy.md)
 - [ExtensionsV1beta1RollbackConfig](docs/ExtensionsV1beta1RollbackConfig.md)
 - [ExtensionsV1beta1RollingUpdateDeployment](docs/ExtensionsV1beta1RollingUpdateDeployment.md)
 - [ExtensionsV1beta1Scale](docs/ExtensionsV1beta1Scale.md)
 - [ExtensionsV1beta1ScaleSpec](docs/ExtensionsV1beta1ScaleSpec.md)
 - [ExtensionsV1beta1ScaleStatus](docs/ExtensionsV1beta1ScaleStatus.md)
 - [RuntimeRawExtension](docs/RuntimeRawExtension.md)
 - [V1APIGroup](docs/V1APIGroup.md)
 - [V1APIGroupList](docs/V1APIGroupList.md)
 - [V1APIResource](docs/V1APIResource.md)
 - [V1APIResourceList](docs/V1APIResourceList.md)
 - [V1APIVersions](docs/V1APIVersions.md)
 - [V1AWSElasticBlockStoreVolumeSource](docs/V1AWSElasticBlockStoreVolumeSource.md)
 - [V1Affinity](docs/V1Affinity.md)
 - [V1AttachedVolume](docs/V1AttachedVolume.md)
 - [V1AzureDiskVolumeSource](docs/V1AzureDiskVolumeSource.md)
 - [V1AzureFileVolumeSource](docs/V1AzureFileVolumeSource.md)
 - [V1Binding](docs/V1Binding.md)
 - [V1Capabilities](docs/V1Capabilities.md)
 - [V1CephFSVolumeSource](docs/V1CephFSVolumeSource.md)
 - [V1CinderVolumeSource](docs/V1CinderVolumeSource.md)
 - [V1ComponentCondition](docs/V1ComponentCondition.md)
 - [V1ComponentStatus](docs/V1ComponentStatus.md)
 - [V1ComponentStatusList](docs/V1ComponentStatusList.md)
 - [V1ConfigMap](docs/V1ConfigMap.md)
 - [V1ConfigMapEnvSource](docs/V1ConfigMapEnvSource.md)
 - [V1ConfigMapKeySelector](docs/V1ConfigMapKeySelector.md)
 - [V1ConfigMapList](docs/V1ConfigMapList.md)
 - [V1ConfigMapProjection](docs/V1ConfigMapProjection.md)
 - [V1ConfigMapVolumeSource](docs/V1ConfigMapVolumeSource.md)
 - [V1Container](docs/V1Container.md)
 - [V1ContainerImage](docs/V1ContainerImage.md)
 - [V1ContainerPort](docs/V1ContainerPort.md)
 - [V1ContainerState](docs/V1ContainerState.md)
 - [V1ContainerStateRunning](docs/V1ContainerStateRunning.md)
 - [V1ContainerStateTerminated](docs/V1ContainerStateTerminated.md)
 - [V1ContainerStateWaiting](docs/V1ContainerStateWaiting.md)
 - [V1ContainerStatus](docs/V1ContainerStatus.md)
 - [V1CrossVersionObjectReference](docs/V1CrossVersionObjectReference.md)
 - [V1DaemonEndpoint](docs/V1DaemonEndpoint.md)
 - [V1DeleteOptions](docs/V1DeleteOptions.md)
 - [V1DownwardAPIProjection](docs/V1DownwardAPIProjection.md)
 - [V1DownwardAPIVolumeFile](docs/V1DownwardAPIVolumeFile.md)
 - [V1DownwardAPIVolumeSource](docs/V1DownwardAPIVolumeSource.md)
 - [V1EmptyDirVolumeSource](docs/V1EmptyDirVolumeSource.md)
 - [V1EndpointAddress](docs/V1EndpointAddress.md)
 - [V1EndpointPort](docs/V1EndpointPort.md)
 - [V1EndpointSubset](docs/V1EndpointSubset.md)
 - [V1Endpoints](docs/V1Endpoints.md)
 - [V1EndpointsList](docs/V1EndpointsList.md)
 - [V1EnvFromSource](docs/V1EnvFromSource.md)
 - [V1EnvVar](docs/V1EnvVar.md)
 - [V1EnvVarSource](docs/V1EnvVarSource.md)
 - [V1Event](docs/V1Event.md)
 - [V1EventList](docs/V1EventList.md)
 - [V1EventSource](docs/V1EventSource.md)
 - [V1ExecAction](docs/V1ExecAction.md)
 - [V1FCVolumeSource](docs/V1FCVolumeSource.md)
 - [V1FlexVolumeSource](docs/V1FlexVolumeSource.md)
 - [V1FlockerVolumeSource](docs/V1FlockerVolumeSource.md)
 - [V1GCEPersistentDiskVolumeSource](docs/V1GCEPersistentDiskVolumeSource.md)
 - [V1GitRepoVolumeSource](docs/V1GitRepoVolumeSource.md)
 - [V1GlusterfsVolumeSource](docs/V1GlusterfsVolumeSource.md)
 - [V1GroupVersionForDiscovery](docs/V1GroupVersionForDiscovery.md)
 - [V1HTTPGetAction](docs/V1HTTPGetAction.md)
 - [V1HTTPHeader](docs/V1HTTPHeader.md)
 - [V1Handler](docs/V1Handler.md)
 - [V1HorizontalPodAutoscaler](docs/V1HorizontalPodAutoscaler.md)
 - [V1HorizontalPodAutoscalerList](docs/V1HorizontalPodAutoscalerList.md)
 - [V1HorizontalPodAutoscalerSpec](docs/V1HorizontalPodAutoscalerSpec.md)
 - [V1HorizontalPodAutoscalerStatus](docs/V1HorizontalPodAutoscalerStatus.md)
 - [V1HostPathVolumeSource](docs/V1HostPathVolumeSource.md)
 - [V1ISCSIVolumeSource](docs/V1ISCSIVolumeSource.md)
 - [V1Job](docs/V1Job.md)
 - [V1JobCondition](docs/V1JobCondition.md)
 - [V1JobList](docs/V1JobList.md)
 - [V1JobSpec](docs/V1JobSpec.md)
 - [V1JobStatus](docs/V1JobStatus.md)
 - [V1KeyToPath](docs/V1KeyToPath.md)
 - [V1LabelSelector](docs/V1LabelSelector.md)
 - [V1LabelSelectorRequirement](docs/V1LabelSelectorRequirement.md)
 - [V1Lifecycle](docs/V1Lifecycle.md)
 - [V1LimitRange](docs/V1LimitRange.md)
 - [V1LimitRangeItem](docs/V1LimitRangeItem.md)
 - [V1LimitRangeList](docs/V1LimitRangeList.md)
 - [V1LimitRangeSpec](docs/V1LimitRangeSpec.md)
 - [V1ListMeta](docs/V1ListMeta.md)
 - [V1LoadBalancerIngress](docs/V1LoadBalancerIngress.md)
 - [V1LoadBalancerStatus](docs/V1LoadBalancerStatus.md)
 - [V1LocalObjectReference](docs/V1LocalObjectReference.md)
 - [V1LocalSubjectAccessReview](docs/V1LocalSubjectAccessReview.md)
 - [V1NFSVolumeSource](docs/V1NFSVolumeSource.md)
 - [V1Namespace](docs/V1Namespace.md)
 - [V1NamespaceList](docs/V1NamespaceList.md)
 - [V1NamespaceSpec](docs/V1NamespaceSpec.md)
 - [V1NamespaceStatus](docs/V1NamespaceStatus.md)
 - [V1Node](docs/V1Node.md)
 - [V1NodeAddress](docs/V1NodeAddress.md)
 - [V1NodeAffinity](docs/V1NodeAffinity.md)
 - [V1NodeCondition](docs/V1NodeCondition.md)
 - [V1NodeDaemonEndpoints](docs/V1NodeDaemonEndpoints.md)
 - [V1NodeList](docs/V1NodeList.md)
 - [V1NodeSelector](docs/V1NodeSelector.md)
 - [V1NodeSelectorRequirement](docs/V1NodeSelectorRequirement.md)
 - [V1NodeSelectorTerm](docs/V1NodeSelectorTerm.md)
 - [V1NodeSpec](docs/V1NodeSpec.md)
 - [V1NodeStatus](docs/V1NodeStatus.md)
 - [V1NodeSystemInfo](docs/V1NodeSystemInfo.md)
 - [V1NonResourceAttributes](docs/V1NonResourceAttributes.md)
 - [V1ObjectFieldSelector](docs/V1ObjectFieldSelector.md)
 - [V1ObjectMeta](docs/V1ObjectMeta.md)
 - [V1ObjectReference](docs/V1ObjectReference.md)
 - [V1OwnerReference](docs/V1OwnerReference.md)
 - [V1PersistentVolume](docs/V1PersistentVolume.md)
 - [V1PersistentVolumeClaim](docs/V1PersistentVolumeClaim.md)
 - [V1PersistentVolumeClaimList](docs/V1PersistentVolumeClaimList.md)
 - [V1PersistentVolumeClaimSpec](docs/V1PersistentVolumeClaimSpec.md)
 - [V1PersistentVolumeClaimStatus](docs/V1PersistentVolumeClaimStatus.md)
 - [V1PersistentVolumeClaimVolumeSource](docs/V1PersistentVolumeClaimVolumeSource.md)
 - [V1PersistentVolumeList](docs/V1PersistentVolumeList.md)
 - [V1PersistentVolumeSpec](docs/V1PersistentVolumeSpec.md)
 - [V1PersistentVolumeStatus](docs/V1PersistentVolumeStatus.md)
 - [V1PhotonPersistentDiskVolumeSource](docs/V1PhotonPersistentDiskVolumeSource.md)
 - [V1Pod](docs/V1Pod.md)
 - [V1PodAffinity](docs/V1PodAffinity.md)
 - [V1PodAffinityTerm](docs/V1PodAffinityTerm.md)
 - [V1PodAntiAffinity](docs/V1PodAntiAffinity.md)
 - [V1PodCondition](docs/V1PodCondition.md)
 - [V1PodList](docs/V1PodList.md)
 - [V1PodSecurityContext](docs/V1PodSecurityContext.md)
 - [V1PodSpec](docs/V1PodSpec.md)
 - [V1PodStatus](docs/V1PodStatus.md)
 - [V1PodTemplate](docs/V1PodTemplate.md)
 - [V1PodTemplateList](docs/V1PodTemplateList.md)
 - [V1PodTemplateSpec](docs/V1PodTemplateSpec.md)
 - [V1PortworxVolumeSource](docs/V1PortworxVolumeSource.md)
 - [V1Preconditions](docs/V1Preconditions.md)
 - [V1PreferredSchedulingTerm](docs/V1PreferredSchedulingTerm.md)
 - [V1Probe](docs/V1Probe.md)
 - [V1ProjectedVolumeSource](docs/V1ProjectedVolumeSource.md)
 - [V1QuobyteVolumeSource](docs/V1QuobyteVolumeSource.md)
 - [V1RBDVolumeSource](docs/V1RBDVolumeSource.md)
 - [V1ReplicationController](docs/V1ReplicationController.md)
 - [V1ReplicationControllerCondition](docs/V1ReplicationControllerCondition.md)
 - [V1ReplicationControllerList](docs/V1ReplicationControllerList.md)
 - [V1ReplicationControllerSpec](docs/V1ReplicationControllerSpec.md)
 - [V1ReplicationControllerStatus](docs/V1ReplicationControllerStatus.md)
 - [V1ResourceAttributes](docs/V1ResourceAttributes.md)
 - [V1ResourceFieldSelector](docs/V1ResourceFieldSelector.md)
 - [V1ResourceQuota](docs/V1ResourceQuota.md)
 - [V1ResourceQuotaList](docs/V1ResourceQuotaList.md)
 - [V1ResourceQuotaSpec](docs/V1ResourceQuotaSpec.md)
 - [V1ResourceQuotaStatus](docs/V1ResourceQuotaStatus.md)
 - [V1ResourceRequirements](docs/V1ResourceRequirements.md)
 - [V1SELinuxOptions](docs/V1SELinuxOptions.md)
 - [V1Scale](docs/V1Scale.md)
 - [V1ScaleIOVolumeSource](docs/V1ScaleIOVolumeSource.md)
 - [V1ScaleSpec](docs/V1ScaleSpec.md)
 - [V1ScaleStatus](docs/V1ScaleStatus.md)
 - [V1Secret](docs/V1Secret.md)
 - [V1SecretEnvSource](docs/V1SecretEnvSource.md)
 - [V1SecretKeySelector](docs/V1SecretKeySelector.md)
 - [V1SecretList](docs/V1SecretList.md)
 - [V1SecretProjection](docs/V1SecretProjection.md)
 - [V1SecretVolumeSource](docs/V1SecretVolumeSource.md)
 - [V1SecurityContext](docs/V1SecurityContext.md)
 - [V1SelfSubjectAccessReview](docs/V1SelfSubjectAccessReview.md)
 - [V1SelfSubjectAccessReviewSpec](docs/V1SelfSubjectAccessReviewSpec.md)
 - [V1ServerAddressByClientCIDR](docs/V1ServerAddressByClientCIDR.md)
 - [V1Service](docs/V1Service.md)
 - [V1ServiceAccount](docs/V1ServiceAccount.md)
 - [V1ServiceAccountList](docs/V1ServiceAccountList.md)
 - [V1ServiceList](docs/V1ServiceList.md)
 - [V1ServicePort](docs/V1ServicePort.md)
 - [V1ServiceSpec](docs/V1ServiceSpec.md)
 - [V1ServiceStatus](docs/V1ServiceStatus.md)
 - [V1Status](docs/V1Status.md)
 - [V1StatusCause](docs/V1StatusCause.md)
 - [V1StatusDetails](docs/V1StatusDetails.md)
 - [V1StorageClass](docs/V1StorageClass.md)
 - [V1StorageClassList](docs/V1StorageClassList.md)
 - [V1SubjectAccessReview](docs/V1SubjectAccessReview.md)
 - [V1SubjectAccessReviewSpec](docs/V1SubjectAccessReviewSpec.md)
 - [V1SubjectAccessReviewStatus](docs/V1SubjectAccessReviewStatus.md)
 - [V1TCPSocketAction](docs/V1TCPSocketAction.md)
 - [V1Taint](docs/V1Taint.md)
 - [V1TokenReview](docs/V1TokenReview.md)
 - [V1TokenReviewSpec](docs/V1TokenReviewSpec.md)
 - [V1TokenReviewStatus](docs/V1TokenReviewStatus.md)
 - [V1Toleration](docs/V1Toleration.md)
 - [V1UserInfo](docs/V1UserInfo.md)
 - [V1Volume](docs/V1Volume.md)
 - [V1VolumeMount](docs/V1VolumeMount.md)
 - [V1VolumeProjection](docs/V1VolumeProjection.md)
 - [V1VsphereVirtualDiskVolumeSource](docs/V1VsphereVirtualDiskVolumeSource.md)
 - [V1WatchEvent](docs/V1WatchEvent.md)
 - [V1WeightedPodAffinityTerm](docs/V1WeightedPodAffinityTerm.md)
 - [V1alpha1ClusterRole](docs/V1alpha1ClusterRole.md)
 - [V1alpha1ClusterRoleBinding](docs/V1alpha1ClusterRoleBinding.md)
 - [V1alpha1ClusterRoleBindingList](docs/V1alpha1ClusterRoleBindingList.md)
 - [V1alpha1ClusterRoleList](docs/V1alpha1ClusterRoleList.md)
 - [V1alpha1PodPreset](docs/V1alpha1PodPreset.md)
 - [V1alpha1PodPresetList](docs/V1alpha1PodPresetList.md)
 - [V1alpha1PodPresetSpec](docs/V1alpha1PodPresetSpec.md)
 - [V1alpha1PolicyRule](docs/V1alpha1PolicyRule.md)
 - [V1alpha1Role](docs/V1alpha1Role.md)
 - [V1alpha1RoleBinding](docs/V1alpha1RoleBinding.md)
 - [V1alpha1RoleBindingList](docs/V1alpha1RoleBindingList.md)
 - [V1alpha1RoleList](docs/V1alpha1RoleList.md)
 - [V1alpha1RoleRef](docs/V1alpha1RoleRef.md)
 - [V1alpha1Subject](docs/V1alpha1Subject.md)
 - [V1beta1APIVersion](docs/V1beta1APIVersion.md)
 - [V1beta1CertificateSigningRequest](docs/V1beta1CertificateSigningRequest.md)
 - [V1beta1CertificateSigningRequestCondition](docs/V1beta1CertificateSigningRequestCondition.md)
 - [V1beta1CertificateSigningRequestList](docs/V1beta1CertificateSigningRequestList.md)
 - [V1beta1CertificateSigningRequestSpec](docs/V1beta1CertificateSigningRequestSpec.md)
 - [V1beta1CertificateSigningRequestStatus](docs/V1beta1CertificateSigningRequestStatus.md)
 - [V1beta1ClusterRole](docs/V1beta1ClusterRole.md)
 - [V1beta1ClusterRoleBinding](docs/V1beta1ClusterRoleBinding.md)
 - [V1beta1ClusterRoleBindingList](docs/V1beta1ClusterRoleBindingList.md)
 - [V1beta1ClusterRoleList](docs/V1beta1ClusterRoleList.md)
 - [V1beta1DaemonSet](docs/V1beta1DaemonSet.md)
 - [V1beta1DaemonSetList](docs/V1beta1DaemonSetList.md)
 - [V1beta1DaemonSetSpec](docs/V1beta1DaemonSetSpec.md)
 - [V1beta1DaemonSetStatus](docs/V1beta1DaemonSetStatus.md)
 - [V1beta1DaemonSetUpdateStrategy](docs/V1beta1DaemonSetUpdateStrategy.md)
 - [V1beta1Eviction](docs/V1beta1Eviction.md)
 - [V1beta1FSGroupStrategyOptions](docs/V1beta1FSGroupStrategyOptions.md)
 - [V1beta1HTTPIngressPath](docs/V1beta1HTTPIngressPath.md)
 - [V1beta1HTTPIngressRuleValue](docs/V1beta1HTTPIngressRuleValue.md)
 - [V1beta1HostPortRange](docs/V1beta1HostPortRange.md)
 - [V1beta1IDRange](docs/V1beta1IDRange.md)
 - [V1beta1Ingress](docs/V1beta1Ingress.md)
 - [V1beta1IngressBackend](docs/V1beta1IngressBackend.md)
 - [V1beta1IngressList](docs/V1beta1IngressList.md)
 - [V1beta1IngressRule](docs/V1beta1IngressRule.md)
 - [V1beta1IngressSpec](docs/V1beta1IngressSpec.md)
 - [V1beta1IngressStatus](docs/V1beta1IngressStatus.md)
 - [V1beta1IngressTLS](docs/V1beta1IngressTLS.md)
 - [V1beta1LocalSubjectAccessReview](docs/V1beta1LocalSubjectAccessReview.md)
 - [V1beta1NetworkPolicy](docs/V1beta1NetworkPolicy.md)
 - [V1beta1NetworkPolicyIngressRule](docs/V1beta1NetworkPolicyIngressRule.md)
 - [V1beta1NetworkPolicyList](docs/V1beta1NetworkPolicyList.md)
 - [V1beta1NetworkPolicyPeer](docs/V1beta1NetworkPolicyPeer.md)
 - [V1beta1NetworkPolicyPort](docs/V1beta1NetworkPolicyPort.md)
 - [V1beta1NetworkPolicySpec](docs/V1beta1NetworkPolicySpec.md)
 - [V1beta1NonResourceAttributes](docs/V1beta1NonResourceAttributes.md)
 - [V1beta1PodDisruptionBudget](docs/V1beta1PodDisruptionBudget.md)
 - [V1beta1PodDisruptionBudgetList](docs/V1beta1PodDisruptionBudgetList.md)
 - [V1beta1PodDisruptionBudgetSpec](docs/V1beta1PodDisruptionBudgetSpec.md)
 - [V1beta1PodDisruptionBudgetStatus](docs/V1beta1PodDisruptionBudgetStatus.md)
 - [V1beta1PodSecurityPolicy](docs/V1beta1PodSecurityPolicy.md)
 - [V1beta1PodSecurityPolicyList](docs/V1beta1PodSecurityPolicyList.md)
 - [V1beta1PodSecurityPolicySpec](docs/V1beta1PodSecurityPolicySpec.md)
 - [V1beta1PolicyRule](docs/V1beta1PolicyRule.md)
 - [V1beta1ReplicaSet](docs/V1beta1ReplicaSet.md)
 - [V1beta1ReplicaSetCondition](docs/V1beta1ReplicaSetCondition.md)
 - [V1beta1ReplicaSetList](docs/V1beta1ReplicaSetList.md)
 - [V1beta1ReplicaSetSpec](docs/V1beta1ReplicaSetSpec.md)
 - [V1beta1ReplicaSetStatus](docs/V1beta1ReplicaSetStatus.md)
 - [V1beta1ResourceAttributes](docs/V1beta1ResourceAttributes.md)
 - [V1beta1Role](docs/V1beta1Role.md)
 - [V1beta1RoleBinding](docs/V1beta1RoleBinding.md)
 - [V1beta1RoleBindingList](docs/V1beta1RoleBindingList.md)
 - [V1beta1RoleList](docs/V1beta1RoleList.md)
 - [V1beta1RoleRef](docs/V1beta1RoleRef.md)
 - [V1beta1RollingUpdateDaemonSet](docs/V1beta1RollingUpdateDaemonSet.md)
 - [V1beta1RunAsUserStrategyOptions](docs/V1beta1RunAsUserStrategyOptions.md)
 - [V1beta1SELinuxStrategyOptions](docs/V1beta1SELinuxStrategyOptions.md)
 - [V1beta1SelfSubjectAccessReview](docs/V1beta1SelfSubjectAccessReview.md)
 - [V1beta1SelfSubjectAccessReviewSpec](docs/V1beta1SelfSubjectAccessReviewSpec.md)
 - [V1beta1StatefulSet](docs/V1beta1StatefulSet.md)
 - [V1beta1StatefulSetList](docs/V1beta1StatefulSetList.md)
 - [V1beta1StatefulSetSpec](docs/V1beta1StatefulSetSpec.md)
 - [V1beta1StatefulSetStatus](docs/V1beta1StatefulSetStatus.md)
 - [V1beta1StorageClass](docs/V1beta1StorageClass.md)
 - [V1beta1StorageClassList](docs/V1beta1StorageClassList.md)
 - [V1beta1Subject](docs/V1beta1Subject.md)
 - [V1beta1SubjectAccessReview](docs/V1beta1SubjectAccessReview.md)
 - [V1beta1SubjectAccessReviewSpec](docs/V1beta1SubjectAccessReviewSpec.md)
 - [V1beta1SubjectAccessReviewStatus](docs/V1beta1SubjectAccessReviewStatus.md)
 - [V1beta1SupplementalGroupsStrategyOptions](docs/V1beta1SupplementalGroupsStrategyOptions.md)
 - [V1beta1ThirdPartyResource](docs/V1beta1ThirdPartyResource.md)
 - [V1beta1ThirdPartyResourceList](docs/V1beta1ThirdPartyResourceList.md)
 - [V1beta1TokenReview](docs/V1beta1TokenReview.md)
 - [V1beta1TokenReviewSpec](docs/V1beta1TokenReviewSpec.md)
 - [V1beta1TokenReviewStatus](docs/V1beta1TokenReviewStatus.md)
 - [V1beta1UserInfo](docs/V1beta1UserInfo.md)
 - [V2alpha1CronJob](docs/V2alpha1CronJob.md)
 - [V2alpha1CronJobList](docs/V2alpha1CronJobList.md)
 - [V2alpha1CronJobSpec](docs/V2alpha1CronJobSpec.md)
 - [V2alpha1CronJobStatus](docs/V2alpha1CronJobStatus.md)
 - [V2alpha1CrossVersionObjectReference](docs/V2alpha1CrossVersionObjectReference.md)
 - [V2alpha1HorizontalPodAutoscaler](docs/V2alpha1HorizontalPodAutoscaler.md)
 - [V2alpha1HorizontalPodAutoscalerList](docs/V2alpha1HorizontalPodAutoscalerList.md)
 - [V2alpha1HorizontalPodAutoscalerSpec](docs/V2alpha1HorizontalPodAutoscalerSpec.md)
 - [V2alpha1HorizontalPodAutoscalerStatus](docs/V2alpha1HorizontalPodAutoscalerStatus.md)
 - [V2alpha1JobTemplateSpec](docs/V2alpha1JobTemplateSpec.md)
 - [V2alpha1MetricSpec](docs/V2alpha1MetricSpec.md)
 - [V2alpha1MetricStatus](docs/V2alpha1MetricStatus.md)
 - [V2alpha1ObjectMetricSource](docs/V2alpha1ObjectMetricSource.md)
 - [V2alpha1ObjectMetricStatus](docs/V2alpha1ObjectMetricStatus.md)
 - [V2alpha1PodsMetricSource](docs/V2alpha1PodsMetricSource.md)
 - [V2alpha1PodsMetricStatus](docs/V2alpha1PodsMetricStatus.md)
 - [V2alpha1ResourceMetricSource](docs/V2alpha1ResourceMetricSource.md)
 - [V2alpha1ResourceMetricStatus](docs/V2alpha1ResourceMetricStatus.md)
 - [VersionInfo](docs/VersionInfo.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### BearerToken

- **Type**: API key
- **API key parameter name**: authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



