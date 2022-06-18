package show.ywy.mybatis.io;

import java.io.IOException;
import java.io.Reader;

public class Resources {
    public static Reader getResourceAsReader(String s) {
        return new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                return 0;
            }

            @Override
            public void close() throws IOException {

            }
        };
    }

    public static String classForName(String name){
        return name;
    }
}
