/*
 * Lagrello API
 * API specification for Lagrello, a simple to use authentication service
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@lagrello.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.CreateTokenRequest;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.Token;
import org.openapitools.client.model.TokenList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TokensApi
 */
@Ignore
public class TokensApiTest {

    private final TokensApi api = new TokensApi();

    
    /**
     * Creates new token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tokensCreateTest() throws ApiException {
        CreateTokenRequest createTokenRequest = null;
        Token response = api.tokensCreate(createTokenRequest);

        // TODO: test validations
    }
    
    /**
     * Deletes specifed access token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tokensDeleteTest() throws ApiException {
        String tokenId = null;
        api.tokensDelete(tokenId);

        // TODO: test validations
    }
    
    /**
     * Returns a list of all active tokens in tenant
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tokensListTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        TokenList response = api.tokensList(size, page);

        // TODO: test validations
    }
    
}
