package cn.johnyu.mymvc.framework.io;

import org.springframework.core.io.InputStreamSource;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

/**
 * Created by WhiteSaber on 15/8/17.
 */
public interface Resource extends InputStreamSource {
    boolean exists();

    boolean isReadable();

    boolean isOpen();

    URL getURL() throws IOException;

    URI getURI() throws IOException;

    File getFile() throws IOException;

    long contentLength() throws IOException;

    long lastModified() throws IOException;

    Resource createRelative(String var1) throws IOException;

    String getFilename();

    String getDescription();
}