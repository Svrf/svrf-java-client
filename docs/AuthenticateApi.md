# AuthenticateApi

All URIs are relative to *https://api.svrf.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appAuthenticatePost**](AuthenticateApi.md#appAuthenticatePost) | **POST** /app/authenticate | Authenticate application


<a name="appAuthenticatePost"></a>
# **appAuthenticatePost**
> AuthResponse appAuthenticatePost(body)

Authenticate application

Authenticate an application&#39;s SVRF API Key to retrieve an access token to the SVRF API.

### Example
```java
// Import classes:
//import com.svrf.client.ApiException;
//import com.svrf.client.api.AuthenticateApi;


AuthenticateApi apiInstance = new AuthenticateApi();
Body body = new Body(); // Body | 
try {
    AuthResponse result = apiInstance.appAuthenticatePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticateApi#appAuthenticatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body**](Body.md)|  |

### Return type

[**AuthResponse**](AuthResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

