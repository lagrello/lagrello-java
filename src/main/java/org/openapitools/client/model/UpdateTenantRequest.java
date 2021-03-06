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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;

/**
 * UpdateTenantRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-27T12:28:31.876+02:00[Europe/Stockholm]")
public class UpdateTenantRequest {
  public static final String SERIALIZED_NAME_CALLBACK_URL = "callbackUrl";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private URI callbackUrl;


  public UpdateTenantRequest callbackUrl(URI callbackUrl) {
    
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * This callback address will be used when using the email authentication method. When the end user will have this callback address send to them with the authentication key. In the callback address you need to specify where you want to the auth token to be placed. Specify where in the uri you want to accept the auth token that will then be verified with Lagrello. To specify where you will use these two characters {}.
   * @return callbackUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.example.com/users/login/{}", value = "This callback address will be used when using the email authentication method. When the end user will have this callback address send to them with the authentication key. In the callback address you need to specify where you want to the auth token to be placed. Specify where in the uri you want to accept the auth token that will then be verified with Lagrello. To specify where you will use these two characters {}.")

  public URI getCallbackUrl() {
    return callbackUrl;
  }


  public void setCallbackUrl(URI callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTenantRequest updateTenantRequest = (UpdateTenantRequest) o;
    return Objects.equals(this.callbackUrl, updateTenantRequest.callbackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTenantRequest {\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

