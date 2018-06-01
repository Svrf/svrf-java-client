# AuthenticateApi

All URIs are relative to *https://api.svrf.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appAuthenticatePost**](AuthenticateApi.md#appAuthenticatePost) | **POST** /app/authenticate | Authenticate application




<a name="appAuthenticatePost"></a>
# **appAuthenticatePost**
> InlineResponse2001 appAuthenticatePost(body)

Authenticate application

Authenticate an application&#x27;s SVRF API Key to retrieve an access token to the SVRF API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticateApi;



AuthenticateApi apiInstance = new AuthenticateApi();

Body body = new Body(); // Body | 

try {
    InlineResponse2001 result = apiInstance.appAuthenticatePost(body);
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

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



