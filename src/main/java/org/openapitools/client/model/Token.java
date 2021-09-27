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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Access tokens are used when talking to the API, it will confirm your identity.
 */
@ApiModel(description = "Access tokens are used when talking to the API, it will confirm your identity.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-27T12:28:31.876+02:00[Europe/Stockholm]")
public class Token {
  public static final String SERIALIZED_NAME_TOKEN_KEY = "tokenKey";
  @SerializedName(SERIALIZED_NAME_TOKEN_KEY)
  private UUID tokenKey;

  public static final String SERIALIZED_NAME_TOKEN_NAME = "tokenName";
  @SerializedName(SERIALIZED_NAME_TOKEN_NAME)
  private String tokenName;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<String> permissions = new ArrayList<String>();


  public Token tokenKey(UUID tokenKey) {
    
    this.tokenKey = tokenKey;
    return this;
  }

   /**
   * Get tokenKey
   * @return tokenKey
  **/
  @ApiModelProperty(example = "13777603-bdf9-48f7-a493-3b4a94e8be02", required = true, value = "")

  public UUID getTokenKey() {
    return tokenKey;
  }


  public void setTokenKey(UUID tokenKey) {
    this.tokenKey = tokenKey;
  }


  public Token tokenName(String tokenName) {
    
    this.tokenName = tokenName;
    return this;
  }

   /**
   * Get tokenName
   * @return tokenName
  **/
  @ApiModelProperty(required = true, value = "")

  public String getTokenName() {
    return tokenName;
  }


  public void setTokenName(String tokenName) {
    this.tokenName = tokenName;
  }


  public Token createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(required = true, value = "")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public Token createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Token permissions(List<String> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public Token addPermissionsItem(String permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getPermissions() {
    return permissions;
  }


  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Token token = (Token) o;
    return Objects.equals(this.tokenKey, token.tokenKey) &&
        Objects.equals(this.tokenName, token.tokenName) &&
        Objects.equals(this.createdBy, token.createdBy) &&
        Objects.equals(this.createdAt, token.createdAt) &&
        Objects.equals(this.permissions, token.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenKey, tokenName, createdBy, createdAt, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Token {\n");
    sb.append("    tokenKey: ").append(toIndentedString(tokenKey)).append("\n");
    sb.append("    tokenName: ").append(toIndentedString(tokenName)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

