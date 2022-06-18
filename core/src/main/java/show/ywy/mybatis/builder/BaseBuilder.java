package show.ywy.mybatis.builder;

import show.ywy.mybatis.session.Configuration;

public class BaseBuilder {
    protected final Configuration configuration;

    public BaseBuilder(Configuration configuration) {
        this.configuration = configuration;
    }

    public Configuration getConfiguration() {
        return configuration;
    }
}
