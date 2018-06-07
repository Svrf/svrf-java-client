
# Media

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adult** | **Boolean** | Whether the Media is adult content |  [optional]
**authors** | **List&lt;String&gt;** | The Media&#39;s authors. This should be displayed when possible. |  [optional]
**canonical** | **String** | The canonical page this Media can be found at via SVRF. |  [optional]
**description** | **String** | A description of the Media |  [optional]
**duration** | [**BigDecimal**](BigDecimal.md) | The duration of the Media in seconds. |  [optional]
**files** | [**MediaFiles**](MediaFiles.md) |  |  [optional]
**height** | **Integer** | The height, in pixels, of the Media&#39;s source |  [optional]
**id** | **String** | The unique ID of this Media |  [optional]
**site** | **String** | The site that this Media came from. This should be displayed when possible. |  [optional]
**title** | **String** | The title of the Media, suitable for displaying |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the Media. This should influence the media controls displayed to the user. |  [optional]
**url** | **String** | The original page this Media is located at. |  [optional]
**width** | **Integer** | The width, in pixels, of the Media&#39;s source |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PHOTO | &quot;photo&quot;
VIDEO | &quot;video&quot;



