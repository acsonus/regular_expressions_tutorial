package edu.acsonus.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
    public static String rewriteInPhp(String str) {
        Pattern p = Pattern.compile("(\\s*\\&\\s+)([a-zA-Z0-9_]+)(\\(\\\"[a-z0-9_]+\\\"\\))(\\s*\\&\\s+)", Pattern.MULTILINE);
        Matcher m = p.matcher(str);
        StringBuilder builder = new StringBuilder();
        boolean newLine = false;
        int last_end = 0;
        while (m.find()) {
            if (newLine)
                builder.append(str.substring(0, m.start()));
            else
                builder.append(str.substring(last_end, m.start() - 1));
            last_end = m.end() + 1;

            String group = m.group(1);
            builder.append(group.replaceFirst("&", "."));
            group = m.group(2);
            builder.append("$" + group);
            group = m.group(3);
            builder.append(group.replace("(", "[").replace(")", "]"));
            group = m.group(4);
            builder.append(group.replaceFirst("&", "."));
        }
        return builder.toString();

    }
}
