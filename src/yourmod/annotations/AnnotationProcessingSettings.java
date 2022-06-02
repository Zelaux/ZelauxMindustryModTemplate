package yourmod.annotations;

import mma.annotations.ModAnnotations.*;


/**
 * If you have no sprites, music and sounds in your mod, remove the annotation after this line
 */
@ModAssetsAnnotation
@RootDirectoryPath(rootDirectoryPath = "")
@AnnotationSettings(
rootPackage = "yourmod",
assetsPath = "resources/assets",
modInfoPath = "resources/mod.hjson",
assetsRawPath = "resources/assets-raw",
classPrefix = "YourPrefix"
)
class AnnotationProcessingSettings{
}
