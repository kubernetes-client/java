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
package io.kubernetes.client.util.eks;

import org.apache.http.client.utils.URIBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Date;
import java.util.Map;


/**
 * Sample AWS4 signer demonstrating how to sign requests to Amazon S3 using
 * query string parameters.
 */
public class AWS4STSSigner extends AWS4SignerBase {

    private static final Logger log = LoggerFactory.getLogger(AWS4STSSigner.class);

    public AWS4STSSigner(URL endpointUrl, String httpMethod,
                         String serviceName, String regionName) {
        super(endpointUrl, httpMethod, serviceName, regionName);
    }

    /**
     * Computes an AWS4 authorization for a request, suitable for embedding in
     * query parameters.
     *
     * @param headers
     *            The request headers; 'Host' and 'X-Amz-Date' will be added to
     *            this set.
     * @param queryParameters
     *            Any query parameters that will be added to the endpoint. The
     *            parameters should be specified in canonical format.
     * @param bodyHash
     *            Precomputed SHA256 hash of the request body content; this
     *            value should also be set as the header 'X-Amz-Content-SHA256'
     *            for non-streaming uploads.
     * @param awsAccessKey
     *            The user's AWS Access Key.
     * @param awsSecretKey
     *            The user's AWS Secret Key.
     * @return The computed authorization string for the request. This value
     *         needs to be set as the header 'Authorization' on the subsequent
     *         HTTP request.
     */
    public String computeSignature(URI endpoint,
                                   Map<String, String> headers,
                                   Map<String, String> queryParameters,
                                   int expiringInSeconds,
                                   String bodyHash,
                                   String awsAccessKey,
                                   String awsSecretKey,
                                   String sessionToken) throws URISyntaxException {
        // first get the date and time for the subsequent request, and convert
        // to ISO 8601 format
        // for use in signature generation
        Date now = new Date();
        String dateTimeStamp = dateTimeFormat.format(now);

        // make sure "Host" header is added
        String hostHeader = endpointUrl.getHost();
        int port = endpointUrl.getPort();
        if ( port > -1 ) {
            hostHeader.concat(":" + Integer.toString(port));
        }
        headers.put("Host", hostHeader);

        // canonicalized headers need to be expressed in the query
        // parameters processed in the signature
        String canonicalizedHeaderNames = getCanonicalizeHeaderNames(headers);
        String canonicalizedHeaders = getCanonicalizedHeaderString(headers);

        // we need scope as part of the query parameters
        String dateStamp = dateStampFormat.format(now);
        String scope =  dateStamp + "/" + regionName + "/" + serviceName + "/" + TERMINATOR;

        // add the fixed authorization params required by Signature V4
        queryParameters.put("X-Amz-Algorithm", SCHEME + "-" + ALGORITHM);
        queryParameters.put("X-Amz-Credential", awsAccessKey + "/" + scope);

        // x-amz-date is now added as a query parameter, but still need to be in ISO8601 basic form
        queryParameters.put("X-Amz-Date", dateTimeStamp);
        queryParameters.put("X-Amz-Expires", String.valueOf(expiringInSeconds));

        queryParameters.put("X-Amz-Security-Token", sessionToken);

        queryParameters.put("X-Amz-SignedHeaders", canonicalizedHeaderNames);

        // build the expanded canonical query parameter string that will go into the
        // signature computation
        String canonicalizedQueryParameters = getCanonicalizedQueryString(queryParameters);

        // express all the header and query parameter data as a canonical request string
        String canonicalRequest = getCanonicalRequest(endpointUrl, httpMethod,
                canonicalizedQueryParameters, canonicalizedHeaderNames,
                canonicalizedHeaders, bodyHash);
        log.debug("--------- Canonical request --------");
        log.debug(canonicalRequest);
        log.debug("------------------------------------");

        // construct the string to be signed
        String stringToSign = getStringToSign(SCHEME, ALGORITHM, dateTimeStamp, scope, canonicalRequest);
        log.debug("--------- String to sign -----------");
        log.debug(stringToSign);
        log.debug("------------------------------------");

        // compute the signing key
        byte[] kSecret = (SCHEME + awsSecretKey).getBytes();
        byte[] kDate = sign(dateStamp, kSecret, "HmacSHA256");
        byte[] kRegion = sign(regionName, kDate, "HmacSHA256");
        byte[] kService = sign(serviceName, kRegion, "HmacSHA256");
        byte[] kSigning = sign(TERMINATOR, kService, "HmacSHA256");
        byte[] signature = sign(stringToSign, kSigning, "HmacSHA256");

        // form up the authorization parameters for the caller to place in the query string
        StringBuilder authString = new StringBuilder();
        URIBuilder builder = new URIBuilder(endpoint);
        queryParameters.forEach((k, v)-> {
            builder.addParameter(k, v);
        });
        builder.addParameter("X-Amz-Signature", BinaryUtils.toHex(signature));
        authString.append(builder.build());
        return authString.toString();
    }

}
