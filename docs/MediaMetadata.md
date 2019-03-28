
# MediaMetadata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hasBlendShapes** | **Boolean** | For 3D Media, denotes that this model contains blend shapes, but having to calculate and apply weights to them is not required. These are models like glasses, hats, and billboards that do not react to face movement. |  [optional]
**isFaceFilter** | **Boolean** | For 3D Media, denotes that this model can be applied as a Face Filter overlay on a video of a face. |  [optional]
**requiresBlendShapes** | **Boolean** | For 3D Media, denotes that calculating and applying blend shape weights to this model is _required_ for the correct experience. If your platform cannot detect and calculate blend shape weights you MUST NOT present these models to your users. |  [optional]



