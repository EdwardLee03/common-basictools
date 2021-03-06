package com.common.util;

import java.util.Map;

/**
 * 映射集合工具辅助类。
 * <p/>
 * Miscellaneous map utility methods.
 * Mainly for internal use within the framework.
 *
 * @author xingle
 * @see org.apache.commons.collections4.MapUtils
 * @since 2016年06月24日 14:11
 */
public final class MapUtil {
    private MapUtil() {
        throw new AssertionError("No com.common.util.MapUtil instances for you!");
    }


    // Empty checks
    //-----------------------------------------------------------------------

    /**
     * Return {@code true} if the supplied Map is {@code null} or empty.
     * Otherwise, return {@code false}.
     * <p/>
     * Null-safe check if the specified Map is empty.
     * <p/>
     * Null returns true.
     *
     * @param map the Map to check, may be null
     * @return {@code true} if the given Map is null or empty
     */
    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

}
