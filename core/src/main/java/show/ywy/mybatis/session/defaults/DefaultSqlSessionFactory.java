package show.ywy.mybatis.session.defaults;

import show.ywy.binding.MapperRegistry;
import show.ywy.session.SqlSession;
import show.ywy.session.SqlSessionFactory;

/**
 * @author yzs
 * @Description TODO
 * @createTime 2022年06月06日 09:21:00
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {
    private final MapperRegistry mapperRegistry;

    public DefaultSqlSessionFactory(MapperRegistry mapperRegistry) {
        this.mapperRegistry = mapperRegistry;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(mapperRegistry);
    }
}
