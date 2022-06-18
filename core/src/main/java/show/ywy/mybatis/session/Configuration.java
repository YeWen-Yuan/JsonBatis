package show.ywy.mybatis.session;

import show.ywy.mybatis.binding.MapperRegistry;
import show.ywy.mybatis.mapper.MappedStatement;

import java.util.HashMap;
import java.util.Map;

public class Configuration {

    /**
     * 映射注册机
     */
    protected MapperRegistry mapperRegistry = new MapperRegistry(this);

    /**
     * 映射的语句，存在Map里
     */
    protected final Map<String, MappedStatement> mappedStatements = new HashMap<>();

    public <T> void addMapper(String type) {
        mapperRegistry.addMapper(type);
    }

    public void addMappedStatement(MappedStatement ms) {
        mappedStatements.put(ms.getId(), ms);
    }

    public MappedStatement getMappedStatement(String statement) {
        return null;
    }
}
