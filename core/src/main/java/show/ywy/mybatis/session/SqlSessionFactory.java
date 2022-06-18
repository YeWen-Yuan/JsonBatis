package show.ywy.mybatis.session;

/**
 * @author yzs
 * @Description TODO
 * @createTime 2022年06月06日 09:20:00
 */
public interface SqlSessionFactory {
    /**
     * 打开一个 session
     * @return SqlSession
     */
    SqlSession openSession();
}
