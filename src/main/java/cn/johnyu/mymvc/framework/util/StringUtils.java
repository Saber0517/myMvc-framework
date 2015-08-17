package cn.johnyu.mymvc.framework.util;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Created by WhiteSaber on 15/8/17.
 */
public class StringUtils {
    public static String[] toStringArray(Collection<String> collection) {
        return collection == null?null:(String[])collection.toArray(new String[collection.size()]);
    }


}
