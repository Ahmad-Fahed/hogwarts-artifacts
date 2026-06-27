package akumaz.hogwartsartifacts.client.imagestorage;

import java.io.IOException;
import java.io.InputStream;

public interface imageStorageClient {
    String uploadImage(String containerName, String originalImageName, InputStream data, long length) throws IOException;
}
