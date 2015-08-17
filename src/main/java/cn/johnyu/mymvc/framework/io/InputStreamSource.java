package cn.johnyu.mymvc.framework.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by WhiteSaber on 15/8/17.
 */
public interface InputStreamSource {
    InputStream getInputStream() throws IOException;
}
