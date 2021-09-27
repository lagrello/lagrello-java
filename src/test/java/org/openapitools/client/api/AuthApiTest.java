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
import org.openapitools.client.model.Error;
import org.openapitools.client.model.TotpEnableRequest;
import org.openapitools.client.model.TotpEnableResponse;
import org.openapitools.client.model.User;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthApi
 */
@Ignore
public class AuthApiTest {

    private final AuthApi api = new AuthApi();

    
    /**
     * Gives back user data for the magic link token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersEmailAuthTest() throws ApiException {
        String payload = null;
        User response = api.usersEmailAuth(payload);

        // TODO: test validations
    }
    
    /**
     * This endpoint will be used when you want to send a magic login link to specified user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersEmailSendTest() throws ApiException {
        String userId = null;
        api.usersEmailSend(userId);

        // TODO: test validations
    }
    
    /**
     * Verify users TOTP token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersTotpAuthTest() throws ApiException {
        String userId = null;
        String payload = null;
        User response = api.usersTotpAuth(userId, payload);

        // TODO: test validations
    }
    
    /**
     * Enables or disables Time-based One-Time Password authentication method for specified user
     *
     * When you want your users to be able to use TOTP authentication you need to send enable set to true as payload to this endpoint. To turn off TOTP set enable to false. When enabling you will recieve the secret key and a QR code link. The QR code you need to show your user for them to scan.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersTotpToggleTest() throws ApiException {
        String userId = null;
        TotpEnableRequest totpEnableRequest = null;
        TotpEnableResponse response = api.usersTotpToggle(userId, totpEnableRequest);

        // TODO: test validations
    }
    
}
