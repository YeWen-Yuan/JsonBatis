package show.ywy.mybatis.session.defaults;

import show.ywy.mapper.MappedStatement;
import show.ywy.session.Configuration;
import show.ywy.session.SqlSession;

public class DefaultSqlSession implements SqlSession {


    private Configuration configuration;

    @Override
    public <T> T selectOne(String statement) {
        return null;
    }

    @Override
    public <T> T selectOne(String statement, Object parameter) {
        MappedStatement mappedStatement = configuration.getMappedStatement(statement);
        return (T) ("你被代理了！" + "\n方法：" + statement + "\n入参：" + parameter + "\n待执行SQL：" + mappedStatement.getSql());
    }

    @Override
    public <T> T getMapper(Class<T> type) {
        return configuration.getMapper(type, this);
    }


}
