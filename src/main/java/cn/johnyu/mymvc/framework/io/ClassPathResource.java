package cn.johnyu.mymvc.framework.io;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

/**
 * Created by WhiteSaber on 15/8/17.
 */
public class ClassPathResource implements Resource {
    private final String path;
    private ClassLoader classLoader;
    private Class<?> clazz;

    public ClassPathResource(String path, Class<?> clazz) {

        this.path = path;
        this.clazz = clazz;
    }

    @Override
    public boolean exists() {
        return false;
    }

    @Override
    public boolean isReadable() {
        return false;
    }

    @Override
    public boolean isOpen() {
        return false;
    }

    @Override
    public URL getURL() throws IOException {
        return null;
    }

    @Override
    public URI getURI() throws IOException {
        return null;
    }

    @Override
    public File getFile() throws IOException {
        return null;
    }

    @Override
    public long contentLength() throws IOException {
        return 0;
    }

    @Override
    public long lastModified() throws IOException {
        return 0;
    }

    @Override
    public Resource createRelative(String var1) throws IOException {
        return null;
    }

    @Override
    public String getFilename() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return null;
    }
}
