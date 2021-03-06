package com.zyinux.zson.token;

import com.zyinux.zson.CharKey;

/**
 * KeyCheck
 *
 * @author zyinux
 * @Desc
 * @date 2020/12/9
 */
public class KeyCheck {

    /**
     * 判断字符是否为需要跳过的字符
     * 比如空格或者制表符等这些显然是不需要处理的（或者当上一个token是{@link Token.TOKEN_KEY}时，因为这代表是字符串里面的值）
     * @param next
     * @return
     */
    public static boolean isContinueKey(char next) {
        if (next == ' ' || next == '\t') {
            return true;
        }
        return false;
    }

    public static boolean isEscape(char next) {
        return next == CharKey.KEY_ESCAPE;
    }
}
